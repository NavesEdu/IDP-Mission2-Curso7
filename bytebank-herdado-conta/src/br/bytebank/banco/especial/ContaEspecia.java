package br.bytebank.banco.especial;

import br.bytebank.banco.modelo.Conta;

public class ContaEspecia extends Conta {


    public ContaEspecia(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor){
        super.saldo += valor;
    }

}
