
//Programa en Java que cree dous fíos e os executa. Os fíos escriben dez veces un número de
//iteración do bucle e seu nome. En cada iteración, despois de escribir o seu nome, se bloquean
//durante un tempo aleatorio de segundos e después volven a estar dispoñibles para a súa
//execución.

public class Main extends Thread{

    public Main(String a){
        super(a);
    }

    public void run(){
        for (int i = 1; i<11;i++){
            System.out.println(i + " "+ getName());
        }
        try {
            Main.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Termina thread "+ getName());
    }

    public static void main(String[] args) {
        new Main("a1").start();
        new Main("a2").start();
        System.out.println("Termina thread main");
    }
}