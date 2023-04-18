
package Hattmakarna;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraBestallning extends javax.swing.JFrame {

    private InfDB idb;
    private String ID;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DefaultListModel<String> model = new DefaultListModel<String>();
    private RegistreraBestallning beställning;
    
    
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
        ändra.setEnabled(false);
        spara2.setVisible(false);
        jList1.setModel(model);
        
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
        spara2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 25)); // NOI18N
        jLabel1.setText("Hantera beställning");

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel8.setText("BeställningsID");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel3.setText("Kund");

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
        läggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                läggTillActionPerformed(evt);
            }
        });

        taBort.setText("Ta bort");
        taBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taBortActionPerformed(evt);
            }
        });

        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 17)); // NOI18N
        jLabel9.setText("Status");

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        annulera.setText("Annulera");
        annulera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annuleraActionPerformed(evt);
            }
        });

        spara2.setText("Spara");
        spara2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spara2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
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
                            .addComponent(datumChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(annulera)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spara2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spara2)
                        .addGap(25, 25, 25)))
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

    private void sök(){
        
        model.clear();
        ändra.setEnabled(true);
        ansvarig.removeAllItems();
        kundBox.removeAllItems();
        status.removeAllItems();
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
                model.addElement(id +"- "+kategori+" "+storlek);

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
    
    private void sökActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sökActionPerformed

        sök();
        
    }//GEN-LAST:event_sökActionPerformed

    private void hittaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hittaActionPerformed
        new BestallningsLista(idb).setVisible(true);
    }//GEN-LAST:event_hittaActionPerformed

    private void taBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taBortActionPerformed
       
                try{
            
                int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill ta bort hatten", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION){
                    
                    int index = jList1.getSelectedIndex();
                    if (index != -1){
                        String listItem = jList1.getModel().getElementAt(index);
                        String[] parts = listItem.split("-");
                        String selectedText = parts[0].trim();
                        
                        ArrayList<String> existerandeBeställninga = idb.fetchColumn("select HattID from Hatt where Bestallning is not null ");
                        
                        if (existerandeBeställninga.contains(selectedText)){
                        idb.update("UPDATE hattmakare.Hatt t SET t.Bestallning = null WHERE t.HattID ="+selectedText);
                        JOptionPane.showMessageDialog(null, "Hatt borttagen från beställning!");
                        sök();
                        
                        }else{
                            if (index != -1) {
                            DefaultListModel model = (DefaultListModel) jList1.getModel();
                            model.remove(index);
                            
                        }
                        
                        }
                    }
                        
                }else{
                
                }
            }
        
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
        
                        
    }//GEN-LAST:event_taBortActionPerformed

    private void ändraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraActionPerformed
        
        taBort.setEnabled(true);
        jList1.setEnabled(true);
        kundBox.setEnabled(true);
        ansvarig.setEnabled(true);
        Adress.setEnabled(true);
        datumChooser.setEnabled(true);
        läggTill.setEnabled(true);
        summan.setEnabled(true);
        status.setEnabled(true);
        annulera.setEnabled(true);
        spara.setEnabled(true);
        
    }//GEN-LAST:event_ändraActionPerformed

    private void annuleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annuleraActionPerformed
        String bästID = beställningsID.getText();
                try{
            
                int resultat = JOptionPane.showConfirmDialog(null, "Är du säker att du vill annulera beställningen", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION){
                    
                    ListModel<String> listModel = jList1.getModel();
                        for (int i = 0; i < jList1.getModel().getSize(); i++) {
                        String listItem = jList1.getModel().getElementAt(i);
                        String[] parts = listItem.split("-");
                        String selectedText = parts[0].trim();
                        idb.update("UPDATE hattmakare.Hatt t SET t.Bestallning = null WHERE t.HattID ="+selectedText);
                        }
                        
                        
                        idb.update("UPDATE hattmakare.Bestallning t SET t.Status = 'Annulerat' WHERE t.BestallningsID = "+bästID);
                        sök();
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
                        JOptionPane.showMessageDialog(null, "Dina order är nu annulerat!");
                }else{
                
                }
            }
        
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }  
                       
    }//GEN-LAST:event_annuleraActionPerformed

    private void läggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_läggTillActionPerformed
        
        String[] options = {"Doktorshatt", "Specialhatt", "Studenthatt"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        
        int result = JOptionPane.showOptionDialog(null, comboBox, "Välj en kategori",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
        if (result == JOptionPane.OK_OPTION) {
            String selectedOption = comboBox.getSelectedItem().toString();
            new Hattar(idb, selectedOption,beställning,this).setVisible(true); 
            spara2.setVisible(true);
            
        }
    
    }//GEN-LAST:event_läggTillActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
    String bästID = beställningsID.getText();
    int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
 
        try{
            if(resultat == JOptionPane.YES_OPTION){
            
                Date datumet = datumChooser.getDate();
                String nyDatum = dateFormat.format(datumet);
                String nyAdress = Adress.getText();     
                String nySumma = summan.getText();       
                String nyKund = kundBox.getSelectedItem().toString();
                String nyAnsvarig = ansvarig.getSelectedItem().toString();
                String nyStatus = status.getSelectedItem().toString();
                
                String hämtaAnsvarig = idb.fetchSingle("select PersonalID from Personal where Namn = '"+nyAnsvarig+"'");
                String hämtaKund = idb.fetchSingle("select KundID from Kund where Namn = '"+nyKund+"'");
                
                idb.update("UPDATE hattmakare.Bestallning t SET t.Leveransadress = '"+nyAdress+"', t.Totalsumma = "+nySumma+", t.Datum= '"+nyDatum+"',t.Kund= "+hämtaKund+", t.Personal = "+hämtaAnsvarig+", t.Status  = '"+nyStatus+"' WHERE t.BestallningsID ="+bästID);
                
                
            JOptionPane.showMessageDialog(null, "Ändringar sparade!");
            sök();
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
        spara2.setVisible(false);
            
        }
    }   
       
    
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }
        
        
    }//GEN-LAST:event_sparaActionPerformed

    private void spara2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spara2ActionPerformed
        
        String bästID = beställningsID.getText();
    int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
        
        try{
            if(resultat == JOptionPane.YES_OPTION){
            
                int size = jList1.getModel().getSize();
                for(int i = 0; i < size; i++){
                    String hattar = jList1.getModel().getElementAt(i);
                    String[] parts = hattar.split("-");
                    String selectedText = parts[0].trim();
                    if (idb.fetchSingle("select Bestallning from Hatt where HattID="+selectedText) == null){
                        
                        idb.update("UPDATE hattmakare.Hatt t SET t.Bestallning = "+bästID+" WHERE t.HattID ="+selectedText);
                        
                        
                    }
                    
                }
                    JOptionPane.showMessageDialog(null, "Ändringar sparade!");
                    sök();
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
                    spara2.setVisible(false);
                }
  
        }
 
       
    
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        }
        
    }//GEN-LAST:event_spara2ActionPerformed

    public void populateList(String[] data){
     
    for (String s : data) {
         
        model.addElement(s);
        }
    
    }
    
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
    private javax.swing.JButton spara2;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField summan;
    private javax.swing.JButton sök;
    private javax.swing.JButton taBort;
    private javax.swing.JButton ändra;
    // End of variables declaration//GEN-END:variables
}
