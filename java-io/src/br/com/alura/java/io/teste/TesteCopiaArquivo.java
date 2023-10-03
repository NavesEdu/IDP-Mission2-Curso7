package br.com.alura.java.io.teste;

import java.io.*;
import java.net.Socket;

public class TesteCopiaArquivo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket();
        //Fluxo de entrada com um arquivo
        InputStream fis = s.getInputStream(); //System.in; //new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos =s.getOutputStream(); //new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String linha = br.readLine();

        while(linha != null && !linha.isEmpty()) {

            bw.write(linha);
            bw.newLine();
            bw.flush();
            linha = br.readLine();
        }

        br.close();
        bw.close();

    }
}
