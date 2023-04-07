package Hattmakarna;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraBestallning extends javax.swing.JFrame {

<<<<<<< HEAD
    private InfDB idb;
    DefaultListModel<String> listModel = new DefaultListModel<>(); 
=======
    private InfDB idb; 
    private String valdHatt;
    private String ID;
    DefaultListModel<String> model = new DefaultListModel<String>();
>>>>>>> parent of 73abaef (.)
    
    public RegistreraBestallning(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraBestallning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        btnUppdateraKundReg.setVisible(false);
        tillagdHatt.setModel(listModel);
       
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
        jbRegBestallning = new javax.swing.JButton();
<<<<<<< HEAD
        tillagdHatt = new javax.swing.JList<>();
        antal = new javax.swing.JTextField();
=======
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        taBort = new javax.swing.JButton();
>>>>>>> parent of 73abaef (.)

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Registrera beställning");

        jLabel2.setText("Datum (åååå-mm-dd)");

        jLabel4.setText("Leveransadress");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel5.setText("Existerande kund");

        jLabel6.setText("Hatt");

        cbKundID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj kundID" }));

        jbRegKund.setText("Registrera kund");
        jbRegKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegKundActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel7.setText("Ny kund");

        cbHattID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Hatt" }));
        cbHattID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHattIDActionPerformed(evt);
            }
        });

        jbLaggTillHatt.setText("Lägg till hatt");
        jbLaggTillHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLaggTillHattActionPerformed(evt);
            }
        });

        txtareaAdress.setColumns(20);
        txtareaAdress.setRows(5);
        jScrollPane1.setViewportView(txtareaAdress);

        jLabel3.setText("Kund");

        jLabel8.setText("Ansvarig för beställning");

        cbAnsvarig.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj" }));

        jDateChooserReg.setDateFormatString("yyyy-MM-dd");

        btnUppdateraKundReg.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        btnUppdateraKundReg.setText("Uppdatera kundregister");
        btnUppdateraKundReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraKundRegActionPerformed(evt);
            }
        });

        jbRegBestallning.setText("Registrera beställning");
        jbRegBestallning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegBestallningActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        antal.setText("antal");
=======
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel5.setText("Totalsumma:");

        jTextField1.setText("\n");

        jScrollPane3.setViewportView(jList1);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel7.setText("Översikt");

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });
>>>>>>> parent of 73abaef (.)

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(46, 46, 46)
                        .addComponent(cbAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbRegBestallning)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(40, 40, 40)
                                .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(89, 89, 89)
                                        .addComponent(jLabel5)
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(antal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbLaggTillHatt)
                                        .addGap(46, 46, 46)
                                        .addComponent(tillagdHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel7)
                                        .addGap(27, 27, 27)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnUppdateraKundReg)
                                            .addComponent(jbRegKund)))))
                            .addComponent(jLabel4))
                        .addContainerGap(25, Short.MAX_VALUE))))
=======
                .addGap(149, 149, 149)
                .addComponent(jbRegBestallning)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(taBort, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61))
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbHattID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbKundID, 0, 212, Short.MAX_VALUE)))
                                .addComponent(jLabel6)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jbLaggTillHatt))
                        .addComponent(jScrollPane3)
                        .addComponent(jScrollPane1)))
                .addContainerGap(45, Short.MAX_VALUE))
>>>>>>> parent of 73abaef (.)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLaggTillHatt)
                    .addComponent(tillagdHatt, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
<<<<<<< HEAD
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegBestallning))
                .addGap(67, 67, 67))
