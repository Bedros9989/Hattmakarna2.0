
package Hattmakarna;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraBestallningFonster extends javax.swing.JFrame {

    private InfDB idb;
    
    public HanteraBestallningFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBestallningsID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtKundID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaLeveransadress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jtHattID = new javax.swing.JTextField();
        jtSumma = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtareaInfo = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jbkund = new javax.swing.JButton();
        jbhatt = new javax.swing.JButton();
        jbBortHatt = new javax.swing.JButton();
        jbLev = new javax.swing.JButton();
        jbSumma = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtAnsvarig = new javax.swing.JTextField();
        jbPersonal = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jdateDatum = new com.toedter.calendar.JDateChooser();
        jbReg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Hantera beställningar");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setText("Ange beställningsID");

        jtBestallningsID.setColumns(4);

        jLabel3.setText("KundID");

        jLabel5.setText("Leveransadress");

        jLabel6.setText("Totalsumma");

        jtKundID.setColumns(5);

        txtaLeveransadress.setColumns(20);
        txtaLeveransadress.setRows(5);
        jScrollPane1.setViewportView(txtaLeveransadress);

        jLabel7.setText("Ändra Hatt");

        jtHattID.setColumns(5);
        jtHattID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtHattIDActionPerformed(evt);
            }
        });

        jtSumma.setColumns(5);

        txtareaInfo.setColumns(20);
        txtareaInfo.setRows(5);
        txtareaInfo.setText("(Denna ruta är för att om tid finns \nkunna få aktuell beställningsinfo till \ndenna ruta när man klickat in beställningsID)");
        jScrollPane2.setViewportView(txtareaInfo);

        jLabel10.setText("Fyll i aktuellt beställningsID samt de uppgifter som du vill uppdatera i beställningen");

        jbkund.setText("Ändra kundID");
        jbkund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbkundActionPerformed(evt);
            }
        });

        jbhatt.setText("Lägg till hatt");
        jbhatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbhattActionPerformed(evt);
            }
        });

        jbBortHatt.setText("Ta bort hatt");
        jbBortHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBortHattActionPerformed(evt);
            }
        });

        jbLev.setText("Ändra leveransadress");

        jbSumma.setText("Ändra totalsumma");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(90, 90, 90)
                                        .addComponent(jtKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbkund)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbhatt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbBortHatt)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtBestallningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(82, 82, 82)
                                        .addComponent(jtSumma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jbSumma))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(40, 40, 40)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbLev)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(122, 122, 122))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtBestallningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbkund))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jbhatt)
                            .addComponent(jbBortHatt))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbLev, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtSumma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSumma)))
        );

        jLabel4.setText("Beställningsansvarig");

        jtAnsvarig.setColumns(5);

        jbPersonal.setText("Ändra beställningsinformation");
        jbPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPersonalActionPerformed(evt);
            }
        });

        jLabel8.setText("Registreringsdatum");

        jbReg.setText("Ändra registreringsdatum");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbPersonal)
                    .addComponent(jbReg))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPersonal))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jdateDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbReg)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtHattIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtHattIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtHattIDActionPerformed

    private void jbPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPersonalActionPerformed
 String bestallningsID= jtBestallningsID.getText();
   String kundID= jtKundID.getText();
   String hattID= jtHattID.getText();
   String leveransAdress= txtaLeveransadress.getText();
   String totalsumma=jtSumma.getText();
   String bestallningsAnsvarig= jtAnsvarig.getText();
    
        if (bestallningsID.isEmpty()|| (bestallningsID.matches(".*[a-zA-Z].*"))){
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");
       
        }
        else{
            try{
           
            if (kundID.isEmpty()== false){
                idb.update("Update Bestallning set Kund = " + kundID + " where BestallningsID= "+ bestallningsID );
                JOptionPane.showMessageDialog(null, "KundID har uppdaterats på ordern!");
            }
            if (hattID.isEmpty()==false){
                 idb.update("Update Hatt set Bestallning = " + bestallningsID + " where HattID= "+ hattID );
                JOptionPane.showMessageDialog(null, "Hatt har lagts till i ordern!");
            }
            if (leveransAdress.isEmpty()==false){
                idb.update("Update Bestallning set Leveransadress = "+leveransAdress+ " where BestallningsID= "+ bestallningsID);
                JOptionPane.showMessageDialog(null, "Leveransadress har uppdaterats!");
            }
            
            if (totalsumma.isEmpty()==false){
                idb.update("Update bestallning set Totalsumma= "+ totalsumma + " where BestallningsID= "+ bestallningsID);
                JOptionPane.showMessageDialog(null, "Totalsumman har uppdaterats!");
            }
         
            if (bestallningsAnsvarig.isEmpty()==false){
                idb.update("Update bestallning set Personal= "+ bestallningsAnsvarig + " where BestallningsID= "+ bestallningsID);
                JOptionPane.showMessageDialog(null, "Totalsumman har uppdaterats!");
            }
            
            }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Databasfel");
        }
        }
        
        //      påbörjan till txtboxen med info  try{
