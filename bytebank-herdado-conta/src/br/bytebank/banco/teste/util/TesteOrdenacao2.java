package br.bytebank.banco.teste.util;

import br.bytebank.banco.modelo.Cliente;
import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteOrdenacao2 {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);


        lista.sort(Comparator.comparingInt(Conta::getNumero));
        for (Conta c: lista
        ) {
            System.out.println(c);
        }

        System.out.println("--------------");
        //lista.sort(new TitularComparator());

        Comparator<Conta> comp = (Conta o1, Conta o2) -> {
                return o1.getTitular().getNome().compareTo(o2.getTitular().getNome());
        };

        lista.sort(comp);
        lista.forEach((conta) -> System.out.println(conta + ", "+ conta.getTitular().getNome()));

        for (Conta c: lista
        ) {
            System.out.println(c + ", "+ c.getTitular().getNome());
        }

    }

}
