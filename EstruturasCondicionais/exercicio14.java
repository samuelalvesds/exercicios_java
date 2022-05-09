package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        String valorMedia = "0";

        if (media >= 9 && media <= 10) {
            valorMedia = "A";
            System.out.println("Você tirou A!");
        } else if  (media >= 7.5 && media < 9) {
            valorMedia = "B";
            System.out.println("Você tirou B!");
        } else if  (media >= 6 && media < 7.5) {
            valorMedia = "C";
            System.out.println("Você tirou C!");
        } else if  (media >= 4 && media < 6) {
            valorMedia = "D";
            System.out.println("Você tirou D!");
        }  else if  (media >= 0 && media < 4) {
            valorMedia = "E";
            System.out.println("Você tirou E!");
        } else {
            System.out.println("Alguma nota 1 ou 2 está incorreta!");
        }

        if (valorMedia == "A" || valorMedia == "B" || valorMedia == "C") {
            System.out.println("APROVADO!");
        } else {
            System.out.println("REPROVADO!");
        }



    }
}
