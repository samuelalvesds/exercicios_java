package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio22 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade (KG) de Maças adquiridas: ");
        double maca = scan.nextDouble();

        System.out.println("Digite a quantidade (KG) de Morangos adquiridos: ");
        double morangos = scan.nextDouble();

        double precoMaca = 0;
        double precoMorango = 0;
        double pesoTotal = morangos + maca;
        double desconto = 0;


        if (maca <= 5) {
            precoMaca = 1.8;
        } else {
            precoMaca = 1.5;
            }

        if (morangos <= 5) {
            precoMorango = 2.5;
        } else {
            precoMorango = 2.2;
                }

        double precoSemDesconto = (precoMaca * maca) + (precoMorango * morangos);

        if (precoSemDesconto > 25) {
            desconto = (precoSemDesconto / 100) * 10;
        } else if (pesoTotal > 8) {
            desconto = (precoSemDesconto / 100) * 10;
        }

        double totalAPagar = precoSemDesconto - desconto;

        System.out.println("Peso total:" + pesoTotal + " KG");
        System.out.println(" Preço sem desconto: " + "R$" +precoSemDesconto);
        System.out.println("Total a pagar: " + "R$" + totalAPagar);

    }

}
