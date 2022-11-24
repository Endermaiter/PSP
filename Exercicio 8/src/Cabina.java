import java.util.Arrays;

public class Cabina {

    private boolean ocupado;
    private int peso;
    private int posActual;
    private int[]posFinal;

    public Cabina() {
    }

    public Cabina(boolean ocupado, int peso, int posActual, int[] posFinal) {
        this.ocupado = ocupado;
        this.peso = peso;
        this.posActual = posActual;
        this.posFinal = posFinal;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int[] getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(int[] posFinal) {
        this.posFinal = posFinal;
    }

    @Override
    public String toString() {
        return "Cabina{" +
                "ocupado=" + ocupado +
                ", peso=" + peso +
                ", posActual=" + posActual +
                ", posFinal=" + Arrays.toString(posFinal) +
                '}';
    }
}
