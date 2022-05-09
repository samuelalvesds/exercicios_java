package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra (F ou M): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")) {
            System.out.println("Sexo Feminino");
        }
        else if (input.equalsIgnoreCase("M")){
            System.out.println("Sexo Masculino");
        } else {
            System.out.println("Sexo Inválido");
        }
    }
}
