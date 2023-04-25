/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author jessicagustafsson
 */
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
        fyllCBSortera();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHantera = new javax.swing.JButton();
        btnUppdatera = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabell = new javax.swing.JTable();
        cbSortera = new javax.swing.JComboBox<>();
        btnSortera = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();

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
        jLabel1.setText("Se hattsaldo");

        jLabel2.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel2.setText("Dessa hattar finns för närvarande i lager:");

        btnHantera.setFont(new java.awt.Font("Futura", 2, 14)); // NOI18N
        btnHantera.setText("Hantera hattinformation");
        btnHantera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHanteraActionPerformed(evt);
            }
        });

        btnUppdatera.setFont(new java.awt.Font("Futura", 2, 14)); // NOI18N
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

        cbSortera.setBackground(new java.awt.Color(242, 242, 242));

        btnSortera.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        btnSortera.setText("Sortera");
        btnSortera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorteraActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jButton1.setText("Sök ID, storlek eller kategori");
        jButton1.setMaximumSize(new java.awt.Dimension(143, 26));
        jButton1.setMinimumSize(new java.awt.Dimension(143, 26));
        jButton1.setPreferredSize(new java.awt.Dimension(143, 26));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbSortera, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSortera))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUppdatera)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(btnHantera)))))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(249, 249, 249))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cbSortera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSortera, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHantera, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUppdatera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void btnSorteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorteraActionPerformed
        String valdKategori = cbSortera.getSelectedItem().toString();

// Add a TableRowSorter to the model
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        jTable1.setRowSorter(sorter);

        if (valdKategori.equals("HattID")) {
            sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(0, SortOrder.ASCENDING)));

        } else if (valdKategori.equals("Storlek")) {
            sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(1, SortOrder.ASCENDING)));
        } else if (valdKategori.equals("Kategori")) {
            sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(2, SortOrder.ASCENDING)));
        }
    }//GEN-LAST:event_btnSorteraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String searchText = searchBox.getText();
        model.setRowCount(0);

        if (ValideringsKlass.textFaltHarVarde2(searchBox)) {

            try {
 ArrayList<HashMap<String, String>> results = idb.fetchRows("SELECT * FROM Hatt WHERE Bestallning IS NULL AND "
         + "(HattID LIKE '%" + searchText + "%' OR Kategori LIKE '%" + searchText + "%' OR storlek LIKE '%" + 
         searchText + "%')");
                for (HashMap<String, String> row : results) {
                    Object[] rowData = {
                        row.get("HattID"),
                        row.get("Storlek"),
                        row.get("Kategori"),};
                        
                    model.addRow(rowData);
                }

                   
                    
                tabell.repaint();
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Database error!");
                System.out.println("Database error: " + e);
            }
        } else {
            // 
           // setHattarTable("HattID");    BLIR RELEVANT FÖR ATT KODA SORTERINGEN SEN SÅ ATT TABELLEN INITALT SORTERAS 
           // UTIFRÅN HATTID ASC
        }

        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void setHattarTable() {

        model.setRowCount(0);

        try {
            ArrayList<HashMap<String, String>> hattarILager = idb.fetchRows("Select * from Hatt where Bestallning is null");

            for (HashMap<String, String> hatt : hattarILager) {
                Object[] hattData = {
                    hatt.get("HattID"),
                    hatt.get("Storlek"),
                    hatt.get("Kategori"),};
                model.addRow(hattData);
            }

            // Add a TableRowSorter to the model
            TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
            jTable1.setRowSorter(sorter);

            // Sort the data by the first column (HattID)
            sorter.setSortKeys(Collections.singletonList(new RowSorter.SortKey(0, SortOrder.ASCENDING)));

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Databasfel: " + e);
        }
    }
    
    
  

    
    
    private void fyllCBSortera() {
        cbSortera.addItem("HattID");
        cbSortera.addItem("Storlek");
        cbSortera.addItem("Kategori");
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHantera;
    private javax.swing.JButton btnSortera;
    private javax.swing.JToggleButton btnUppdatera;
    private javax.swing.JComboBox<String> cbSortera;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JTable tabell;
    // End of variables declaration//GEN-END:variables
}
