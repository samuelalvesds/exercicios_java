package exerciciosJava.Arrays;

import javax.swing.*;
import java.util.Scanner;

public class exercicio24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Digite um número: ");
        String entrada = scan.next();

        // Criando uma String que pode ser alterada para se tornar a string invertida;
        StringBuffer stringInvertida = new StringBuffer();

       // Um método que retorna o valor de "entrada" invertido foi criado.
        //  Nosso String Buffer se torna o valor de "entrada" só que invertido
       stringInvertida = inverteString(entrada);

        // Transformando StringBuffer em String
        String SI = stringInvertida.toString();


        if (entrada.equalsIgnoreCase(SI)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("NÃO é um palíndromo");
        }

    }

    public static StringBuffer inverteString(String entrada) {
        StringBuffer SB = new StringBuffer(entrada);

        SB.reverse();

        return SB;
    }
}
