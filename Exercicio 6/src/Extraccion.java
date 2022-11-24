public class Extraccion extends Thread{

    private int cantidadRestar;
    private Caixa caixa;

    public Extraccion(int cantidadRestar, Caixa caixa) {
        this.cantidadRestar = cantidadRestar;
        this.caixa = caixa;
    }

    @Override
    public void run() {
        caixa.caixa(cantidadRestar);
    }
}

