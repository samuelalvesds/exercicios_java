package exerciciosJava.TiposPrimitivosEOperadoresAritmeticos;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nota do primeiro bimestre: ");
        double pbim = scan.nextDouble();

        System.out.println("Nota do segundo bimestre");
        double sbim = scan.nextDouble();

        System.out.println("Nota do terceiro bimestre");
        double tbim = scan.nextDouble();

        System.out.println("Nota do quarto bimestre");
        double qbim = scan.nextDouble();

        /*System.out.println("A média do aluno é: " + ((pbim + sbim + tbim + qbim) / 4) );*/
        // OU

        double media = (pbim + sbim + tbim + qbim) / 4;

        System.out.println("A média das notas é: " + media);


    }
}
