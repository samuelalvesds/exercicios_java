package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um ano qualquer: ");
        int year = scan.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && (year % 100 != 0)) {
            System.out.println("É um ano bissexto");
        } else {
            System.out.println("Não é uno bissexto! (tem 365 dias)");
        }

    }
}
