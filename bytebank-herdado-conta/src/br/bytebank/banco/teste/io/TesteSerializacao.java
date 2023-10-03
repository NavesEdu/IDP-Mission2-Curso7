package br.bytebank.banco.teste.io;

import br.bytebank.banco.modelo.Cliente;
import br.bytebank.banco.modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setNome("Nico");
        cliente.setProfissao("Dev");
        cliente.setCpf("234113131");

        ContaCorrente cc =  new ContaCorrente(123,321);
        cc.setTitular(cliente);
        cc.deposita(200);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("conta.bin"));
        oos.writeObject(cc);
        oos.close();


    }
}
