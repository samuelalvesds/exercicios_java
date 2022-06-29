package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];


        for(int i=0 ; i< vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i=0 ; i< vetorB.length; i++) {
            vetorB[i] = 1;
        }

        for(int i=0 ; i< vetorA.length; i++) {
            System.out.print("Vetor B" + i + ": " );
            for(int j=vetorA[i];  j>0; j--) {
                vetorB[i] *= j;
            }
            System.out.print(" " + vetorB[i] + "\n");
        }


    }
}
