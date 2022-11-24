
//Programa que crea 4 fíos, os executa e espera a que estes terminen. Os fíos escriben 5 veces o
//número de iteración do bucle e o seu nome. En cada iteración, despois de escribir o seu nome,
//bloquéanse durante un segundo e volven a estar dispoñibles para a súa execución.

public class Main extends Thread{

    public Main(String a){
        super(a);
    }

    public void run(){
        for (int i = 1; i<6;i++){
            System.out.println(i + " "+ getName());
        }
        System.out.println("Termina thread "+ getName());
    }

    public static void sleepMethod(){
        try {
            Main.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        //CON EL METODO sleep()

        /*
        new Main("Fiesta").start();
        Main.sleepMethod();
        new Main("Maquiabelico").start();
        Main.sleepMethod();
        new Main("Sintron").start();
        Main.sleepMethod();
        new Main("Roncero").start();
        System.out.println("Termina thread main");

         */

        //CON EL MÉTODO join()


        Thread fiesta = new Thread(new Main("Fiesta"));
        Thread maquiabelico = new Thread(new Main("Maquiabelico"));
        Thread sintron = new Thread(new Main("Sintron"));
        Thread roncero = new Thread(new Main("Roncero"));

        fiesta.start();
        fiesta.join();
        //fiesta.setPriority(10);

        maquiabelico.start();
        maquiabelico.join();
        //maquiabelico.setPriority(8);

        sintron.start();
        sintron.join();
        //sintron.setPriority(6);

        roncero.start();
        roncero.join();
        //roncero.setPriority(4);

        //EN JAVA, EL METODO setPriority() NO FUNCIONA CORRECTAMENTE PORQUE NO SE EJECUTAN EN EL ORDEN DESEADO.


    }
}