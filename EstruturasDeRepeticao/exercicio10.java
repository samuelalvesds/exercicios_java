package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i1;
        int i2;
        int maior;
        int menor;

        System.out.println("Digite o primeiro número: ");
        i1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        i2 = scan.nextInt();

        if (i1 > i2) {
            maior = i1;
            menor = i2;
        } else {
            maior = i2;
            menor = i1;
        }

        do {
            menor++;
            System.out.println(menor);
        }
        while (menor + 1 < maior);






    }
}
