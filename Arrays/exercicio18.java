package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorIdades = new int[10];
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;


        for (int i = 0; i < vetorIdades.length; i++) {
            System.out.println("Digite a idade da pessoa " + (i+1) + ": ");
            vetorIdades[i] = scan.nextInt();

            if (vetorIdades[i] < menorIdade) {
                menorIdade = vetorIdades[i];
            } else if (vetorIdades[i] > maiorIdade) {
                maiorIdade = vetorIdades[i];
            }
        }

        for (int i = 0; i < vetorIdades.length; i++) {
            if (vetorIdades[i] == menorIdade) {
                System.out.println("A menor idade digitada foi: " + menorIdade);
                System.out.println("A Pessoa de menor idade é a pessoa: " + (i+1));
            } else if (vetorIdades[i] == maiorIdade) {
                System.out.println("A maior idade digitada foi: " + maiorIdade);
                System.out.println("A Pessoa de maior idade é a pessoa: " + (i+1));
            }


        }
    }
}
