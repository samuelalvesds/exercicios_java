package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio25 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double precoProduto;
        double total = 0;
        double dinheiro;
        double troco;

        String iniciar;
        boolean repetirOperacao = true;

        boolean fimOperacao = false;


        do {
            System.out.println("Deseja iniciar uma nova operação? S/N");
            iniciar = scan.next();

            if (iniciar.equalsIgnoreCase("n")) {
                repetirOperacao = false;
            } else {

                fimOperacao = false;
                do {
                    System.out.println("Digite o preço do produto:");
                    precoProduto = scan.nextDouble();

                    total += precoProduto;

                    if (precoProduto == 0) {
                        fimOperacao = true;
                    }
                } while (!fimOperacao);


                System.out.println("Total: " + total);

                System.out.println("Digite o valor recebido:");
                double pagamento = scan.nextDouble();

                troco = pagamento - total;
                System.out.println("Troco:" + troco);

            }
        } while (repetirOperacao == true);

    }
}


