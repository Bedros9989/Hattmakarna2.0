package Hattmakarna;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraBestallning extends javax.swing.JFrame {

    private InfDB idb;

    public RegistreraBestallning(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraBestallning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnUppdateraKundReg.setVisible(false);
        fyllcbHattID();
        fyllcbPersonalID();
        fyllcbKundID();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbKundID = new javax.swing.JComboBox<>();
        jbRegKund = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbHattID = new javax.swing.JComboBox<>();
        jbLaggTillHatt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaAdress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbAnsvarig = new javax.swing.JComboBox<>();
        jDateChooserReg = new com.toedter.calendar.JDateChooser();
        btnUppdateraKundReg = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jbRegBestallning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Registrera beställning");

        jLabel2.setText("Datum (åååå-mm-dd)");

        jLabel4.setText("Leveransadress");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel5.setText("Existerande kund");

        jLabel6.setText("HattID");

        cbKundID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj kundID" }));
        cbKundID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKundIDActionPerformed(evt);
            }
        });

        jbRegKund.setText("Registrera kund");
        jbRegKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegKundActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel7.setText("Ny kund");

        cbHattID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj hattID" }));
        cbHattID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHattIDActionPerformed(evt);
            }
        });

        jbLaggTillHatt.setText("Lägg till ytterligare hatt");
        jbLaggTillHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLaggTillHattActionPerformed(evt);
            }
        });

        txtareaAdress.setColumns(20);
        txtareaAdress.setRows(5);
        txtareaAdress.setText("Namn/Företag\nPostadress\nPostnummer Postort\nLand (om utrikes)");
        txtareaAdress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtareaAdressMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtareaAdress);

        jLabel3.setText("Kund");

        jLabel8.setText("Ansvarig för beställning");

        cbAnsvarig.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj" }));
        cbAnsvarig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnsvarigActionPerformed(evt);
            }
        });

        btnUppdateraKundReg.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        btnUppdateraKundReg.setText("Uppdatera kundregister");
        btnUppdateraKundReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraKundRegActionPerformed(evt);
            }
        });

        jButton1.setText("tillfällig knapp till hantera beställning som ej funkar");
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
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46)
                        .addComponent(cbAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUppdateraKundReg)
                            .addComponent(jbRegKund))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jButton1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(84, 84, 84)
                                .addComponent(cbHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jbLaggTillHatt))
                            .addComponent(jLabel1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegKund)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUppdateraKundReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLaggTillHatt))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jbRegBestallning.setText("Registrera beställning");
        jbRegBestallning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegBestallningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRegBestallning)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbRegBestallning)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegBestallningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegBestallningActionPerformed
        // Saker som ej syns i designen men som ska läggas till: :
        // Skapa beställningsID getautoincrement
       
        // totalsumma (kan det hämtas ut automatiskt genom HattID + kundens lojalitet kanske?)
        
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        String regDatum = DateFormat.format(jDateChooserReg.getDate());
    }//GEN-LAST:event_jbRegBestallningActionPerformed

    private void jbRegKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegKundActionPerformed
        // Länk till RegistreraKundFonster?
        new RegistreraKundFonster(idb).setVisible(true);
        btnUppdateraKundReg.setVisible(true);
        
    }//GEN-LAST:event_jbRegKundActionPerformed

    private void jbLaggTillHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLaggTillHattActionPerformed
        // Leder till att hatt 1 läggs till + chans lägga till ny hatt
    }//GEN-LAST:event_jbLaggTillHattActionPerformed

    private void cbAnsvarigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnsvarigActionPerformed
        // bättre hämta namnen från tabellen personal ifall någon mer personal läggs till
    }//GEN-LAST:event_cbAnsvarigActionPerformed

    private void txtareaAdressMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtareaAdressMousePressed
        // textfältet ska bli tomt när man klickar på det, det blir det med denna
        txtareaAdress.setText("");
    }//GEN-LAST:event_txtareaAdressMousePressed

    private void cbHattIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHattIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHattIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //ska raderas sen
        new hanteraBestallningFonster(idb).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbKundIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKundIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKundIDActionPerformed

    private void btnUppdateraKundRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraKundRegActionPerformed
        // TODO add your handling code here:
//        String fraga= "Update table Bestallning";
//        
//        try{
//            idb.
//            JOptionPane.showMessageDialog(null, "Kundregistret är uppdaterat!");
//    }
//        catch (InfException e){
//            System.out.println("något är fel");
//        }
    
        
    }//GEN-LAST:event_btnUppdateraKundRegActionPerformed

private void fyllcbHattID(){
    String fraga= "select HattID from Hatt";
    ArrayList<String> allaHattIDn;
    try {
        allaHattIDn= idb.fetchColumn(fraga);
        
        for (String hattID: allaHattIDn){
            cbHattID.addItem(hattID);
        }
        
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
    }
}
    
    private void fyllcbPersonalID(){
    String fraga= "select PersonalID from Personal";
    ArrayList<String> allaPersonalIDn;
    try {
        allaPersonalIDn= idb.fetchColumn(fraga);
        
        for (String PersonalID: allaPersonalIDn){
            cbAnsvarig.addItem(PersonalID);
        }
        
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
    }
    
    
    
}
    
    public void fyllcbKundID(){
        String fraga= "select KundID from Kund";
        ArrayList<String> allaKundIDn;
        
        try{
            allaKundIDn= idb.fetchColumn(fraga);
            for (String enKund: allaKundIDn){
              cbKundID.addItem(enKund);
            }
            
        }  catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
    }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUppdateraKundReg;
    private javax.swing.JComboBox<String> cbAnsvarig;
    private javax.swing.JComboBox<String> cbHattID;
    private javax.swing.JComboBox<String> cbKundID;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooserReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLaggTillHatt;
    private javax.swing.JButton jbRegBestallning;
    private javax.swing.JButton jbRegKund;
    private javax.swing.JTextArea txtareaAdress;
    // End of variables declaration//GEN-END:variables
}
