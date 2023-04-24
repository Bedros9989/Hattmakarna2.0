package Hattmakarna;


import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import oru.inf.InfException;
import oru.inf.InfDB;


public class Statistik extends javax.swing.JFrame {

    private InfDB idb;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DefaultTableModel model = new DefaultTableModel();
    
    public Statistik(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        Statistik.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        antalBeställningar.setEnabled(false);
        antalReturer.setEnabled(false);
        vinst.setEditable(false);
        tabell.setModel(model);
        model.addColumn("BeställningsID");
        model.addColumn("Antal Varor");
        model.addColumn("Försäljningspris");
        model.addColumn("Tillverkningspris");
        model.addColumn("Vinst");
        model.addColumn("Datum");
        model.addColumn("Skapare");
        tabell.setDefaultEditor(Object.class, null);
        
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblValkommen = new javax.swing.JLabel();
        lblHattID = new javax.swing.JLabel();
        förstaDatum = new com.toedter.calendar.JDateChooser();
        andraDatum = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabell = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        antalBeställningar = new javax.swing.JTextField();
        antalReturer = new javax.swing.JTextField();
        vinst = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        lblValkommen.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        lblValkommen.setText("Statistik");

        lblHattID.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblHattID.setText("Sortera mellan:");

        förstaDatum.setDateFormatString("yyyy-MM-dd");
        förstaDatum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        andraDatum.setDateFormatString("yyyy-MM-dd");
        andraDatum.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        jLabel1.setText("---");

        ok.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        tabell.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        tabell.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabell);

        jLabel2.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel2.setText("Antal beställningar");

        jLabel3.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel3.setText("Antal returer");

        jLabel4.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        jLabel4.setText("Total vinst");

