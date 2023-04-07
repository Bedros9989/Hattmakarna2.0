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
    
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> parent of 1d85450 (.)
       public static boolean rutaEmpty(JTextField enRuta) {
        boolean empty = false;

        if (enRuta.getText().isEmpty()) {
            empty = true;
        }

        return empty;
    }
<<<<<<< HEAD

    public static boolean rutanÄrTom2 (JTextArea enRuta, JLabel namn){
        
        boolean resultat = true;
        if (enRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ruta "+namn.getText()+" får ej vara tom!");
            resultat=false;
        }
        return resultat;
    }
=======
>>>>>>> parent of 73abaef (.)
    
    

=======
>>>>>>> parent of 1d85450 (.)
}
