package exerciciosJava.Matrizes;

import java.util.Random;

public class exercicio2 {
    public static void main(String[] args) {
        Random dice = new Random();

        int[][] matrizA = new int[10][10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // creating array 10x10 with aleatory numbers between 0 and 9
        for(int i=0; i<matrizA.length; i++) {
          for(int j=0; j<matrizA[i].length; j++){
            matrizA[i][j] = dice.nextInt(9);
          }
        }


        // output of array
        for(int i=0; i<matrizA.length; i++) {
            for(int j=0; j<matrizA[i].length; j++){
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }


        // analysing the line 5
        for(int i=4; i==4; i++) {
            for(int j=0; j<matrizA[i].length; j++){
                if (matrizA[i][j] > maior) {
                    maior = matrizA[i][j];
                }
                if (matrizA[i][j] < menor) {
                    menor = matrizA[i][j];
                }
            }
        }

        System.out.println("Maior Número da Linha 5: " + maior);
        System.out.println("Menor Número da Linha 5: " + menor);

        for(int j=6; j == 6; j++) {
            maior = Integer.MIN_VALUE;
            menor = Integer.MAX_VALUE;
            for (int i=0; i<matrizA.length; i++) {
                if (matrizA[i][j] > maior) {
                    maior = matrizA[i][j];
                }
                if (matrizA[i][j] < menor) {
                    menor = matrizA[i][j];
                }
            }
        }

        System.out.println("Maior Número da Coluna 7: " + maior);
        System.out.println("Menor Número da Coluna 7: " + menor);

    }
}
