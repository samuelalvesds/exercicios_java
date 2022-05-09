package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio20 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("Quantas pessoas informarão as idades?");
        int nPessoas = scan.nextInt();

        int idade;
        int soma = 0;
        int media;

        for (int i = 0 ; i < nPessoas ; i++) {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            soma += idade;
        }

        media = soma / nPessoas;
        System.out.println("A média de idade dos participantes é" + " " +media);

        if (media >  0 && media <= 25) {
            System.out.println("Turma Jovem");
        } else if (media >  25 && media <= 26) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }

    }
}
