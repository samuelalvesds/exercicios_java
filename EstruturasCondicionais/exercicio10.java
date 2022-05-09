package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Em que turno você estuda?: (M - Matutino, V - Vespertino e N - Noturno.");
        String turno = scan.next();

        if (turno.length() > 1) {
            System.out.println("Utilize apenas as letras M, V ou N");
        } switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            case "m":
                System.out.println("Bom dia!");
                break;
            case "v":
                System.out.println("Boa tarde!");
                break;
            case "n":
                System.out.println("Boa noite!");
                break;
            default: System.out.println("Turno Inválido: Utilize apenas as letras M, V e N!");

        }

        }

    }
