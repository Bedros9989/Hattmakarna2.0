package Hattmakarna;

import oru.inf.InfDB;

public class MaterialFonster extends javax.swing.JFrame {

    private InfDB idb;

    public MaterialFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        MaterialFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegMaterial = new javax.swing.JButton();
        jBHanteraMaterial = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegMaterial.setText("Registrera nytt material");
        btnRegMaterial.setMaximumSize(new java.awt.Dimension(117, 23));
        btnRegMaterial.setMinimumSize(new java.awt.Dimension(117, 23));
        btnRegMaterial.setPreferredSize(new java.awt.Dimension(117, 23));
        btnRegMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMaterialActionPerformed(evt);
            }
        });

        jBHanteraMaterial.setText("Hantera material");
        jBHanteraMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHanteraMaterialActionPerformed(evt);
            }
        });

        jButton1.setText("Visa materiallager");
        jButton1.setMaximumSize(new java.awt.Dimension(117, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(117, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(117, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRegMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jBHanteraMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnRegMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jBHanteraMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMaterialActionPerformed
       new RegistreraMaterial(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegMaterialActionPerformed

    private void jBHanteraMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHanteraMaterialActionPerformed
        new HanteraMaterial(idb).setVisible(true);
    }//GEN-LAST:event_jBHanteraMaterialActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new SeMaterialLager(idb).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegMaterial;
    private javax.swing.JButton jBHanteraMaterial;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