=======
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBort))
                .addGap(18, 18, 18)
                .addComponent(jbRegBestallning, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
>>>>>>> parent of 73abaef (.)
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

    private void jbRegBestallningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegBestallningActionPerformed
        
        // totalsumma ska läggas till (kan det hämtas ut automatiskt genom HattID + kundens lojalitet kanske)
        
        String kundID= cbKundID.getSelectedItem().toString();
       // String hattID= cbHattID.getSelectedItem().toString();
        //String hattID= txtareaTillagdHat.getText();
        String leveransAdress= txtareaAdress.getText();
        String personal=cbAnsvarig.getSelectedItem().toString();
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String regDatum = DateFormat.format(jDateChooserReg.getDate());
        
        
        try{
            
            String nyttID= idb.getAutoIncrement("Bestallning", "BestallningsID");
            idb.insert("INSERT INTO hattmakare.Bestallning (BestallningsID, Leveransadress, Totalsumma, Fraktsedel, Datum, Kund, Personal) VALUES ("+nyttID+", '"+leveransAdress+"', 3000, 'Test', '"+regDatum+"',"+ kundID+","+personal+")");
            
            for (String hatt : Collections.list(listModel.elements())){
                
                
                
            }
            JOptionPane.showMessageDialog(null, "tillagt!");
       

       
        
        }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("fel:"+ e);
        }
        
    }//GEN-LAST:event_jbRegBestallningActionPerformed

    private void jbRegKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegKundActionPerformed
        // Länk till RegistreraKundFonster?..
        new RegistreraKundFonster(idb).setVisible(true);
        btnUppdateraKundReg.setVisible(true);
        
    }//GEN-LAST:event_jbRegKundActionPerformed

    private void jbLaggTillHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLaggTillHattActionPerformed
        // Leder till att hatt 1 läggs till i textarean för hattar.
        
        
        String hattID= cbHattID.getSelectedItem().toString();
        String summa = hattID+"* "+antal.getText();
        listModel.addElement(summa);

       
        
    }//GEN-LAST:event_jbLaggTillHattActionPerformed

    private void cbHattIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHattIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHattIDActionPerformed

    private void btnUppdateraKundRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraKundRegActionPerformed

    

fyllcbKundID();
       JOptionPane.showMessageDialog(null, "Kundregistret är uppdaterat!"); 
    }//GEN-LAST:event_btnUppdateraKundRegActionPerformed

private void fyllcbHattID(){
    String fraga= "select Namn from Hatt";
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
    
<<<<<<< HEAD

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField antal;
    private javax.swing.JButton btnUppdateraKundReg;
    private javax.swing.JComboBox<String> cbAnsvarig;
=======
    private void hämtaHattar(){
        
        String fraga= "select Kategori from Hatt";
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
    
    private void jbRegBestallningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegBestallningActionPerformed

        new BestallningGenomford(idb).setVisible(true);
        
    }//GEN-LAST:event_jbRegBestallningActionPerformed

    private void jbLaggTillHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLaggTillHattActionPerformed

        valdHatt = cbHattID.getSelectedItem().toString();
        
        new Hattar(idb, valdHatt).setVisible(true); 
        
    }//GEN-LAST:event_jbLaggTillHattActionPerformed

    private void cbHattIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHattIDActionPerformed
        
    }//GEN-LAST:event_cbHattIDActionPerformed

    private void cbKundIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKundIDActionPerformed
        
        if (cbKundID.getSelectedItem().toString().equals("+ Lägg till ny kund")){
                
                new HanteraKundInfoFonster(idb).setVisible(true);
                dispose();
                
            }
        
    }//GEN-LAST:event_cbKundIDActionPerformed

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        
        int index = jList1.getSelectedIndex();
            if (index != -1) {
        DefaultListModel model = (DefaultListModel) jList1.getModel();
        model.remove(index);
    }
        
        
    }//GEN-LAST:event_taBortActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
>>>>>>> parent of 73abaef (.)
    private javax.swing.JComboBox<String> cbHattID;
    private javax.swing.JComboBox<String> cbKundID;
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
<<<<<<< HEAD
    private javax.swing.JButton jbLaggTillHatt;
    private javax.swing.JButton jbRegBestallning;
    private javax.swing.JButton jbRegKund;
    private javax.swing.JList<String> tillagdHatt;
=======
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbLaggTillHatt;
    private javax.swing.JButton jbRegBestallning;
    private javax.swing.JButton taBort;
>>>>>>> parent of 73abaef (.)
    private javax.swing.JTextArea txtareaAdress;
    // End of variables declaration//GEN-END:variables
}
