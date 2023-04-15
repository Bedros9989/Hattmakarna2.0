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
        cbSkapare.setEnabled(false);
        cbKategori.setEnabled(false);
        txtStorlek.setEnabled(false);
        txtTillverkningstimmar.setEnabled(false);
        txtBestallningsID.setEnabled(false);
        btnUppdateraBild.setEnabled(false);
        cbMaterial.setEnabled(false);
        txtMangd.setEnabled(false);
        btnAndra.setEnabled(false);
        btnSpara.setEnabled(false);
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
        jLabel1.setText("Test");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkommen = new javax.swing.JLabel();
        lblHattID = new javax.swing.JLabel();
        txtHattID = new javax.swing.JTextField();
        btnSokHatt = new javax.swing.JButton();
        btnHattLista = new javax.swing.JButton();
        btnAndra = new javax.swing.JButton();
        btnSpara = new javax.swing.JButton();
        lblSkapare = new javax.swing.JLabel();
        lblKategori = new javax.swing.JLabel();
        lblStorlek = new javax.swing.JLabel();
        lblTillverkningstimmar = new javax.swing.JLabel();
        lblBestallningsID = new javax.swing.JLabel();
        lblMaterial = new javax.swing.JLabel();
        cbMaterial = new javax.swing.JComboBox<>();
        txtMangd = new javax.swing.JTextField();
        lblMangd = new javax.swing.JLabel();
        cbSkapare = new javax.swing.JComboBox<>();
        cbKategori = new javax.swing.JComboBox<>();
        txtStorlek = new javax.swing.JTextField();
        txtTillverkningstimmar = new javax.swing.JTextField();
        txtBestallningsID = new javax.swing.JTextField();
        btnUppdateraBild = new javax.swing.JButton();
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

        btnHattLista.setText("Lista");
        btnHattLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHattListaActionPerformed(evt);
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

        txtMangd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMangdActionPerformed(evt);
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

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMaterial)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblValkommen, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblKategori)
                                        .addGap(89, 89, 89)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHattID)
                                    .addComponent(lblStorlek)
                                    .addComponent(lblTillverkningstimmar)
                                    .addComponent(lblBestallningsID)
                                    .addComponent(lblSkapare))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBestallningsID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTillverkningstimmar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtStorlek, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbKategori, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbSkapare, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHattID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnUppdateraBild, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMangd)
                    .addComponent(btnSokHatt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHattLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMangd))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHattLista)
                .addGap(15, 15, 15)
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
                .addComponent(btnUppdateraBild)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblMangd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterial)
                    .addComponent(cbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMangd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHattListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHattListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHattListaActionPerformed

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
        cbMaterial.setEnabled(true);
        txtMangd.setEnabled(true);
        btnSpara.setEnabled(true);
    }//GEN-LAST:event_btnAndraActionPerformed

    private void txtMangdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMangdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMangdActionPerformed

    private void txtTillverkningstimmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTillverkningstimmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTillverkningstimmarActionPerformed

    private void btnSokHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokHattActionPerformed

        try {
            String hattID = txtHattID.getText();

            fyllCbKategori();
            fyllCbSkapare();

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndra;
    private javax.swing.JButton btnHattLista;
    private javax.swing.JButton btnSokHatt;
    private javax.swing.JButton btnSpara;
    private javax.swing.JButton btnUppdateraBild;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JComboBox<String> cbMaterial;
    private javax.swing.JComboBox<String> cbSkapare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBestallningsID;
    private javax.swing.JLabel lblHattID;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblMangd;
    private javax.swing.JLabel lblMaterial;
    private javax.swing.JLabel lblSkapare;
    private javax.swing.JLabel lblStorlek;
    private javax.swing.JLabel lblTillverkningstimmar;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JTextField txtBestallningsID;
    private javax.swing.JTextField txtHattID;
    private javax.swing.JTextField txtMangd;
    private javax.swing.JTextField txtStorlek;
    private javax.swing.JTextField txtTillverkningstimmar;
    // End of variables declaration//GEN-END:variables
}
