package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int number1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int number2 = scan.nextInt();


        System.out.println("Qual operação você deseja fazer com esses números? (+, -, / ou *");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;


        switch(operacao) {
            case "+":
                resultado = number1 + number2;
                break;
            case "-":
                resultado = number1 - number2;
                break;
            case "/":
                resultado = number1 / number2;
                break;
            case "*":
                resultado = number1 * number2;
                break;
            default:
                System.out.println("Operação Inválida!"); valida = false;
        }

        if (valida) {

            System.out.println("Resultado: " + resultado);

            if (resultado >= 0) {
                System.out.println("Número Positivo!");
            } else {
                System.out.println("Número negativo!");
            }

            if (resultado % 2 == 0) {
                System.out.println("Número Par!");
            } else {
                System.out.println("Número Ímpar!");
            }


        }



    }

}
