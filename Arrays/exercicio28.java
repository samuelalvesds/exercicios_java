package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0 ; i< vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[vetorA.length - i - 1] = vetorA[i];
        }

        System.out.print("Vetor A: ");
        for (int i = 0 ; i< vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0 ; i< vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }
}
