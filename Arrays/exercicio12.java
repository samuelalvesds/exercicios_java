package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i=0 ; i<vetorA.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            soma += vetorA[i];
        }

        System.out.print("Vetores Digitados: ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.println("A soma dos vetores é: " + soma);

    }
}
