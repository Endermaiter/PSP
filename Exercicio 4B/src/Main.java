public class Main extends Thread{

    public Main(String a) {
        super(a);
    }


    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();
        Thread3 th3 = new Thread3();
        th1.start();
        th2.start();
        th3.start();

    }
}