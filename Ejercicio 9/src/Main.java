
/*
  Programa que crea 3 fíos, os ejecuta e espera a que o tercer fío acabe para que se execute o
  segundo e a súa vez, que o segundo acabe para que se execute o primeiro. O programa
  principal no terminará ata que terminen os tres fíos. Os fíos escriben 10 veces o número de
  iteración do bucle e o seu nome. En cada iteración, despois de escribir o seu nome,
  bloquéanse durante un tempo aleatorio entre medio e un segundo e volven a estar dispoñibles
  para a súa execución.
  */

public class Main extends Thread {

    public Main(String a) {
        super(a);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread fio1 = new Thread(new Main("FIO A"));
        Thread fio2 = new Thread(new Main("FIO B"));
        Thread fio3 = new Thread(new Main("FIO C"));

        fio3.start();
        fio3.join();

        fio2.start();
        fio2.join();

        fio1.start();
        fio1.join();
    }

    @Override
    public void run() {
        int i = 1;
        int randomTime = (int) (Math.random() * (1000 - 500 + 1) + 500);
        switch (getName()) {
            case "FIO A", "FIO B", "FIO C" -> {
                while (i < 11) {
                    System.out.println("Bucle: " + i + " Nome: " + getName());
                    try {
                        sleep(randomTime);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    i++;
                }
            }
        }
        System.out.println("\n");
    }
}