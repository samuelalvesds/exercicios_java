package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora trabalhada: ");
        double horaTrab = scan.nextDouble();

        System.out.println("Digite quantas horas por mês você trabalha: ");
        double valoraHora = scan.nextDouble();

        double salarioBruto = horaTrab * valoraHora;

        int sindicato = 3;
        int iR = 0;
        int fgts = 11;

        if (salarioBruto <= 900) {
            iR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            iR = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            iR = 10;
        } else if (salarioBruto > 2500) {
            iR = 20;
        }

        double descontoIR = (salarioBruto / 100) * iR;
        double descontoSindicato =  (salarioBruto / 100) * sindicato;
        double totalDescontos = descontoSindicato + descontoIR;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: " + " R$" + salarioBruto);
        System.out.println("IR (" + iR + "%): " + descontoIR);
        System.out.println("Sindicato (3%)" + " R$" + descontoSindicato);
        System.out.println("FGTS (" + fgts + "%): " + fgts);
        System.out.println("Total de Descontos: " + " R$" + totalDescontos);
        System.out.println("Salario Líquido: " + " R$" + salarioLiquido);

    }
}