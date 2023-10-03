package br.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * @author eduardonaves
 *
 */
public class Conta extends Object implements Comparable<Conta>, Serializable {

    protected double saldo;
    private int agencia;
    private int numero;
    private transient Cliente titular;
    private static int total;

    /**
     * Construtor para inicializar o objeto Conta a partir da agência e número
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("O total de contas é: "+ Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criando uma nova conta");
    }

    public void deposita (double valor){
        this.saldo += valor;
        System.out.println(saldo);
    }

    public void saca (double valor) throws SaldoInsuficienteException{

        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: "+ this.saldo + ", Valor: "+ valor);
        }
        this.saldo -= valor;
    }

    public void transfere (double valor, Conta destino) throws SaldoInsuficienteException{
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getsaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero) {
        if (novoNumero <= 0){
            System.out.println("erro");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("erro");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String toString(){
        return "Número "+ this.numero + ", Agencia: "+ this.agencia + ", Saldo: "+ this.saldo;
    }

    @Override
    public boolean equals(Object obj) {

        Conta outra = (Conta) obj;

        if(this.agencia != outra.agencia) {
            return false;
        }

        if(this.numero != outra.numero) {
            return false;
        }

        return true;

    }

    @Override
    public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
    }


}
