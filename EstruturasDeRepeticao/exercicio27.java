package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número de temperaturas que serão cadastradas:");
        double qtdTemperaturas = scan.nextInt();

        double temperatura = 0;
        double menorTemp = Double.MAX_VALUE;
        double maiorTemp = Double.MIN_VALUE;
        double soma = 0;
        double media = 0;


        System.out.println("Departamento Estadual de Meteorologia");
        for (int i = 1; i <= qtdTemperaturas; i++) {
            System.out.println("Digite a temperatura " + i);
            temperatura = scan.nextDouble();

            soma += temperatura;

            if (temperatura < menorTemp) {
                menorTemp = temperatura;
            }
            if (temperatura > maiorTemp) {
                maiorTemp = temperatura;
            }

        }

        media = soma / qtdTemperaturas;

        System.out.println("Maior temperatura: " + maiorTemp);
        System.out.println("Menor temperatura: " + menorTemp);
        System.out.println("Média das temperaturas: " + media);
    }
}