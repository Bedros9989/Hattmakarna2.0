package Hattmakarna;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraPersonalFonster extends javax.swing.JFrame {

    private InfDB idb;
    
    public HanteraPersonalFonster(InfDB idb) {
    initComponents();
    this.idb = idb;
    this.setLocationRelativeTo(null);
    HanteraPersonalFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    ID.setEnabled(false);
    Namn.setEnabled(false);
    Telefonnummer.setEnabled(false);
    Losenord.setEnabled(false);
    Timpris.setEnabled(false);
    hämtaPersonal();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHanteraPersonal = new javax.swing.JLabel();
        cbPersonalID = new javax.swing.JComboBox<>();
        jÄndraPersonalID = new javax.swing.JLabel();
        jÄndraPersonalNamn = new javax.swing.JLabel();
        jÄndraPersonalLosen = new javax.swing.JLabel();
        jÄndraPersonalTelefon = new javax.swing.JLabel();
        jÄndraPersonalTimpris = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Namn = new javax.swing.JTextField();
        Losenord = new javax.swing.JTextField();
        Telefonnummer = new javax.swing.JTextField();
        Timpris = new javax.swing.JTextField();
        ändra = new javax.swing.JButton();
        spara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHanteraPersonal.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        lblHanteraPersonal.setText("Hantera personal information");

        cbPersonalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersonalIDActionPerformed(evt);
            }
        });

        jÄndraPersonalID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraPersonalID.setText("PersonalID");

        jÄndraPersonalNamn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraPersonalNamn.setText("Namn");

        jÄndraPersonalLosen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraPersonalLosen.setText("Lösenord");

        jÄndraPersonalTelefon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraPersonalTelefon.setText("Telefonnummer");

        jÄndraPersonalTimpris.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jÄndraPersonalTimpris.setText("Timpris");

        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
            }
        });

        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(lblHanteraPersonal)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jÄndraPersonalTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jÄndraPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jÄndraPersonalLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jÄndraPersonalNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jÄndraPersonalID, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ändra)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spara)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbPersonalID, 0, 181, Short.MAX_VALUE)
                        .addComponent(ID)
                        .addComponent(Namn)
                        .addComponent(Losenord)
                        .addComponent(Telefonnummer)
                        .addComponent(Timpris)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblHanteraPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(cbPersonalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndraPersonalID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndraPersonalNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndraPersonalLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Losenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndraPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndraPersonalTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Timpris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ändra)
                    .addComponent(spara))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hämtaPersonal(){
        
        String fraga= "select Namn from Personal";
        ArrayList<String> allaPersonalNamn;
        
        try{
            allaPersonalNamn= idb.fetchColumn(fraga);
            for (String enKund: allaPersonalNamn){
              cbPersonalID.addItem(enKund);
              
            }
            cbPersonalID.addItem("+ Lägg till ny personal");
            
            
            
        }  catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
    }
    }
    
    private void cbPersonalIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPersonalIDActionPerformed
    if (cbPersonalID.getSelectedItem().toString().equals("+ Lägg till ny personal")){

            new RegistreraPersonal(idb).setVisible(true);
            dispose();

            
            
        }else{

            try {
                String personal = cbPersonalID.getSelectedItem().toString();
                String hämtaID = idb.fetchSingle("select PersonalID from Personal where Namn= '"+personal+"'");
                String hämtaNamn = idb.fetchSingle("select Namn from Personal where Namn= '"+personal+"'");
                String hämtaTelefon = idb.fetchSingle("select Telefonnummer from Personal where Namn= '"+personal+"'");
                String hämtaLosenord = idb.fetchSingle("select Losenord from Personal where Namn= '"+personal+"'");
                String hämtaTimpris = idb.fetchSingle("select Timpris from Personal where Namn= '"+personal+"'");
                
                ID.setText(hämtaID);
                Namn.setText(hämtaNamn);
                Telefonnummer.setText(hämtaTelefon);
                Losenord.setText(hämtaLosenord);
                Timpris.setText(hämtaTimpris);

            }
            catch (InfException e) {

                JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
                System.out.println("Databasfel: " + e);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");

            }
        }                              
    }//GEN-LAST:event_cbPersonalIDActionPerformed

    private void ändraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraActionPerformed
        Namn.setEnabled(true);
        Telefonnummer.setEnabled(true);
        Losenord.setEnabled(true);
        Timpris.setEnabled(true);
    }//GEN-LAST:event_ändraActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
    
    if(resultat == JOptionPane.YES_OPTION){
        
        try {
                String personal = cbPersonalID.getSelectedItem().toString();
                String hämtaID = idb.fetchSingle("select PersonalID from Personal where Namn= '"+personal+"'");
            
                String nyNamn = Namn.getText();
                String nyTelefon = Telefonnummer.getText();
                String nyLosenord = Losenord.getText();
                String nyTimpris = Timpris.getText();
                String ändraInfo = "UPDATE hattmakare.Personal t SET t.Namn = '"+nyNamn+"', t.Telefonnummer= '"+nyTelefon+"', t.Losenord = '"+nyLosenord+"', t.Timpris = "+nyTimpris+" WHERE t.PersonalID = "+hämtaID+";";
                idb.update(ändraInfo);
                
                JOptionPane.showMessageDialog(null, "Ändringar sparade!");
                new HanteraPersonalFonster(idb).setVisible(true);
                dispose();
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        
    }                                     
    }//GEN-LAST:event_sparaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Losenord;
    private javax.swing.JTextField Namn;
    private javax.swing.JTextField Telefonnummer;
    private javax.swing.JTextField Timpris;
    private javax.swing.JComboBox<String> cbPersonalID;
    private javax.swing.JLabel jÄndraPersonalID;
    private javax.swing.JLabel jÄndraPersonalLosen;
    private javax.swing.JLabel jÄndraPersonalNamn;
    private javax.swing.JLabel jÄndraPersonalTelefon;
    private javax.swing.JLabel jÄndraPersonalTimpris;
    private javax.swing.JLabel lblHanteraPersonal;
    private javax.swing.JButton spara;
    private javax.swing.JButton ändra;
    // End of variables declaration//GEN-END:variables
}
