package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    int[] vetorA = new int[10];
    int superior35Anos = 0;


    for (int i = 0; i < vetorA.length; i++) {
        System.out.println("Digite a idade da pessoa " + (i +1) + ":");
        vetorA[i] = scan.nextInt();

        if (vetorA[i] > 35) superior35Anos++;

    }

        System.out.println("Pessoas com mais de 35 anos: " + superior35Anos);

    }
}
