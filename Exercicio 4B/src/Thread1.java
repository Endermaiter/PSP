public class Thread1 extends Thread{

    public void run(){
        int suma = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
