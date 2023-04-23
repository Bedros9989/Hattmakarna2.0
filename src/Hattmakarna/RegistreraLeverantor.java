
package Hattmakarna;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraLeverantor extends javax.swing.JFrame {
    
     private InfDB idb;
     private String lID;

 
    public RegistreraLeverantor(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraLeverantor.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jTLevID.setEnabled(false);
        visaInfo();
        kontrolleraText();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLNamn = new javax.swing.JLabel();
        jLAdress = new javax.swing.JLabel();
        jLTelefon = new javax.swing.JLabel();
        jTNamn = new javax.swing.JTextField();
        jTAdress = new javax.swing.JTextField();
        jTTelefon = new javax.swing.JTextField();
        jLLevID = new javax.swing.JLabel();
        jTLevID = new javax.swing.JTextField();
        jBReg = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        jLabel1.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel1.setText("Registrera ny leverantör");

        jLNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLNamn.setText("Namn");

        jLAdress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLAdress.setText("Adress");

        jLTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLTelefon.setText("Telefonnummer");

        jTNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jTAdress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jTTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jLLevID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLLevID.setText("LeverantörsID");

        jTLevID.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jBReg.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jBReg.setText("Registrera leverantör");
        jBReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hattmakarna/Ny.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel4)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jBReg)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLLevID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTLevID, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jTNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLevID)
                    .addComponent(jTLevID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAdress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefon))
                .addGap(18, 18, 18)
                .addComponent(jBReg, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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

    private void visaInfo (){
        
         try {
             lID = idb.getAutoIncrement("Leverantor","LeverantorsID");
             jTLevID.setText(lID);
         } catch (InfException ex) {
             Logger.getLogger(RegistreraLeverantor.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
    private void jBRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegActionPerformed
        
    if (ValideringsKlass.endastNummerTillåten(jTTelefon)){
    if (ValideringsKlass.rutanÄrTom(jTNamn, jLNamn)){    
    if (ValideringsKlass.rutanÄrTom( jTTelefon,jLTelefon)){   
    if (ValideringsKlass.rutanÄrTom(jTAdress, jLAdress)){
        
        
        try {
           
            String namnet = jTNamn.getText();
            String adress = jTAdress.getText();
            String telefonnr = jTTelefon.getText();
            
            
            
            int resultat = JOptionPane.showConfirmDialog(null, "Är du nöjd med allt du har skrivit?", "Bekräfta uppgifter", JOptionPane.YES_NO_OPTION);
                
                if(resultat == JOptionPane.YES_OPTION){
                    if (jTTelefon.getText().matches("[a-zA-Z]+")){
                        JOptionPane.showMessageDialog(null, "Endast siffror tillåtna!");
                    } else{
                        idb.insert("INSERT INTO Leverantor VALUES("+lID+",'"+namnet+"','"+adress+"','"+telefonnr+"')");
                        JOptionPane.showMessageDialog(null, "Ny leverantör är nu registrerad!");
                        dispose();
                    }  
                }
            
         } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
    }
    }
    }
    }//GEN-LAST:event_jBRegActionPerformed
    }
   
    private void kontrolleraText(){
        
        jTTelefon.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(jTTelefon);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(jTTelefon);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten(jTTelefon);
            }
        });
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBReg;
    private javax.swing.JLabel jLAdress;
    private javax.swing.JLabel jLLevID;
    private javax.swing.JLabel jLNamn;
    private javax.swing.JLabel jLTelefon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTAdress;
    private javax.swing.JTextField jTLevID;
    private javax.swing.JTextField jTNamn;
    private javax.swing.JTextField jTTelefon;
    // End of variables declaration//GEN-END:variables
}
