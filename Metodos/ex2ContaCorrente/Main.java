package exerciciosJava.Metodos.ex2ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcaoMenu;
        double valorDeposito;
        double valorSaque;
        int opcaoChequeEspecial = 0;

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numeroConta = 327841-2;
        contaCorrente.saldo = 0;
        contaCorrente.limiteChequeEspecial = 500;
        contaCorrente.usadoChequeEspecial = 0;
        contaCorrente.statusChequeEspecial = contaCorrente.limiteChequeEspecial - contaCorrente.usadoChequeEspecial;

        do {

            System.out.println("Digite");
            System.out.println("1 - para Depósito");
            System.out.println("2 - para Consulta de Saldo");
            System.out.println("3 - para Saque");
            System.out.println("4 - para Consultar Cheque Especial");
            opcaoMenu = scan.nextInt();

            switch (opcaoMenu) {
                case 1: {
                    System.out.println("Qual valor você quer depositar?");
                    valorDeposito = scan.nextDouble();
                    contaCorrente.realizarDeposito(valorDeposito);
                    break;
                }
                case 2: {
                    contaCorrente.consultarSaldo();
                    break;
                }
                case 3: {
                    System.out.println("Digite o valor do saque: ");
                    valorSaque = scan.nextDouble();
                    contaCorrente.realizarSaque(valorSaque, opcaoChequeEspecial);
                    break;
                }
                case 4: {
                    contaCorrente.consultarContaEspecial();
                    break;
                }
                default:
                    System.out.println("Número Inválido!");
                    break;
            }


        } while (true);

    }
}
