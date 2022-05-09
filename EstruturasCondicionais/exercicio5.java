package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota do aluno");
        double nota2 = scan.nextDouble();

        double media = ((nota1 + nota2) / 2);



        if (media == 10) {
            System.out.println("Aprovado com Distinção!");
        } else if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }
        {
            System.out.println("Aluno Aprovado com Distinção!");
    }

}
