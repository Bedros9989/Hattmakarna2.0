package Hattmakarna;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
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
    
     public static boolean tommaTextFält(JTextField ... textrutor){
        boolean resultat = true;
        for (JTextField text : textrutor){
            if (text.getText().isEmpty()){
                resultat = false;
            }
        }
            if (!resultat){
                JOptionPane.showMessageDialog(null, "Vänligen fyll i alla fält!");
            }
        
        return resultat;
    }
    
}
