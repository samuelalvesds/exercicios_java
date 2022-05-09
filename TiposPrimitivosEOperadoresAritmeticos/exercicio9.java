package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Farenheit: ");
        double temperaturaF = scan.nextDouble();

        double resultadoCelcius = (5 * (temperaturaF - 32)/ 9);

        System.out.println(temperaturaF + " graus Farenheit são " + resultadoCelcius + "graus Celcius");

    }
}
