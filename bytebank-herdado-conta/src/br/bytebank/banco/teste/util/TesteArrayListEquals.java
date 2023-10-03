package br.bytebank.banco.teste.util;

import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {

        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(123,321);
        Conta cc1 = new ContaCorrente(123,123);
        lista.add(cc);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(123,123);
        boolean existe = lista.contains(cc2);
        System.out.println(existe);

        System.out.println("For");
        for (Conta conta: lista){
            if (conta.equals(cc2)){
                System.out.println("Já tenho essa conta");
            }
        }

//        for (Conta conta: lista){
//            System.out.println(conta);
//        }





    }



}
