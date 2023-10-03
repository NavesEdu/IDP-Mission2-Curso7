package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.Cliente;
import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(123,321);

        referencias[0] = cc1;
        //System.out.println(referencias[0].getAgencia());
        ContaCorrente cc2 = new ContaCorrente(123,333);
        referencias[1] = cc2;
        //System.out.println(referencias[1].getNumero());

        Cliente cliente = new Cliente();
        referencias[3] = cliente;

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        referencias[2] = ref;
        //System.out.println(referencias[2].getNumero());


    }

}
