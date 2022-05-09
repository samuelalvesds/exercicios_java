package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro número inteiro: ");
        int num3 = scan.nextInt();


        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            // num1 é menor
            // num3 é o maior e num 2 é maior que num1
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if  (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            // num3 é o maior
            // num2 é menor
            System.out.println(num3 + " - " + num1 + " - " + num2);
        } else if  (num1 <= num2 && num1 <= num3 && num3 <= num2) {
            // num2 é o maior
            // num1 é menor
            System.out.println(num2 + " - " + num3 + " - " + num1);
        } else if  (num1 <= num2 && num3 <= num1 && num3 <= num2) {
            // num2 é o maior
            // num3 é menor
            System.out.println(num2 + " - " + num1 + " - " + num3);
        } else if  (num2 <= num3 && num3 <= num1 && num2 <= num1) {
            // num1 é o maior
            // num2 é menor
            System.out.println(num1 + " - " + num3 + " - " + num2);
        } else if  (num3 <= num2 && num3 <= num1 && num2 <= num1) {
            // num1 é o maior
            // num3 é menor
            System.out.println(num2 + " - " + num1 + " - " + num3);
        }

    }
}
