public class Main extends Thread{

    Cabina obx = new Cabina();

    public Main(String a){
        super(a);
    }

    public static void main(String[] args) {
        Thread uso = new Thread(new Main("0"));
        uso.start();
    }

    @Override
    public synchronized void run() {
        if(obx.isOcupado()){
            System.out.println("Ascensor Ocupado");
            try {
                while (obx.isOcupado()) {
                    wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }else{
            obx.setOcupado(true);
            System.out.println("Ascensor Ocupado");
            obx.setPosActual(Integer.parseInt(getName()));
            System.out.println("Posicion Actual: " + obx.getPosActual());
            notify(); //pechar a porta
            obx.setOcupado(false);
            System.out.println("Ascensor Vacio");
        }
    }
}