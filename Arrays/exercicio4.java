package exerciciosJava.Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[15];
        double[] vetorB = new double[vetorA.length];

        DecimalFormat df = new DecimalFormat("###,###.##");

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Digite o número da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        System.out.print("Vetor A= ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B= ");
        for (int i=0; i<vetorA.length; i++) {
            System.out.print(df.format(vetorB[i]) + " ");
        }
    }

}

