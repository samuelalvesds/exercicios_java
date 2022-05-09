package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio24 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Loja Quase Dois - Tabela de Preços");

        System.out.println("Digite o preço do pão");
        double precoPao = scan.nextDouble();

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + " - " + " R$" + (precoPao * i));
        }

    }
}
