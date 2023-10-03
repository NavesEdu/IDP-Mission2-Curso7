package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardador {

    GuardadorDeContas guardador = new GuardadorDeContas();

    Conta cc = new ContaCorrente(22, 11);

    //guardador.adiciona(cc);

}
