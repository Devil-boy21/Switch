package operacionesmatematicas1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Suma sumita = new Suma();
//        sumita.Suma(2, 4, 7);
//        double resulSuma = sumita.operacion();
//        System.out.println("La suma es:" + resulSuma);
//
//        Resta rest = new Resta();
//        rest.resta(54, 47);
//        double resulRes = rest.operacion();
//        System.out.println("La resta es:" + resulRes);
//
//        Multiplicacion mult = new Multiplicacion();
//        mult.Multiplicacion(5, 10);
//        double resultMul = mult.Operacion();
//        System.out.println("La multiplicacion es:" + resultMul);
//
//        Division divid = new Division();
//        divid.Divicion(50, 5);
//        double resultDiv = divid.operacion();
//        System.out.println("La division es:" + resultDiv);
        int ejec = 1;
        while (ejec == 1) {
            Scanner n = new Scanner(System.in);
            System.out.println("ingresa la operacion que desea realizar: 1.suma 2.resta 3.multiplicacion 4.division");
            int a = n.nextInt();
            switch (a) {
                case 1:
                    System.out.println("ingrese sumado 1");
                    int suma1 = n.nextInt();
                    System.out.println("ingrese sumando 2");
                    int suma2 = n.nextInt();
                    System.out.println("ingrese sumando 3");
                    int suma3 = n.nextInt();
                    Suma sumita = new Suma();
                    sumita.Suma(suma1, suma2, suma3);
                    double resulSuma = sumita.operacion();
                    System.out.println("La suma es:" + resulSuma);

                    break;

                case 2:
                    System.out.println("ingrese el valor a restar 1");
                    int resta1 = n.nextInt();
                    System.out.println("ingrese el valor a restar 2");
                    int resta2 = n.nextInt();
                    Resta rest = new Resta();
                    rest.resta(resta1, resta2);
                    double resulRes = rest.operacion();
                    System.out.println("La resta es:" + resulRes);
                    break;
                case 3:
                    System.out.println("ingrese el valor a multiplicar 1");
                    int mult1 = n.nextInt();
                    System.out.println("ingrese el valor a multiplicae 2");
                    int mult2 = n.nextInt();
                    Multiplicacion mult = new Multiplicacion();
                    mult.Multiplicacion(mult1, mult2);
                    double resultMul = mult.Operacion();
                    System.out.println("La multiplicacion es:" + resultMul);

                    break;
                case 4:
                    System.out.println("ingrese el valor a dividir");
                    int divi1 = n.nextInt();
                    System.out.println("ingrese el segundo valor a dividir");
                    int divi2 = n.nextInt();
                    Division divid = new Division();
                    divid.Division(divi1, divi2);
                    double resultDiv = divid.operacion();
                    System.out.println("La division es:" + resultDiv);
                    break;

                default:
                    System.out.println("la opcion ingresada es invalida");
                    break;

//               
            }
            System.out.println("presiona 1 se desea continua o presiona 0 para salir");
            int salir = n.nextInt();
            if (salir == 0) {
                ejec = 1;
                break;
            }

        }

    }
}
