package br.bytebank.banco.teste.util;

import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteArrayList {


    public static void main(String[] args) {

        List<Conta> lista = new ArrayList<>();

//        Cliente cliente = new Cliente();
//        lista.add(cliente);
        Conta cc = new ContaCorrente(123,321);
        Conta cc1 = new ContaCorrente(321,123);
        lista.add(cc);
        lista.add(cc1);
        System.out.println(lista.size());

        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());
        lista.remove(0);
        System.out.println(lista.size());


        Conta cc3 = new ContaCorrente(123,111);
        Conta cc4 = new ContaCorrente(321,222);
        lista.add(cc3);
        lista.add(cc4);


        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        for (Conta conta: lista){
            System.out.println(conta);
        }



    }
}
