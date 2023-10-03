package br.com.alura.java.io.teste;

import java.io.*;

public class TesteSerializacaoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


//        Cliente cliente = new Cliente();
//        cliente.setNome("Edu");
//        cliente.setProfissao("Dev");
//        cliente.setCpf("12345678");
//
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//        oos.writeObject(cliente);
//        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
        Cliente cliente = (Cliente) ois.readObject();
        ois.close();
        System.out.println(cliente.getNome());


//        String nome = "Eduardo";

//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//        oos.writeObject(nome);
//        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//        String nome = (String) ois.readObject();
//        ois.close();
//        System.out.println(nome);
    }
}
