package exerciciosJava.EstruturasDeRepeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio31 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        /*
        double salarioInicial = 1000;
        double novoSalario = salarioInicial;
        double porcentagem = 1.5;
        double aumento;

        System.out.println("O Salário em 1995 - 1000");

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i=1996; i <=2015; i++) {
            aumento = (novoSalario / 100) * porcentagem;
            novoSalario += aumento;
            porcentagem *= 2;

            System.out.println("O Salário em " + i + " - " + "R$" + format.format(novoSalario));
        }*/


        System.out.println("Digite o salario inicial: ");
        double salarioInicial = scan.nextDouble();

        System.out.println("Digite o ano inicial: ");
        int anoInicial = scan.nextInt();

        double novoSalario = salarioInicial;
        double porcentagem = 1.5;
        double aumento;

        System.out.println("O Salário em " + anoInicial + " - R$1000,00");

        DecimalFormat format = new DecimalFormat("###,###.##");

        for (int i=anoInicial+1; i <=2015; i++) {
            aumento = (novoSalario / 100) * porcentagem;
            novoSalario += aumento;
            porcentagem *= 2;

            System.out.println("O Salário em " + i + " - " + "R$" + format.format(novoSalario));
        }



        }
    }

