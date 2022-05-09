package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio19 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        double somaNotas = 0;
        int nNotas;

        // pedir a nota e pedir O número de N

        System.out.println("Quantas notas serão adicionadas?");
        nNotas = scan.nextInt();

        for (int i = 0; i < nNotas; i++) {
            System.out.println("Digite uma nota: ");
            nota = scan.nextDouble();
            somaNotas += nota;
        }

        media = somaNotas / nNotas;
        System.out.println("A média do aluno é " + media);
    }
}

