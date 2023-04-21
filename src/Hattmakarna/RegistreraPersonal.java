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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegKund.setFont(new java.awt.Font("Calibri", 0, 22)); // NOI18N
        lblRegKund.setText("Registrera ny personal");

        jPersonalNamn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPersonalNamn.setText("Namn");

        jPersonalLosen.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPersonalLosen.setText("Lösenord");

        jPersonalTelefon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPersonalTelefon.setText("Telefonnummer");

        jPersonalTimpris.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jPersonalTimpris.setText("Timpris");

        jRegistreraPersonalKnapp.setText("Registrera personal");
        jRegistreraPersonalKnapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistreraPersonalKnappActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPersonalNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPersonalLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPersonalTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addComponent(meddelandeKonfirmera, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRegistreraPersonalKnapp, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(jAngivetPersonalNamn)
                    .addComponent(jAngivetPersonalLosen)
                    .addComponent(jAngivetPersonalTelefon)
                    .addComponent(jAngivetPersonalTimpris))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jfelMeddelandet, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblRegKund)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblRegKund)
                        .addGap(40, 40, 40)
                        .addComponent(jAngivetPersonalNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPersonalNamn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jAngivetPersonalLosen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPersonalLosen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jAngivetPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPersonalTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPersonalTimpris)
                            .addComponent(jAngivetPersonalTimpris, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jfelMeddelandet, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRegistreraPersonalKnapp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meddelandeKonfirmera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
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
