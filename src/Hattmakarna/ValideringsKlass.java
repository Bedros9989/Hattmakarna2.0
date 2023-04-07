package Hattmakarna;


import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


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
    
    public static boolean endastNummerTillåten(JTextField telefon){
        
        boolean resultat = true;
        if (telefon.getText().matches(".*[a-zA-Z].*")){
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
    
    public static boolean rutaEmpty (JTextField enRuta){
        
        boolean resultat = true;
        if (enRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ruta får ej vara tom!");
            resultat=false;
        }
        return resultat;
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
    
}
