package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio35 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for(int i = 0; i< vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }

        System.out.println("\n");

        for(int i=1 ; i< vetorA.length ; i++) {
            System.out.println("Analisando o número " + vetorA[i]);

            for(int j=1; j<vetorA[i]; j++) {
                if(vetorA[i] % j == 0) {
                    System.out.println(vetorA[i] + " é divisível por " + j);
                }
            }
            System.out.println();
        }

    }

}
