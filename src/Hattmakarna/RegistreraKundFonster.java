package Hattmakarna;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraKundFonster extends javax.swing.JFrame {

    private InfDB idb;
    
    public RegistreraKundFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraKundFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTitel = new javax.swing.JLabel();
        jKundNamn = new javax.swing.JLabel();
        jKundTelefon = new javax.swing.JLabel();
        jKundAdress = new javax.swing.JLabel();
        jKundMejl = new javax.swing.JLabel();
        jAngivetKundNamn = new javax.swing.JTextField();
        jAngiventKundTel = new javax.swing.JTextField();
        jAngivenKundAdress = new javax.swing.JTextField();
        jAngivenKundMejl = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        felMeddelande = new javax.swing.JLabel();
        rättMeddelande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTitel.setText("Registrera ny kund");

        jKundNamn.setText("Namn");

        jKundTelefon.setText("Telefonnummer");

        jKundAdress.setText("Gatuadress");

        jKundMejl.setText("E-postadress");

        jAngivetKundNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivetKundNamnActionPerformed(evt);
            }
        });

        jAngiventKundTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngiventKundTelActionPerformed(evt);
            }
        });

        jAngivenKundAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivenKundAdressActionPerformed(evt);
            }
        });

        jAngivenKundMejl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivenKundMejlActionPerformed(evt);
            }
        });

        jButton1.setText("Registrera kund");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jKundNamn)
                    .addComponent(jKundTelefon)
                    .addComponent(jKundAdress)
                    .addComponent(jKundMejl)
                    .addComponent(felMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rättMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAngivetKundNamn)
                    .addComponent(jAngiventKundTel)
                    .addComponent(jAngivenKundAdress)
                    .addComponent(jAngivenKundMejl)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAngivetKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKundTelefon)
                    .addComponent(jAngiventKundTel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAngivenKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKundAdress))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAngivenKundMejl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKundMejl))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(felMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rättMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAngivetKundNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivetKundNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivetKundNamnActionPerformed

    private void jAngivenKundAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivenKundAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivenKundAdressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jAngiventKundTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngiventKundTelActionPerformed
        felMeddelande.setText("");
        rättMeddelande.setText("");

        if (ValideringsKlass.rutanÄrTom(jAngivetKundNamn, jKundNamn) || ValideringsKlass.rutanÄrTom(jAngiventKundTel, jKundTelefon) || ValideringsKlass.rutanÄrTom(jAngivenKundAdress, jKundAdress) || ValideringsKlass.rutanÄrTom(jAngivenKundMejl, jKundMejl)) {
            felMeddelande.setText("Fel: Vänligen fyll i alla fält");
        } else {
            try {
                idb.insert("INSERT INTO Kund (Namn, Telefon, Adress, Email) VALUES (" + jAngivetKundNamn.getText() + "', '" + jAngiventKundTel.getText() + "', '" + jAngivenKundAdress.getText() + "', " + jAngivenKundMejl.getText() + ");");
            } catch (InfException ex) {
                Logger.getLogger(RegistreraKundFonster.class.getName()).log(Level.SEVERE, null, ex);
            }
                                    rättMeddelande.setText("En ny kund har registrerats!");

                            }
    }//GEN-LAST:event_jAngiventKundTelActionPerformed

    private void jAngivenKundMejlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivenKundMejlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivenKundMejlActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel felMeddelande;
    private javax.swing.JTextField jAngivenKundAdress;
    private javax.swing.JTextField jAngivenKundMejl;
    private javax.swing.JTextField jAngiventKundTel;
    private javax.swing.JTextField jAngivetKundNamn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jKundAdress;
    private javax.swing.JLabel jKundMejl;
    private javax.swing.JLabel jKundNamn;
    private javax.swing.JLabel jKundTelefon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTitel;
    private javax.swing.JLabel rättMeddelande;
    // End of variables declaration//GEN-END:variables
}
