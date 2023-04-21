
package Hattmakarna;

import oru.inf.InfDB;

public class Leverantorer extends javax.swing.JFrame {

    
    private InfDB idb;
    private String ID;
    
    public Leverantorer(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID = ID;
        this.setLocationRelativeTo(null);
        Leverantorer.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nyLeverantör = new javax.swing.JButton();
        visaLeverantörer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nyLeverantör.setText("Registrera Leverantör");
        nyLeverantör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyLeverantörActionPerformed(evt);
            }
        });

        visaLeverantörer.setText("Visa Leverantörer");
        visaLeverantörer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaLeverantörerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(nyLeverantör)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visaLeverantörer, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nyLeverantör, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visaLeverantörer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nyLeverantörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyLeverantörActionPerformed
        new RegistreraLeverantor(idb).setVisible(true);
    }//GEN-LAST:event_nyLeverantörActionPerformed

    private void visaLeverantörerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaLeverantörerActionPerformed

        new BefintligaLeverantorer(idb).setVisible(true);

    }//GEN-LAST:event_visaLeverantörerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nyLeverantör;
    private javax.swing.JButton visaLeverantörer;
    // End of variables declaration//GEN-END:variables
}
