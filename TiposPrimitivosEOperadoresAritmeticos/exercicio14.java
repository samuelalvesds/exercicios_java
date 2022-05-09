package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo em MB: ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Informe a velocidade da sua internet em Mbps: ");
        double velocidadeInternet = scan.nextDouble();


        double tempoDownload = (tamanhoArquivo / velocidadeInternet);
        System.out.println("O arquivo será baixado em " + tempoDownload + " segundos");



    }
}
