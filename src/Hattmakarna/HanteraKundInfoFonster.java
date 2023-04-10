package Hattmakarna;

import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraKundInfoFonster extends javax.swing.JFrame {

    private InfDB idb;

    public HanteraKundInfoFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
       // HanteraKundInfoFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Hantera kundinformation");

        jLabel2.setText("Ange KundID");

        jÄndraKundMejl.setText("E-postadress");

        jLojalitetsKund.setText("Lojalitetskund");

        jÄndraKundTel.setText("Telefonnummer");

        jÄndraKundNamn.setText("Namn");

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
                    .addComponent(jÄndraKundNamn)
                    .addComponent(jLojalitetsKund)
                    .addComponent(jÄndraKundAdress)
                    .addComponent(jÄndraKundTel)
                    .addComponent(jLabel2)
                    .addComponent(jÄndraKundMejl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jAngivetKundID, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jKundIDKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 67, Short.MAX_VALUE))
                    .addComponent(lblKundNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKundTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKundAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKundEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKundLojalitet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jKundIDKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jAngivetKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndraKundNamn)
                    .addComponent(lblKundNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jÄndraKundTel)
                    .addComponent(lblKundTel, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jÄndraKundAdress, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(lblKundAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jÄndraKundMejl)
                    .addComponent(lblKundEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLojalitetsKund)
                    .addComponent(lblKundLojalitet, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
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

            info = idb.fetchRow("SELECT Namn, Adress, Telefon, Lojalitet, Email FROM Kund WHERE KundID = '" + jAngivetKundID + "';");

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
