package Hattmakarna;


import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;


public class ValideringsKlass {
    
    public static boolean lösenordetÄrLång(JPasswordField lösenordet){
        
        boolean resultat = true;
        char[] lösenord = lösenordet.getPassword();
        if(lösenord.length>6){   
            JOptionPane.showMessageDialog(null, "Lösenord får inte vara mer än 6 karaktärer!");
            resultat = false;
        }
        return resultat;
    }
    
    public static boolean endastNummerTillåten(JTextField ettTextfält){
        
        boolean resultat = true;
        if (ettTextfält.getText().matches(".*[a-zA-Z].*")){
            JOptionPane.showMessageDialog(null, "Endast siffror tillåtna!");
            resultat=false;  
        }
        return resultat;
    }
    
    public static boolean rutanÄrTom (JTextField enRuta, JLabel namn){
        
        boolean resultat = true;
        if (enRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ruta "+namn.getText()+" får ej vara tom!");
            resultat=false;
        }
        return resultat;
    }
    
    //rutaEmpty är rätt, ändra inte
        public static boolean rutaEmpty(JTextField enRuta) {
        boolean empty = false;

        if (enRuta.getText().isEmpty()) {
            empty = true;
        }

        return empty;
    }
    
    public static boolean rutanÄrTom2 (JTextArea enRuta, JLabel namn){
        
        boolean resultat = true;
        if (enRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ruta "+namn.getText()+" får ej vara tom!");
            resultat=false;
        }
        return resultat;
    }
    
    public static boolean datumInteVald(JDateChooser datum){
        
        boolean resultat = true;
        Date valdDatum = datum.getDate();
        if (valdDatum == null){
            JOptionPane.showMessageDialog(null, "Du har inte valt ett datum");
            resultat = false;
        }
        return resultat;
    }
    
    public static boolean listaTom(JList lista){
        
        boolean resultat = true;
        if(lista.getModel().getSize() ==0){
            JOptionPane.showMessageDialog(null, "Du har inte valt någon hatt");
            resultat = false;
        }
        return resultat;
    }

    //Kontrollerar om värdet som fyllts i är positivt
    public static boolean isPositivt(JTextField ettTextFalt) {
        boolean resultat = true;
        double ettTextFaltSiffra = Double.parseDouble(ettTextFalt.getText());
        if (ettTextFaltSiffra < 0) {
            JOptionPane.showMessageDialog(null, "Endast positivt tal tillåtet!");
            resultat = false;
        }
        return resultat;
    }

    //Kontrollerar om värdet som fyllts i är en double
    public static boolean isTal(JTextField ettTextFalt) {
        boolean resultat = true;

        try {
            Integer.parseInt(ettTextFalt.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Var god ange ett tal (decimal tillåtet)!");
            resultat = false;
        }
        return resultat;
    }
    
    //Kontrollerar att fältet är ifyllt
    public static boolean textFaltHarVarde(JTextField ettTextFalt) {
        boolean resultat = true;

        if (ettTextFalt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vissa inmatningsrutor får ej lämnas tomma!");
            resultat = false;
        }
        return resultat;
    }
    
     public static boolean textFaltHarVarde2(JTextField ettTextFalt) {
        boolean resultat = true;

        if (ettTextFalt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Inmatningsrutan får ej lämnas tom!");
            resultat = false;
        }
        return resultat;
    }

}
