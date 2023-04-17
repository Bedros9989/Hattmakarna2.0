package Hattmakarna;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
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

    public HanteraHatt(InfDB idb) {
        initComponents();
        this.idb = idb;
        HanteraHatt.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        fyllCbMaterialLager();
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
            
            ArrayList<String> hattMaterial = idb.fetchColumn("SELECT materialnamn FROM material where materialID in (SELECT material FROM hattmaterial WHERE hatt= " +hattID+ ")");
            Collections.sort(hattMaterial);

            for (String ettMaterial : hattMaterial) {
                cbMaterialHatt.addItem(ettMaterial);
            }
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }

    private void fyllCbMaterialLager() {
        try {
            ArrayList<String> allaMaterial = idb.fetchColumn("Select materialnamn from material");
            Collections.sort(allaMaterial);

            for (String ettMaterial : allaMaterial) {
                cbMaterialLager.addItem(ettMaterial);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbMaterialHatt, 0, 198, Short.MAX_VALUE)
                                    .addComponent(lblHattNuvarandeMaterial)
                                    .addComponent(lblNyttMaterial)
                                    .addComponent(cbMaterialLager, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMangdHatt)
                                    .addComponent(txtMangdMaterial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMangd)
                                            .addComponent(lblMangd2))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMaterial)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHattID)
                                    .addComponent(lblStorlek)
                                    .addComponent(lblTillverkningstimmar)
                                    .addComponent(lblBestallningsID)
                                    .addComponent(lblSkapare))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nuvarandeBild, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUppdateraBild, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtBestallningsID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTillverkningstimmar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtStorlek, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbKategori, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbSkapare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHattID, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblValkommen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblKategori)
                                        .addGap(89, 89, 89)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnSokHatt)
                        .addGap(33, 33, 33))))
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
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMangd)
                    .addComponent(lblHattNuvarandeMaterial))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
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
                    
            String q = "UPDATE hattmakare.Hatt t SET t.Storlek = ?, t.Skapare= ?,t.Kategori= ?,t.Tillverkningstimmar = ?,t.Bestallning= ?, t.BildData = ? WHERE t.HattID = ?";
            PreparedStatement pst = conn.prepareStatement(q);
            pst.setString(1, nyStorlek);
            pst.setString(2, nySkapare);
            pst.setString(3, nyKategori);
            pst.setString(4, nyTillverkningstimmar);
            pst.setString(5, nyBestallning);
            pst.setBytes(6, pimage);
            pst.setString(7, hattID);
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
    }//GEN-LAST:event_btnAndraActionPerformed

    private void txtMangdHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMangdHattActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMangdHattActionPerformed

    private void txtTillverkningstimmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTillverkningstimmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTillverkningstimmarActionPerformed

    private void btnSokHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokHattActionPerformed

        try {
            String hattID = txtHattID.getText();
            
            fyllCbKategori();
            fyllCbSkapare();
            fyllCbMaterialHatt();

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
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }//GEN-LAST:event_btnSokHattActionPerformed

    private void btnUppdateraBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraBildActionPerformed
        new ValjBild(registrera,this).setVisible(true);
    }//GEN-LAST:event_btnUppdateraBildActionPerformed

    private void nuvarandeBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuvarandeBildActionPerformed
        
        String hatt = txtHattID.getText();
        new KollaBild(hatt).setVisible(true);
        
    }//GEN-LAST:event_nuvarandeBildActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnSokHatt;
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnUppdateraBild;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JComboBox<String> cbMaterialHatt;
    private javax.swing.JComboBox<String> cbMaterialLager;
    private javax.swing.JComboBox<String> cbSkapare;
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
    private javax.swing.JLabel lblTillverkningstimmar;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JButton nuvarandeBild;
    private javax.swing.JTextField txtBestallningsID;
    private javax.swing.JTextField txtHattID;
    private javax.swing.JTextField txtMangdHatt;
    private javax.swing.JTextField txtMangdMaterial;
    private javax.swing.JTextField txtStorlek;
    private javax.swing.JTextField txtTillverkningstimmar;
    // End of variables declaration//GEN-END:variables
}
