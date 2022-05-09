package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio17 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro:");
        long n = scan.nextInt();

        long fatorial = 1;

        for (long i = n; i > 0; i--) {
            fatorial *= i;
        }

        System.out.println(n + "! =" + " " + fatorial);

    }

}
