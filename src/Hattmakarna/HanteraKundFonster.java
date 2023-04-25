package Hattmakarna;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import oru.inf.InfDB;
import oru.inf.InfException;

public class HanteraKundFonster extends javax.swing.JFrame {

    private InfDB idb;

    public HanteraKundFonster(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        HanteraKundFonster.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        id.setEnabled(false);
        namn.setEnabled(false);
        mail.setEnabled(false);
        adress.setEnabled(false);
        lojalitet.setEnabled(false);
        nummer.setEnabled(false);
        hämtaKund();
        kontrolleraNyTelefon();
        kontrolleraNyLojalitet();
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
        id = new javax.swing.JTextField();
        namn = new javax.swing.JTextField();
        nummer = new javax.swing.JTextField();
        adress = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        lojalitet = new javax.swing.JTextField();
        spara = new javax.swing.JButton();
        ändra = new javax.swing.JButton();
        cbKundID = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        jLabel1.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel1.setText("Sök kundinformation");

        jLabel2.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel2.setText("KundID");

        jÄndraKundMejl.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraKundMejl.setText("E-postadress");

        jLojalitetsKund.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLojalitetsKund.setText("Lojalitetskund");

        jÄndraKundTel.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraKundTel.setText("Telefonnummer");

        jÄndraKundNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraKundNamn.setText("Namn");

        jÄndraKundAdress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jÄndraKundAdress.setText("Gatuadress");

        id.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        nummer.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        adress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        mail.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        lojalitet.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        spara.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        spara.setText("Spara");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        ändra.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ändra.setText("Ändra");
        ändra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ändraActionPerformed(evt);
            }
        });

        cbKundID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        cbKundID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj Kund" }));
        cbKundID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKundIDActionPerformed(evt);
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
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jÄndraKundTel)
                                    .addComponent(jLabel2)
                                    .addComponent(jÄndraKundNamn)
                                    .addComponent(jÄndraKundAdress)
                                    .addComponent(jÄndraKundMejl)
                                    .addComponent(jLojalitetsKund))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(id)
                                            .addComponent(namn)
                                            .addComponent(nummer)
                                            .addComponent(adress)
                                            .addComponent(lojalitet)
                                            .addComponent(mail))))
                                .addGap(24, 24, 24))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namn))
                    .addComponent(jÄndraKundNamn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(adress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lojalitet)
                            .addComponent(jLojalitetsKund))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jÄndraKundTel)
                            .addComponent(nummer))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jÄndraKundAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jÄndraKundMejl)
                        .addGap(71, 71, 71)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ändra, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    private void cbKundIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKundIDActionPerformed

        if (cbKundID.getSelectedItem().toString().equals("+ Lägg till ny kund")){

            new RegistreraKundFonster(idb).setVisible(true);
            dispose();

            
            
        }else{

            try {
                String kunden = cbKundID.getSelectedItem().toString();
                String hämtaID = idb.fetchSingle("select KundID from Kund where Namn= '"+kunden+"'");
                String hämtaNamn = idb.fetchSingle("select Namn from Kund where Namn= '"+kunden+"'");
                String hämtaTelefon = idb.fetchSingle("select Telefonnummer from Kund where Namn= '"+kunden+"'");
                String hämtaAdress = idb.fetchSingle("select Adress from Kund where Namn= '"+kunden+"'");
                String hämtaMail = idb.fetchSingle("select Email from Kund where Namn= '"+kunden+"'");
                String hämtaLojalitet = idb.fetchSingle("select Lojalitet from Kund where Namn= '"+kunden+"'");
                
                id.setText(hämtaID);
                namn.setText(hämtaNamn);
                nummer.setText(hämtaTelefon);
                adress.setText(hämtaAdress);
                mail.setText(hämtaMail);
                lojalitet.setText(hämtaLojalitet);
                
                


            }
            catch (InfException e) {

                JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
                System.out.println("Databasfel: " + e);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");

            }
        }

    }//GEN-LAST:event_cbKundIDActionPerformed

    private void ändraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ändraActionPerformed
        
        namn.setEnabled(true);
        mail.setEnabled(true);
        adress.setEnabled(true);
        lojalitet.setEnabled(true);
        nummer.setEnabled(true);
        
    }//GEN-LAST:event_ändraActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed
        
    int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
    
    if(resultat == JOptionPane.YES_OPTION){
       
        if (ValideringsKlass.rutaEmpty(namn) || ValideringsKlass.rutaEmpty(nummer) || ValideringsKlass.rutaEmpty(adress) || ValideringsKlass.rutaEmpty(mail) || ValideringsKlass.rutaEmpty(lojalitet)) {
           JOptionPane.showMessageDialog(null, "Fel: Vänligen fyll i alla fält");
        }
           else {
        try {
                String kunden = cbKundID.getSelectedItem().toString();
                String hämtaID = idb.fetchSingle("select KundID from Kund where Namn= '"+kunden+"'");
            
                String nyNamn = namn.getText();
                String nyTelefon = nummer.getText();
                String nyAdress = adress.getText();
                String nyMail = mail.getText();
                String nyLojalitet = lojalitet.getText();
                String ändraInfo = "UPDATE hattmakare.Kund t SET t.Namn = '"+nyNamn+"', t.Adress= '"+nyAdress+"', t.Telefonnummer = '"+nyTelefon+"', t.Lojalitet = "+nyLojalitet+", t.Email = '"+nyMail+"' WHERE t.KundID = "+hämtaID+";";
                idb.update(ändraInfo);
                
                JOptionPane.showMessageDialog(null, "Ändringar sparade!");
                new HanteraKundFonster(idb).setVisible(true);
                dispose();
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
            }}
    }//GEN-LAST:event_sparaActionPerformed

        private void kontrolleraNyTelefon() {
        nummer.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(nummer);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(nummer);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(nummer);
            }
        });
      }
        private void kontrolleraNyLojalitet() {
        lojalitet.getDocument().addDocumentListener(new DocumentListener() {
            
            @Override
            public void insertUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(lojalitet);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(lojalitet);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            ValideringsKlass.endastNummerTillåten(lojalitet);
            }
        });
      }       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress;
    private javax.swing.JComboBox<String> cbKundID;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLojalitetsKund;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jÄndraKundAdress;
    private javax.swing.JLabel jÄndraKundMejl;
    private javax.swing.JLabel jÄndraKundNamn;
    private javax.swing.JLabel jÄndraKundTel;
    private javax.swing.JTextField lojalitet;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField namn;
    private javax.swing.JTextField nummer;
    private javax.swing.JButton spara;
    private javax.swing.JButton ändra;
    // End of variables declaration//GEN-END:variables
}