        antalBeställningar.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        antalReturer.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        vinst.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(antalBeställningar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(antalReturer, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vinst, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 117, Short.MAX_VALUE)
                        .addComponent(lblHattID)
                        .addGap(18, 18, 18)
                        .addComponent(förstaDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(andraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblValkommen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ok)
                        .addGap(307, 307, 307))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblValkommen)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(förstaDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addComponent(lblHattID))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(andraDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(antalBeställningar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(antalReturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vinst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        
        Date datum1 = förstaDatum.getDate();
        Date datum2 = andraDatum.getDate();
        String förstaDatumet = dateFormat.format(datum1);
        String andraDatumet = dateFormat.format(datum2);
        
        model.setRowCount(0);
        
        try
        {
            String beställningar = "SELECT BestallningsID,(SELECT COUNT(*) FROM hatt WHERE Bestallning = Bestallning.BestallningsID) AS AntalHattar, Totalsumma, Datum, Namn FROM Bestallning JOIN hatt h ON Bestallning.BestallningsID = h.Bestallning JOIN Personal P ON P.PersonalID = Bestallning.Personal where Datum between '"+förstaDatumet+"' and '"+andraDatumet+"'";
            ArrayList<HashMap<String, String>> allaHattar = idb.fetchRows(beställningar); 
            
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (value instanceof Number) {
                double val = ((Number) value).doubleValue();
                if (val > 0) {
                    c.setForeground(Color.GREEN); // Positive numbers are green
                } else if (val < 0) {
                    c.setForeground(Color.RED); // Negative numbers are red
                } else {
                    c.setForeground(Color.BLACK); // Zero is black
                }
            }
            return c;
        }
    };
            
            
            for (HashMap<String, String> hatt : allaHattar){     
                
                String beställningsID = hatt.get("BestallningsID");
                String antalHattar = hatt.get("AntalHattar");
                String totalsumma = hatt.get("Totalsumma");
                String datum = hatt.get("Datum");
                String namn = hatt.get("Namn");
                
                Object[] hattData = {
                    
                    beställningsID,
                    antalHattar,
                    totalsumma+"kr",
                    raknaUtTotalkostnad1(beställningsID)+"kr",
                    räknaVinst(Double.parseDouble(totalsumma),raknaUtTotalkostnad1(beställningsID)),
                    datum,
                    namn, 
                };
                 
               TableColumn column = tabell.getColumnModel().getColumn(4);
               column.setCellRenderer(renderer);
                model.addRow(hattData);
                
                String antalreturer = idb.fetchSingle("select count(*) from Bestallning where Status='Returnerat' and Datum between '"+förstaDatumet+"' and '"+andraDatumet+"'");
                antalReturer.setText(antalreturer);
                
                String antalbeställningar = idb.fetchSingle("select count(*) from Bestallning where Datum between '"+förstaDatumet+"' and '"+andraDatumet+"'");
                antalBeställningar.setText(antalbeställningar);
                
                double sum = 0.0;
                for (int i = 0; i < tabell.getRowCount(); i++) {
                Object value = tabell.getValueAt(i, 4); // Get the value from the fourth column (index 3)
                if (value instanceof Number) {
                double val = ((Number) value).doubleValue();
                sum += val; // Add the value to the running sum
                }
            }
                String summa = Double.toString(sum);
                vinst.setText(summa);
                
                if (sum > 0) {
                vinst.setForeground(Color.GREEN); // Set the text color to green if the sum is positive
                } else if (sum < 0) {
                    vinst.setForeground(Color.RED); // Set the text color to red if the sum is negative
                } else {
                vinst.setForeground(Color.BLACK); // Set the text color to black if the sum is zero
                }
                
            }

            
        }catch (InfException ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Databasfel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        catch (Exception ettUndantag) {
            
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
            
        }
        
        
    }//GEN-LAST:event_okActionPerformed

        private double raknaUtTotalkostnad1(String beställID){
            
            double i=0;
            
            try{
            
                ArrayList<String> allaHattar = idb.fetchColumn("select HattID from hatt where Bestallning="+beställID);
                
                for (String hattar : allaHattar){
                    
                    i= i + raknaUtTotalkostnad2(hattar);
                    
                    
                }

            
            
        }  catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
    }
         return i;   
            
        }
    
    
        private double raknaUtTotalkostnad2(String hattID) {
            
            double tillverkningskostnad=0;
        try {
            

            //Räknar ut arbetskostnad
            double arbetskostnad = 0;
            double tillverkningstimmar = Double.parseDouble(idb.fetchSingle("SELECT Tillverkningstimmar FROM hatt WHERE hattID= " + hattID));
            double timpris = Double.parseDouble(idb.fetchSingle("SELECT Timpris FROM personal WHERE personalID= (SELECT skapare FROM hatt WHERE hattID= " + hattID + " )"));
            arbetskostnad = tillverkningstimmar * timpris;

            //Räknar ut materialkostnad
            
            ArrayList<Double> listaMaterialkostnad = new ArrayList<>();
            ArrayList<HashMap<String, String>> allaMaterialIHatten = idb.fetchRows("SELECT Material, Mangd FROM Hattmaterial WHERE Hatt= " + hattID);

            for (HashMap<String, String> enMaterialRad : allaMaterialIHatten) {
                String material = enMaterialRad.get("Material");
                String mangd = enMaterialRad.get("Mangd");
                double mangdDouble = Double.parseDouble(mangd);
                double enhetspris = Double.parseDouble(idb.fetchSingle("SELECT enhetspris FROM material WHERE materialID= " + material));

                double materialkostnad = mangdDouble * enhetspris;

                listaMaterialkostnad.add(materialkostnad);
            }
            double totalMaterialkostnad = 0;
            for (Double enMaterialkostnad : listaMaterialkostnad) {
                totalMaterialkostnad = totalMaterialkostnad + enMaterialkostnad;
            }

            //Räknar ut tillverkningskostnad
             tillverkningskostnad = totalMaterialkostnad + arbetskostnad;

            //txtTillverkningskostnad.setText(String.valueOf(tillverkningskostnad));

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
        
        return tillverkningskostnad;
        
    }
    
        private double räknaVinst(double Försäljning, double Tillverkning){
            
            double total = Försäljning - Tillverkning;
            return total;
        }
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser andraDatum;
    private javax.swing.JTextField antalBeställningar;
    private javax.swing.JTextField antalReturer;
    private com.toedter.calendar.JDateChooser förstaDatum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHattID;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JButton ok;
    private javax.swing.JTable tabell;
    private javax.swing.JTextField vinst;
    // End of variables declaration//GEN-END:variables
}
