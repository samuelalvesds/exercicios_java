package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];


        // Criando os vetores A e B com números aleatórios.
        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 30);
            vetorB[i] = (int)Math.round(Math.random() * 30);
        }

        // Preenchendo o vetor C
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[i] = vetorA[i];
        }
        for (int i = 0; i < vetorB.length; i++) {
        vetorC[i + vetorA.length] = vetorB[i];
        }

        // Saída de dados
        System.out.print("Vetor A: ");
        for (int i = 0 ; i< vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.print("\nVetor B: ");
        for (int i = 0 ; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }

        System.out.print("\nVetor C: ");
        for (int i = 0 ; i < vetorC.length; i++) {
            System.out.print(vetorC[i] + " ");
        }


    }
}
