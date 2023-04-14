/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Hattmakarna;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author rilam
 */
public class HanteraMaterial extends javax.swing.JFrame {
private InfDB idb;
    /**
     * Creates new form HanteraMaterial
     */
    public HanteraMaterial(InfDB idb) {
        initComponents();
        this.idb = idb;
        fillComboboxMaterialNamn();
        this.setLocationRelativeTo(null);
        HanteraMaterial.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLMaterialMangd = new javax.swing.JLabel();
        jLValjMaterial = new javax.swing.JLabel();
        jCMaterialNamn = new javax.swing.JComboBox<>();
        jBAndra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLMaterialMangd.setText("Sätt materialmängd till 0 i lager");

        jLValjMaterial.setText("Välj material");

        jCMaterialNamn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBAndra.setText("Ändra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBAndra)
                    .addComponent(jCMaterialNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLMaterialMangd)
                        .addGap(68, 68, 68)
                        .addComponent(jLValjMaterial)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLMaterialMangd)
                    .addComponent(jLValjMaterial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCMaterialNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBAndra)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void fillComboboxMaterialNamn(){ 
    jCMaterialNamn.removeAllItems();
    String fraga = "SELECT MaterialNamn FROM Material";
    
    ArrayList<String> MaterialNamnLista = new ArrayList<String>();
    try {
    MaterialNamnLista= idb.fetchColumn(fraga);
    
    for(String material: MaterialNamnLista)
    {
      jCMaterialNamn.addItem(material);
    }
    }   catch (InfException ex){
        Logger.getLogger(HanteraMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAndra;
    private javax.swing.JComboBox<String> jCMaterialNamn;
    private javax.swing.JLabel jLMaterialMangd;
    private javax.swing.JLabel jLValjMaterial;
    // End of variables declaration//GEN-END:variables
}
