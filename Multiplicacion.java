package operacionesmatematicas1;

public class Multiplicacion {

    private double multiplicando;
    private double multiplicador;
    private double resultado;

    public void Multiplicacion(double mult1, double multipl) {

        multiplicando = mult1;
        multiplicador = multipl;

    }

    public double Operacion() {

        return multiplicando * multiplicador;

    }

    public void imprimir() {

        Operacion();
    }

}
