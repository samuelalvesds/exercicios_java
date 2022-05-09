package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double popA;
        double popB;
        double taxaA;
        double taxaB;

        boolean valido = false;
        boolean operacaoValida = false;

        while (operacaoValida == false) {

        do {
            System.out.println("Digite a população A: ");
            popA = scan.nextDouble();

            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("População A precisa ser maior que 0.");
            }
        } while (!valido);


        valido = false;
        do {
            System.out.println("Digite a população B: ");
            popB = scan.nextDouble();

            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0.");
            }
        } while (!valido);


        valido = false;
        do {
            System.out.println("Digite a taxa de crescimento da popA: ");
            taxaA = scan.nextDouble();

            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("A Taxa de Crescimento da População A precisa ser maior que 0.");
            }
        } while (!valido);


        valido = false;
        do {
            System.out.println("Digite a taxa de crescimento da popB: ");
            taxaB = scan.nextDouble();

            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("A Taxa de Crescimento da População B precisa ser maior que 0.");
            }
        } while (!valido);


        int i = 0;

        while (popA < popB) {

            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            i++;
        }

        System.out.println(i);


            System.out.println("Deseja repetir a operação? Digite'S' para Sim e 'N' para Não.");
            String validarOp = scan.next();

            operacaoValida = false;
            if (validarOp.equalsIgnoreCase("n")){
                operacaoValida = true;
            } else {
                operacaoValida = false;
            }



    }

        System.out.println("Operação Finalizada");

    }
}

