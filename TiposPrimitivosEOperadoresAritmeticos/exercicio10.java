package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celcius: ");
        double celcius = scan.nextDouble();
        double fahrenheit =  (celcius * 1.8) + 32;

        System.out.println(celcius + " graus Celcius são " + fahrenheit + "graus Fahrenheit");



    }
}

