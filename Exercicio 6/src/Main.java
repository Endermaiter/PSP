
/*
Simular a caixa dunha empresa con dous fíos. Un simulará o ingreso, ca compra de artigos por parte
de clientes e o outro a extracción de cartos da caixa co pago a proveedores. A conta terá un capital
inicial. Realizar 10 ingresos e 5 extraccións.
 */

public class Main extends Thread {

    public static void main(String[] args) throws InterruptedException {

        /*
        Thread ingreso1 = new Thread(new Ingreso(10));
        Thread ingreso2 = new Thread(new Ingreso(10));
        Thread ingreso3 = new Thread(new Ingreso(10));
        Thread ingreso4 = new Thread(new Ingreso(10));
        Thread ingreso5 = new Thread(new Ingreso(10));
        Thread ingreso6 = new Thread(new Ingreso(10));
        Thread ingreso7 = new Thread(new Ingreso(10));
        Thread ingreso8 = new Thread(new Ingreso(10));
        Thread ingreso9 = new Thread(new Ingreso(10));
        Thread ingreso10 = new Thread(new Ingreso(10));
        Thread extraccion1 = new Thread(new Extraccion(-10));
        Thread extraccion2 = new Thread(new Extraccion(-10));
        Thread extraccion3 = new Thread(new Extraccion(-10));
        Thread extraccion4 = new Thread(new Extraccion(-10));
        Thread extraccion5 = new Thread(new Extraccion(-10));


         */

        Caixa c = new Caixa();

        Extraccion ex = new Extraccion(-10,c);
        Extraccion ex2 = new Extraccion(-10,c);
        Extraccion ex3 = new Extraccion(-10,c);
        Extraccion ex4 = new Extraccion(-10,c);
        Extraccion ex5 = new Extraccion(-10,c);

        Ingreso in = new Ingreso(10,c);
        Ingreso in2 = new Ingreso(10,c);
        Ingreso in3 = new Ingreso(10,c);
        Ingreso in4 = new Ingreso(10,c);
        Ingreso in5 = new Ingreso(10,c);
        Ingreso in6 = new Ingreso(10,c);
        Ingreso in7 = new Ingreso(10,c);
        Ingreso in8 = new Ingreso(10,c);
        Ingreso in9 = new Ingreso(10,c);
        Ingreso in10 = new Ingreso(10,c);

        //Iniciamos as extraccions
        ex.start();
        ex2.start();
        ex3.start();
        ex4.start();
        ex5.start();


        //Iniciamos os ingresos
        in.start();
        in2.start();
        in3.start();
        in4.start();
        in5.start();
        in6.start();
        in7.start();
        in8.start();
        in9.start();
        in10.start();


    }
}