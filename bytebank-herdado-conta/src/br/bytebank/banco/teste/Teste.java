package br.bytebank.banco.teste;

import br.bytebank.banco.modelo.ContaCorrente;
import br.bytebank.banco.modelo.ContaPoupanca;

public class Teste {


    public static void main(String[] args) {

//        ContaCorrente cc = new ContaCorrente(123,321);
//        ContaPoupanca cp = new ContaPoupanca(123,123);
//        System.out.println(cc.toString());
//        System.out.println(cp);


        int[] idades = new int[5];
        idades[0] = 22;
        idades[1] = 32;
        idades[2] = 42;
        idades[3] = 52;
        idades[4] = 62;

        int idade4 = idades[3];
        System.out.println(idade4);
        System.out.println(idades.length);

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i*i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

    }


}
