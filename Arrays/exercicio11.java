package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int pares = 0;

        for (int i=0; i<vetorA.length; i++) {
            System.out.println("Digite o número da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                pares += 1;
            }
        }

        System.out.println("Quantidade de elementos armazenados: " + vetorA.length);
        System.out.println("De " + vetorA.length + " elementos armazenados " + pares + " são PARES");

    }
}
