package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número que deseja obter o fatorial:");
        int num = scan.nextInt();

        int fatorial = 1;
        int novoFatorial= 0;


        System.out.println("Fatorial de " + num);

        System.out.print(num + "!= ");

        for (int i = num; i > 1; i--) {
            fatorial *= i; // 1 * 5 *    5 * 4(i-1) *    20 * 3 *    60 * 2 *    120 * 1
            System.out.print(i + " . ");
        }

        System.out.print("1= " + fatorial);
    }
}
