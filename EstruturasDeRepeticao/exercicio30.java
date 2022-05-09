package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio30 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Você quer ver a tabuada de qual número? Digite:");
        int num = scan.nextInt();

        int comecar;
        int terminar;

        do {
            System.out.println("Por qual número devo começar a tabuada? Digite:");
            comecar = scan.nextInt();

            System.out.println("E em qual número devo terminar a tabuada? Digite:");
            terminar = scan.nextInt();

            if (terminar < comecar) {
                System.out.println("Preciso começar a tabuada por um número menor do que o número que devo terminar");
            }

        } while (terminar < comecar);

        int resultado;

        System.out.println("Vou montar a tabuada de " + num + " começando em " + comecar + " e terminando em " + terminar + ":");
        for (int i=comecar; i<=terminar; i++) {
            resultado = num * i;
            System.out.println(num + " x " + i + "= " + resultado);
        }


    }
}
