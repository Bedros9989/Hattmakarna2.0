
package Hattmakarna;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import oru.inf.InfDB;

/**
 *
 * @author augus
 */
public class HattFonster extends javax.swing.JFrame {

    private InfDB idb;

    public HattFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        HattFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistreraHatt = new javax.swing.JButton();
        btnAndraHatt = new javax.swing.JButton();
        btnAndraHatt1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnRegistreraHatt.setText("Registrera ny hatt");
        btnRegistreraHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraHattActionPerformed(evt);
            }
        });

        btnAndraHatt.setText("Ändra hatt");
        btnAndraHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraHattActionPerformed(evt);
            }
        });

        btnAndraHatt1.setText("Se hattar i Lager");
        btnAndraHatt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraHatt1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAndraHatt1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAndraHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistreraHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndraHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistreraHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAndraHatt1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraHattActionPerformed
        new RegistreraHattFonster(idb).setVisible(true);
    }//GEN-LAST:event_btnRegistreraHattActionPerformed

    private void btnAndraHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraHattActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAndraHattActionPerformed

    private void btnAndraHatt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraHatt1ActionPerformed
new SeHattLager(idb).setVisible(true);        
    }//GEN-LAST:event_btnAndraHatt1ActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAndraHatt;
    private javax.swing.JButton btnAndraHatt1;
    private javax.swing.JButton btnRegistreraHatt;
    // End of variables declaration//GEN-END:variables
}
