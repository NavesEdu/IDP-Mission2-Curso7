package br.bytebank.banco.teste;

import br.bytebank.banco.especial.ContaEspecia;
import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.ContaPoupanca;
import br.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaEspecia ce = new ContaEspecia(123,321);

        int a = 3;
        //int b = a / 0;


        ContaCorrente outra = null;
        outra.deposita(200.0);

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);

        cc.transfere(10.0, cp);

        System.out.println("CC: " + cc.getSaldo());
        System.out.println("CP: " + cp.getSaldo());


    }

}