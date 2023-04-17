package Hattmakarna;

import java.util.ArrayList;
import java.util.Collections;
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
        lblKvantTyp = new javax.swing.JLabel();
        cbxTyp = new javax.swing.JComboBox<>();
        lblExtra = new javax.swing.JLabel();
        txtExtra = new javax.swing.JTextField();

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

        lblKvantTyp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKvantTyp.setText("Kvantitetstyp");

        cbxTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kvadratmetervara", "Antalvara", "Metervara" }));
        cbxTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTypActionPerformed(evt);
            }
        });

        lblExtra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblMaterialNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(lblEnhetsPris, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(lblKvantTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(77, 77, 77))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(59, 59, 59)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxTyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMaterialNamn, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                .addComponent(txtEnhetsPris)
                                .addComponent(txtExtra)))))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxTyp, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lblKvantTyp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(lblExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(felMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
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

    private void cbxTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTypActionPerformed
    if(cbxTyp.getSelectedItem().toString().equals("Kvadratmetervara")) {
        lblExtra.setText("Kvadratmeter");
        } else if (cbxTyp.getSelectedItem().toString().equals("Antalvara")) {
          lblExtra.setText("Antal");
        } else {
          lblExtra.setText("Meter");
        }                    
    }//GEN-LAST:event_cbxTypActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegMaterial;
    private javax.swing.JComboBox<String> cbxTyp;
    private javax.swing.JLabel confirmMeddelande;
    private javax.swing.JLabel felMeddelande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblEnhetsPris;
    private javax.swing.JLabel lblExtra;
    private javax.swing.JLabel lblKvantTyp;
    private javax.swing.JLabel lblMaterialNamn;
    private javax.swing.JTextField txtEnhetsPris;
    private javax.swing.JTextField txtExtra;
    private javax.swing.JTextField txtMaterialNamn;
    // End of variables declaration//GEN-END:variables
}
