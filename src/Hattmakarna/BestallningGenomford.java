
package Hattmakarna;

import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.Random;

public class BestallningGenomford extends javax.swing.JFrame {

    private InfDB idb;
    private String orderNr;
    private String datum;
    private String mottagare;
    private String kund;
    private String pris;
    
    public BestallningGenomford(InfDB idb, String orderNr,String datum, String mottagare,String kund,String pris) {
        initComponents();
        this.idb = idb;
        this.orderNr=orderNr;
        this.datum=datum;
        this.mottagare=mottagare;
        this.kund=kund;
        this.pris=pris;
        this.setLocationRelativeTo(null);
        BestallningGenomford.this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBVisaFraktsedel = new javax.swing.JButton();
        jLBeställning = new javax.swing.JLabel();
        skickaBekräftelse = new javax.swing.JButton();
        visaFaktura = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(249, 248, 244));

        jBVisaFraktsedel.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        jBVisaFraktsedel.setForeground(new java.awt.Color(51, 51, 51));
        jBVisaFraktsedel.setText("Visa Fraktsedel");
        jBVisaFraktsedel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVisaFraktsedelActionPerformed(evt);
            }
        });

        jLBeställning.setFont(new java.awt.Font("Futura", 0, 24)); // NOI18N
        jLBeställning.setText("Beställning genomförd!");

        skickaBekräftelse.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        skickaBekräftelse.setForeground(new java.awt.Color(51, 51, 51));
        skickaBekräftelse.setText("Skicka Bekräftelse");
        skickaBekräftelse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skickaBekräftelseActionPerformed(evt);
            }
        });

        visaFaktura.setFont(new java.awt.Font("Futura", 0, 15)); // NOI18N
        visaFaktura.setForeground(new java.awt.Color(51, 51, 51));
        visaFaktura.setText("Visa Faktura");
        visaFaktura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaFakturaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 251, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLBeställning))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visaFaktura, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skickaBekräftelse)
                            .addComponent(jBVisaFraktsedel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLBeställning)
                .addGap(27, 27, 27)
                .addComponent(jBVisaFraktsedel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(visaFaktura, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(skickaBekräftelse, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public static PDDocument createSamplePDF1(String msg, String msg2, String msg3, String msg4, String msg5, String msg6, String msg7)throws IOException{
        
        PDDocument pDDocument = new PDDocument();
        PDPage pDPage = new PDPage();
        pDDocument.addPage(pDPage);
        PDPageContentStream cs = new PDPageContentStream(pDDocument,pDPage);
        cs.beginText();
        cs.setFont(PDType1Font.TIMES_BOLD, 20);
        cs.setNonStrokingColor(Color.black);
        cs.moveTextPositionByAmount(250, 750);
        cs.showText(msg);
        cs.newLineAtOffset(-70, -30);
        cs.newLine();
        cs.showText(msg2);
        cs.newLineAtOffset(-150, -80);
        cs.newLine();
        cs.showText(msg3);
        cs.newLineAtOffset(0, -50);
        cs.newLine();
        cs.showText(msg4);
        cs.newLineAtOffset(0, -50);
        cs.newLine();
        cs.showText(msg5);
        cs.newLineAtOffset(0, -50);
        cs.newLine();
        cs.showText(msg6);
        cs.newLineAtOffset(0, -50);
        cs.newLine();
        cs.showText(msg7);
        cs.endText();
        cs.close();
        return pDDocument;
    }
    
    public static void savenclose1 (PDDocument pdd,String destpath)throws IOException{
        
        pdd.save(new File(destpath));
        pdd.close();
        
    }
    
    public static void insertImage1 (String pdfPath, String imagePath)throws IOException{
        
       PDDocument pdd = PDDocument.load(new File(pdfPath));
       PDPage page = pdd.getPage(0);
       
       PDImageXObject pdImage = PDImageXObject.createFromFile("./Databasfiler/1.png", pdd);
       PDPageContentStream cs = new PDPageContentStream(pdd,page,PDPageContentStream.AppendMode.APPEND,false);
       cs.drawImage(pdImage,55,50,500,300);
       cs.close();
       savenclose1(pdd,pdfPath);
        
    }
    
    private void jBVisaFraktsedelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVisaFraktsedelActionPerformed
        
        String text = "Fraktsedel";
        String text2= "Otto och Judiths hattar AB";
        String text3= "Ordernummer:"+orderNr;
        String text4= "Vikt:";
        String text5= "Datum:"+datum;
        String text6= "Avsändare: Hattvägen 1, 70281, Örebro";
        String text7= "Mottagare:"+ mottagare;
       
        try {
       PDDocument pdd = createSamplePDF1(text, text2, text3, text4, text5,text6,text7);
        savenclose1 (pdd,"./Databasfiler/fraktsedel.pdf");
        insertImage1("./Databasfiler/fraktsedel.pdf","./Databasfiler/1.png");
        
        File file = new File("./Databasfiler/fraktsedel.pdf");
        if (file.exists()) {
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("File not found.");
        }

        
    } catch (IOException e) {
        e.printStackTrace();
    }
        
    }//GEN-LAST:event_jBVisaFraktsedelActionPerformed
    
    private void skickaBekräftelseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skickaBekräftelseActionPerformed
        
        try {
            
            String email= idb.fetchSingle("select Email from Kund where KundID = "+kund);
            try {
            String subject = "Email subject";
            String body = "Hej,\n\n Tack for din forfragan om att bestalla en hatt fran Otto och Judiths hattar. Hatten du osnkar kommer att kosta"+" "+pris+". For att bestalla den vanligen svara pa detta meddelande. \n\n Mvh \n Otto och Judith";
            URI emailUri = new URI("mailto", email, null, "subject=" + subject + "&body=" + body, null);
            Desktop.getDesktop().mail(emailUri);
            
            }catch (URISyntaxException | IOException ex) {
                 ex.printStackTrace();
            }
 
    }
        catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        
        }
        
    }//GEN-LAST:event_skickaBekräftelseActionPerformed

