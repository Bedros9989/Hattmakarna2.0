
package Hattmakarna;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import java.sql.ResultSet;


public class KollaBild extends javax.swing.JFrame {

    private ImageIcon format=null;
    private String fname=null;
    int s=0;
    public byte[] pimage=null;
    Connection conn=null;
    
    
    public KollaBild() {
        initComponents();
        this.setLocationRelativeTo(null);
        KollaBild.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        conn=KollaBild.DBConnect.connect();
        kollaPåBild();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        väljBild = new javax.swing.JButton();
        spara = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        väljBild.setText("Spara");
        väljBild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                väljBildActionPerformed(evt);
            }
        });

        spara.setText("Välj en bild");
        spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sparaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(väljBild, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(väljBild, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spara, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void väljBildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_väljBildActionPerformed

    }//GEN-LAST:event_väljBildActionPerformed

    private void sparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sparaActionPerformed

    }//GEN-LAST:event_sparaActionPerformed

    public class DBConnect {   
     public static Connection connect()
    {
     Connection con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");                                
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hattmakare","hattuser","hattkey");   
        } 
            catch (Exception e) 
    {
        System.out.println("inter.DBConnect.connect()");
    }
   return con;
        } 
    }
    
    
    private void kollaPåBild(){
        
        try {
           String sql="SELECT `BildData` FROM `Hatt` WHERE HattID=3";          
           PreparedStatement pst=conn.prepareStatement(sql);
           ResultSet rs=pst.executeQuery();
           if(rs.next())
           {          
               byte[] imagedata=rs.getBytes("BildData");
               format=new ImageIcon(imagedata);
               Image mm=format.getImage();
               Image img2=mm.getScaledInstance(jLabel1.getWidth(),        jLabel1.getHeight(), Image.SCALE_SMOOTH);
               ImageIcon image=new ImageIcon(img2);
               jLabel1.setIcon(image);
            } 
           else
           {
          
           }
        } catch (Exception e) {
           
        }   
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton spara;
    private javax.swing.JButton väljBild;
    // End of variables declaration//GEN-END:variables
}
