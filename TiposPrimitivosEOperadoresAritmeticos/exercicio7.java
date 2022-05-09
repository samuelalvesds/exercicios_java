package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a área do quadrado: ");
        double lado = scan.nextDouble();
        double area = Math.pow (lado, 2);

        System.out.println("A área desse quadrado é: " + area);
        double darea = (area* 2);

        System.out.println("Portanto, o dobro dessa área é: " + darea);



    }
}
