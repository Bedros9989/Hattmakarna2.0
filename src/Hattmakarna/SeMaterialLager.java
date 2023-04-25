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
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Victo
 */
public class SeMaterialLager extends javax.swing.JFrame implements ActionListener {

    private InfDB idb;
    private JComboBox<String> columnComboBox;
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
        btnUppdatera.setVisible(false);

        columnComboBox = new JComboBox<>(new String[]{"MaterialID", "Materialnamn", "Antal", "Meter", "Kvadratmeter"});
        columnComboBox.addActionListener(this);
        jPanel1.add(columnComboBox);

        setMaterialTable2("MaterialID");

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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabell = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnHanteraMaterial = new javax.swing.JButton();
        btnUppdatera = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        searchBox = new javax.swing.JTextField();
        cbSortera = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnSortera = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        tabell.setFont(new java.awt.Font("Futura", 2, 14)); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel1.setText("Aktuellt materialsaldo");

        btnHanteraMaterial.setFont(new java.awt.Font("Futura", 2, 14)); // NOI18N
        btnHanteraMaterial.setText(" Hantera information om material");
        btnHanteraMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHanteraMaterialActionPerformed(evt);
            }
        });

        btnUppdatera.setFont(new java.awt.Font("Futura", 2, 14)); // NOI18N
        btnUppdatera.setText("Uppdatera saldo");
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Futura", 2, 14)); // NOI18N
        jButton1.setText("Sök ID eller namn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchBox.setColumns(7);
        searchBox.setFont(new java.awt.Font("Futura", 2, 14)); // NOI18N

        cbSortera.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        cbSortera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MaterialID", "Materialnamn", "Antal", "Meter", "Kvadratmeter" }));
        cbSortera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSorteraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("Sortera efter:");

        btnSortera.setText("Sortera");
        btnSortera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorteraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(163, 163, 163))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbSortera, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnSortera))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnHanteraMaterial, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnUppdatera, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbSortera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSortera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHanteraMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUppdatera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHanteraMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHanteraMaterialActionPerformed

        new HanteraMaterial(idb).setVisible(true);
        btnUppdatera.setVisible(true);
    }//GEN-LAST:event_btnHanteraMaterialActionPerformed

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        setMaterialTable2("MaterialID");
    }//GEN-LAST:event_btnUppdateraActionPerformed

    public void actionPerformed(ActionEvent e) {
        JComboBox comboBox = (JComboBox) e.getSource();
        String selectedColumn = (String) comboBox.getSelectedItem();
        setMaterialTable2(selectedColumn);

    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String searchText = searchBox.getText();
        model.setRowCount(0);

        if (ValideringsKlass.textFaltHarVarde2(searchBox)) {

            try {
                ArrayList<HashMap<String, String>> results = idb.fetchRows("SELECT MaterialNamn, "
                        + "Material.MaterialID, antal, meter, kvadratmeter FROM Material "
                        + "LEFT JOIN Antalvara ON Material.MaterialID = Antalvara.MaterialID LEFT JOIN Metervara "
                        + "ON Material.MaterialID = Metervara.MaterialID LEFT JOIN Kvadratmetervara on "
                        + "Material.MaterialID = Kvadratmetervara.MaterialID WHERE Materialnamn LIKE "
                        + "'%" + searchText + "%'");
                for (HashMap<String, String> row : results) {
                    Object[] rowData = {
                        row.get("MaterialID"),
                        row.get("Materialnamn"),
                        row.get("Antal"),
                        row.get("Meter"),
                        row.get("Kvadratmeter"),};
                    model.addRow(rowData);
                }

                ArrayList<HashMap<String, String>> materialID = idb.fetchRows("SELECT MaterialNamn, "
                        + "Material.MaterialID, antal, meter, kvadratmeter FROM Material "
                        + "LEFT JOIN Antalvara ON Material.MaterialID = Antalvara.MaterialID LEFT JOIN Metervara "
                        + "ON Material.MaterialID = Metervara.MaterialID LEFT JOIN Kvadratmetervara on "
                        + "Material.MaterialID = Kvadratmetervara.MaterialID WHERE Material.MaterialID LIKE "
                        + "'%" + searchText + "%'");
                for (HashMap<String, String> row : materialID) {
                    Object[] rowData = {
                        row.get("MaterialID"),
                        row.get("Materialnamn"),
                        row.get("Antal"),
                        row.get("Meter"),
                        row.get("Kvadratmeter"),};
                    model.addRow(rowData);

                }
                tabell.repaint();
            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Database error!");
                System.out.println("Database error: " + e);
            }
        } else {
            // skulle varit optimalt att ha kvar sökningen innan, istället för att orginaltabellen kommer fram, men vet ej hur?
            setMaterialTable2("MaterialID");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbSorteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSorteraActionPerformed

//        String selectedColumn = (String) columnComboBox.getSelectedItem();
        String sorteringsVal = cbSortera.getSelectedItem().toString();
//        setMaterialTable2(selectedColumn);

        if (sorteringsVal.equals("MaterialNamn")) {

            sorteraNamn();

        }


    }//GEN-LAST:event_cbSorteraActionPerformed

    private void btnSorteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorteraActionPerformed
        //        String selectedColumn = (String) columnComboBox.getSelectedItem();
        String sorteringsVal = cbSortera.getSelectedItem().toString();
//        setMaterialTable2(selectedColumn);

if (sorteringsVal.equals("MaterialID")){
   
    
     String selectedColumn = (String) columnComboBox.getSelectedItem();
    setMaterialTable2(selectedColumn);    
    
}

        if (sorteringsVal.equals("Materialnamn")) {

            sorteraNamn();

        }
        if (sorteringsVal.equals("Antal")) {
            sorteraAntal();
        }

        if (sorteringsVal.equals("Meter")) {
            sorteraMeter();
        }

        if (sorteringsVal.equals("Kvadratmeter")) {
            sorteraKvadratMeter();
        }


    }//GEN-LAST:event_btnSorteraActionPerformed

    private void setMaterialTable2(String orderByColumn) {

        model.setRowCount(0);
        try {
            String query = "SELECT material.MaterialID, Material.Materialnamn, Antalvara.Antal, Metervara.meter, Kvadratmetervara.kvadratmeter "
                    + "FROM material "
                    + "LEFT JOIN Antalvara ON Material.MaterialID = antalvara.MaterialID "
                    + "LEFT JOIN Metervara ON Material.MaterialID = metervara.MaterialID "
                    + "LEFT JOIN Kvadratmetervara ON Material.MaterialID = Kvadratmetervara.MaterialID "
                    + "ORDER BY " + orderByColumn + " ASC";

            ArrayList<HashMap<String, String>> rows = idb.fetchRows(query);
            for (HashMap<String, String> row : rows) {
                Object[] rowData = {
                    row.get("MaterialID"),
                    row.get("Materialnamn"),
                    row.get("Antal"),
                    row.get("Meter"),
                    row.get("Kvadratmeter")
                };
                model.addRow(rowData);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Databasfel: " + e);
        }
    }

    private void sorteraNamn() {

        model.setRowCount(0);
        try {
            String query = "SELECT material.MaterialID, Material.Materialnamn, Antalvara.Antal, Metervara.meter, Kvadratmetervara.kvadratmeter "
                    + "FROM material "
                    + "LEFT JOIN Antalvara ON Material.MaterialID = antalvara.MaterialID "
                    + "LEFT JOIN Metervara ON Material.MaterialID = metervara.MaterialID "
                    + "LEFT JOIN Kvadratmetervara ON Material.MaterialID = Kvadratmetervara.MaterialID "
                    + "ORDER BY Materialnamn ASC";

            ArrayList<HashMap<String, String>> rows = idb.fetchRows(query);
            for (HashMap<String, String> row : rows) {
                Object[] rowData = {
                    row.get("MaterialID"),
                    row.get("Materialnamn"),
                    row.get("Antal"),
                    row.get("Meter"),
                    row.get("Kvadratmeter")
                };
                model.addRow(rowData);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Databasfel: " + e);
        }
    }

    private void sorteraAntal() {

        model.setRowCount(0);
        try {
            String query = "SELECT Material.MaterialID, Material.Materialnamn, Antalvara.Antal  FROM material  "
                    + "JOIN Antalvara ON Material.MaterialID = Antalvara.MaterialID   "
                    + "ORDER BY Antalvara.Antal";

            ArrayList<HashMap<String, String>> rows = idb.fetchRows(query);
            for (HashMap<String, String> row : rows) {
                Object[] rowData = {
                    row.get("MaterialID"),
                    row.get("Materialnamn"),
                    row.get("Antal"),
                    row.get("Meter")

                };
                model.addRow(rowData);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Databasfel: " + e);
        }
    }

    public void sorteraMeter() {

        model.setRowCount(0);
        try {
            String query = "SELECT Material.MaterialID, Material.Materialnamn, Metervara.Meter  FROM material "
                    + "JOIN Metervara ON Material.MaterialID = Metervara.MaterialID "
                    + "ORDER BY Metervara.Meter";

            ArrayList<HashMap<String, String>> rows = idb.fetchRows(query);
            for (HashMap<String, String> row : rows) {
                Object[] rowData = {
                    row.get("MaterialID"),
                    row.get("Materialnamn"),
                    row.get("Antal"),
                    row.get("Meter")

                };
                model.addRow(rowData);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Databasfel: " + e);
        }

    }

    public void sorteraKvadratMeter() {
        model.setRowCount(0);
        try {
            String query = "SELECT Material.MaterialID, Material.Materialnamn, Kvadratmetervara.kvadratmeter  FROM material "
                    + "JOIN Kvadratmetervara ON Material.MaterialID = Kvadratmetervara.MaterialID "
                    + "ORDER BY Kvadratmetervara.Kvadratmeter";

            ArrayList<HashMap<String, String>> rows = idb.fetchRows(query);
            for (HashMap<String, String> row : rows) {
                Object[] rowData = {
                    row.get("MaterialID"),
                    row.get("Materialnamn"),
                    row.get("Antal"),
                    row.get("Meter"),
                    row.get("Kvadratmeter")

                };
                model.addRow(rowData);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Databasfel: " + e);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHanteraMaterial;
    private javax.swing.JButton btnSortera;
    private javax.swing.JButton btnUppdatera;
    private javax.swing.JComboBox<String> cbSortera;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField searchBox;
    private javax.swing.JTable tabell;
    // End of variables declaration//GEN-END:variables
}
