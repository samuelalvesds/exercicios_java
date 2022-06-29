package exerciciosJava.Arrays;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio20e21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.##");


        double[] vetorCotacao = new double[20];
        double cotacao;

        System.out.println("Digite a cotação do ");
        cotacao = scan.nextDouble();




        for (int i = 0; i < vetorCotacao.length; i++) {
            vetorCotacao[i] = cotacao * (i+1);
            System.out.println("Conversões para " + (i+1) + ": " + df.format(vetorCotacao[i]));
        }

    }
}
