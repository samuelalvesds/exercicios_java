package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Digite o número da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i]*2;
        }

        System.out.print("O vetor A= ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();

        System.out.print("O vetor B= ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

    }

}
