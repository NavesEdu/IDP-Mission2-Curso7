package br.bytebank.banco.modelo;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Serializable {


    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteException{
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
    }

    public String toString(){
        return "Conta Corrente, "+ super.toString();
    }

}
