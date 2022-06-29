package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int tabuada = 0;
        int posicaoVetor = 0;


        for (int i = 0; i< vetorA.length; i++) {
            System.out.println("Digite o número da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            for (int j = 1; j <= 10; j++) {
             tabuada = vetorA[posicaoVetor] * j;
             System.out.println(vetorA[posicaoVetor] + " x " + j + " = " + tabuada);
            }
            System.out.println("----------------------------------------------------");
            posicaoVetor++;
        }

    }
}
