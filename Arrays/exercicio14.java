package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int divisor = 0;
        int media;

        for(int i=0 ; i<vetorA.length ; i++) {
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) {
                soma += vetorA[i];
                divisor++;
            }
        }

        media = soma/divisor;

        System.out.print("Os números ímpares do vetor são: ");
        for (int i=0; i<vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                System.out.print(vetorA[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Média Aritmética= " + media);
    }
}
