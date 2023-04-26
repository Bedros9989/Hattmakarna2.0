package Hattmakarna;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
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
    kontrolleraNyTelefon();
    kontrolleraNyTimpris();
    kontrolleraLosenord();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHanteraPersonal = new javax.swing.JLabel();
        cbPersonalID = new javax.swing.JComboBox<>();
        jÄndraPersonalID = new javax.swing.JLabel();
        jÄndraPersonalNamn = new javax.swing.JLabel();
        jÄndraPersonalLosen = new javax.swing.JLabel();
        jÄndraPersonalTelefon = new javax.swing.JLabel();
        jÄndraPersonalTimpris = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Namn = new javax.swing.JTextField();
        Telefonnummer = new javax.swing.JTextField();
        Timpris = new javax.swing.JTextField();
        ändra = new javax.swing.JButton();
        spara = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Losenord = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        lblHanteraPersonal.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        lblHanteraPersonal.setText("Hantera personal information");

        cbPersonalID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        cbPersonalID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPersonalIDActionPerformed(evt);
            }
        });

        jÄndraPersonalID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraPersonalID.setText("PersonalID");

        jÄndraPersonalNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraPersonalNamn.setText("Namn");

        jÄndraPersonalLosen.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraPersonalLosen.setText("Lösenord");

        jÄndraPersonalTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraPersonalTelefon.setText("Telefonnummer");

        jÄndraPersonalTimpris.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraPersonalTimpris.setText("Timpris");

        ID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        Namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        Telefonnummer.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        Timpris.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        ändra.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
            }
        });

        spara.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hattmakarna/Sök.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jÄndraPersonalTimpris, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jÄndraPersonalTelefon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jÄndraPersonalLosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jÄndraPersonalNamn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jÄndraPersonalID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Timpris, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(Telefonnummer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(Namn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(ID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(cbPersonalID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Losenord))
                                .addGap(53, 53, 53))
                            .addComponent(lblHanteraPersonal, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblHanteraPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(cbPersonalID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraPersonalID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraPersonalNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jÄndraPersonalLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Losenord, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Timpris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jÄndraPersonalTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
       
        if (ValideringsKlass.rutaEmpty(Namn) || ValideringsKlass.rutaEmpty(Losenord) || ValideringsKlass.rutaEmpty(Telefonnummer) || ValideringsKlass.rutaEmpty(Timpris)) {
           JOptionPane.showMessageDialog(null, "Fel: Vänligen fyll i alla fält");
        } else {
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
        
        
    } }                                   
    }//GEN-LAST:event_sparaActionPerformed

        private void kontrolleraNyTelefon() {
        Telefonnummer.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(Telefonnummer);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(Telefonnummer);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(Telefonnummer);
            }
        });
        }
        
        private void kontrolleraNyTimpris() {
        Timpris.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(Timpris);
            ValideringsKlass.endastPositivt(Timpris);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(Timpris);
                ValideringsKlass.endastPositivt(Timpris);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(Timpris);
                ValideringsKlass.endastPositivt(Timpris);
            }
        });
    }
        
     private void kontrolleraLosenord() {
        Losenord.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
            ValideringsKlass.lösenordetÄrLång(Losenord);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            ValideringsKlass.lösenordetÄrLång(Losenord);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            ValideringsKlass.lösenordetÄrLång(Losenord);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JPasswordField Losenord;
    private javax.swing.JTextField Namn;
    private javax.swing.JTextField Telefonnummer;
    private javax.swing.JTextField Timpris;
    private javax.swing.JComboBox<String> cbPersonalID;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
