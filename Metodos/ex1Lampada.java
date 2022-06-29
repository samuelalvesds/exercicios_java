package exerciciosJava.Metodos;

public class ex1Lampada {

    String marca;
    String modelo;
    String cor;
    int potencia;
    String tensao;
    String[] tipos;
    boolean ligada;


    void ligar() {
        ligada = true;
    }
    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("A lampada está ligada!");
        } else {
            System.out.println("A lampada está desligada!");
        }
    }

}
