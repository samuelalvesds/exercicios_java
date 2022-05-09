package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio21 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Número de Turmas:");
        int nTurmas = scan.nextInt();

        int alunos;
        double media;
        int soma = 0;
        boolean invalido = true;

        for (int i = 0; i < nTurmas; i++) {

            invalido = true;
            do {
                System.out.println("Digite o A quantidade de Alunos na Turma " + (i + 1));
                alunos = scan.nextInt();

                if (alunos <= 40) {
                    invalido = false;
                } else {
                    System.out.println("Númerode Alunos não pode ser maior que 40. Digite novamente");
                }

            } while (invalido == true) ;

                soma += alunos;
        }

        media = soma / nTurmas;
        System.out.println("A média de alunos por turma é: " + media);

        }
    }

