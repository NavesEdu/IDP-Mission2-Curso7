package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {


        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());



        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        String sNovo = new String(bytes);
        System.out.println(sNovo);
        System.out.println(bytes.length+", UTF-8");


    }

}
