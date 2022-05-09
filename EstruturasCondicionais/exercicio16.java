package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio16 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Não é uma equação de segundo grau!");
        } else {
            System.out.println("");

            System.out.println("Digite o valor de B: ");
            int b = scan.nextInt();

            System.out.println("Digite o valor de C: ");
            int c = scan.nextInt();

            double delta = (b*b) - (4*a*c);
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais!");
            } else {

                if (delta == 0) {
                    System.out.println("A equação possui apenas uma raiz real!");
                } else if (delta > 0) {
                    System.out.println("A equação possui duas raizes reais!");
                }


            }

            }


        }
    }

