package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Digite o tipo da carne (File, Alc ou Pic): ");
        String tipoCarne = scan.next();

        System.out.println("Digite a quatidade de Carne (KG): ");
        double qtdCarne = scan.nextDouble();

        System.out.println("Tipo de pagamento (cartão ou dinheiro): ");
        String tipoPagamento = scan.next();

        //tipo da carne , quantidade e o tipo de pagamento.

        double precoCarne = 0;

        if (tipoCarne.equalsIgnoreCase("File")) {
            if (qtdCarne <= 5) {
                precoCarne = 4.9;
            } else {
                precoCarne = 5.8;
            }
        } else if (tipoCarne.equalsIgnoreCase("Alc")) {
            if (qtdCarne <= 5) {
                precoCarne = 5.9;
            } else {
                precoCarne = 6.8;
            }
        } else if (tipoCarne.equalsIgnoreCase("Pic")) {

            if (qtdCarne <= 5) {
                precoCarne = 6.9;
            } else {
                precoCarne = 7.8;
            }
        }

        double totalSemDesc = qtdCarne * precoCarne;
        System.out.println(totalSemDesc);

        double totalAPagar = 0;
        double desconto = 0;

        if (tipoPagamento.equalsIgnoreCase("cartao")) {
            desconto = (totalSemDesc / 100) * 5; // 5% de desconto
            totalAPagar = totalSemDesc - desconto;
        } else {
            desconto = 0;
            totalAPagar = totalSemDesc;
        }

        System.out.println("NOTA FISCAL:");
        System.out.println("Tipo da carne: " + tipoCarne);
        System.out.println("Quantidade de Carne: " + qtdCarne + "KG");
        System.out.println("Preço Total: " + "R$" +totalSemDesc);
        System.out.println("Tipo de Pagamento: " + tipoPagamento);
        System.out.println("Desconto: 5%");
        System.out.println("Valor do Desconto: " + "R$" + desconto );
        System.out.println("Valor a Pagar: " + "R$" + totalAPagar);

    }
}