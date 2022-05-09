package exerciciosJava.EstruturasDeRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio35 {

    public static final DecimalFormat df = new DecimalFormat("0.00");
    public static final DecimalFormat dfInt = new DecimalFormat("0");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        double n = scan.nextDouble();

        double soma = 0;

        for (double i=1, j=1; i<=n ; i++, j+=2) {
            System.out.print(dfInt.format(i) + "/" + dfInt.format(j) + " + ");
            soma += i/j;

        }
        System.out.print("\nSoma = " + df.format(soma));

    }
}
