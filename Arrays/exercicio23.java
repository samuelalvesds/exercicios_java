package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        boolean verificar = true;


        // preenchendo o vetorA
        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 != 0) break;
        }


    }
}
