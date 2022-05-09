package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio15 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o enésimo termo da série de fibonacci: ");
        long n = scan.nextInt();

        // SEQUENCIA DE FIBONACCI
        long num1 = 1;
        long num2 = 1;
        long num3;

        System.out.println(num1);
        System.out.println(num2);

        for ( int i = 3; i <= n ; i++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }


    }
}
