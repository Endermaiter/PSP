public class Thread3 extends Thread{

    public void run(){
        int sumar = 0;
        for (int i = 1; i < 1000; i++) {
            if ((i % 10 == 2 )||(i % 10 == 3)) {
                sumar = sumar + i;
            }
        }
        System.out.println(sumar);
    }
}
