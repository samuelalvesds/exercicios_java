package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num;
        double soma = 0;
        double media = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número:");
            num = scan.nextInt();

            soma += num;
            media = soma / 5;

        }

        System.out.println("A soma dos números é " + soma);
        System.out.println("A média dos números é " + media);

    }
}
