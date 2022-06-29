package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 40);

            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i];
            } else {
                vetorC[i] = vetorA[i];
            }
        }

        System.out.print("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("\nVetor B: ");
        for (int i = 0; i < vetorB.length; i++) {

            if (vetorB[i] != 0) {
                System.out.print(vetorB[i] + " " + "");
            }
        }
        System.out.print("\nVetor C: ");
        for (int i = 0; i < vetorC.length; i++) {

            if (vetorC[i] != 0) {
                System.out.print(vetorC[i] + " ");
            }
        }

    }
}
