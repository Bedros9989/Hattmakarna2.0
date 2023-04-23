package Hattmakarna;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraPersonal extends javax.swing.JFrame {

    private InfDB idb;
    
    public RegistreraPersonal(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraPersonal.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegKund = new javax.swing.JLabel();
        jPersonalNamn = new javax.swing.JLabel();
        jPersonalLosen = new javax.swing.JLabel();
        jPersonalTelefon = new javax.swing.JLabel();
        jPersonalTimpris = new javax.swing.JLabel();
        jAngivetPersonalNamn = new javax.swing.JTextField();
        jAngivetPersonalLosen = new javax.swing.JTextField();
        jAngivetPersonalTelefon = new javax.swing.JTextField();
        jAngivetPersonalTimpris = new javax.swing.JTextField();
        jRegistreraPersonalKnapp = new javax.swing.JButton();
        jfelMeddelandet = new javax.swing.JLabel();
        meddelandeKonfirmera = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        lblRegKund.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        lblRegKund.setText("Registrera ny personal");

        jPersonalNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPersonalNamn.setText("Namn");

        jPersonalLosen.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPersonalLosen.setText("Lösenord");

        jPersonalTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPersonalTelefon.setText("Telefonnummer");

        jPersonalTimpris.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jPersonalTimpris.setText("Timpris");

        jAngivetPersonalNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jAngivetPersonalLosen.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jAngivetPersonalTelefon.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jAngivetPersonalTimpris.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jRegistreraPersonalKnapp.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jRegistreraPersonalKnapp.setText("Registrera personal");
        jRegistreraPersonalKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistreraPersonalKnappActionPerformed(evt);
            }
        });

        jfelMeddelandet.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        meddelandeKonfirmera.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hattmakarna/Ny.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel4)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel4)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPersonalTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPersonalLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPersonalNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jfelMeddelandet, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(meddelandeKonfirmera, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jAngivetPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jAngivetPersonalLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jAngivetPersonalNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jAngivetPersonalTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRegistreraPersonalKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRegKund)
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblRegKund)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jAngivetPersonalNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jAngivetPersonalLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPersonalLosen)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jPersonalNamn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jAngivetPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPersonalTelefon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAngivetPersonalTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPersonalTimpris))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jfelMeddelandet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jRegistreraPersonalKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(meddelandeKonfirmera, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRegistreraPersonalKnappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistreraPersonalKnappActionPerformed
        jfelMeddelandet.setText("");
        meddelandeKonfirmera.setText("");
        
        if (ValideringsKlass.rutaEmpty(jAngivetPersonalNamn) || ValideringsKlass.rutaEmpty(jAngivetPersonalLosen) || ValideringsKlass.rutaEmpty(jAngivetPersonalTelefon) || ValideringsKlass.rutaEmpty(jAngivetPersonalTimpris)) {
           jfelMeddelandet.setText("Fel: Vänligen fyll i alla fält");
        } else {
            if (ValideringsKlass.endastNummerTillåten(jAngivetPersonalTelefon) || ValideringsKlass.endastNummerTillåten(jAngivetPersonalTimpris)) {
                }
            else {
            if(ValideringsKlass.isPositivt(jAngivetPersonalTimpris)){
                }
            else{
            try {
                String pID = idb.getAutoIncrement("Personal", "PersonalID");
                idb.insert("INSERT INTO Personal VALUES (" + pID + ", '" + jAngivetPersonalNamn.getText() + "', '" + jAngivetPersonalLosen.getText() + "', '" + jAngivetPersonalTelefon.getText() + "','" + jAngivetPersonalTimpris.getText() + "');");
                meddelandeKonfirmera.setText("En ny kund har registrerats!");
            } catch (InfException exc) {
                
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            } 
            } }}                                            
    }//GEN-LAST:event_jRegistreraPersonalKnappActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAngivetPersonalLosen;
    private javax.swing.JTextField jAngivetPersonalNamn;
    private javax.swing.JTextField jAngivetPersonalTelefon;
    private javax.swing.JTextField jAngivetPersonalTimpris;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jPersonalLosen;
    private javax.swing.JLabel jPersonalNamn;
    private javax.swing.JLabel jPersonalTelefon;
    private javax.swing.JLabel jPersonalTimpris;
    private javax.swing.JButton jRegistreraPersonalKnapp;
    private javax.swing.JLabel jfelMeddelandet;
    private javax.swing.JLabel lblRegKund;
    private javax.swing.JLabel meddelandeKonfirmera;
    // End of variables declaration//GEN-END:variables
}
