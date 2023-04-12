package Hattmakarna;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class SeKundInfoFonster extends javax.swing.JFrame {

    private InfDB idb;

    public SeKundInfoFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
       // SeKundInfoFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jÄndraKundMejl = new javax.swing.JLabel();
        jLojalitetsKund = new javax.swing.JLabel();
        jÄndraKundTel = new javax.swing.JLabel();
        jÄndraKundNamn = new javax.swing.JLabel();
        jÄndraKundAdress = new javax.swing.JLabel();
        jAngivetKundID = new javax.swing.JTextField();
        jKundIDKnapp = new javax.swing.JButton();
        lblKundNamn = new javax.swing.JLabel();
        lblKundTel = new javax.swing.JLabel();
        lblKundAdress = new javax.swing.JLabel();
        lblKundEmail = new javax.swing.JLabel();
        lblKundLojalitet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Sök kundinformation");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ange KundID");

        jÄndraKundMejl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraKundMejl.setText("E-postadress");

        jLojalitetsKund.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLojalitetsKund.setText("Lojalitetskund");

        jÄndraKundTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraKundTel.setText("Telefonnummer");

        jÄndraKundNamn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraKundNamn.setText("Namn");

        jÄndraKundAdress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraKundAdress.setText("Gatuadress");

        jAngivetKundID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAngivetKundIDActionPerformed(evt);
            }
        });

        jKundIDKnapp.setText("OK");
        jKundIDKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKundIDKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jÄndraKundNamn)
                            .addComponent(jÄndraKundAdress)
                            .addComponent(jÄndraKundTel)
                            .addComponent(jLojalitetsKund)
                            .addComponent(jÄndraKundMejl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jAngivetKundID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jKundIDKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblKundEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblKundLojalitet, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKundTel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jÄndraKundNamn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAngivetKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jKundIDKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jÄndraKundTel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblKundTel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jÄndraKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jÄndraKundMejl)
                        .addGap(18, 18, 18)
                        .addComponent(jLojalitetsKund)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblKundEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblKundLojalitet, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAngivetKundIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAngivetKundIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAngivetKundIDActionPerformed

    private void jKundIDKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKundIDKnappActionPerformed
    if(jAngivetKundID.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Vänligen fyll i ett KundID");
    }
        setInfo();      
    }//GEN-LAST:event_jKundIDKnappActionPerformed

        public HashMap getInfoKund() {    
         HashMap<String, String> info = new HashMap<>();
        try {

            info = idb.fetchRow("SELECT Namn, Adress, Telefonnummer, Lojalitet, Email FROM Kund WHERE KundID = '" + jAngivetKundID.getText() + "';");

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");

        }
        return info;
    }
   
    
 public void setInfo() {
        HashMap<String, String> info;
        info = getInfoKund();

        String namn = info.get("Namn");
        String adress = info.get("Adress");
        String telefon = info.get("Telefonnummer");
        String lojalitet = info.get("Lojalitet");
        String email = info.get("Email");

        lblKundNamn.setText(namn);
        lblKundAdress.setText(adress);
        lblKundTel.setText(telefon);
        lblKundLojalitet.setText(lojalitet);
        lblKundEmail.setText(email);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAngivetKundID;
    private javax.swing.JButton jKundIDKnapp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLojalitetsKund;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jÄndraKundAdress;
    private javax.swing.JLabel jÄndraKundMejl;
    private javax.swing.JLabel jÄndraKundNamn;
    private javax.swing.JLabel jÄndraKundTel;
    private javax.swing.JLabel lblKundAdress;
    private javax.swing.JLabel lblKundEmail;
    private javax.swing.JLabel lblKundLojalitet;
    private javax.swing.JLabel lblKundNamn;
    private javax.swing.JLabel lblKundTel;
    // End of variables declaration//GEN-END:variables
}
