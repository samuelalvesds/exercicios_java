package exerciciosJava.Matrizes;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio5JogoDaVelha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] tabuleiro = new String[3][3];
        String[] jogador = new String[2];
        String[] simboloJogador = new String[2];
        int escolhaLinha;
        int escolhaColuna;
        int jogadorAtual = 0;


        System.out.println("JOGO DA VELHA\n");

        // Colocando nome no jogador;
        for(int i=0; i<2; i++) {
            System.out.println("Digite o nome do Jogador " + (i+1) + ": ");
            jogador[i] = scan.next();
        }

        // Imprimindo tabuleiro
        inicializandoTabuleiro(tabuleiro, simboloJogador);
        imprimirTabuleiro(tabuleiro);


        // começando o jogo
        System.out.println(Arrays.toString(jogador));
        do {
            System.out.println( jogador[jogadorAtual] + " digite a cordenada que irá marcar o " + simboloJogador[jogadorAtual] + " (ex: 1 1): ");
            escolhaLinha = scan.nextInt();
            escolhaColuna = scan.nextInt();

            if (escolhaLinha > 0 && escolhaLinha < 4 && escolhaColuna > 0 && escolhaColuna < 4) {
                if (tabuleiro[escolhaLinha-1][escolhaColuna-1].equalsIgnoreCase("-")) {
                    tabuleiro[escolhaLinha - 1][escolhaColuna - 1] = simboloJogador[jogadorAtual];
                    imprimirTabuleiro(tabuleiro);
                    if (jogadorAtual == 0) {
                        jogadorAtual = 1;
                    } else {
                        jogadorAtual = 0;
                    }
                } else {
                    System.out.println("Essa posição já está marcada.");
                }

            } else {
                System.out.println("Opa, as coordenadas só podem ser de 1 à 3.");

            }


        } while (oJogoContinua(tabuleiro, jogador));

        System.out.println("O jogo Acabou!");

    }

    public static void imprimirTabuleiro(String[][] tabuleiro) {

        for(int i=0; i< tabuleiro.length; i++) {
            for(int j=0; j<tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void inicializandoTabuleiro(String[][] tabuleiro, String[] simboloJogador) {
        for(int i=0; i< tabuleiro.length; i++) {
            for(int j=0; j<tabuleiro[i].length; j++) {
                tabuleiro[i][j] = "-";
            }
            System.out.println();
        }

        // simbolo jogador
        simboloJogador[0] = "X";
        simboloJogador[1] = "O";

    }

    public static boolean oJogoContinua(String[][] tabuleiro, String[] jogador) {


        if (tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[1][0] == tabuleiro[2][0] && tabuleiro[0][0] != "-") {
            mostraGanhador(tabuleiro, jogador, 0, 0);
            return false;
        }
        if (tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][1] && tabuleiro[0][1] != "-") {
            mostraGanhador(tabuleiro, jogador, 0, 1);
            return false;
        }
        if (tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[1][2] == tabuleiro[2][2] && tabuleiro[0][2] != "-") {
            mostraGanhador(tabuleiro, jogador, 0, 2);
            return false;
        }
        if (tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][1] == tabuleiro[0][2] && tabuleiro[0][0] != "-") {
            mostraGanhador(tabuleiro, jogador, 0, 0);
            return false;
        }
        if (tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[1][2] && tabuleiro[1][0] != "-") {
            mostraGanhador(tabuleiro, jogador, 1, 0);
            return false;
        }
        if (tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][1] == tabuleiro[2][2] && tabuleiro[2][0] != "-") {
            mostraGanhador(tabuleiro, jogador, 2, 0);
            return false;
        }
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[0][0] != "-") {
            mostraGanhador(tabuleiro, jogador, 0, 0);
            return false;
        }
        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[0][2] != "-") {
            mostraGanhador(tabuleiro, jogador, 0, 2);
            return false;
        }

        // verificando se deu velha
        for(int i=0; i< tabuleiro.length; i++) {
            for(int j=0; j<tabuleiro[i].length; j++) {
                if (tabuleiro[i][j].equalsIgnoreCase("-")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void mostraGanhador(String[][] tabuleiro, String[] jogador, int linha, int coluna) {
        if (tabuleiro[linha][coluna] == "X") {
            System.out.println(jogador[0] + " ganhou!");
        } else {
            System.out.println(jogador[1] + " ganhou!");
        }
    }

}
