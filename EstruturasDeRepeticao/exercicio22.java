package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio22 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade total de CDs:");
        int qtdCD = scan.nextInt();

        double soma = 0;
        double media;
        double valorCD;

        for (int i = 0 ; i < qtdCD ; i++) {
            System.out.println("Quanto você pagou no CD " + (i + 1) + ":");
            valorCD = scan.nextDouble();

            soma += valorCD;
        }

        media = soma / qtdCD;
        System.out.println("Você pagou por CD em média " + media + " reais.");

    }
}
