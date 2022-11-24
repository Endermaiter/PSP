package exercicio7;

/**
 *
 */
public class Lector extends Thread {
    
    private Buzon bz;
    
    //Constructor
    public Lector(Buzon mail){
        bz = mail;
    }
    
    //Lánzase o método lector sincronizado do obxecto buzón
     @Override
    public void run(){
         bz.lector();
    }
}
