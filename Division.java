package operacionesmatematicas1;

public class Division {

    private double dividendo;
    private double divisor;
    private double resultado;

    public void Division(double dividid, double divis) {

        dividendo = dividid;
        divisor = divis;

    }

    public double operacion() {

        return dividendo / divisor;
    }

    public void imprimir() {

        operacion();
    }
}
