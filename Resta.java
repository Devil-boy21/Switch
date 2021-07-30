package operacionesmatematicas1;

public class Resta {

    private double minuendo;
    private double sustarendo;
    private double resultado;

    public void resta(double min, double sust) {

        minuendo = min;
        sustarendo = sust;

    }

    public double operacion() {

        return minuendo - sustarendo;

    }

    public void imprimir() {

        operacion();

    }

}
