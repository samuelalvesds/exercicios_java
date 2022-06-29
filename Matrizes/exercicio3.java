package exerciciosJava.Matrizes;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int pares = 0, impares = 0;


        for(int i=0; i<matrizA.length; i++) {
            for(int j=0; j<matrizA[i].length; j++) {
                System.out.println("Digite o valor da posição " + i + "x" + j);
                matrizA[i][j] = scan.nextInt();

                if (matrizA[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }

        System.out.println("Matriz: ");
            for(int i=0; i< matrizA.length; i++) {
                for (int j=0; j<matrizA[i].length; j++) {
                    System.out.print(matrizA[i][j] + " ");
                }
                System.out.println();
            }

        System.out.println("Quantidade de Números Pares: " + pares);
        System.out.println("Quantidade de Números Impares: " + impares);

    }

}
