package Hattmakarna;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oru.inf.InfException;
import oru.inf.InfDB;


public class Statistik extends javax.swing.JFrame {

    private InfDB idb;
    
    public Statistik(InfDB idb) {
        initComponents();
        this.idb = idb;
        this.setLocationRelativeTo(null);
        Statistik.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        kvartal.setVisible(false);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblValkommen = new javax.swing.JLabel();
        lblHattID = new javax.swing.JLabel();
        sortera = new javax.swing.JComboBox<>();
        kvartal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        lblValkommen.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        lblValkommen.setText("Statistik");

        lblHattID.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        lblHattID.setText("Sortera efter:");

        sortera.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        sortera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj...", "Månadsvis", "Kvartalsvis", "Årsvis" }));
        sortera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorteraActionPerformed(evt);
            }
        });

        kvartal.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        kvartal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q1", "Q2", "Q3" }));
        kvartal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kvartalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(lblValkommen))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblHattID)
                        .addGap(18, 18, 18)
                        .addComponent(sortera, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kvartal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValkommen)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHattID)
                    .addComponent(sortera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kvartal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(374, Short.MAX_VALUE))
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

    private void kvartalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kvartalActionPerformed
        
    }//GEN-LAST:event_kvartalActionPerformed

    private void sorteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorteraActionPerformed
        
        if (sortera.getSelectedItem().equals("Månadsvis")){
            
            Locale swedishLocale = new Locale("sv", "SE");
            JCalendar calendar = new JCalendar();
            JMonthChooser monthChooser = calendar.getMonthChooser();
            monthChooser.setLocale(swedishLocale);
            JPanel panel = new JPanel();
            panel.add(monthChooser);
            int result = JOptionPane.showConfirmDialog(null, panel, "Välj en månad", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION){
                
                int month = monthChooser.getMonth() + 1;
                System.out.println("Month selected: " + month);
            }
        }else if(sortera.getSelectedItem().equals("Kvartalsvis")){
            
            JCalendar calendar = new JCalendar();
            JYearChooser yearChooser = calendar.getYearChooser();
            JPanel panel = new JPanel();
            panel.add(yearChooser);
            int result = JOptionPane.showConfirmDialog(null, panel, "Välj ett år", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION){
                
                int year = yearChooser.getYear();
                System.out.println("År vald: " + year);
                kvartal.setVisible(true);
                
            }
        }else if (sortera.getSelectedItem().equals("Årsvis")){
            
            JCalendar calendar = new JCalendar();
            JYearChooser yearChooser = calendar.getYearChooser();
            JPanel panel = new JPanel();
            panel.add(yearChooser);
            int result = JOptionPane.showConfirmDialog(null, panel, "Välj ett år", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if (result == JOptionPane.OK_OPTION){
                
                int year = yearChooser.getYear();
                System.out.println("År vald: " + year);
                
            }
            
            
        }
        
    }//GEN-LAST:event_sorteraActionPerformed

    
        private void raknaUtTotalkostnad(String hattID) {
            
        try {
            

            //Räknar ut arbetskostnad
            double arbetskostnad = 0;
            double tillverkningstimmar = Double.parseDouble(idb.fetchSingle("SELECT Tillverkningstimmar FROM hatt WHERE hattID= " + hattID));
            double timpris = Double.parseDouble(idb.fetchSingle("SELECT Timpris FROM personal WHERE personalID= (SELECT skapare FROM hatt WHERE hattID= " + hattID + " )"));
            arbetskostnad = tillverkningstimmar * timpris;

            //Räknar ut materialkostnad
            double totalMaterialkostnad = 0;
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

            for (Double enMaterialkostnad : listaMaterialkostnad) {
                totalMaterialkostnad = totalMaterialkostnad + enMaterialkostnad;
            }

            //Räknar ut tillverkningskostnad
            double tillverkningskostnad = totalMaterialkostnad + arbetskostnad;

            //txtTillverkningskostnad.setText(String.valueOf(tillverkningskostnad));

        } catch (InfException ex) {
            JOptionPane.showMessageDialog(null, "Något gick fel");
            System.out.println("Internt felmeddelande" + ex.getMessage());
        }
    }
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> kvartal;
    private javax.swing.JLabel lblHattID;
    private javax.swing.JLabel lblValkommen;
    private javax.swing.JComboBox<String> sortera;
    // End of variables declaration//GEN-END:variables
}
