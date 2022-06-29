package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int numeros1 = 0;
        double porcentagem1;


        System.out.print("Vetor A: ");
        for(int i = 0; i < vetorA.length; i++) {
            vetorA[i] = (int)Math.round(Math.random() * 1); // conversão para inteiro depois 2 métodos. // O 1 no final representa número máximo para randomizar.
            System.out.print(vetorA[i] + " ");

            if (vetorA[i] == 1) {
                numeros1++;
            }
        }

        porcentagem1 = (numeros1 * 100) / vetorA.length;

        System.out.println("\nA porcentagem de números 1 é: " + porcentagem1 + "%");
        System.out.println("A porcentagem de números 0 é: " + (100 - porcentagem1) + "%");
    }
}
