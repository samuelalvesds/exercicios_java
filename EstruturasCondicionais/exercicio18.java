package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio18 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int number1 = scan.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("É um número par!");

        } else {
            System.out.println("É um número ímpar");
        }



    }
}
