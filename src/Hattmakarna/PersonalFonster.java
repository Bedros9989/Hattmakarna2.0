package Hattmakarna;

import javax.swing.JOptionPane;
import oru.inf.InfDB; 
import oru.inf.InfException;

public class PersonalFonster extends javax.swing.JFrame {

    private InfDB idb;
    
        public PersonalFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        PersonalFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnÄndraPersonal = new javax.swing.JButton();
        btnRegPersonal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnÄndraPersonal.setText("Hantera personal information");
        btnÄndraPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnÄndraPersonalActionPerformed(evt);
            }
        });

        btnRegPersonal.setText("Registrera ny personal");
        btnRegPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegPersonalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnÄndraPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnÄndraPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnRegPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnÄndraPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnÄndraPersonalActionPerformed
        new HanteraPersonalFonster(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnÄndraPersonalActionPerformed

    private void btnRegPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegPersonalActionPerformed
        new RegistreraPersonal(idb).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegPersonalActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegPersonal;
    private javax.swing.JButton btnÄndraPersonal;
    // End of variables declaration//GEN-END:variables
}