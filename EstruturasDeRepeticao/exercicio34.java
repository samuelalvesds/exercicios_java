package exerciciosJava.EstruturasDeRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;



public class exercicio34 {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        int n = scan.nextInt();

        double H;
        double soma = 0;

        for (double i=1; i <=n; i++) {
            H = 1/i;
            System.out.print(1 + "/" + i + " = ");
            soma += H;
            System.out.println(df.format(H) + "\n");
        }

        System.out.print("H = " + df.format(soma));
    }

}
