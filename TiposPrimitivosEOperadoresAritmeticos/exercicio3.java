package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("A soma dos dois números é: " + resultado);

    }
}
