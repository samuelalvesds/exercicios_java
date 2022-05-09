package exerciciosJava.Arrays;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int inf15 = 0; // qtd de números inferiores a 15
        int somaInf15 = 0; // soma dos números inferiores a 15
        int igual15 = 0; // qtd de numeros iguals a 15
        int mediaSup15 = 0; // media dos numeros superiores a 15
        int sup15 = 0; // qtd de números superiores a 15
        int soma = 0; // soma dos números superiores a 15

        for(int i=0 ; i<vetorA.length ; i++) {
            System.out.println("Digite o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            if (vetorA[i] < 15) {
                inf15++;
                somaInf15 += vetorA[i];
            }
            if (vetorA[i] == 15) {
                igual15++;
            }
            if (vetorA[i] > 15) {
                sup15++;
                soma += vetorA[i];
            }
        }

        mediaSup15 = soma/sup15;

        System.out.println("Soma dos números menores que 15: " + somaInf15);
        System.out.println("Número de vezes que o 15 apareceu: " + igual15);
        System.out.println("Média dos números maiores que 15: " + mediaSup15);

    }
}
