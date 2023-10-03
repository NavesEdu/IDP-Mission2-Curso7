package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada com um arquivo
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

//        FileWriter fw = new FileWriter("lorem2.txt");
//        BufferedWriter bw = new BufferedWriter(fw);

//        PrintStream ps = new PrintStream("lorem2.txt");

        PrintWriter ps = new PrintWriter("lorem2.txt");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println();
        ps.println("ashasuhahsuahsaudhsaju");

        ps.close();

    }
}
