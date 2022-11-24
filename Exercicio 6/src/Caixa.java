public class Caixa extends Thread{

    static boolean semaforo = false;
    static int dineroCaja = 500;


    public synchronized void caixa(int a) {
        while (semaforo){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        semaforo = true;
        System.out.println("DINERO EN LA CAJA --> " + dineroCaja + "\n");
        switch (a) {
            case 10 -> {
                System.out.println("Ingreso de 10€\n");
                dineroCaja = dineroCaja + a;
            }
            case -10 -> {
                System.out.println("Extraccion de 10€\n");
                dineroCaja = dineroCaja + a;
            }
        }
        semaforo = false;
        notify();
    }
}
