public class Thread2 extends Thread{

    public void run(){
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
