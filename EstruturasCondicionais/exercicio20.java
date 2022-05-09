package exerciciosJava.EstruturasCondicionais;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("RESPONDA AS PERGUNTAS A SEGUIR COM 's' para sim OU 'n' para não");

        System.out.println("Telefonou para vítima?");
        String resp1 = scan.next();



            System.out.println("Esteve no local do crime?");
            String resp2 = scan.next();



                System.out.println("Mora perto da vítima?");
                String resp3 = scan.next();



                System.out.println("Devia para a vítima?");
                String resp4 = scan.next();



                System.out.println("Já trabalhou com a vítima?");
                String resp5 = scan.next();


                            int cont = 0;

                            if (resp1.equalsIgnoreCase("s")) {
                                cont++;
                            }
                            if (resp2.equalsIgnoreCase("s")) {
                                cont++;
                            }
                            if (resp3.equalsIgnoreCase("s")) {
                                cont++;
                            }
                            if (resp4.equalsIgnoreCase("s")) {
                                cont++;
                            }
                            if (resp5.equalsIgnoreCase("s")) {
                                cont++;
                            }

                            if (cont == 2) {
                                System.out.println("Suspeito");
                            } else if (cont >= 3 && cont <= 4) {
                                System.out.println("Cúmplice");
                            } else if (cont == 5) {
                                System.out.println("Assassino");
                            } else {
                                System.out.println("Inocente");
                            }




        }


    }


