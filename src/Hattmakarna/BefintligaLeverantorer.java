package Hattmakarna;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

public class BefintligaLeverantorer extends javax.swing.JFrame {

    private InfDB idb;

    public BefintligaLeverantorer(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        BefintligaLeverantorer.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        fyllLista();
        namn.setEnabled(false);
        telefonnummer.setEnabled(false);
        adress.setEnabled(false);
    }

    public void fyllLista(){
        
        String hämtaLeverantörer = "Select Namn from Leverantor";
        
        ArrayList<String> allaLeverantörer;
        
        try {
            
            allaLeverantörer = idb.fetchColumn(hämtaLeverantörer);

            for (String namn : allaLeverantörer) {
                valdLeverantör.addItem(namn);
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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        valdLeverantör = new javax.swing.JComboBox<>();
        namn = new javax.swing.JTextField();
        adress = new javax.swing.JTextField();
        telefonnummer = new javax.swing.JTextField();
        jLVald = new javax.swing.JLabel();
        jLNamn = new javax.swing.JLabel();
        jLAdress = new javax.swing.JLabel();
        jLTelefon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        statistik = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logga.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        valdLeverantör.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        valdLeverantör.setForeground(new java.awt.Color(51, 51, 51));
        valdLeverantör.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valdLeverantörActionPerformed(evt);
            }
        });

        namn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        namn.setForeground(new java.awt.Color(51, 51, 51));

        adress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        adress.setForeground(new java.awt.Color(51, 51, 51));

        telefonnummer.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        telefonnummer.setForeground(new java.awt.Color(51, 51, 51));

        jLVald.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLVald.setForeground(new java.awt.Color(51, 51, 51));
        jLVald.setText("Vald Leverantör");

        jLNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLNamn.setForeground(new java.awt.Color(51, 51, 51));
        jLNamn.setText("Namn");

        jLAdress.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLAdress.setForeground(new java.awt.Color(51, 51, 51));
        jLAdress.setText("Telefonnummer");

        jLTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLTelefon.setForeground(new java.awt.Color(51, 51, 51));
        jLTelefon.setText("Adress");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        statistik.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        statistik.setText("Statistik");
        statistik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statistikActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hattmakarna/Leverantör.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(98, 98, 98)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statistik, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addGap(95, 95, 95)))
        );

        jLabel1.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel1.setText("Leverantörer");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNamn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLAdress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLTelefon, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(namn)
                                    .addComponent(adress)
                                    .addComponent(telefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLVald)
                                .addGap(28, 28, 28)
                                .addComponent(valdLeverantör, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(98, 98, 98))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valdLeverantör, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLVald))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNamn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonnummer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLAdress))
                .addGap(52, 52, 52))
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

    private void valdLeverantörActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valdLeverantörActionPerformed
        
        try {
            
            String valdLeverantor = valdLeverantör.getSelectedItem().toString();
            String hämtaTelefon = idb.fetchSingle("Select Telefon from Leverantor where Namn='"+valdLeverantor+"'");
            String hämtaAdress = idb.fetchSingle("Select Adress from Leverantor where Namn='"+valdLeverantor+"'");
            
            namn.setText(valdLeverantor);
            telefonnummer.setText(hämtaTelefon);
            adress.setText(hämtaAdress);
            
        } catch (InfException ettUndantag) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        catch (Exception ettUndantag) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        
    }//GEN-LAST:event_valdLeverantörActionPerformed

    private void statistikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statistikActionPerformed
        // TODO add your handling code here:
         new LeverantorsStatistik(idb).setVisible(true);
    }//GEN-LAST:event_statistikActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adress;
    private javax.swing.JLabel jLAdress;
    private javax.swing.JLabel jLNamn;
    private javax.swing.JLabel jLTelefon;
    private javax.swing.JLabel jLVald;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namn;
    private javax.swing.JButton statistik;
    private javax.swing.JTextField telefonnummer;
    private javax.swing.JComboBox<String> valdLeverantör;
    // End of variables declaration//GEN-END:variables
}
