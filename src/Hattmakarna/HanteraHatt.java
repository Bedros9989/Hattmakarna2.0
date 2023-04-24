package Hattmakarna;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraHatt extends javax.swing.JFrame {

    private InfDB idb;
    public byte[] pimage = null;
    private Connection conn = null;
    private RegistreraHattFonster registrera;
    private String bestallningsID =null;
    private String nuvarandeMaterialMangd =null;

    public HanteraHatt(InfDB idb) {
        initComponents();
        this.idb = idb;
        HanteraHatt.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        cbSkapare.setEnabled(false);
        cbKategori.setEnabled(false);
        txtStorlek.setEnabled(false);
        txtTillverkningstimmar.setEnabled(false);
        txtBestallningsID.setEnabled(false);
        btnUppdateraBild.setEnabled(false);
        cbMaterialHatt.setEnabled(false);
        txtMangdHatt.setEnabled(false);
        btnAndra.setEnabled(false);
        btnSpara.setEnabled(false);
        cbMaterialLager.setEnabled(false);
        txtMangdMaterial.setEnabled(false);
        txtTillverkningskostnad.setEnabled(false);
        conn = DBConnect.connect();
    }

     public class DBConnect {
        public static Connection connect() {
            Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hattmakare", "hattuser", "hattkey");
            } catch (Exception e) {
                System.out.println("inter.DBConnect.connect()");
            }
            return con;
        }
    }

    public void hämtabild(byte[] pimage2) {
        pimage = pimage2;
    }

    private void fyllCbSkapare() {
        try {
            ArrayList<String> allaPersonalNamn = idb.fetchColumn("Select namn from personal");
            Collections.sort(allaPersonalNamn);

            for (String Namn : allaPersonalNamn) {
                cbSkapare.addItem(Namn);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void fyllCbKategori() {
        cbKategori.addItem("Doktorshatt");
        cbKategori.addItem("Specialhatt");
        cbKategori.addItem("Studenthatt");
    }

    private void fyllCbMaterialHatt() {
        try {
            String hattID = txtHattID.getText();

            ArrayList<String> hattMaterial = idb.fetchColumn("SELECT materialnamn FROM material where materialID in (SELECT material FROM hattmaterial WHERE hatt= " + hattID + ")");
            Collections.sort(hattMaterial);

            for (String ettMaterial : hattMaterial) {
                cbMaterialHatt.addItem(ettMaterial);
            }
            cbMaterialHatt.setSelectedIndex(-1);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void fyllCbMaterialLager() {
        try {
            ArrayList<String> allaMaterial = idb.fetchColumn("SELECT materialnamn FROM material");
            Collections.sort(allaMaterial);

            for (String ettMaterial : allaMaterial) {
                cbMaterialLager.addItem(ettMaterial);
            }
            cbMaterialLager.setSelectedIndex(-1);

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void uppdateraMaterial() {
        try {
            if (cbMaterialHatt.getSelectedItem() != null && !txtMangdHatt.getText().isEmpty()) {

                String materialNamn = cbMaterialHatt.getSelectedItem().toString();
                String materialID = idb.fetchSingle("SELECT materialID FROM material WHERE materialnamn= '" + materialNamn + "'");
                String materialMangd = txtMangdHatt.getText();

                //Mängden före är samma som fältet nuvarandeMaterialMangd.
                String mangdEfter = txtMangdHatt.getText();
                double mangdSkillnad = Double.parseDouble(nuvarandeMaterialMangd) - Double.parseDouble(mangdEfter);

                ArrayList<String> allaAntal = new ArrayList<String>();
                ArrayList<String> allaMetervara = new ArrayList<String>();
                ArrayList<String> allaKvadratmetervara = new ArrayList<String>();
                String fragaAntal = "SELECT materialID FROM antalvara";
                String fragaMetervara = "SELECT materialID FROM metervara";
                String fragaKvadratmetervara = "SELECT materialID FROM kvadratmetervara";
                allaAntal = idb.fetchColumn(fragaAntal);
                allaMetervara = idb.fetchColumn(fragaMetervara);
                allaKvadratmetervara = idb.fetchColumn(fragaKvadratmetervara);

                for (String idAntal : allaAntal) {
                    if (materialID.equals(idAntal)) {
                        String antal = idb.fetchSingle("SELECT antal FROM antalvara WHERE materialID= " + idAntal);
                        double antalDouble = Double.parseDouble(antal);
                        double nyttAntal = antalDouble + mangdSkillnad;
                        String nyttAntalString = String.valueOf(nyttAntal);
                        //Uppdatera antalcellen
                        idb.update("UPDATE antalvara SET antal= " + nyttAntalString + " WHERE materialID= " + idAntal);
                    }
                }

                for (String idMetervara : allaMetervara) {
                    if (materialID.equals(idMetervara)) {
                        String meter = idb.fetchSingle("SELECT meter FROM metervara WHERE materialID= " + idMetervara);
                        double meterDouble = Double.parseDouble(meter);
                        double nyttMeter = meterDouble + mangdSkillnad;
                        String nyttMeterString = String.valueOf(nyttMeter);
                        //Uppdatera antalcellen
                        idb.update("UPDATE metervara SET meter= " + nyttMeterString + " WHERE materialID= " + idMetervara);
                    }
                }

                for (String idKvadratmetervara : allaKvadratmetervara) {
                    if (materialID.equals(idKvadratmetervara)) {
                        String kvadratmeter = idb.fetchSingle("SELECT kvadratmeter FROM kvadratmetervara WHERE materialID= " + idKvadratmetervara);
                        double kvadratmeterDouble = Double.parseDouble(kvadratmeter);
                        double nyttKvadratmeter = kvadratmeterDouble + mangdSkillnad;
                        String nyttKvadratmeterString = String.valueOf(nyttKvadratmeter);
                        //Uppdatera antalcellen
                        idb.update("UPDATE kvadratmetervara SET kvadratmeter= " + nyttKvadratmeterString + " WHERE materialID= " + idKvadratmetervara);
                    }
                }
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void uppdateraHattMaterial() {
        try {
            if (cbMaterialHatt.getSelectedItem() != null && !txtMangdHatt.getText().isEmpty()) {

                String hattID = txtHattID.getText();

                String materialNamn = cbMaterialHatt.getSelectedItem().toString();
                String materialID = idb.fetchSingle("SELECT materialID FROM material WHERE materialnamn= '" + materialNamn + "'");
                String materialMangd = txtMangdHatt.getText();

                idb.update("UPDATE hattmaterial SET mangd= " + materialMangd + " WHERE material= " + materialID + " AND hatt= " + hattID);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }
    
    private void laggTillNyttHattMaterial() {
        try {
            if (cbMaterialLager.getSelectedItem() != null && !txtMangdMaterial.getText().isEmpty()) {

                String hattID = txtHattID.getText();

                String materialNamn = cbMaterialLager.getSelectedItem().toString();
                String materialID = idb.fetchSingle("SELECT materialID FROM material WHERE materialnamn= '" + materialNamn + "'");
                String materialMangd = txtMangdMaterial.getText();

                idb.insert("INSERT INTO hattmaterial VALUES (" +hattID+ ", " +materialID+ ", " +materialMangd+ ")");
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }
    
        private void laggTillNyttHattMaterialuppdateraMaterial() {
        try {
            if (cbMaterialLager.getSelectedItem() != null && !txtMangdMaterial.getText().isEmpty()) {

                String materialNamn = cbMaterialLager.getSelectedItem().toString();
                String materialID = idb.fetchSingle("SELECT materialID FROM material WHERE materialnamn= '" + materialNamn + "'");
                String materialMangd = txtMangdMaterial.getText();

                double mangdNyttMaterial = Double.parseDouble(materialMangd);

                ArrayList<String> allaAntal = new ArrayList<String>();
                ArrayList<String> allaMetervara = new ArrayList<String>();
                ArrayList<String> allaKvadratmetervara = new ArrayList<String>();
                String fragaAntal = "SELECT materialID FROM antalvara";
                String fragaMetervara = "SELECT materialID FROM metervara";
                String fragaKvadratmetervara = "SELECT materialID FROM kvadratmetervara";
                allaAntal = idb.fetchColumn(fragaAntal);
                allaMetervara = idb.fetchColumn(fragaMetervara);
                allaKvadratmetervara = idb.fetchColumn(fragaKvadratmetervara);

                for (String idAntal : allaAntal) {
                    if (materialID.equals(idAntal)) {
                        String antal = idb.fetchSingle("SELECT antal FROM antalvara WHERE materialID= " + idAntal);
                        double antalDouble = Double.parseDouble(antal);
                        double nyttAntal = antalDouble - mangdNyttMaterial;
                        String nyttAntalString = String.valueOf(nyttAntal);
                        //Uppdatera antalcellen
                        idb.update("UPDATE antalvara SET antal= " + nyttAntalString + " WHERE materialID= " + idAntal);
                    }
                }

                for (String idMetervara : allaMetervara) {
                    if (materialID.equals(idMetervara)) {
                        String meter = idb.fetchSingle("SELECT meter FROM metervara WHERE materialID= " + idMetervara);
                        double meterDouble = Double.parseDouble(meter);
                        double nyttMeter = meterDouble - mangdNyttMaterial;
                        String nyttMeterString = String.valueOf(nyttMeter);
                        //Uppdatera antalcellen
                        idb.update("UPDATE metervara SET meter= " + nyttMeterString + " WHERE materialID= " + idMetervara);
                    }
                }

                for (String idKvadratmetervara : allaKvadratmetervara) {
                    if (materialID.equals(idKvadratmetervara)) {
                        String kvadratmeter = idb.fetchSingle("SELECT kvadratmeter FROM kvadratmetervara WHERE materialID= " + idKvadratmetervara);
                        double kvadratmeterDouble = Double.parseDouble(kvadratmeter);
                        double nyttKvadratmeter = kvadratmeterDouble - mangdNyttMaterial;
                        String nyttKvadratmeterString = String.valueOf(nyttKvadratmeter);
                        //Uppdatera antalcellen
                        idb.update("UPDATE kvadratmetervara SET kvadratmeter= " + nyttKvadratmeterString + " WHERE materialID= " + idKvadratmetervara);
                    }
                }
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void raknaUtTotalkostnad() {
        try {
            String hattID = txtHattID.getText();

            //Räknar ut arbetskostnad
            double arbetskostnad = 0;
            double tillverkningstimmar = Double.parseDouble(idb.fetchSingle("SELECT Tillverkningstimmar FROM hatt WHERE hattID= " + hattID));
            double timpris = Double.parseDouble(idb.fetchSingle("SELECT Timpris FROM personal WHERE personalID= (SELECT skapare FROM hatt WHERE hattID= " + hattID + " )"));
            arbetskostnad = tillverkningstimmar * timpris;

            //Räknar ut materialkostnad
            double totalMaterialkostnad = 0;
            ArrayList<Double> listaMaterialkostnad = new ArrayList<>();
            ArrayList<HashMap<String, String>> allaMaterialIHatten = idb.fetchRows("SELECT Material, Mangd FROM Hattmaterial WHERE Hatt= " + hattID);

            for (HashMap<String, String> enMaterialRad : allaMaterialIHatten) {
                String material = enMaterialRad.get("Material");
                String mangd = enMaterialRad.get("Mangd");
                double mangdDouble = Double.parseDouble(mangd);
                double enhetspris = Double.parseDouble(idb.fetchSingle("SELECT enhetspris FROM material WHERE materialID= " + material));

                double materialkostnad = mangdDouble * enhetspris;

                listaMaterialkostnad.add(materialkostnad);
            }

            for (Double enMaterialkostnad : listaMaterialkostnad) {
                totalMaterialkostnad = totalMaterialkostnad + enMaterialkostnad;
            }

            //Räknar ut tillverkningskostnad
            double tillverkningskostnad = totalMaterialkostnad + arbetskostnad;

            txtTillverkningskostnad.setText(String.valueOf(tillverkningskostnad));

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblValkommen = new javax.swing.JLabel();
        lblHattID = new javax.swing.JLabel();
        txtHattID = new javax.swing.JTextField();
        btnSokHatt = new javax.swing.JButton();
        btnAndra = new javax.swing.JButton();
        btnSpara = new javax.swing.JButton();
        lblSkapare = new javax.swing.JLabel();
        lblKategori = new javax.swing.JLabel();
        lblStorlek = new javax.swing.JLabel();
        lblTillverkningstimmar = new javax.swing.JLabel();
        lblBestallningsID = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        cbMaterialHatt = new javax.swing.JComboBox<>();
        txtMangdHatt = new javax.swing.JTextField();
        lblMangd = new javax.swing.JLabel();
        cbSkapare = new javax.swing.JComboBox<>();
        cbKategori = new javax.swing.JComboBox<>();
        txtStorlek = new javax.swing.JTextField();
        txtTillverkningstimmar = new javax.swing.JTextField();
        txtBestallningsID = new javax.swing.JTextField();
        btnUppdateraBild = new javax.swing.JButton();
        nuvarandeBild = new javax.swing.JButton();
        lblHattNuvarandeMaterial = new javax.swing.JLabel();
        lblNyttMaterial = new javax.swing.JLabel();
        cbMaterialLager = new javax.swing.JComboBox<>();
        txtMangdMaterial = new javax.swing.JTextField();
        lblMangd2 = new javax.swing.JLabel();
        lblTillverkningskostnad = new javax.swing.JLabel();
        txtTillverkningskostnad = new javax.swing.JTextField();
        bild = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        lblValkommen.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        lblValkommen.setText("Hantera hatt");

        lblHattID.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblHattID.setText("HattID");

        txtHattID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        btnSokHatt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnSokHatt.setText("Sök");
        btnSokHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokHattActionPerformed(evt);
            }
        });

        btnAndra.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        btnSpara.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        lblSkapare.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblSkapare.setText("Skapare");

        lblKategori.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblKategori.setText("Kategori");

        lblStorlek.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblStorlek.setText("Storlek");

        lblTillverkningstimmar.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblTillverkningstimmar.setText("Tillverkningstimmar");

        lblBestallningsID.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblBestallningsID.setText("BeställningsID");

        lblMaterial.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblMaterial.setText("Material");

        cbMaterialHatt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        txtMangdHatt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        txtMangdHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMangdHattActionPerformed(evt);
            }
        });

        lblMangd.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblMangd.setText("Mängd");

        cbSkapare.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        cbKategori.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        txtStorlek.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        txtStorlek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStorlekActionPerformed(evt);
            }
        });

        txtTillverkningstimmar.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        txtTillverkningstimmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTillverkningstimmarActionPerformed(evt);
            }
        });

        txtBestallningsID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        btnUppdateraBild.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnUppdateraBild.setText("Uppdatera bild");
        btnUppdateraBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraBildActionPerformed(evt);
            }
        });

        nuvarandeBild.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        nuvarandeBild.setText("Nuvarande bild");
        nuvarandeBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuvarandeBildActionPerformed(evt);
            }
        });

        lblHattNuvarandeMaterial.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblHattNuvarandeMaterial.setText("Hattens nuvarande material");

        lblNyttMaterial.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblNyttMaterial.setText("Lägg till nytt material");

        cbMaterialLager.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        txtMangdMaterial.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        lblMangd2.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblMangd2.setText("Mängd");

        lblTillverkningskostnad.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblTillverkningskostnad.setText("Tillverkningskostnad");

        txtTillverkningskostnad.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        bild.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        bild.setText("Bild");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblStorlek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(133, 133, 133))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTillverkningstimmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(36, 36, 36))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblBestallningsID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(77, 77, 77))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblSkapare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(120, 120, 120))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblKategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(118, 118, 118))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHattID)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStorlek, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTillverkningstimmar)
                                    .addComponent(txtBestallningsID)
                                    .addComponent(cbSkapare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtHattID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSokHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNyttMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(71, 71, 71))
                                    .addComponent(cbMaterialLager, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblMangd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(31, 31, 31))
                                    .addComponent(txtMangdMaterial))
                                .addGap(130, 130, 130))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHattNuvarandeMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(26, 26, 26))
                                    .addComponent(cbMaterialHatt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblMangd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(31, 31, 31))
                                    .addComponent(txtMangdHatt))
                                .addGap(130, 130, 130))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(379, 379, 379))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(btnAndra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSpara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(51, 51, 51))
                            .addComponent(lblValkommen))
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(159, 159, 159))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTillverkningskostnad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nuvarandeBild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUppdateraBild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtTillverkningskostnad))
                        .addGap(102, 102, 102))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblValkommen)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHattID)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSokHatt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSkapare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSkapare))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKategori))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStorlek))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTillverkningstimmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTillverkningstimmar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBestallningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBestallningsID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMaterial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHattNuvarandeMaterial)
                    .addComponent(lblMangd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMaterialHatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMangdHatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyttMaterial)
                    .addComponent(lblMangd2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMaterialLager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMangdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTillverkningskostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTillverkningskostnad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuvarandeBild, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(bild)))
                    .addComponent(btnUppdateraBild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        if (ValideringsKlass.endastPunkt(txtStorlek) && ValideringsKlass.endastPunkt(txtTillverkningstimmar) && ValideringsKlass.endastPunkt(txtMangdHatt) && ValideringsKlass.endastPunkt(txtMangdMaterial) && ValideringsKlass.textFaltHarVarde(txtStorlek) && ValideringsKlass.textFaltHarVarde(txtTillverkningstimmar) && ValideringsKlass.isPositivt(txtStorlek) && ValideringsKlass.isPositivt(txtTillverkningstimmar) && ValideringsKlass.isPositivt(txtMangdHatt) && ValideringsKlass.isPositivt(txtMangdMaterial) && ValideringsKlass.isTal(txtMangdHatt) && ValideringsKlass.isTal(txtMangdMaterial)) {
            try {
                ArrayList<String> allaBestallningar = idb.fetchColumn("SELECT BestallningsID FROM bestallning");
                boolean bestallningFinns = false;

                for (String enBestallning : allaBestallningar) {
                    if (enBestallning.equals(txtBestallningsID.getText())) {
                        bestallningFinns = true;
                    }
                }

                if (txtBestallningsID.getText().isEmpty() || bestallningFinns == true) {
                    String hattID = txtHattID.getText();

                    //Uppdaterar materialtabellen och hattmaterialtabellen
                    uppdateraMaterial();
                    uppdateraHattMaterial();
                    laggTillNyttHattMaterial();
                    laggTillNyttHattMaterialuppdateraMaterial();

                    if (txtBestallningsID.getText().isEmpty()) {
                        bestallningsID = null;
                    } else {
                        bestallningsID = txtBestallningsID.getText();
                    }

                    String skapareString = cbSkapare.getSelectedItem().toString();
                    String nySkapare = idb.fetchSingle("SELECT PersonalID FROM Personal WHERE Namn= '" + skapareString + "'");
                    String nyKategori = cbKategori.getSelectedItem().toString();
                    String nyStorlek = txtStorlek.getText();
                    String nyTillverkningstimmar = txtTillverkningstimmar.getText();
                    String nyBestallning = bestallningsID;
                    String nyTillverkningskostnad = txtTillverkningskostnad.getText();

                    String q = "UPDATE hattmakare.Hatt t SET t.Storlek = ?, t.Skapare= ?,t.Kategori= ?,t.Tillverkningstimmar = ?,t.Bestallning= ?, t.BildData = ?, t.Tillverkningskostnad= ? WHERE t.HattID = ?";
                    PreparedStatement pst = conn.prepareStatement(q);
                    pst.setString(1, nyStorlek);
                    pst.setString(2, nySkapare);
                    pst.setString(3, nyKategori);
                    pst.setString(4, nyTillverkningstimmar);
                    pst.setString(5, nyBestallning);
                    pst.setBytes(6, pimage);
                    pst.setString(7, nyTillverkningskostnad);
                    pst.setString(8, hattID);
                    pst.execute();

                    raknaUtTotalkostnad();
                    JOptionPane.showMessageDialog(null, ("Hatt " + hattID + " har uppdaterats"));

                } else {
                    JOptionPane.showMessageDialog(null, "BeställningsIDt existerar inte!");
                }
            } catch (InfException ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(HanteraHatt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSparaActionPerformed

    private void btnAndraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraActionPerformed
        cbSkapare.setEnabled(true);
        cbKategori.setEnabled(true);
        txtStorlek.setEnabled(true);
        txtTillverkningstimmar.setEnabled(true);
        txtBestallningsID.setEnabled(true);
        btnUppdateraBild.setEnabled(true);
        cbMaterialHatt.setEnabled(true);
        txtMangdHatt.setEnabled(true);
        btnSpara.setEnabled(true);
        cbMaterialLager.setEnabled(true);
        txtMangdMaterial.setEnabled(true);
    }//GEN-LAST:event_btnAndraActionPerformed

    private void txtMangdHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMangdHattActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMangdHattActionPerformed

    private void txtTillverkningstimmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTillverkningstimmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTillverkningstimmarActionPerformed

    private void btnSokHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokHattActionPerformed
        cbSkapare.removeAllItems();
        cbKategori.removeAllItems();
        cbMaterialHatt.removeAllItems();
        cbMaterialLager.removeAllItems();

        cbSkapare.setEnabled(false);
        cbKategori.setEnabled(false);
        txtStorlek.setEnabled(false);
        txtTillverkningstimmar.setEnabled(false);
        txtBestallningsID.setEnabled(false);
        btnUppdateraBild.setEnabled(false);
        cbMaterialHatt.setEnabled(false);
        txtMangdHatt.setEnabled(false);
        btnSpara.setEnabled(false);
        cbMaterialLager.setEnabled(false);
        txtMangdMaterial.setEnabled(false);
        btnAndra.setEnabled(true);
        
        try {
            String hattID = txtHattID.getText();

            ArrayList<String> existerandeHattar;
            existerandeHattar = idb.fetchColumn("select HattID from Hatt");

            boolean hattenFinns = false;
            for (String ettHattID : existerandeHattar) {
                if(ettHattID.contains(hattID)){
                    hattenFinns = true;
                }
            }

            if (hattenFinns == false) {
                JOptionPane.showMessageDialog(null, "Hatt med detta ID existerar inte!");
                btnAndra.setEnabled(false);
            } else {
                fyllCbKategori();
                fyllCbSkapare();
                fyllCbMaterialHatt();
                fyllCbMaterialLager();
                raknaUtTotalkostnad();

                cbSkapare.setSelectedItem(idb.fetchSingle("SELECT Namn FROM Personal WHERE PersonalID = (Select PersonalID from personal where PersonalID = (select Skapare from Hatt where HattID = " + hattID + "))"));
                cbKategori.setSelectedItem(idb.fetchSingle("SELECT Kategori FROM Hatt WHERE HattID = " + hattID));
                txtStorlek.setText(idb.fetchSingle("SELECT Storlek FROM Hatt WHERE HattID = " + hattID));
                txtTillverkningstimmar.setText(idb.fetchSingle("SELECT Tillverkningstimmar FROM Hatt WHERE HattID = " + hattID));
                txtBestallningsID.setText(idb.fetchSingle("SELECT Bestallning FROM Hatt WHERE HattID = " + hattID));
            }

            // Add an ItemListener to cbMaterialHatt§
            cbMaterialHatt.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent event) {
                    // Check if the selected item has changed
                    if (event.getStateChange() == ItemEvent.SELECTED) {
                        try {
                            // Get the selected material name
                            String selectedMaterialName = cbMaterialHatt.getSelectedItem().toString();
                            // Get the material ID from the database
                            String selectedMaterialID = idb.fetchSingle("SELECT materialID FROM material WHERE materialnamn= '" + selectedMaterialName + "'");
                            // Get the material quantity for the selected hat and material from the database
                            String materialMangd = idb.fetchSingle("SELECT mangd FROM hattmaterial WHERE hatt= " + hattID + " AND material= " + selectedMaterialID);
                            // Update the txtMangdHatt field with the material quantity
                            txtMangdHatt.setText(materialMangd);
                            nuvarandeMaterialMangd = materialMangd;
                        } catch (InfException ex) {
                            JOptionPane.showMessageDialog(null, "Något gick fel");
                            System.out.println("Internt felmeddelande" + ex.getMessage());
                        }
                    }
                }
            });

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnSokHattActionPerformed

    private void btnUppdateraBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraBildActionPerformed
        new ValjBild(registrera, this).setVisible(true);
    }//GEN-LAST:event_btnUppdateraBildActionPerformed

    private void nuvarandeBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuvarandeBildActionPerformed
        String hatt = txtHattID.getText();
        new KollaBild(hatt).setVisible(true);
    }//GEN-LAST:event_nuvarandeBildActionPerformed

    private void txtStorlekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStorlekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStorlekActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bild;
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnSokHatt;
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnUppdateraBild;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JComboBox<String> cbMaterialHatt;
    private javax.swing.JComboBox<String> cbMaterialLager;
    private javax.swing.JComboBox<String> cbSkapare;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBestallningsID;
    private javax.swing.JLabel lblHattID;
    private javax.swing.JLabel lblHattNuvarandeMaterial;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblMangd;
    private javax.swing.JLabel lblMangd2;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblNyttMaterial;
    private javax.swing.JLabel lblSkapare;
    private javax.swing.JLabel lblStorlek;
    private javax.swing.JLabel lblTillverkningskostnad;
    private javax.swing.JLabel lblTillverkningstimmar;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JButton nuvarandeBild;
    private javax.swing.JTextField txtBestallningsID;
    private javax.swing.JTextField txtHattID;
    private javax.swing.JTextField txtMangdHatt;
    private javax.swing.JTextField txtMangdMaterial;
    private javax.swing.JTextField txtStorlek;
    private javax.swing.JTextField txtTillverkningskostnad;
    private javax.swing.JTextField txtTillverkningstimmar;
    // End of variables declaration//GEN-END:variables
}
