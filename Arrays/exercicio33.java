package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio33 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        String msg = "";
        boolean primo = true;


        for(int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor da posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++) {
           primo = true;

            for(int j = 2; j < vetorA[i]; j++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }
            msg = "";
            if (primo) {
                msg = " É primo";
            } else {
                msg = " NÃO é primo";
            }
            System.out.println(vetorA[i] + msg);
        }

    }
}
