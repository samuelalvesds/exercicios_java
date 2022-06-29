package exerciciosJava.Matrizes;

import java.util.Random;

public class exercicio1 {

    public static void main(String[] args) {
        Random numeroRandom = new Random();


        int[][] numerosAleatorios = new int[4][4];
        int maiorNumero = Integer.MIN_VALUE;
        int linha = 0, coluna =0;


        for(int i=0; i<numerosAleatorios.length; i++) {
            for(int j=0; j<numerosAleatorios[i].length; j++) {
            numerosAleatorios[i][j] = numeroRandom.nextInt(100);

            if (numerosAleatorios[i][j] > maiorNumero) {
                maiorNumero = numerosAleatorios[i][j];
                linha = i;
                coluna = j;
            }
            }
        }

        for(int i=0; i<numerosAleatorios.length; i++) {
            for(int j=0; j<numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior valor: " + maiorNumero);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
