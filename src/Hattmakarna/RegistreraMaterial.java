package Hattmakarna;

import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import oru.inf.InfDB;
import oru.inf.InfException;

public class RegistreraMaterial extends javax.swing.JFrame {

    private InfDB idb;
    
    public RegistreraMaterial(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        RegistreraMaterial.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        kontrolleraTextEnhetspris();
        kontrolleraTxtExtra();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMaterialNamn = new javax.swing.JLabel();
        lblEnhetsPris = new javax.swing.JLabel();
        txtMaterialNamn = new javax.swing.JTextField();
        txtEnhetsPris = new javax.swing.JTextField();
        btnRegMaterial = new javax.swing.JButton();
        lblKvantTyp = new javax.swing.JLabel();
        cbxTyp = new javax.swing.JComboBox<>();
        lblExtra = new javax.swing.JLabel();
        txtExtra = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        confirmMeddelande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        jLabel1.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel1.setText("Registrera nytt material");

        lblMaterialNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblMaterialNamn.setText("Materialnamn");

        lblEnhetsPris.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblEnhetsPris.setText("Enhetspris");

        txtMaterialNamn.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        txtMaterialNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaterialNamnActionPerformed(evt);
            }
        });

        txtEnhetsPris.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        txtEnhetsPris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnhetsPrisActionPerformed(evt);
            }
        });

        btnRegMaterial.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnRegMaterial.setText("Registrera material");
        btnRegMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegMaterialActionPerformed(evt);
            }
        });

        lblKvantTyp.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblKvantTyp.setText("Kvantitetstyp");

        cbxTyp.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        cbxTyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kvadratmetervara", "Antalvara", "Metervara" }));
        cbxTyp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTypActionPerformed(evt);
            }
        });

        lblExtra.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblExtra.setText("Kvadratmeter");

        txtExtra.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hattmakarna/Ny.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(29, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(confirmMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEnhetsPris, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblMaterialNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(78, 78, 78))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblKvantTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtExtra)
                                            .addComponent(txtEnhetsPris)
                                            .addComponent(cbxTyp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMaterialNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterialNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterialNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnhetsPris, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnhetsPris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKvantTyp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(confirmMeddelande, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegMaterialActionPerformed
    
    confirmMeddelande.setText("");
     
        
        if (ValideringsKlass.rutaEmpty(txtMaterialNamn) || ValideringsKlass.rutaEmpty(txtEnhetsPris) || ValideringsKlass.rutaEmpty(txtExtra)) {
           confirmMeddelande.setText("Fel: Vänligen fyll i alla fält");
        
        } else {
        
            try {
                String mID = idb.getAutoIncrement("Material", "MaterialID");
                idb.insert("INSERT INTO Material VALUES (" + mID + ", '" + txtMaterialNamn.getText() + "', '" + txtEnhetsPris.getText() + "');");
                idb.insert("INSERT INTO " + cbxTyp.getSelectedItem().toString() + " VALUES (" + mID + ", '" + txtExtra.getText() + "');");
                confirmMeddelande.setText("Ett nytt material har registrerats!");
            } catch (InfException exc) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
            } 
        
     
        }
     
    }//GEN-LAST:event_btnRegMaterialActionPerformed

      private void kontrolleraTextEnhetspris() {
        txtEnhetsPris.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten2(txtEnhetsPris);
                ValideringsKlass.endastPunkt(txtEnhetsPris);
                ValideringsKlass.endastPositivt(txtEnhetsPris);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten2(txtEnhetsPris);
                ValideringsKlass.endastPunkt(txtEnhetsPris);
                ValideringsKlass.endastPositivt(txtEnhetsPris);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten2(txtEnhetsPris);
                ValideringsKlass.endastPunkt(txtEnhetsPris);
                ValideringsKlass.endastPositivt(txtEnhetsPris);
            }
        });
      }

  private void kontrolleraTxtExtra() {
        txtExtra.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten2(txtExtra);
                ValideringsKlass.endastPunkt(txtExtra);
                ValideringsKlass.endastPositivt(txtExtra);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten2(txtExtra);
                ValideringsKlass.endastPunkt(txtExtra);
                ValideringsKlass.endastPositivt(txtExtra);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ValideringsKlass.endastNummerTillåten2(txtExtra);
                ValideringsKlass.endastPunkt(txtExtra);
                ValideringsKlass.endastPositivt(txtExtra);
            }
        });
    }
    private void txtMaterialNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaterialNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaterialNamnActionPerformed

    private void txtEnhetsPrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnhetsPrisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnhetsPrisActionPerformed

    private void cbxTypActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTypActionPerformed
    if(cbxTyp.getSelectedItem().toString().equals("Kvadratmetervara")) {
        lblExtra.setText("Kvadratmeter");
        } else if (cbxTyp.getSelectedItem().toString().equals("Antalvara")) {
          lblExtra.setText("Antal");
        } else {
          lblExtra.setText("Meter");
        }                    
    }//GEN-LAST:event_cbxTypActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegMaterial;
    private javax.swing.JComboBox<String> cbxTyp;
    private javax.swing.JLabel confirmMeddelande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEnhetsPris;
    private javax.swing.JLabel lblExtra;
    private javax.swing.JLabel lblKvantTyp;
    private javax.swing.JLabel lblMaterialNamn;
    private javax.swing.JTextField txtEnhetsPris;
    private javax.swing.JTextField txtExtra;
    private javax.swing.JTextField txtMaterialNamn;
    // End of variables declaration//GEN-END:variables
}
