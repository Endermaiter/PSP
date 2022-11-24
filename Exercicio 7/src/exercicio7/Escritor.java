package exercicio7;

/*
 * 
 *
 */
public class Escritor extends Thread{
    
    private Buzon bz;
    private String txt;
    
    //Constructor
    public Escritor(Buzon mail, String texto){
        bz = mail;
        txt = texto;
    }
    
    //Lánzase o método escritos sincronizado do obxecto buzón enviandolle a mensaxe
    @Override
    public void run(){
        bz.escritor(txt);
    }
    
}
