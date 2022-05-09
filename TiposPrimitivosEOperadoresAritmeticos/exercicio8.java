package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu salário por hora: ");
        double salarioH = scan.nextDouble();

        System.out.println("Digite quantas horas por mês você trabalha: ");
        double horas = scan.nextDouble();

        System.out.println("O seu salário mensal é: " + "R$ " + salarioH * horas);

    }
}
