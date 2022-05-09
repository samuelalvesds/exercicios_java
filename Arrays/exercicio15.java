package exerciciosJava.Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("###,###.###");

        int[] vetorA = new int[10];
        double pares = 0;
        double impares = 0;
        double porcentagemPares;
        double porcentagemImpares;

        for(int i=0; i<vetorA.length; i++) {
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        porcentagemPares = (pares/vetorA.length) * 100;
        porcentagemImpares = (impares/vetorA.length) * 100;

        System.out.println("Pares: " + df.format(porcentagemPares) + "%");
        System.out.println("Ímpares: " + df.format(porcentagemImpares) + "%");
    }
}
