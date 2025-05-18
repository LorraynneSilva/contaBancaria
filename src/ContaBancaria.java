import javax.swing.*;

public class ContaBancaria {

    //atributos e variaveis
    private int numeroConta;
    private String titular;
    private double saldo;

    //construtor
    public ContaBancaria(int numeroConta, String titular, double saldo) {
        //this chamando a variavel da classe this em inglês == esse
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;

    } //método get e set

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) { // esse método não faz sentido, pois já o metodo sacar e depositar que operam o emcima do saldo
        this.saldo = saldo;
    }


    public void depositar(double valor) {
        this.saldo += valor;

        System.out.println("Saldo atual: " + this.saldo);

    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {

            saldo -= valor;
            System.out.println("Saque realizado com sucesso");
            return true;

        } else {
            System.out.println("Saldo insuficiente para realizar o saque seu saldo é " + saldo);

            return false;
        }


    }


}
