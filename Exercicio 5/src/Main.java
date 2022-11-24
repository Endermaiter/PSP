
/*
Escribe unha clase que cree dous fíos e force que a escritura do segundo sexa sempre anterior á
escritura por pantalla do primeiro.
 Exemplo de ejecución:
 Ola, son o fío número 2
 Ola, son o fío número 1
a) faino con join
b )faino con prioridades
 */

public class Main extends Thread{

    public Main(int a){
        super(String.valueOf(a));
    }

    public static void main(String[] args) throws InterruptedException {
        Thread fio1 = new Thread(new Main(1));
        Thread fio2 = new Thread(new Main(2));


        //APARTADO a)

        fio2.start();
        fio2.join();

        fio1.start();
        fio1.join();



        //APARTADO b)

        /*
        fio2.setPriority(10);
        fio1.setPriority(4);
        fio1.start();
        fio2.start();

         */
    }


    public void run() {
        System.out.println("Ola, son o fio numero "+getName());
    }
}