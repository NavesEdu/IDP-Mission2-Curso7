package br.bytebank.banco.teste.util;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];
        Integer idadeRef = Integer.valueOf(29);
        int valor = idadeRef.intValue(); //unboxing
        System.out.println(valor);

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(idadeRef); //Autoboxing, transformação de um primitivo pra um objeto
        System.out.println(numeros);


    }



}
