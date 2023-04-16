package Hattmakarna;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraMaterial extends javax.swing.JFrame {

    private InfDB idb;
    
    public RegistreraMaterial(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraMaterial.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblMaterialNamn = new javax.swing.JLabel();
        lblEnhetsPris = new javax.swing.JLabel();
        txtMaterialNamn = new javax.swing.JTextField();
        txtEnhetsPris = new javax.swing.JTextField();
        btnRegMaterial = new javax.swing.JButton();
        felMeddelande = new javax.swing.JLabel();
        confirmMeddelande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Registrera nytt material");

        lblMaterialNamn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMaterialNamn.setText("Materialnamn");

        lblEnhetsPris.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEnhetsPris.setText("Enhetspris");

        txtMaterialNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialNamnActionPerformed(evt);
            }
        });

        txtEnhetsPris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnhetsPrisActionPerformed(evt);
            }
        });

        btnRegMaterial.setText("Registrera material");
        btnRegMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMaterialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(felMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                .addComponent(confirmMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegMaterial))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblMaterialNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(lblEnhetsPris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(77, 77, 77)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaterialNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(txtEnhetsPris)))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterialNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterialNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnhetsPris, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnhetsPris, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(felMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(73, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMaterialActionPerformed
    felMeddelande.setText("");
    confirmMeddelande.setText("");
        
        if (ValideringsKlass.rutaEmpty(txtMaterialNamn) || ValideringsKlass.rutaEmpty(txtEnhetsPris)) {
           felMeddelande.setText("Fel: Vänligen fyll i alla fält");
        } else {
            try {
                String mID = idb.getAutoIncrement("Material", "MaterialID");
                idb.insert("INSERT INTO Material VALUES (" + mID + ", '" + txtMaterialNamn.getText() + "', '" + txtEnhetsPris.getText() + "');");
                confirmMeddelande.setText("Ett nytt material har registrerats!");
            } catch (InfException exc) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            } 
        }
    }//GEN-LAST:event_btnRegMaterialActionPerformed

    private void txtMaterialNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaterialNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterialNamnActionPerformed

    private void txtEnhetsPrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnhetsPrisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnhetsPrisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegMaterial;
    private javax.swing.JLabel confirmMeddelande;
    private javax.swing.JLabel felMeddelande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEnhetsPris;
    private javax.swing.JLabel lblMaterialNamn;
    private javax.swing.JTextField txtEnhetsPris;
    private javax.swing.JTextField txtMaterialNamn;
    // End of variables declaration//GEN-END:variables
}
