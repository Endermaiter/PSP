
/*
Realizar un programa que cree un fío, que a súa vez cree outro fío, e así consecutivamente,
ata un total de cinco fíos. Cada fío debe presentar o seu nome indicando que comenzou, crear
o seu fío fillo e presentar o seu nome 10 veces indicando que se está procesando, esperando
un tempo aleatorio entre 100 e 600 milisegundos entre cada presentación. Cada fío deberá
esperar a que o seu fillo termine antes de presentar o seu último mensaxe indicando o seu
nome e que rematou.
 */

import java.util.Random;

public class Main extends Thread {

    static int contadorFios = 1;
    int numeroRandom = (int) (Math.random() * (600 - 100)) + 100;

    public Main(int a) {
        super(String.valueOf(a));
    }

    public static void main(String[] args) throws InterruptedException {
        Thread fio1 = new Thread(new Main(contadorFios));
        fio1.start();
    }

    public void run() {
        if (contadorFios < 6) {
            for(int i =0; i<10;i++){
                System.out.println("Son o fio " + getName());
                try {
                    Main.sleep(numeroRandom);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Rematou o fío "+getName());
            contadorFios++;
            Thread fio2 = new Thread(new Main(contadorFios));
            fio2.start();
        }
    }
}