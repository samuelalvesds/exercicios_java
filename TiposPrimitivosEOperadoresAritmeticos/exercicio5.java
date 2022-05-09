package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros: ");
        double metros = scan.nextInt();
        double resultado = (metros * 100);

        System.out.println( metros + " equivalem a: " + resultado + " cm");


    }
}
