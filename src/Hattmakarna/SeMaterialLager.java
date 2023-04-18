/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarna;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Victo
 */
public class SeMaterialLager extends javax.swing.JFrame {

    private InfDB idb;
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form SeMaterialLager
     */
    public SeMaterialLager(InfDB idb) {
        initComponents();
        this.idb = idb;
     
        this.setLocationRelativeTo(null);
        tabell.setModel(model);
        model.addColumn("MaterialID");
        model.addColumn("Materialnamn");
        model.addColumn("Antal");
        model.addColumn("Meter");
        model.addColumn("Kvadratmeter");
        tabell.setDefaultEditor(Object.class, null);
        setMaterialTable2();
        btnUppdatera.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabell = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnHanteraMaterial = new javax.swing.JButton();
        btnUppdatera = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaterialID", "Materialnamn", "Antal", "Meter", "Kvadratmeter"
            }
        ));
        jScrollPane2.setViewportView(tabell);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setText("Aktuellt materialsaldo");

        btnHanteraMaterial.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        btnHanteraMaterial.setText(" Hantera information om material");
        btnHanteraMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHanteraMaterialActionPerformed(evt);
            }
        });

        btnUppdatera.setText("Uppdatera saldo");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnHanteraMaterial)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(502, 502, 502)
                                    .addComponent(btnUppdatera))))
                        .addGap(0, 97, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnHanteraMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUppdatera)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHanteraMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHanteraMaterialActionPerformed
        //btnUppdatera.setVisible(true);
        
          new HanteraMaterial(idb).setVisible(true);
          btnUppdatera.setVisible(true);
    }//GEN-LAST:event_btnHanteraMaterialActionPerformed

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
       setMaterialTable2();
    }//GEN-LAST:event_btnUppdateraActionPerformed

        
            private void setMaterialTable2() {

        model.setRowCount(0);

        try {
            
                  ArrayList<HashMap<String, String>> antalLager = idb.fetchRows("select material.MaterialID, Material.Materialnamn, Antal from material " +
"join Antalvara on Material.MaterialID = antalvara.MaterialID");

            for (HashMap<String, String> antal : antalLager) {
                Object[] antalData = {
                    antal.get("MaterialID"),
                    antal.get("Materialnamn"),
                antal.get("Antal"),};
                model.addRow(antalData);
        
            ArrayList<HashMap<String, String>> meterLager = idb.fetchRows("select material.MaterialID, Material.Materialnamn, meter from material"+
" join Metervara on material.MaterialID=metervara.MaterialID");

            for (HashMap<String, String> material : meterLager) {
                Object[] materialData = {
                    material.get("MaterialID"),
                    material.get("Materialnamn"),
                    material.get("Antal"),
                 material.get("Meter"),};
                model.addRow(materialData);
            }
        
                // Bortkommenterad då den inte är klar, men ska vara för kvadratmetervaror nedan:
                
                 ArrayList<HashMap<String, String>> kvadratLager = idb.fetchRows("select material.MaterialID, Material.Materialnamn, kvadratmeter from material"+
" join Kvadratmetervara on material.MaterialID=Kvadratmetervara.MaterialID");

            for (HashMap<String, String> kvadrat : kvadratLager) {
                Object[] materialData = {
                    kvadrat.get("MaterialID"),
                    kvadrat.get("Materialnamn"),
                     kvadrat.get("Antal"),
                      kvadrat.get("Meter"),
                     kvadrat.get("Kvadratmeter"),
               };
                model.addRow(materialData);
            
                      
            
            }
            }
            
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Databasfel: " + e);
        }
    
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHanteraMaterial;
    private javax.swing.JButton btnUppdatera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tabell;
    // End of variables declaration//GEN-END:variables
}
