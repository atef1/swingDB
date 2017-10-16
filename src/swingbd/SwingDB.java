/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbd;

import fr.seb.databas.utils.DatabaseTools;
import fr.seb.swingDB.frame.LoginFrame;


/**
 *
 * @author formation
 */
public class SwingDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //System.out.println(DatabaseTools.sha1Encode("123"));
        
        
        //creation d'une instance de la fenetre d login
        LoginFrame app = new LoginFrame();
        
        //affichage de la fenetre 
        app.setVisible(true);
        
        //centrage de la fenetre sur l'écran
        app.setLocationRelativeTo(null);
        
        
    }
    
}
