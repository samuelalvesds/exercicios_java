package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        boolean validar = false;
        do {
            System.out.println("Digite o número de 1 a 10 escolhido: ");
            num = scan.nextInt();

            if (num >= 1 && num <= 10) {
                validar = true;
            } else {
                System.out.println("Número Inválido!");
            }
        } while (!validar);

        int i = 1; // multiplicador

        for (i =1; i <= 10; i++) {
            int resultado = num*i;
            if (resultado / num == i){
                System.out.println(resultado);
            }
        }

    }
}
