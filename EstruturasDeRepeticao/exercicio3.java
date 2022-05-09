package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo;
        int idade;
        double salario;
        String estadoCivil;

        do {
            System.out.println("Digite seu nome: ");
            nome = scan.next();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Seu nome precisa ter mais de 3 caracteres. Digite novamente!");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            if (idade > 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("Idade Inválida, digite novamente!");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu salário: ");
            salario = scan.nextDouble();

            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("Salário Inválido, digite novamente!");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu sexo (F - Feminimo e M - Masculino: ");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("m")) {
                infoValida = true;
            } else {
                System.out.println("Salário Inválido, digite novamente!");
            }
        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite seu Estado Civil ('C', 'S', 'V' ou 'D')");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("c") || sexo.equalsIgnoreCase("s") || sexo.equalsIgnoreCase("v") || sexo.equalsIgnoreCase("d"))
            {
                infoValida = true;
            } else {
                System.out.println("Estado Civil Inválido, digite novamente!");
            }
        } while (!infoValida);

        System.out.println("Cadastro Concluído!");

    }


}
