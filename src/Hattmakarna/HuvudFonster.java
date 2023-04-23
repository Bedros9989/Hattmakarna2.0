package Hattmakarna;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;


public class HuvudFonster extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;

    public HuvudFonster(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID = ID;
        this.setLocationRelativeTo(null);
        HuvudFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        hej();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        beställningar = new javax.swing.JButton();
        kunder = new javax.swing.JButton();
        material = new javax.swing.JButton();
        btnHattar = new javax.swing.JButton();
        loggaUt = new javax.swing.JButton();
        btnPersonal = new javax.swing.JButton();
        leverantorer = new javax.swing.JButton();
        hej = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        beställningar.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        beställningar.setForeground(new java.awt.Color(51, 51, 51));
        beställningar.setText("Beställningar");
        beställningar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beställningarActionPerformed(evt);
            }
        });

        kunder.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        kunder.setForeground(new java.awt.Color(51, 51, 51));
        kunder.setText("Kunder");
        kunder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kunderActionPerformed(evt);
            }
        });

        material.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        material.setForeground(new java.awt.Color(51, 51, 51));
        material.setText("Material");
        material.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialActionPerformed(evt);
            }
        });

        btnHattar.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        btnHattar.setForeground(new java.awt.Color(51, 51, 51));
        btnHattar.setText("Hattar");
        btnHattar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHattarActionPerformed(evt);
            }
        });

        loggaUt.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        loggaUt.setForeground(new java.awt.Color(51, 51, 51));
        loggaUt.setText("Logga ut");
        loggaUt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loggaUtActionPerformed(evt);
            }
        });

        btnPersonal.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        btnPersonal.setForeground(new java.awt.Color(51, 51, 51));
        btnPersonal.setText("Personal");
        btnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalActionPerformed(evt);
            }
        });

        leverantorer.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        leverantorer.setForeground(new java.awt.Color(51, 51, 51));
        leverantorer.setText("Leverantör");
        leverantorer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leverantorerActionPerformed(evt);
            }
        });

        hej.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        hej.setForeground(new java.awt.Color(255, 255, 255));
        hej.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hej)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(material, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(beställningar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHattar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kunder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPersonal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(leverantorer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(loggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(hej)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kunder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(beställningar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(material, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(leverantorer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHattar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(loggaUt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void hej(){
        
        try
        {
            
            String hejMeddelande = idb.fetchSingle("Select Namn from Personal where PersonalID="+ID);
            String welcome = "Välkommen"+" "+hejMeddelande+" "+"vad vill du göra idag?";
            hej.setText(welcome);
            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
           
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            
            
        }
    }
    
    private void beställningarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beställningarActionPerformed
        
        new Bestallningar(idb, ID).setVisible(true);
        
    }//GEN-LAST:event_beställningarActionPerformed

    private void materialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialActionPerformed
    new MaterialFonster(idb).setVisible(true);
    }//GEN-LAST:event_materialActionPerformed

    private void kunderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kunderActionPerformed
        
        new KundFonster(idb).setVisible(true);
        
    }//GEN-LAST:event_kunderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHattarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHattarActionPerformed
        new HattFonster(idb).setVisible(true);
    }//GEN-LAST:event_btnHattarActionPerformed

    private void loggaUtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loggaUtActionPerformed
        
        dispose();
        new InloggningsFonster(idb).setVisible(true);
        
    }//GEN-LAST:event_loggaUtActionPerformed

    private void leverantorerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leverantorerActionPerformed
         new Leverantorer(idb,ID).setVisible(true);
    }//GEN-LAST:event_leverantorerActionPerformed

    private void btnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalActionPerformed
        
        new PersonalFonster(idb).setVisible(true); 
        
    }//GEN-LAST:event_btnPersonalActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beställningar;
    private javax.swing.JButton btnHattar;
    private javax.swing.JButton btnPersonal;
    private javax.swing.JLabel hej;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kunder;
    private javax.swing.JButton leverantorer;
    private javax.swing.JButton loggaUt;
    private javax.swing.JButton material;
    // End of variables declaration//GEN-END:variables
}
