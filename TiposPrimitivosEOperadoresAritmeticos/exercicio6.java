package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio do círculo");
        double raio = scan.nextDouble();

        //
        double areaCirculo = Math.PI * Math.pow (raio, 2);
        System.out.println("A área do círculo é: " + areaCirculo);

    }

}
