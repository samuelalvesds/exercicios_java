package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] result = new double[notas1.length];


        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Digite a nota 1 do aluno " + (i + 1) + ": ");
            notas1[i] = scan.nextDouble();
            System.out.println("Digite a nota 2 do aluno " + (i + 1) + ": ");
            notas2[i] = scan.nextDouble();

            result[i] = (notas1[i] + notas2[i]) / 2;
            System.out.println("-------------------------------------------");

        }

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Média do aluno " + (i+1) + "= " + result[i]);
            if (result[i] >= 7) {
                System.out.println("Aluno " + (i+1) + " aprovado");
            } else {
                System.out.println("Aluno " + (i+1) + " reprovado");
            }
            System.out.println("_____________________________________");
        }



    }
}
