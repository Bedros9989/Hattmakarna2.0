
package Hattmakarna;

import oru.inf.InfDB;


public class Bestallningar extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;

    public Bestallningar(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID=ID;
        this.setLocationRelativeTo(null);
        Bestallningar.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hanteraBeställning = new javax.swing.JButton();
        nyBeställning = new javax.swing.JButton();
        statistik = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        hanteraBeställning.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        hanteraBeställning.setForeground(new java.awt.Color(51, 51, 51));
        hanteraBeställning.setText("Hantera Beställning");
        hanteraBeställning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hanteraBeställningActionPerformed(evt);
            }
        });

        nyBeställning.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        nyBeställning.setForeground(new java.awt.Color(51, 51, 51));
        nyBeställning.setText("Ny Beställning");
        nyBeställning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nyBeställningActionPerformed(evt);
            }
        });

        statistik.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        statistik.setForeground(new java.awt.Color(51, 51, 51));
        statistik.setText("Statistik");
        statistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hattmakarna/Beställning.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(62, 62, 62)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addGap(73, 73, 73)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nyBeställning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hanteraBeställning, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statistik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(nyBeställning, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hanteraBeställning, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void hanteraBeställningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hanteraBeställningActionPerformed
        
        new HanteraBestallning(idb,ID).setVisible(true);
        
    }//GEN-LAST:event_hanteraBeställningActionPerformed

    private void nyBeställningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nyBeställningActionPerformed
         
        new RegistreraBestallning(idb,ID).setVisible(true);
        
         
    }//GEN-LAST:event_nyBeställningActionPerformed

    private void statistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistikActionPerformed
        
        new Statistik(idb).setVisible(true);
        
    }//GEN-LAST:event_statistikActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hanteraBeställning;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton nyBeställning;
    private javax.swing.JButton statistik;
    // End of variables declaration//GEN-END:variables
}
