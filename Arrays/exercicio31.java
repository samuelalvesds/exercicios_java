package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int posicaoB = 0;


        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 100);
        }

        for(int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[posicaoB] = vetorA[i];
                posicaoB++;
            }
        }

        for(int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                vetorB[posicaoB] = vetorA[i];
                posicaoB++;
            }
        }


        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.print("\nVetor B: ");
        for(int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}

