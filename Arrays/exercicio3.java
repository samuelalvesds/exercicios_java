package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Digite o número da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i]*vetorA[i];
        }

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B= ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }



    }
}
