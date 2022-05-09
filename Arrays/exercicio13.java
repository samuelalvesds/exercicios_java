package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for(int i=0 ; i<vetorA.length ; i++) {
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 5 == 0 ) {
               soma += vetorA[i];
            }
        }

        System.out.print("Números do Vetor A divisíveis por 5: " );
        for (int i=0 ; i<vetorA.length; i++) {

            if (vetorA[i] % 5 == 0) {
                System.out.print(vetorA[i] + " ");
            }
        }

        System.out.println();

        System.out.println("A soma dos vetores divisíveis por 5 é= " + soma);

    }
}
