package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Digite quantas horas você trabalha por mês: ");
        double horasMes = scan.nextDouble();

        double salarioBruto = (valorHora * horasMes);
        System.out.println("Seu salário bruto mensal é: " + salarioBruto);

        double inss = salarioBruto * 0.08;
        //System.out.println("Você pagou R$" + inss + " de INSS");

        double sindicato = salarioBruto * 0.05;

        double impostoDeRenda = salarioBruto * 0.11;

        double salarioLiquido = salarioBruto - inss - sindicato - impostoDeRenda;

        System.out.println("Você pagou R$" + inss + " de INSS");
        System.out.println("Você pagou R$" + sindicato + " de Sindicato");
        System.out.println("Você pagou R$" + impostoDeRenda + " de impostoDeRenda");
        System.out.println("Seu salário líquido é R$" + salarioLiquido);

    }
}
