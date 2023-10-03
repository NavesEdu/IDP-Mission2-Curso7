package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.CalculadorDeImposto;
import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc= new ContaCorrente(222, 333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        //calc.registra(cc);
        calc.registra(seguro);

        System.out.println(calc.getTotalImposto());

    }

}