package operacionesmatematicas1;

public class Suma {

    private double sumando1;
    private double sumando2;
    private double sumando3;
    private double resultado;

    public void Suma(double sum1, double sum2, double sum3) {
        sumando1 = sum1;
        sumando2 = sum2;
        sumando3 = sum3;

    }

    public double operacion() {

        return sumando1 + sumando2 + sumando3;
    }

    public double imprimir() {

        return operacion();
    }
  
}
