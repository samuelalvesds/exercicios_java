package exerciciosJava.Matrizes;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] diasPorHoras = new String[30][24];
        int dia = 0;
        int hora = 0;
        int consultaDia = 0;
        int consultaHora = 0;
        int menu = 3;


        System.out.println("AGENDA DO MÊS");

        while (menu != 0) {

            System.out.println("\n\nDigite 1 para Criar um Compromisso \nDigite 2 para Consultar seus comprimissos\nDigite 0 para finalziar o programa");
            menu = scan.nextInt();

            while (menu < 0 || menu > 2) {
                System.out.println("Número inválido, digite novamente: ");
                menu = scan.nextInt();
            }

            boolean flag = true;
            if (menu == 1) {

                // Criando o compromisso
                while (flag) {
                    System.out.println("Selecione o Dia: ");
                    dia = scan.nextInt();

                    if (dia > 30 || dia < 1) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }

                flag = true;
                while (flag) {
                    System.out.println("Selecione a Hora: ");
                    hora = scan.nextInt();

                    if (hora > 23 || hora < 00) {
                        flag = true;
                    } else {
                        flag = false;
                    }

                }

                System.out.println("Digite o compromisso do dia " + dia + " às " + hora + " horas:");
                for (int i = dia; i < diasPorHoras.length; i++) {
                    for (int j = hora; j < diasPorHoras[i].length; j++) {
                        diasPorHoras[i][j] = scan.next();
                        break;
                    }
                    break;
                }

            }

            // Criando a consulta do compromisso
            if (menu == 2) {


                System.out.println();
                System.out.println("CONSULTAR COMPRIMISSOS");

                flag = true;
                while (flag) {
                    System.out.println("Digite o dia em que quer consultar: ");
                    consultaDia = scan.nextInt();

                    if (consultaDia > 30 || dia < 1) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }


                flag = true;
                while (flag) {
                    System.out.println("Digite a hora em que quer consultar: ");
                    consultaHora = scan.nextInt();

                    if (consultaHora > 23 || consultaHora < 00) {
                        flag = true;
                    } else {
                        flag = false;
                    }

                }

                for (int i = consultaDia; i < diasPorHoras.length; i++) {
                    for (int j = consultaHora; j < diasPorHoras[i].length; j++) {
                        if (diasPorHoras[i][j] == null) {
                            System.out.println("Você não tem compromissos nesse dia e horário :)");
                        } else {
                            System.out.println("Seu compromisso no dia " + consultaDia + " às " + consultaHora + ": ");
                            System.out.println(diasPorHoras[i][j]);
                        }
                        break;
                    }
                    break;
                }

            }
        }
    }
}