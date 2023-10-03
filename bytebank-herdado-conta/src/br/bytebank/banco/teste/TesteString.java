package br.bytebank.banco.teste;

public class TesteString {

    public static void main(String[] args) {
        String nome = "Alura";
        String vazio =" ";
        String outroVazio = vazio.trim();
        //String outro = new String("Alura");
        String meuNome = nome.replace("Alura","eduardo");
        String novoNome = nome.toLowerCase();
        System.out.println(meuNome);
        System.out.println(novoNome);

        System.out.println(nome.charAt(3));
        System.out.println(nome.indexOf("ur"));
        System.out.println(nome.substring(1));
        System.out.println(nome.length());
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }
        System.out.println(outroVazio.isEmpty());

        System.out.println(nome.contains("Alu"));

    }

}
