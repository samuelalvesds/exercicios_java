package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        /*do {

        System.out.println("Digite um número de 1 a 10: ");
        int num = scan.nextInt();

            if (num > 0 && num <= 10) {
                notaValida = true;
                System.out.println("Você digitou o número: " + num);
            } else {
                System.out.println("Nota inválida, digite novamente!");
            }

        } while (!notaValida); // while (notaValida == false);*/


        while (notaValida == false) {

            System.out.println("Digite um número de 1 a 10: ");
            int num = scan.nextInt();

            if (num > 0 && num < 10) {
                notaValida = true;
                System.out.println("Você digitou o número: " + num);
            } else {
                System.out.println("Número Inválido, Digite Novamente!");
                notaValida = false;
            }
        }



        }
    }

