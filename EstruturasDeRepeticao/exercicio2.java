package exerciciosJava.EstruturasDeRepeticao;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean verificar = false;
        String nomeUsuario;
        String senha;


        while (verificar == false) {

            System.out.println("Digite um nome de usuário: ");
            nomeUsuario = scan.next();

            System.out.println("Digite uma senha: ");
            senha = scan.next();

            if (senha.equalsIgnoreCase(nomeUsuario)) {
                verificar = false;
                System.out.println("Por favor, digite um senha diferente do seu Nome de Usuário!");
            } else {
                verificar = true;
                System.out.println("Cadastro Concluído!");
            }



        }



    }
}
