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
        btnRegistreraKund = new javax.swing.JButton();
        felMeddelande = new javax.swing.JLabel();
        confirmMeddelande = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        jTitel.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jTitel.setText("Registrera ny kund");

        jKundNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jKundNamn.setText("Namn");

        jKundTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jKundTelefon.setText("Telefonnummer");

        jKundAdress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jKundAdress.setText("Gatuadress");

        jKundMejl.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jKundMejl.setText("E-postadress");

        jAngivetKundNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jAngivetKundNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivetKundNamnActionPerformed(evt);
            }
        });

        jAngiventKundTel.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jAngivenKundAdress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jAngivenKundAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivenKundAdressActionPerformed(evt);
            }
        });

        jAngivenKundMejl.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        btnRegistreraKund.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnRegistreraKund.setText("Registrera kund");
        btnRegistreraKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistreraKundActionPerformed(evt);
            }
        });

        felMeddelande.setForeground(new java.awt.Color(255, 0, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hattmakarna/Ny.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel4)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel4)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(felMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jKundNamn)
                            .addComponent(jKundTelefon)
                            .addComponent(jKundAdress)
                            .addComponent(jKundMejl))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jAngivenKundMejl, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jAngivenKundAdress)
                            .addComponent(jAngiventKundTel)
                            .addComponent(jAngivetKundNamn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTitel)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistreraKund, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAngivetKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAngiventKundTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jKundTelefon))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAngivenKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jKundAdress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAngivenKundMejl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jKundMejl))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistreraKund, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(felMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(confirmMeddelande, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAngivetKundNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivetKundNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivetKundNamnActionPerformed

    private void jAngivenKundAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivenKundAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivenKundAdressActionPerformed

    private void btnRegistreraKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistreraKundActionPerformed
    felMeddelande.setText("");
    confirmMeddelande.setText("");
        
        if (ValideringsKlass.rutaEmpty(jAngivetKundNamn) || ValideringsKlass.rutaEmpty(jAngiventKundTel) || ValideringsKlass.rutaEmpty(jAngivenKundAdress) || ValideringsKlass.rutaEmpty(jAngivenKundMejl)) {
           felMeddelande.setText("Fel: Vänligen fyll i alla fält");
        } else {
            if (ValideringsKlass.endastNummerTillåten(jAngiventKundTel)) {
                }
                else {
            try {
                String kID = idb.getAutoIncrement("Kund", "KundID");
                idb.insert("INSERT INTO Kund VALUES (" + kID + ", '" + jAngivetKundNamn.getText() + "', '" + jAngivenKundAdress.getText() + "', '" + jAngiventKundTel.getText() + "', 0 , '" + jAngivenKundMejl.getText() + "');");
                confirmMeddelande.setText("En ny kund har registrerats!");
            } catch (InfException exc) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            } 
        }
    }//GEN-LAST:event_btnRegistreraKundActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraKund;
    private javax.swing.JLabel confirmMeddelande;
    private javax.swing.JLabel felMeddelande;
    private javax.swing.JTextField jAngivenKundAdress;
    private javax.swing.JTextField jAngivenKundMejl;
    private javax.swing.JTextField jAngiventKundTel;
    private javax.swing.JTextField jAngivetKundNamn;
    private javax.swing.JLabel jKundAdress;
    private javax.swing.JLabel jKundMejl;
    private javax.swing.JLabel jKundNamn;
    private javax.swing.JLabel jKundTelefon;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jTitel;
    // End of variables declaration//GEN-END:variables
}
