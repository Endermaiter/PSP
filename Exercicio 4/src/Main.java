
/*
Realiza un programa en java que execute tres fíos de forma concurrente. Un de eles debe sumar os
números pares del 1 ao 1000, outro os impares, e outro, os que terminen en dous ou en tres.
 */
public class Main extends Thread {


    public Main(String a) {
        super(a);
    }

    public void run() {
        switch (getName()) {
            case "par":
                int suma = 0;
                for (int i = 1; i < 1000; i++) {
                    if (i % 2 == 0) {
                        suma = suma + i;
                    }
                }
                System.out.println(suma);
                break;
            case "impar":
                int sum = 0;
                for (int i = 1; i < 1000; i++) {
                    if (i % 2 != 0) {
                        sum = sum + i;
                    }
                }
                System.out.println(sum);
                break;
            case "rematen23":
                int sumar = 0;
                for (int i = 1; i < 1000; i++) {
                    if ((i % 10 == 2 )||(i % 10 == 3)) {
                        sumar = sumar + i;
                    }
                }
                System.out.println(sumar);
                break;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread fio1 = new Thread(new Main("par"));
        Thread fio2 = new Thread(new Main("impar"));
        Thread fio3 = new Thread(new Main("rematen23"));

        fio1.start();
        fio1.join();

        fio2.start();
        fio2.join();

        fio3.start();
        fio3.join();
    }
}