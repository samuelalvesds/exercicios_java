package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salário do colaborador: ");
        double salario = scan.nextDouble();

        int percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario <= 700) {
            percentual = 15;
        } else if (salario >= 700 && salario < 1500) {
            percentual = 10;
        } else if (salario >= 1500) {
            percentual = 5;
        }

        double aumento = (salario / 100) * percentual;
        double novoSalario = salario + aumento;

        System.out.println("Salário antigo: " + "R$ " + salario);
        System.out.println("Percentual aplicado: " + percentual + "%");
        System.out.println("Valor do Aumento: " + "R$ " + aumento);
        System.out.println("Novo Salário: " + "R$ " + novoSalario);

        /*//REAJUSTES
        double reajuste1 = salario + (salario * 0.2); // até 280 reais aumento de 20%
        double reajuste2 = salario + (salario * 0.15); // entre 280 e 700 reais aumento de 15%
        double reajuste3 = salario + (salario * 0.1); // entr 700 e 1500 reais aumento de 10%
        double reajuste4 = salario + (salario * 0.05); // 1500 reais em diante aumento de 5%

        if (salario <= 280) {
            System.out.println("Seu salário antes do reajuste era: " + "R$ " + salario);
            System.out.println("Foi aplicado um aumento de 20% no seu salário");
            System.out.println("Em reais, esse aumento foi de: " + "R$ " + (salario * 0.2));
            System.out.println("Seu novo salário é: " + "R$ " +  reajuste1);
        } else if (salario <= 700 && salario > 280) {
            System.out.println("Seu salário antes do reajuste era: " + "R$ " + salario);
            System.out.println("Foi aplicado um aumento de 15% no seu salário");
            System.out.println("Em reais, esse aumento foi de: " + "R$ " + (salario * 0.15));
            System.out.println("Seu novo salário é: " + "R$ " +  reajuste2);
        } else if (salario <= 1500 && salario > 701) {
            System.out.println("Seu salário antes do reajuste era: " + "R$ " + salario);
            System.out.println("Foi aplicado um aumento de 10% no seu salário");
            System.out.println("Em reais, esse aumento foi de: " + "R$ " + (salario * 0.1));
            System.out.println("Seu novo salário é: " + "R$ " +  reajuste3);
        } else if (salario > 1501) {
            System.out.println("Seu salário antes do reajuste era: " + "R$ " + salario);
            System.out.println("Foi aplicado um aumento de 5% no seu salário");
            System.out.println("Em reais, esse aumento foi de: " + "R$ " + (salario * 0.05));
            System.out.println("Seu novo salário é: " + "R$ " +  reajuste4);
        }*/

    }
}
