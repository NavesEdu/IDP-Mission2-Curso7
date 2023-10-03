package br.bytebank.banco.teste.io;

import br.bytebank.banco.modelo.ContaCorrente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("conta.bin"));
        ContaCorrente cc = (ContaCorrente) ois.readObject();
        ois.close();
        System.out.println(cc.getNumero());
        System.out.println(cc.getsaldo());
        System.out.println(cc.getTitular());


    }
}
