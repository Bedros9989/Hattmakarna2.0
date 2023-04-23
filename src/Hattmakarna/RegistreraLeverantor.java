
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        jLabel1.setText("Registrera ny leverantör");

        jLNamn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLNamn.setText("Namn");

        jLAdress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLAdress.setText("Adress");

        jLTelefon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLTelefon.setText("Telefonnummer");

        jLLevID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLLevID.setText("LeverantörsID");

        jBReg.setText("Registrera leverantör");
        jBReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLLevID)
                        .addComponent(jLNamn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLAdress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTTelefon)
                    .addComponent(jTLevID, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(jTAdress)
                    .addComponent(jTNamn))
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBReg, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLLevID)
                    .addComponent(jTLevID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNamn))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAdress))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefon))
                .addGap(18, 18, 18)
                .addComponent(jBReg, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTAdress;
    private javax.swing.JTextField jTLevID;
    private javax.swing.JTextField jTNamn;
    private javax.swing.JTextField jTTelefon;
    // End of variables declaration//GEN-END:variables
}
