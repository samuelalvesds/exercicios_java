package exerciciosJava.Classes;

import java.util.Date;

public class TesteClasses {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();
        lampada.marca = "Phillips";
        lampada.modelo = "A60";
        lampada.cor = "Amarela";
        lampada.potencia = 7;
        lampada.tensao = "Bivolt";
        lampada.tipos = new String[2];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[0] = "Lampeões";

        System.out.println("Marca da Lâmpada: " + lampada.marca + "\n");

        Livro livro = new Livro();
        livro.nome = "Contato";
        livro.autor = "Carl Sagan";
        livro.editora = "Companhia de Bolso";
        livro.idioma = "Português";
        livro.tipoCapa = "Capa comum";
        livro.numeroPaginas = 440;

        System.out.println("Nome do livro: " + livro.nome + "\n");

        LivroLivraria livroLivraria = new LivroLivraria();
        livroLivraria.nome = "Contato";
        livroLivraria.autor = "Carl Sagan";
        livroLivraria.editora = "Companhia de Bolso";
        livroLivraria.idioma = "Português";
        livroLivraria.tipoCapa = "Capa comum";
        livroLivraria.numeroPaginas = 440;

        livroLivraria.preco = 69.9;

        System.out.println("Preço livro da livraria: " + livroLivraria.preco + "\n");

        LivroBiclioteca livroBiclioteca = new LivroBiclioteca();
        livroBiclioteca.nome = "Contato";
        livroBiclioteca.autor = "Carl Sagan";
        livroBiclioteca.editora = "Companhia de Bolso";
        livroBiclioteca.idioma = "Português";
        livroBiclioteca.tipoCapa = "Capa comum";
        livroBiclioteca.numeroPaginas = 440;

        livroBiclioteca.emprestado = true;
        livroBiclioteca.emprestadoPara = "Samuel";
        livroBiclioteca.dataEntrega = new Date();

        System.out.println("O livro está emprestado: " + livroBiclioteca.emprestado + "\n");

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.numeroConta = 854301;
        contaCorrente.saldo = 230.34;
        contaCorrente.especial = false;
        contaCorrente.limite = 500;

        System.out.println("É uma conta corrente especial? " + contaCorrente.especial + "\n");

        ContatoCelular contatoCelular = new ContatoCelular();
        contatoCelular.nome = "Igor";
        contatoCelular.anotacao = "Irmão";
        contatoCelular.numeroCelular = 991577517;
        contatoCelular.numeroCasa = 36313383;

        System.out.println("Número do celular: " + contatoCelular.numeroCelular + "\n");

    }
}
