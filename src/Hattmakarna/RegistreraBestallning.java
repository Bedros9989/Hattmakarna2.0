package Hattmakarna;

import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraBestallning extends javax.swing.JFrame {

    private InfDB idb;

    public RegistreraBestallning(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraBestallning.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbKundID = new javax.swing.JComboBox<>();
        jbRegKund = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbHattID = new javax.swing.JComboBox<>();
        jbLaggTillHatt = new javax.swing.JButton();
        tfDatum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaAdress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbAnsvarig = new javax.swing.JComboBox<>();
        jbRegBestallning = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Registrera beställning");

        jLabel2.setText("Datum (åååå-mm-dd)");

        jLabel4.setText("Leveransadress");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel5.setText("Existerande kund");

        jLabel6.setText("HattID");

        cbKundID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj kundID", "Item 2", "Item 3", "Item 4" }));

        jbRegKund.setText("Registrera kund");
        jbRegKund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegKundActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        jLabel7.setText("Ny kund");

        cbHattID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj hattID", "Item 2", "Item 3", "Item 4" }));

        jbLaggTillHatt.setText("Lägg till ytterligare hatt");
        jbLaggTillHatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLaggTillHattActionPerformed(evt);
            }
        });

        tfDatum.setColumns(10);

        txtareaAdress.setColumns(20);
        txtareaAdress.setRows(5);
        txtareaAdress.setText("Namn/Företag\nPostadress\nPostnummer Postort\nLand (om utrikes)");
        jScrollPane1.setViewportView(txtareaAdress);

        jLabel3.setText("Kund");

        jLabel8.setText("Ansvarig för beställning");

        cbAnsvarig.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj", "Otto", "Judith", "" }));
        cbAnsvarig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnsvarigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(61, 61, 61)
                        .addComponent(cbAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(84, 84, 84)
                                        .addComponent(cbHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(0, 2, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLaggTillHatt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbRegKund)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(43, 43, 43)
                        .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbKundID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbRegKund)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbHattID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLaggTillHatt))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnsvarig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jbRegBestallning.setText("Registrera beställning");
        jbRegBestallning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegBestallningActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbRegBestallning)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jbRegBestallning)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegBestallningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegBestallningActionPerformed
        // Saker som ej syns i designen men som ska läggas till: :
        // Skapa beställningsID
        //koppla vem som ansvarar för ordern (eller lått dem fylla i det själva?)
        // totalsumma (kan det hämtas ut automatiskt genom HattID + kundens lojalitet kanske?)
    }//GEN-LAST:event_jbRegBestallningActionPerformed

    private void jbRegKundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegKundActionPerformed
        // Länk till RegistreraKundFonster?
    }//GEN-LAST:event_jbRegKundActionPerformed

    private void jbLaggTillHattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLaggTillHattActionPerformed
        // Leder till att hatt 1 läggs till + chans lägga till ny hatt
    }//GEN-LAST:event_jbLaggTillHattActionPerformed

    private void cbAnsvarigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnsvarigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnsvarigActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbAnsvarig;
    private javax.swing.JComboBox<String> cbHattID;
    private javax.swing.JComboBox<String> cbKundID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLaggTillHatt;
    private javax.swing.JButton jbRegBestallning;
    private javax.swing.JButton jbRegKund;
    private javax.swing.JTextField tfDatum;
    private javax.swing.JTextArea txtareaAdress;
    // End of variables declaration//GEN-END:variables
}
