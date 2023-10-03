package br.bytebank.banco.modelo;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }


    public String toString(){
        return "Conta Poupança, "+ super.toString();
    }

}
