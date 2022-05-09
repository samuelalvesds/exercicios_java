package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra de 'A' a 'Z'");
        String letra = scan.next();

        switch (letra) {
            case "a":
                System.out.println("A letra " + letra + " é uma vogal."); break;
            case "e": System.out.println("A letra " + letra + " é uma vogal."); break;
            case "i": System.out.println("A letra " + letra + " é uma vogal."); break;
            case "o": System.out.println("A letra " + letra + " é uma vogal.");break;
            case "u": System.out.println("A letra " + letra + " é uma vogal.");break;
            case "A": System.out.println("A letra " + letra + " é uma vogal.");break;
            case "E": System.out.println("A letra " + letra + " é uma vogal.");break;
            case "I": System.out.println("A letra " + letra + " é uma vogal.");break;
            case "O": System.out.println("A letra " + letra + " é uma vogal.");break;
            case "U": System.out.println("A letra " + letra + " é uma vogal.");break;
            default: System.out.println("A letra " + letra + " é uma consoante.");


        /*if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("Vogal");
        } else System.out.println("Consoante");*/

        }
    }
}
