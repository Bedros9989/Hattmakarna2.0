package Hattmakarna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraHattFonster extends javax.swing.JFrame {

    private InfDB idb;
    public byte[] pimage = null;
    private Connection conn = null;
    private String bestallningsID;
    private HanteraHatt hantera;

    public RegistreraHattFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        RegistreraHattFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lblHattIDPresentation.setText(hamtaHattID());
        fyllCbValjPersonal();
        fyllCbHattKategori();
        kontrolleraBestallning();
        kontrolleraTillverkningstimmar();
        kontrolleraTextHattStorlek();
        this.setLocationRelativeTo(null);
        conn = RegistreraHattFonster.DBConnect.connect();
    }

    private String hamtaHattID() {
        String nastaID = null;
        try {
            nastaID = idb.getAutoIncrement("hatt", "HattID");
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
        }
        return nastaID;
    }

    private void fyllCbValjPersonal() {
        try {
            ArrayList<String> allaPersonalNamn = idb.fetchColumn("Select namn from personal");
            Collections.sort(allaPersonalNamn);

            for (String Namn : allaPersonalNamn) {
                cbValjPersonal.addItem(Namn);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void fyllCbHattKategori() {
        cbHattKategori.addItem("Doktorshatt");
        cbHattKategori.addItem("Specialhatt");
        cbHattKategori.addItem("Studenthatt");
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

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblValkomstText = new javax.swing.JLabel();
        lblHattStorlek = new javax.swing.JLabel();
        txtHattStorlek = new javax.swing.JTextField();
        lblHattSkapare = new javax.swing.JLabel();
        cbValjPersonal = new javax.swing.JComboBox<>();
        btnRegistreraHatt = new javax.swing.JButton();
        lblHattID = new javax.swing.JLabel();
        lblHattIDPresentation = new javax.swing.JLabel();
        hattBild = new javax.swing.JButton();
        cbHattKategori = new javax.swing.JComboBox<>();
        lblHattKategorier = new javax.swing.JLabel();
        lblTillverkningstimmar = new javax.swing.JLabel();
        txtTillverkningstimmar = new javax.swing.JTextField();
        txtBestallning = new javax.swing.JTextField();
        lblBestallningsID = new javax.swing.JLabel();
        lblKanLamnasTom = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        lblValkomstText.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        lblValkomstText.setText("Registrera ny hatt");

        lblHattStorlek.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblHattStorlek.setText("Storlek");

        txtHattStorlek.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        lblHattSkapare.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblHattSkapare.setText("Skapare");

        cbValjPersonal.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        cbValjPersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj personal" }));
        cbValjPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjPersonalActionPerformed(evt);
            }
        });

        btnRegistreraHatt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnRegistreraHatt.setText("Registrera hatt");
        btnRegistreraHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraHattActionPerformed(evt);
            }
        });

        lblHattID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblHattID.setText("HattID");

        lblHattIDPresentation.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblHattIDPresentation.setText("hattID");

        hattBild.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        hattBild.setText("Lägg till bild");
        hattBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hattBildActionPerformed(evt);
            }
        });

        cbHattKategori.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        lblHattKategorier.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblHattKategorier.setText("Hattkategori");

        lblTillverkningstimmar.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblTillverkningstimmar.setText("Tillverkningstimmar");

        txtTillverkningstimmar.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        txtBestallning.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        lblBestallningsID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblBestallningsID.setText("BeställningsID");

        lblKanLamnasTom.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblKanLamnasTom.setText("Kan lämnas tom!");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hattmakarna/Ny.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblValkomstText, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblBestallningsID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblKanLamnasTom)
                                    .addComponent(txtBestallning, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHattID)
                                        .addGap(90, 90, 90))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTillverkningstimmar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblHattKategorier, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHattStorlek, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHattSkapare, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTillverkningstimmar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbHattKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbValjPersonal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtHattStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHattIDPresentation))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(hattBild, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistreraHatt)))
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblValkomstText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHattIDPresentation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbValjPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHattStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHattStorlek))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHattKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHattKategorier)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHattID)
                        .addGap(18, 18, 18)
                        .addComponent(lblHattSkapare)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTillverkningstimmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTillverkningstimmar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBestallning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBestallningsID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKanLamnasTom)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hattBild, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistreraHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbValjPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbValjPersonalActionPerformed

    private void btnRegistreraHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraHattActionPerformed
        /* För att lägga-bild funktionen ska funka så behövde vi 
           använda den officiella mysql.java.jar filen som fanns
           istället för InfDB.jar. Den är dock jättenkel att använda
           som ni kanske märker nedanför */
        if (ValideringsKlass.textFaltHarVarde(txtHattStorlek) && ValideringsKlass.textFaltHarVarde(txtTillverkningstimmar) && ValideringsKlass.isPositivt(txtHattStorlek) && ValideringsKlass.isPositivt(txtTillverkningstimmar)) {
            try {
                ArrayList<String> allaBestallningar = idb.fetchColumn("SELECT BestallningsID FROM bestallning");
                boolean bestallningFinns = false;

                for (String enBestallning : allaBestallningar) {
                    if (enBestallning.equals(txtBestallning.getText())) {
                        bestallningFinns = true;
                    }
                }

                if (txtBestallning.getText().isEmpty() || bestallningFinns == true) {

                    if (txtBestallning.getText().isEmpty()) {
                        bestallningsID = null;
                    } else {
                        bestallningsID = txtBestallning.getText();
                    }

                    String q = "INSERT INTO `hatt`(`hattID`, `Storlek`,`Skapare`,`Kategori`,`Bestallning`,`Tillverkningstimmar`,`BildData`) VALUES (?,?,?,?,?,?,?)";

                    String personalNamn = cbValjPersonal.getSelectedItem().toString();
                    String personalID = idb.fetchSingle("SELECT personalID FROM Personal WHERE namn = '" + personalNamn + "'");

                    PreparedStatement pst = conn.prepareStatement(q);
                    pst.setString(1, lblHattIDPresentation.getText());
                    pst.setString(2, txtHattStorlek.getText());
                    pst.setString(3, personalID);
                    pst.setString(4, cbHattKategori.getSelectedItem().toString());
                    pst.setString(5, bestallningsID);
                    pst.setString(6, txtTillverkningstimmar.getText());
                    pst.setBytes(7, pimage);
                    pst.execute();

                    JOptionPane.showMessageDialog(null, "Hatten har registrerats");
                    RegistreraHattFonster.this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "BeställningsIDt existerar inte!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Något gick fel");
                System.out.println("Internt felmeddelande" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnRegistreraHattActionPerformed

    private void kontrolleraTextHattStorlek() {
        txtHattStorlek.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

                ValideringsKlass.endastNummerTillåten(txtHattStorlek);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                ValideringsKlass.endastNummerTillåten(txtHattStorlek);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(txtHattStorlek);
            }
        });
    }

    private void kontrolleraTillverkningstimmar() {
        txtTillverkningstimmar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

                ValideringsKlass.endastNummerTillåten(txtTillverkningstimmar);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                ValideringsKlass.endastNummerTillåten(txtTillverkningstimmar);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(txtTillverkningstimmar);
            }
        });
    }

    private void kontrolleraBestallning() {
        txtBestallning.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(txtBestallning);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(txtBestallning);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(txtBestallning);
            }
        });
    }

    private void hattBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hattBildActionPerformed

        new ValjBild(this,hantera).setVisible(true);

    }//GEN-LAST:event_hattBildActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraHatt;
    private javax.swing.JComboBox<String> cbHattKategori;
    private javax.swing.JComboBox<String> cbValjPersonal;
    private javax.swing.JButton hattBild;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBestallningsID;
    private javax.swing.JLabel lblHattID;
    private javax.swing.JLabel lblHattIDPresentation;
    private javax.swing.JLabel lblHattKategorier;
    private javax.swing.JLabel lblHattSkapare;
    private javax.swing.JLabel lblHattStorlek;
    private javax.swing.JLabel lblKanLamnasTom;
    private javax.swing.JLabel lblTillverkningstimmar;
    private javax.swing.JLabel lblValkomstText;
    private javax.swing.JTextField txtBestallning;
    private javax.swing.JTextField txtHattStorlek;
    private javax.swing.JTextField txtTillverkningstimmar;
    // End of variables declaration//GEN-END:variables
}
