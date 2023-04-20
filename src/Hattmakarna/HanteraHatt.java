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
        btnRaknaUtTillverkningskostnad.setEnabled(false);
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
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnRaknaUtTillverkningskostnad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkommen.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblValkommen.setText("Hantera hatt");

        lblHattID.setText("HattID");

        btnSokHatt.setText("Sök");
        btnSokHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokHattActionPerformed(evt);
            }
        });

        btnAndra.setText("Ändra");
        btnAndra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraActionPerformed(evt);
            }
        });

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        lblSkapare.setText("Skapare");

        lblKategori.setText("Kategori");

        lblStorlek.setText("Storlek");

        lblTillverkningstimmar.setText("Tillverkningstimmar");

        lblBestallningsID.setText("BeställningsID");

        lblMaterial.setText("Material");

        txtMangdHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMangdHattActionPerformed(evt);
            }
        });

        lblMangd.setText("Mängd");

        txtTillverkningstimmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTillverkningstimmarActionPerformed(evt);
            }
        });

        btnUppdateraBild.setText("Uppdatera bild");
        btnUppdateraBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraBildActionPerformed(evt);
            }
        });

        nuvarandeBild.setText("Nuvarande bild");
        nuvarandeBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuvarandeBildActionPerformed(evt);
            }
        });

        lblHattNuvarandeMaterial.setText("Hattens nuvarande material");

        lblNyttMaterial.setText("Lägg till nytt material");

        lblMangd2.setText("Mängd");

        lblTillverkningskostnad.setText("Tillverkningskostnad");

        btnRaknaUtTillverkningskostnad.setText("Räkna ut");
        btnRaknaUtTillverkningskostnad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaknaUtTillverkningskostnadActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setText("Tryck räkna ut och sedan spara för att spara tillverkningskostnaden");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHattID)
                                    .addComponent(lblStorlek)
                                    .addComponent(lblTillverkningstimmar)
                                    .addComponent(lblBestallningsID)
                                    .addComponent(lblSkapare))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStorlek, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbKategori, javax.swing.GroupLayout.Alignment.TRAILING, 0, 225, Short.MAX_VALUE)
                                    .addComponent(cbSkapare, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHattID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBestallningsID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTillverkningstimmar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblValkommen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblKategori)
                                        .addGap(89, 89, 89)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nuvarandeBild)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUppdateraBild)))
                        .addGap(18, 18, 18)
                        .addComponent(btnSokHatt)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTillverkningskostnad)
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblNyttMaterial)
                                            .addComponent(lblHattNuvarandeMaterial)
                                            .addComponent(txtTillverkningskostnad)
                                            .addComponent(cbMaterialLager, 0, 200, Short.MAX_VALUE)
                                            .addComponent(cbMaterialHatt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(lblMaterial))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMangd)
                                    .addComponent(lblMangd2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtMangdMaterial, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnRaknaUtTillverkningskostnad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtMangdHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(66, 66, 66))))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblValkommen)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHattID)
                    .addComponent(txtHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSokHatt))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSkapare)
                    .addComponent(cbSkapare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKategori)
                    .addComponent(cbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStorlek)
                    .addComponent(txtStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTillverkningstimmar)
                    .addComponent(txtTillverkningstimmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBestallningsID)
                    .addComponent(txtBestallningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUppdateraBild)
                    .addComponent(nuvarandeBild))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHattNuvarandeMaterial)
                    .addComponent(lblMangd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterial)
                    .addComponent(cbMaterialHatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMangdHatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyttMaterial)
                    .addComponent(lblMangd2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMaterialLager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMangdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTillverkningskostnad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTillverkningskostnad)
                    .addComponent(btnRaknaUtTillverkningskostnad))
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        try {
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
            
            JOptionPane.showMessageDialog(null, ("Hatt " + hattID + " har uppdaterats"));
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(HanteraHatt.class.getName()).log(Level.SEVERE, null, ex);
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
        btnRaknaUtTillverkningskostnad.setEnabled(true);
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
        btnAndra.setEnabled(false);
        btnSpara.setEnabled(false);
        cbMaterialLager.setEnabled(false);
        txtMangdMaterial.setEnabled(false);
        btnRaknaUtTillverkningskostnad.setEnabled(false);

        try {
            String hattID = txtHattID.getText();

            fyllCbKategori();
            fyllCbSkapare();
            fyllCbMaterialHatt();
            fyllCbMaterialLager();

            btnAndra.setEnabled(true);

            ArrayList<String> existerandeHattar;
            existerandeHattar = idb.fetchColumn("select HattID from Hatt");

            if (!existerandeHattar.contains(hattID)) {
                JOptionPane.showMessageDialog(null, "Beställning med denna ID existerar inte!");
            } else {

                cbSkapare.setSelectedItem(idb.fetchSingle("SELECT Namn FROM Personal WHERE PersonalID = (Select PersonalID from personal where PersonalID = (select Skapare from Hatt where HattID = " + hattID + "))"));
                cbKategori.setSelectedItem(idb.fetchSingle("SELECT Kategori FROM Hatt WHERE HattID = " + hattID));
                txtStorlek.setText(idb.fetchSingle("SELECT Storlek FROM Hatt WHERE HattID = " + hattID));
                txtTillverkningstimmar.setText(idb.fetchSingle("SELECT Tillverkningstimmar FROM Hatt WHERE HattID = " + hattID));
                txtBestallningsID.setText(idb.fetchSingle("SELECT Bestallning FROM Hatt WHERE HattID = " + hattID));
            }

            // Add an ItemListener to cbMaterialHatt
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

    private void btnRaknaUtTillverkningskostnadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaknaUtTillverkningskostnadActionPerformed
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
                double enhetspris = Double.parseDouble(idb.fetchSingle("SELECT enhetspris FROM material WHERE materialID= " +material));
                
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
    }//GEN-LAST:event_btnRaknaUtTillverkningskostnadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnRaknaUtTillverkningskostnad;
    private javax.swing.JButton btnSokHatt;
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnUppdateraBild;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JComboBox<String> cbMaterialHatt;
    private javax.swing.JComboBox<String> cbMaterialLager;
    private javax.swing.JComboBox<String> cbSkapare;
    private javax.swing.JLabel jLabel1;
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