//           String fraga= ("Select * from Bestallning where BestallningsID = " + bestallningsID); 
//          HashMap <String, String> forsok= idb.fetchRow(fraga);
//           
         
//        }        
    }//GEN-LAST:event_jbPersonalActionPerformed

    private void jbkundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbkundActionPerformed
       String bestallningsID= jtBestallningsID.getText();
   String kundID= jtKundID.getText();
  
    
        if (bestallningsID.isEmpty()|| (bestallningsID.matches(".*[a-zA-Z].*"))){
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");
       
        }
        else{
            try{
           
            if (kundID.isEmpty()== false){
                idb.update("Update Bestallning set Kund = " + kundID + " where BestallningsID= "+ bestallningsID );
                JOptionPane.showMessageDialog(null, "KundID har uppdaterats på ordern!");
            }else { 
                        JOptionPane.showMessageDialog(null, "Skriv nått i rutan!");
                        }
            
            }
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Databasfel");
        }
        }
    }//GEN-LAST:event_jbkundActionPerformed

    private void jbhattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhattActionPerformed
       String bestallningsID= jtBestallningsID.getText();
   
   String hattID= jtHattID.getText();
 
    
        if (bestallningsID.isEmpty()|| (bestallningsID.matches(".*[a-zA-Z].*"))){
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");
       
        }
        else{
            try{
           
          
            
            if (hattID.isEmpty()==false){
                 idb.update("Update Hatt set Bestallning = " + bestallningsID + " where HattID= "+ hattID );
                JOptionPane.showMessageDialog(null, "Hatt har lagts till i ordern!");
            }
            else
          JOptionPane.showMessageDialog(null, "Skriv nått i rutan!");
                        }
            
            
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Databasfel");
        }
        }
    }//GEN-LAST:event_jbhattActionPerformed

    private void jbBortHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBortHattActionPerformed
               
        //funkar ej att at bort hatt från beställning!
        String bestallningsID= jtBestallningsID.getText();
   
   String hattID= jtHattID.getText();
 
    
        if (bestallningsID.isEmpty()|| (bestallningsID.matches(".*[a-zA-Z].*"))){
            JOptionPane.showMessageDialog(null, "Säkerställ att du skrivit in beställningsID korrekt!");
       
        }
        else{
            try{
           
          
            
            if (hattID.isEmpty()==false){
                 idb.update("Update Hatt set Bestallning = " + 0 + " where HattID= "+ hattID );
                JOptionPane.showMessageDialog(null, "Hatt har tagits bort från beställningen!");
            }
            else
          JOptionPane.showMessageDialog(null, "Skriv nått i rutan!");
                        }
            
            
        catch (InfException e){
            JOptionPane.showMessageDialog(null, "Databasfel");
            System.out.println("fel: " + e);
        }
        }
    }//GEN-LAST:event_jbBortHattActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JButton jbBortHatt;
    private javax.swing.JButton jbLev;
    private javax.swing.JButton jbPersonal;
    private javax.swing.JButton jbReg;
    private javax.swing.JButton jbSumma;
    private javax.swing.JButton jbhatt;
    private javax.swing.JButton jbkund;
    private com.toedter.calendar.JDateChooser jdateDatum;
    private javax.swing.JTextField jtAnsvarig;
    private javax.swing.JTextField jtBestallningsID;
    private javax.swing.JTextField jtHattID;
    private javax.swing.JTextField jtKundID;
    private javax.swing.JTextField jtSumma;
    private javax.swing.JTextArea txtaLeveransadress;
    private javax.swing.JTextArea txtareaInfo;
    // End of variables declaration//GEN-END:variables
}
