package exerciciosJava.EstruturasDeRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio33 {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Digite o valor de N:");
        int n = scan.nextInt();

        double m = 1;
        double soma = 0;
        double calculo;

        for (double i=1; i<=n; i++) {
            System.out.print(i + "/" + m + " = ");
            calculo = i / m;
            System.out.print(df.format(calculo) + "\n");
            m += 2;
            soma += calculo;
        }
        System.out.println("Soma: " + df.format(soma));


    }
}

