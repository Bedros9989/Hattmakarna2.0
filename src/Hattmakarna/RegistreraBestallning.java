package Hattmakarna;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import oru.inf.InfDB;
import oru.inf.InfException;


public class RegistreraBestallning extends javax.swing.JFrame {

    private InfDB idb; 
    private String valdHatt;
    private String ID;
    private double Lojalitet;
    DefaultListModel<String> model = new DefaultListModel<String>();
    private HanteraBestallning hantering;
    
    private String orderNr;
    private String vikt;
    private String datum;
    private String mottagare;
    private String kund;
    private String bästID;
    
    public RegistreraBestallning(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID = ID;
        this.setLocationRelativeTo(null);
        RegistreraBestallning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        hämtaKund();
        hämtaHattar();
        jTextField1.setEnabled(false);
        hämtaID();
        summan.setText(null);
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbKundID = new javax.swing.JComboBox<>();
        cbHattID = new javax.swing.JComboBox<>();
        jbLaggTillHatt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Adress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jDateChooserReg = new com.toedter.calendar.JDateChooser();
        jbRegBestallning = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        summan = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        taBort = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        jLabel1.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Registrera beställning");

        jLabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Datum (åååå-mm-dd)");

        jLabel4.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Leveransadress");

        jLabel6.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Hatt");

        cbKundID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        cbKundID.setForeground(new java.awt.Color(51, 51, 51));
        cbKundID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Kund" }));
        cbKundID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKundIDActionPerformed(evt);
            }
        });

        cbHattID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        cbHattID.setForeground(new java.awt.Color(51, 51, 51));
        cbHattID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Hatt" }));
        cbHattID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHattIDActionPerformed(evt);
            }
        });

        jbLaggTillHatt.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jbLaggTillHatt.setForeground(new java.awt.Color(51, 51, 51));
        jbLaggTillHatt.setText("Lägg till hatt");
        jbLaggTillHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLaggTillHattActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        Adress.setColumns(20);
        Adress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        Adress.setForeground(new java.awt.Color(51, 51, 51));
        Adress.setRows(5);
        jScrollPane1.setViewportView(Adress);

        jLabel3.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Kund");

        jDateChooserReg.setForeground(new java.awt.Color(51, 51, 51));
        jDateChooserReg.setDateFormatString("yyyy-MM-dd");
        jDateChooserReg.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jbRegBestallning.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jbRegBestallning.setForeground(new java.awt.Color(51, 51, 51));
        jbRegBestallning.setText("Registrera beställning");
        jbRegBestallning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegBestallningActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Totalsumma:");

        summan.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        summan.setForeground(new java.awt.Color(51, 51, 51));
        summan.setText("\n");

        jScrollPane3.setForeground(new java.awt.Color(51, 51, 51));

        jList1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setViewportView(jList1);

        jLabel7.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Översikt");

        taBort.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        taBort.setForeground(new java.awt.Color(51, 51, 51));
        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("BeställningsID");

        jTextField1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(31, 31, 31)
                                    .addComponent(summan, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(taBort, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cbHattID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(62, 62, 62)
                                                .addComponent(jTextField1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbLaggTillHatt))
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jbRegBestallning)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLaggTillHatt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooserReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(summan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(taBort))
                .addGap(26, 26, 26)
                .addComponent(jbRegBestallning, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

    private void hämtaID(){
        
        try {
        
            bästID=idb.getAutoIncrement("Bestallning", "BestallningsID");
            jTextField1.setText(bästID);
        
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        
        
    }
    
    public void populateList(String[] data){
     
    for (String s : data) {
        
        model.addElement(s);
        }
        jList1.setModel(model);   
    }
    
    
    private void hämtaKund(){
        
        String fraga= "select Namn from Kund";
        ArrayList<String> allaKundNamn;
        
        try{
            allaKundNamn= idb.fetchColumn(fraga);
            for (String enKund: allaKundNamn){
              cbKundID.addItem(enKund);
              
            }
            cbKundID.addItem("+ Lägg till ny kund");
            
            
            
        }  catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
    }
        
    }
    
    private void hämtaHattar(){
        
        String fraga= "select Kategori from Hatt";
        ArrayList<String> allaHattIDn;
        HashSet<String> unikaHattIDn = new HashSet<>();
        try {
        
            allaHattIDn= idb.fetchColumn(fraga);
            for (String hattID: allaHattIDn){
            unikaHattIDn.add(hattID);
            
            
        }
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        for (String hattID : unikaHattIDn) {
            cbHattID.addItem(hattID);
        }
    }
    
    private void jbRegBestallningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegBestallningActionPerformed

        if (ValideringsKlass.rutanÄrTom2(Adress, jLabel4)){
        if (ValideringsKlass.datumInteVald(jDateChooserReg)){
        if (ValideringsKlass.listaTom(jList1)){
        if (ValideringsKlass.rutanÄrTom(summan,jLabel5)) {
        
        
        SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        if (cbKundID.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Du har ej valt någon kund");    
        }
        
        else {
            
           
        try {
        
            String adress = Adress.getText();
            String fraktsedel = "Adress:"+" "+adress;
            String regDatum = DateFormat.format(jDateChooserReg.getDate());
            String kundID = idb.fetchSingle("select KundID from Kund where Namn = '"+cbKundID.getSelectedItem().toString()+"'"); 
            
            if (Lojalitet > 0){
                
                int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION){
                    
                        
                        double totalSumma = Double.parseDouble(summan.getText())  * Lojalitet;
                        idb.insert("INSERT INTO hattmakare.Bestallning (BestallningsID, Leveransadress, Totalsumma, Fraktsedel, Datum, Kund, Personal,Status) VALUES ("+bästID+", '"+adress+"', "+totalSumma+", '"+fraktsedel+"', '"+regDatum+"', "+kundID+", "+ID+",'Pågående');");
                        String pris= Double.toString(totalSumma);
                        new BestallningGenomford(idb,bästID,regDatum,adress,kundID,pris).setVisible(true);
                        updateHattar();
                        updateLojalitet();
                        dispose();
                        
                     
                }
                
            }else{
                
                int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION){
                        double summa = Double.parseDouble(summan.getText());
                        idb.insert("INSERT INTO hattmakare.Bestallning (BestallningsID, Leveransadress, Totalsumma, Fraktsedel, Datum, Kund, Personal,Status) VALUES ("+bästID+", '"+adress+"', "+summa+", '"+fraktsedel+"', '"+regDatum+"', "+kundID+", "+ID+",'Pågående');");
                        String pris= Double.toString(summa);
                        new BestallningGenomford(idb,bästID,regDatum,adress,kundID,pris).setVisible(true);
                        updateHattar();
                        updateLojalitet();
                        dispose();
                    }

                        
                     
                }

                
            }
            
        
    
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        
    
            }
        
        }
        }
        }
        }
        
    }//GEN-LAST:event_jbRegBestallningActionPerformed

    private void updateHattar(){
        
        try {
        
            ListModel<String> listModel = jList1.getModel();
                        for (int i = 0; i < jList1.getModel().getSize(); i++) {
                        String listItem = jList1.getModel().getElementAt(i);
                        String[] parts = listItem.split("-");
                        String selectedText = parts[0].trim();
                        idb.update("UPDATE hattmakare.Hatt t SET t.Bestallning = "+bästID+" WHERE t.HattID = "+selectedText+";");

        }
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        
    }
        
    
    private void jbLaggTillHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLaggTillHattActionPerformed

        if(cbHattID.getSelectedIndex() == 0){
            
            JOptionPane.showMessageDialog(null, "Du har inte valt en hattkategori");
            
        }else{
        
        valdHatt = cbHattID.getSelectedItem().toString();
        new Hattar(idb, valdHatt,this,hantering).setVisible(true); 
        }
    }//GEN-LAST:event_jbLaggTillHattActionPerformed

    private void cbHattIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHattIDActionPerformed
        
    }//GEN-LAST:event_cbHattIDActionPerformed

    private void cbKundIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKundIDActionPerformed
        
        if (cbKundID.getSelectedItem().toString().equals("+ Lägg till ny kund")){
                
                new RegistreraKundFonster(idb).setVisible(true);
                dispose();
                
            }else if (cbKundID.getSelectedItem().toString().equals("Välj Kund")){
                
                
                
            }else{
        
        try {
            
            String hittaLojalitet = idb.fetchSingle("select Lojalitet from Kund where Namn ='"+cbKundID.getSelectedItem().toString()+"'");
            int procent = Integer.parseInt(hittaLojalitet);
            
            if(procent > 1){
                
                Lojalitet = 1 - (procent * 0.01);
                
            }
            
        
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        }
        
    }//GEN-LAST:event_cbKundIDActionPerformed

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
        
        int index = jList1.getSelectedIndex();
            if (index != -1) {
        DefaultListModel model = (DefaultListModel) jList1.getModel();
        model.remove(index);
    }  
            
    }//GEN-LAST:event_taBortActionPerformed

    private void updateLojalitet(){
        
    try {
     
        String kundID = idb.fetchSingle("select KundID from Kund where Namn = '"+cbKundID.getSelectedItem().toString()+"'");
        String antalKöptaHattar = idb.fetchSingle("select count(*) from hatt join Bestallning B on B.BestallningsID = hatt.Bestallning join Kund K on K.KundID = B.Kund where KundID="+kundID);
        int antalKöptaHattar2 = Integer.parseInt(antalKöptaHattar);
        
        if (antalKöptaHattar2 > 10){
            
            idb.update("UPDATE hattmakare.Kund t SET t.Lojalitet = 10 WHERE t.KundID = "+kundID);
            
        }
        
   
        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }
        
     }  
    

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Adress;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbLaggTillHatt;
    private javax.swing.JButton jbRegBestallning;
    private javax.swing.JTextField summan;
    private javax.swing.JButton taBort;
    // End of variables declaration//GEN-END:variables
}