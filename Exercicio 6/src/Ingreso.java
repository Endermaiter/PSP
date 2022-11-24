public class Ingreso extends Thread{

    private int cantidadSumar;
    private Caixa caixa;

    public Ingreso(int cantidadSumar, Caixa caixa) {
        this.cantidadSumar = cantidadSumar;
        this.caixa = caixa;
    }

    @Override
    public void run() {
        caixa.caixa(cantidadSumar);
    }
}

