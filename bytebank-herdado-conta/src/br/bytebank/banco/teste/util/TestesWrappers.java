package br.bytebank.banco.teste.util;

import java.util.ArrayList;

public class TestesWrappers {
    public static void main(String[] args) {

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.FALSE;
        System.out.println(bRef.booleanValue());

        Number numero = Float.valueOf(35.5f);
        ArrayList<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(30.2);



    }

}
