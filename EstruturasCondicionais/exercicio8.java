package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço do produto 1: ");
        double preco1 = scan.nextDouble();
        System.out.println("Informe o preço do produto 1: ");
        double preco2 = scan.nextDouble();
        System.out.println("Informe o preço do produto 1: ");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("Compre o produto 1!");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("Compre o produto 2!");
        } else if (preco3 <= preco2 && preco3 <= preco1) {
            System.out.println("Compre o produto 3!");
        }




    }
}