public static PDDocument createSamplePDF2(String msg, String msg2, String msg3, String msg4, String msg5, String msg6, String msg7, String msg8,String msg9,String msg10,String msg11)throws IOException{
        
        PDDocument pDDocument = new PDDocument();
        PDPage pDPage = new PDPage();
        pDDocument.addPage(pDPage);
        PDPageContentStream cs = new PDPageContentStream(pDDocument,pDPage);
        cs.beginText();
        cs.setFont(PDType1Font.TIMES_BOLD, 18);
        cs.setNonStrokingColor(Color.black);
        cs.moveTextPositionByAmount(430, 750);
        cs.showText(msg);
        cs.newLineAtOffset(-70, -20);
        cs.newLine();
        cs.showText(msg2);
        cs.newLineAtOffset(-330, -90);
        cs.newLine();
        cs.showText(msg3);
        cs.newLineAtOffset(0, -30);
        cs.newLine();
        cs.showText(msg4);
        cs.newLineAtOffset(0, -30);
        cs.newLine();
        cs.showText(msg5);
        cs.newLineAtOffset(0, -30);
        cs.newLine();
        cs.showText(msg6);
        cs.newLineAtOffset(0, -60);
        cs.newLine();
        cs.showText(msg7);
        cs.newLineAtOffset(0, -30);
        cs.newLine();
        cs.showText(msg8);
        cs.newLineAtOffset(0, -30);
        cs.newLine();
        cs.showText(msg9);
        cs.newLineAtOffset(0, -30);
        cs.newLine();
        cs.showText(msg10);
        cs.newLineAtOffset(0, -60);
        cs.newLine();
        cs.showText(msg11);
        cs.endText();
        cs.close();
        return pDDocument;
    }
    
    public static void savenclose2 (PDDocument pdd,String destpath)throws IOException{
        
        pdd.save(new File(destpath));
        pdd.close();
        
    }
    
    public static void insertImage2 (String pdfPath, String imagePath1, String imagepath2)throws IOException{
        
       PDDocument pdd = PDDocument.load(new File(pdfPath));
       PDPage page = pdd.getPage(0);
       
       PDImageXObject pdImage1 = PDImageXObject.createFromFile("./Databasfiler/2.png", pdd);
       PDPageContentStream cs1 = new PDPageContentStream(pdd,page,PDPageContentStream.AppendMode.APPEND,false);
       cs1.drawImage(pdImage1,-5,0,610,300);
       cs1.close();
       
       PDImageXObject pdImage2 = PDImageXObject.createFromFile("./Databasfiler/3.png", pdd);
       PDPageContentStream cs2 = new PDPageContentStream(pdd,page,PDPageContentStream.AppendMode.APPEND,false);
       cs2.drawImage(pdImage2,30,680,150,100);
       cs2.close();
       
       savenclose2(pdd,pdfPath);
        
    }
    
    private void visaFakturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaFakturaActionPerformed
        
        Random random = new Random();
        int number = random.nextInt(90000) + 10000;
            String fakturanummer = String.format("%05d", number);
        int number2 = random.nextInt(100000);
            String ocr = String.format("%010d", number);
       
        JCalendar calendar = new JCalendar();
        Date date = calendar.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = sdf.format(date);
        
        Date currentDate = calendar.getDate();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(currentDate);
        calendar2.add(Calendar.DAY_OF_YEAR, 30);
        Date futureDate = calendar2.getTime();
        String dateString2 = sdf.format(futureDate); 
        
        try {
            
        String namn = idb.fetchSingle("select Namn from Kund where KundID = "+kund);
        String adress = idb.fetchSingle("select Adress from Kund where KundID = "+kund);
        String antal = idb.fetchSingle("select count(*) from Hatt where Bestallning="+orderNr);
        
        String text = "Faktura";
        String text2= "Otto och Judiths hattar AB";
        String text3= "Fakturnanummer:"+" "+fakturanummer;
        String text4= "Fakturadatum:"+ " "+dateString;
        String text5= "Namn:"+" "+namn;
        String text6= "Adress:"+" "+adress;
        String text7= "Pris:"+ " "+pris+" "+"kr";
        String text8= "Förfallodatum:"+" "+dateString2;
        String text9= "Plusgirokontonr: 99 1337-0";
        String text10= "OCR- nummer:"+" "+ocr;
        String text11= "Antal beställda varor:"+" "+antal;
        
        
       PDDocument pdd = createSamplePDF2(text, text2, text3, text4, text5,text6,text7,text8,text9,text10,text11);
        savenclose2 (pdd,"./Databasfiler/faktura.pdf");
        insertImage2("./Databasfiler/faktura.pdf","./Databasfiler/2.png","./Databasfiler/3.png");
        
        File file = new File("./Databasfiler/faktura.pdf");   
        if (file.exists()) {
            try {
                Desktop.getDesktop().open(file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else {
            System.out.println("File not found.");
        }

        
    } catch (IOException e) {
        e.printStackTrace();
    }catch (InfException e) {

            JOptionPane.showMessageDialog(null, "Fel på databasuppkopplingen, prova igen senare!");
            System.out.println("Databasfel: " + e);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Något gick snett, prova igen!");
            
        
        }
        
    }//GEN-LAST:event_visaFakturaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBVisaFraktsedel;
    private javax.swing.JLabel jLBeställning;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton skickaBekräftelse;
    private javax.swing.JButton visaFaktura;
    // End of variables declaration//GEN-END:variables
}
