package exercicio7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */
public class Buzon {
 
    private String mail = null;
    
    /**Métodos sincronizados*/
    
    //Soamente se pode leer a mensaxe se non é NULL
    public synchronized void lector(){
        
        while(mail==null){
            try {
                System.out.println("    *  Buzón vacío. Imposible leer.");
                wait();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("Lendo: "+mail);
        
        mail = null;
        notify();
   
    }
    
    //Soamente se pode escribir si a mensaxe é NULL
    public synchronized void escritor(String mai){
        
        while(mail!=null){
            
            try {
                System.out.println("    *   Non se pode escribir. Buzón cheo.");
                wait();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        this.mail = mai;
        
        System.out.println("Escribindo: "+mail);
        
        notify();
    }
}
