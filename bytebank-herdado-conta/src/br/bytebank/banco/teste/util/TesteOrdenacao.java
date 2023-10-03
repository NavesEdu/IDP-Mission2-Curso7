package br.bytebank.banco.teste.util;

import br.bytebank.banco.modelo.Cliente;
import br.bytebank.banco.modelo.Conta;
import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.ContaPoupanca;

import java.util.*;

public class TesteOrdenacao {

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

        for (Conta c: lista
             ) {
            System.out.println(c);
        }

        //NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        Collections.sort(lista);
        System.out.println("--------------");
        //lista.sort(new TitularComparator());

        for (Conta c: lista
        ) {
            System.out.println(c + ", "+ c.getTitular().getNome());
        }

    }

}

class NumeroDaContaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {


        return  Integer.compare(c1.getNumero(), c2.getNumero());
//        return c1.getNumero() - c2.getNumero();

//        if (c1.getNumero() < c2.getNumero()){
//            return -12;
//        }
//
//        if (c1.getNumero() > c2.getNumero()){
//            return 1;
//        }
//        return 0;
    }
}

class TitularComparator implements Comparator<Conta>{


//    @Override
//    public int compare(Conta o1, Conta o2) {
//
//        String nomeC1 = o1.getTitular().getNome();
//        String nomeC2 = o2.getTitular().getNome();
//
//        return nomeC1.compareTo(nomeC2);
//    }

    @Override
    public int compare(Conta o1, Conta o2) {
        return o1.getTitular().getNome().compareTo(o2.getTitular().getNome());
    }
}
