
package Hattmakarna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import oru.inf.InfDB;
import oru.inf.InfException;


public class SeHattLager extends javax.swing.JFrame {

    private InfDB idb;
    DefaultTableModel model = new DefaultTableModel();

    public SeHattLager(InfDB idb) {
        initComponents();
        this.idb = idb;
        SeHattLager.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        tabell.setModel(model);
        model.addColumn("HattID");
        model.addColumn("Storlek");
        model.addColumn("Kategori");
        tabell.setDefaultEditor(Object.class, null);
        setHattarTable();
        btnUppdatera.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHantera = new javax.swing.JButton();
        btnUppdatera = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabell = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        jLabel1.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel1.setText("Aktuellt hattsaldo");

        btnHantera.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnHantera.setText("Hantera hattinformation");
        btnHantera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHanteraActionPerformed(evt);
            }
        });

        btnUppdatera.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnUppdatera.setText("Uppdatera saldo");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

        tabell.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        tabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "HattID", "Kategori", "Storlek"
            }
        ));
        tabell.setMinimumSize(new java.awt.Dimension(75, 80));
        tabell.setPreferredSize(new java.awt.Dimension(375, 80));
        jScrollPane3.setViewportView(tabell);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUppdatera, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHantera, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUppdatera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHantera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
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

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        setHattarTable();

    }//GEN-LAST:event_btnUppdateraActionPerformed

    private void btnHanteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHanteraActionPerformed
        new HanteraHatt(idb).setVisible(true);
        btnUppdatera.setVisible(true);
    }//GEN-LAST:event_btnHanteraActionPerformed

    private void setHattarTable() {

        model.setRowCount(0);

        try {
            ArrayList<HashMap<String, String>> hattarILager = idb.fetchRows("Select * from Hatt where Bestallning is null order by HattID asc");

            for (HashMap<String, String> hatt : hattarILager) {
                Object[] hattData = {
                    hatt.get("HattID"),
                    hatt.get("Storlek"),
                    hatt.get("Kategori"),};
                model.addRow(hattData);
            }

            // Add a TableRowSorter to the model
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            tabell.setRowSorter(sorter);

            // Sort the data by the first column (HattID)
            sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(0, SortOrder.ASCENDING)));

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Databasfel: " + e);
        }
    }



 


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHantera;
    private javax.swing.JToggleButton btnUppdatera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabell;
    // End of variables declaration//GEN-END:variables
}
