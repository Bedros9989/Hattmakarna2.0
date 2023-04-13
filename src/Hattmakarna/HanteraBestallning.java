
package Hattmakarna;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraBestallning extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DefaultListModel<String> listModel = new DefaultListModel<>();
    
    public HanteraBestallning(InfDB idb, String ID) {
        initComponents();
        this.idb = idb;
        this.ID = ID;
        this.setLocationRelativeTo(null);
        HanteraBestallning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        kundBox.setEnabled(false);
        ansvarig.setEnabled(false);
        Adress.setEnabled(false);
        datumChooser.setEnabled(false);
        jList1.setEnabled(false);
        läggTill.setEnabled(false);
        taBort.setEnabled(false);
        summan.setEnabled(false);
        status.setEnabled(false);
        annulera.setEnabled(false);
        spara.setEnabled(false);
        jList1.setModel(listModel);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        beställningsID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kundBox = new javax.swing.JComboBox<>();
        sök = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Adress = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datumChooser = new com.toedter.calendar.JDateChooser();
        hitta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        summan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ansvarig = new javax.swing.JComboBox<>();
        läggTill = new javax.swing.JButton();
        taBort = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        ändra = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        annulera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 25)); // NOI18N
        jLabel1.setText("Hantera beställning");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel8.setText("BeställningsID");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel3.setText("Kund");

        kundBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        kundBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kundBoxActionPerformed(evt);
            }
        });

        sök.setText("Sök");
        sök.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sökActionPerformed(evt);
            }
        });

        Adress.setColumns(20);
        Adress.setRows(5);
        jScrollPane1.setViewportView(Adress);

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel4.setText("Leveransadress");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel2.setText("Datum (åååå-mm-dd)");

        datumChooser.setDateFormatString("yyyy-MM-dd");

        hitta.setText("Hitta");
        hitta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hittaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel7.setText("Översikt");

        jScrollPane3.setViewportView(jList1);

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel5.setText("Totalsumma:");

        summan.setText("\n");

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel6.setText("Ansvarig");

        ansvarig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansvarigActionPerformed(evt);
            }
        });

        läggTill.setText("Lägg till");

        taBort.setText("Ta bort");

        spara.setText("Spara");

        ändra.setText("Ändra");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel9.setText("Status");

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        annulera.setText("Annulera");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(datumChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kundBox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(ansvarig, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(62, 62, 62)
                                        .addComponent(beställningsID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addComponent(sök)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hitta)
                            .addComponent(läggTill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(taBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(summan)
                                    .addComponent(status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(annulera)))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(beställningsID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sök)
                    .addComponent(hitta))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(kundBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ansvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(datumChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(läggTill)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taBort)
                        .addGap(60, 60, 60)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(summan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annulera))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void hämtaKunder(){

        String fraga= "select Namn from Kund";
        ArrayList<String> allaKundNamn;
        
        try{
            allaKundNamn= idb.fetchColumn(fraga);
            for (String enKund: allaKundNamn){
              kundBox.addItem(enKund); 
            }
        
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }        
    }
    
    private void hämtaPersonal(){
        
        String fraga= "select Namn from Personal";
        ArrayList<String> allaPersonalNamn;
        
        try{
            allaPersonalNamn= idb.fetchColumn(fraga);
            for (String ettPersonal: allaPersonalNamn){
              ansvarig.addItem(ettPersonal); 
            }
        
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }      
        
    }
    
    private void läggStatus(){
        
        status.addItem("Pågående");
        status.addItem("Skickat");
        status.addItem("Annulerat");
        
    }
    
    private void kundBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kundBoxActionPerformed

    }//GEN-LAST:event_kundBoxActionPerformed

    private void ansvarigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansvarigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansvarigActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void sökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökActionPerformed

        hämtaKunder();
        hämtaPersonal();
        läggStatus();
        String bästID = beställningsID.getText();
        try{
            
            ArrayList<String> existerandeBeställninga = idb.fetchColumn("select BestallningsID from Bestallning");
            
            if (!existerandeBeställninga.contains(bästID)){

                        JOptionPane.showMessageDialog(null, "Beställning med denna ID existerar inte!");
            }else{
            
            
            String hämtaKund = idb.fetchSingle("Select Namn from Kund join Bestallning B on Kund.KundID = B.Kund where BestallningsID="+bästID);
            kundBox.setSelectedItem(hämtaKund);
            String hämtaAnsvarig = idb.fetchSingle("select Namn from Personal join Bestallning B on Personal.PersonalID = B.Personal where BestallningsID ="+bästID);
            ansvarig.setSelectedItem(hämtaAnsvarig);
            String hämtaAdress = idb.fetchSingle("select Leveransadress from Bestallning where BestallningsID="+bästID);
            Adress.setText(hämtaAdress);
            String hämtaDatum = idb.fetchSingle("select Datum from Bestallning where BestallningsID="+bästID);
            Date datumet = dateFormat.parse(hämtaDatum);
            dateFormat.format(datumet);
            datumChooser.setDate(datumet);
            String hämtaSumma = idb.fetchSingle("select Totalsumma from Bestallning where BestallningsID="+bästID);
            summan.setText(hämtaSumma);
            String hämtaStatus = idb.fetchSingle("select Status from Bestallning where BestallningsID="+bästID);
            status.setSelectedItem(hämtaStatus);
            
            ArrayList<HashMap<String,String>> allaHattar = idb.fetchRows("SELECT * FROM Hatt where Bestallning="+bästID);
            for (HashMap<String, String> hatt : allaHattar){
                
                String id = hatt.get("HattID");
                String kategori= hatt.get("Kategori");
                String storlek = hatt.get("Storlek");
                listModel.addElement(id +"- "+kategori+" "+storlek);

            }
            }
            
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }      
        
        
    }//GEN-LAST:event_sökActionPerformed

    private void hittaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hittaActionPerformed
        new BestallningsLista(idb).setVisible(true);
    }//GEN-LAST:event_hittaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Adress;
    private javax.swing.JButton annulera;
    private javax.swing.JComboBox<String> ansvarig;
    private javax.swing.JTextField beställningsID;
    private com.toedter.calendar.JDateChooser datumChooser;
    private javax.swing.JButton hitta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> kundBox;
    private javax.swing.JButton läggTill;
    private javax.swing.JButton spara;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField summan;
    private javax.swing.JButton sök;
    private javax.swing.JButton taBort;
    private javax.swing.JButton ändra;
    // End of variables declaration//GEN-END:variables
}
