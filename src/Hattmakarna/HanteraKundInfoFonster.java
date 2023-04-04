package Hattmakarna;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraKundInfoFonster extends javax.swing.JFrame {

    private InfDB idb;

    public HanteraKundInfoFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        HanteraKundInfoFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jÄndratKundNamn = new javax.swing.JTextField();
        jÄndratKundTel = new javax.swing.JTextField();
        jÄndraKundMejl = new javax.swing.JLabel();
        jAngeLojalitetsKund = new javax.swing.JTextField();
        jLojalitetsKund = new javax.swing.JLabel();
        jÄndraKundTel = new javax.swing.JLabel();
        jÄndradKundMejl = new javax.swing.JTextField();
        jÄndradKundAdress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jÄndraKundNamn = new javax.swing.JLabel();
        jÄndraKundAdress = new javax.swing.JLabel();
        jAngivetKundID = new javax.swing.JTextField();
        jKundIDKnapp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Hantera kundinformation");

        jLabel2.setText("Ange KundID");

        jÄndratKundNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jÄndratKundNamnActionPerformed(evt);
            }
        });

        jÄndraKundMejl.setText("E-postadress");

        jLojalitetsKund.setText("Lojalitetskund");

        jÄndraKundTel.setText("Telefonnummer");

        jButton1.setText("Ändra kundinformation");

        jÄndraKundNamn.setText("Namn");

        jÄndraKundAdress.setText("Gatuadress");

        jAngivetKundID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivetKundIDActionPerformed(evt);
            }
        });

        jKundIDKnapp.setText("OK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jÄndraKundNamn)
                    .addComponent(jLojalitetsKund)
                    .addComponent(jÄndraKundAdress)
                    .addComponent(jÄndraKundTel)
                    .addComponent(jLabel2)
                    .addComponent(jÄndraKundMejl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jÄndratKundTel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndradKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndradKundMejl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAngeLojalitetsKund, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndratKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jAngivetKundID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jKundIDKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jAngivetKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKundIDKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndratKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraKundNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndratKundTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraKundTel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndradKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraKundAdress))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndradKundMejl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraKundMejl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAngeLojalitetsKund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLojalitetsKund))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAngivetKundIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivetKundIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivetKundIDActionPerformed

    private void jÄndratKundNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jÄndratKundNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jÄndratKundNamnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAngeLojalitetsKund;
    private javax.swing.JTextField jAngivetKundID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jKundIDKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLojalitetsKund;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jÄndraKundAdress;
    private javax.swing.JLabel jÄndraKundMejl;
    private javax.swing.JLabel jÄndraKundNamn;
    private javax.swing.JLabel jÄndraKundTel;
    private javax.swing.JTextField jÄndradKundAdress;
    private javax.swing.JTextField jÄndradKundMejl;
    private javax.swing.JTextField jÄndratKundNamn;
    private javax.swing.JTextField jÄndratKundTel;
    // End of variables declaration//GEN-END:variables
}
