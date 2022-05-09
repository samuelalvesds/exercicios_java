package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do lado 1 do triângulo: ");
        int lado1 = scan.nextInt();

        System.out.println("Informe o tamanho do lado 2 do triângulo: ");
        int lado2 = scan.nextInt();

        System.out.println("Informe o tamanho do lado 3 do triângulo: ");
        int lado3 = scan.nextInt();

        String verificar = "PODE ser um triângulo!";


        if (((lado1 + lado2) > lado3) &&
                ((lado1 + lado3) > lado2) &&
                ((lado2 + lado3) > lado1)) {
            System.out.println(verificar);
        } else {
            verificar = "NÃO PODE ser um triângulo!";
            System.out.println(verificar);
        }

        switch (verificar) {
            case "NÃO PODE ser um triângulo!": break;
            default: break;
        }

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("É um triângulo equilátero!");

        } else if ((lado1 == lado2 && lado2 != lado3) ||

                lado1 == lado3 && lado3 != lado2 ||

                lado3 == lado2 && lado2 != lado1) {
            System.out.println("É um triângulo isóceles");

        } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
            System.out.println("É um triângulo escaleno!");
        }


    }
}