
package Hattmakarna;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import oru.inf.InfDB;
import oru.inf.InfException;

public class BestallningGenomford extends javax.swing.JFrame {

    private InfDB idb;
    private String orderNr;
    private String vikt;
    private String datum;
    private String mottagare;
    private String kund;
    
    public BestallningGenomford(InfDB idb, String orderNr,String vikt,String datum, String mottagare,String kund) {
        initComponents();
        this.idb = idb;
        this.orderNr=orderNr;
        this.vikt=vikt;
        this.datum=datum;
        this.mottagare=mottagare;
        this.kund=kund;
        this.setLocationRelativeTo(null);
        BestallningGenomford.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBVisaFraktsedel = new javax.swing.JButton();
        jLBeställning = new javax.swing.JLabel();
        skickaBekräftelse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBVisaFraktsedel.setText("Visa fraktsedel");
        jBVisaFraktsedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisaFraktsedelActionPerformed(evt);
            }
        });

        jLBeställning.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLBeställning.setText("Beställning genomförd!");

        skickaBekräftelse.setText("Skicka Bekräftelse");
        skickaBekräftelse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skickaBekräftelseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLBeställning))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(skickaBekräftelse, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBVisaFraktsedel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLBeställning)
                .addGap(31, 31, 31)
                .addComponent(jBVisaFraktsedel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skickaBekräftelse, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void jBVisaFraktsedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisaFraktsedelActionPerformed
        
        
        
    }//GEN-LAST:event_jBVisaFraktsedelActionPerformed

    private void skickaBekräftelseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skickaBekräftelseActionPerformed
        
        try {
    String to = "omradeschef@mib.se";
    String subject = "Email subject";
    String body = "This is the email body text";
    URI emailUri = new URI("mailto", to, null, "subject=" + subject + "&body=" + body, null);
    Desktop.getDesktop().mail(emailUri);
} catch (URISyntaxException | IOException ex) {
    ex.printStackTrace();
}


        
    }//GEN-LAST:event_skickaBekräftelseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVisaFraktsedel;
    private javax.swing.JLabel jLBeställning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton skickaBekräftelse;
    // End of variables declaration//GEN-END:variables
}
