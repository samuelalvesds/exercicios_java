package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo Número: ");
        double num2 = scan.nextDouble();

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}