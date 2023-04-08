
package Hattmakarna;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraHattFonster extends javax.swing.JFrame {

    private InfDB idb;

    public RegistreraHattFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        RegistreraHattFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        lblHattIDPresentation.setText(hamtaHattID());
        fyllCbValjPersonal();
        this.setLocationRelativeTo(null);
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

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValkomstText = new javax.swing.JLabel();
        lblHattStorlek = new javax.swing.JLabel();
        lblHattBildLänk = new javax.swing.JLabel();
        txtHattStorlek = new javax.swing.JTextField();
        lblHattSkapare = new javax.swing.JLabel();
        cbValjPersonal = new javax.swing.JComboBox<>();
        txtHattBild = new javax.swing.JTextField();
        btnRegistreraHatt = new javax.swing.JButton();
        lblValjMaterial = new javax.swing.JLabel();
        cbHattMaterial = new javax.swing.JComboBox<>();
        lblMängdMaterial = new javax.swing.JLabel();
        txtHattMängd = new javax.swing.JTextField();
        lblHattID = new javax.swing.JLabel();
        lblHattIDPresentation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaMaterial = new javax.swing.JTextArea();
        lblValtMaterial = new javax.swing.JLabel();
        btnValjMaterial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblValkomstText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblValkomstText.setText("Registrera ny hatt");

        lblHattStorlek.setText("Storlek");

        lblHattBildLänk.setText("Bildlänk");

        lblHattSkapare.setText("Skapare");

        cbValjPersonal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj personal" }));
        cbValjPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbValjPersonalActionPerformed(evt);
            }
        });

        btnRegistreraHatt.setText("Registrera hatt");
        btnRegistreraHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraHattActionPerformed(evt);
            }
        });

        lblValjMaterial.setText("Välj material");

        cbHattMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj materialnamn" }));
        cbHattMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHattMaterialActionPerformed(evt);
            }
        });

        lblMängdMaterial.setText("Mängd material");

        txtHattMängd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHattMängdActionPerformed(evt);
            }
        });

        lblHattID.setText("HattID");

        lblHattIDPresentation.setText("hattID");

        txtAreaMaterial.setColumns(20);
        txtAreaMaterial.setRows(5);
        jScrollPane1.setViewportView(txtAreaMaterial);

        lblValtMaterial.setText("Valt material");

        btnValjMaterial.setText("Välj");
        btnValjMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValjMaterialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHattStorlek)
                            .addComponent(lblHattBildLänk)
                            .addComponent(lblValjMaterial)
                            .addComponent(lblMängdMaterial)
                            .addComponent(lblHattSkapare)
                            .addComponent(lblHattID))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbValjPersonal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHattStorlek)
                                .addComponent(txtHattBild)
                                .addComponent(cbHattMaterial, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHattMängd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnValjMaterial))
                            .addComponent(lblHattIDPresentation))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValtMaterial)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnRegistreraHatt)
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblValkomstText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblValkomstText)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHattID)
                    .addComponent(lblHattIDPresentation)
                    .addComponent(lblValtMaterial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHattSkapare)
                            .addComponent(cbValjPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHattStorlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHattStorlek))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHattMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValjMaterial))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMängdMaterial)
                            .addComponent(txtHattMängd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValjMaterial)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHattBildLänk)
                    .addComponent(txtHattBild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistreraHatt))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbValjPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbValjPersonalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbValjPersonalActionPerformed

    private void btnRegistreraHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraHattActionPerformed
        
        new RegistreraBild(idb).setVisible(true);
        
    }//GEN-LAST:event_btnRegistreraHattActionPerformed

    private void cbHattMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHattMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHattMaterialActionPerformed

    private void txtHattMängdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHattMängdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHattMängdActionPerformed

    private void btnValjMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValjMaterialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnValjMaterialActionPerformed

    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraHatt;
    private javax.swing.JButton btnValjMaterial;
    private javax.swing.JComboBox<String> cbHattMaterial;
    private javax.swing.JComboBox<String> cbValjPersonal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHattBildLänk;
    private javax.swing.JLabel lblHattID;
    private javax.swing.JLabel lblHattIDPresentation;
    private javax.swing.JLabel lblHattSkapare;
    private javax.swing.JLabel lblHattStorlek;
    private javax.swing.JLabel lblMängdMaterial;
    private javax.swing.JLabel lblValjMaterial;
    private javax.swing.JLabel lblValkomstText;
    private javax.swing.JLabel lblValtMaterial;
    private javax.swing.JTextArea txtAreaMaterial;
    private javax.swing.JTextField txtHattBild;
    private javax.swing.JTextField txtHattMängd;
    private javax.swing.JTextField txtHattStorlek;
    // End of variables declaration//GEN-END:variables
}
