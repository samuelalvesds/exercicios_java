package exerciciosJava.Metodos.ex2ContaCorrente;


public class ContaCorrente {


    int numeroConta;
    double saldo;
    boolean especial;
    double limiteChequeEspecial;
    double usadoChequeEspecial; //valor usadodo;
    double statusChequeEspecial = limiteChequeEspecial - usadoChequeEspecial; // valor disponível


    void realizarDeposito(double valorDeposito){
        if (valorDeposito > 0) {
            if (valorDeposito > usadoChequeEspecial && usadoChequeEspecial != 0) {
                saldo += valorDeposito - usadoChequeEspecial;
                usadoChequeEspecial -= usadoChequeEspecial;
                System.out.println("Depósito no valor de R$" + valorDeposito + " realizado com sucesso.\n");
            }
            if (valorDeposito < usadoChequeEspecial) {
                usadoChequeEspecial -= valorDeposito;
                System.out.println("Depósito no valor de R$" + valorDeposito + " realizado com sucesso.\n");
            }
            if (valorDeposito >= saldo && usadoChequeEspecial == 0) {
                saldo += valorDeposito;
                System.out.println("Depósito no valor de R$" + valorDeposito + " realizado com sucesso.\n");
            }
        } else System.out.println("Valor de Depósito precisa ser maior que R$0.00");


    }

    void consultarSaldo(){
        System.out.println("O seu saldo atual é: " + "R$" + saldo + "\n");
    }

    void realizarSaque(double valorSaque, int opcaoChequeEspecial){
        // TODO Debuggar saque - Cheque especial não funcionando corretamente.
        if (valorSaque <= (saldo + statusChequeEspecial)) {
            if (saldo == 0) {
                usadoChequeEspecial += valorSaque;
                System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!\n");
            }
            if (valorSaque > saldo && saldo != 0) {
                usadoChequeEspecial += valorSaque - saldo;
                saldo -= saldo;
                System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!\n");
            }
            if (saldo >= valorSaque) {
                saldo -= valorSaque;
                System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!\n");
            }
        } else {
            System.out.println("Valor de Saque Inválido.");
        }
    }

    boolean consultarContaEspecial() {
        System.out.println("O limite do seu cheque especial é: R$" + limiteChequeEspecial);
        System.out.println("O valor disponível do seu cheque especial é: R$" + statusChequeEspecial);
        System.out.println("O valor usado do seu cheque especial é: R$" + usadoChequeEspecial);



        return false;
    }

}
