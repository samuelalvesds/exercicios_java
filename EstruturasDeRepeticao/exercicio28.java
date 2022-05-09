package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número inteiro (positivo > 1) desejado:");
        int num = scan.nextInt();

        boolean primo = true;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                primo = false;
                System.out.println("Não é um número primo - divisível por: " + i);
            }
        }

        if (primo) {
            System.out.println("É um número primo!");
        }

    }
}
