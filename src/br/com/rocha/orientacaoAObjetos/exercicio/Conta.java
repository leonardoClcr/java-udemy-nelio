package br.com.rocha.orientacaoAObjetos.exercicio;

public class Conta {
    private int numero;
    private String nomeTitular;
    private double valorInicial;

    public Conta(int numero, String nomeTitular, double valorInicial) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.valorInicial = valorInicial;
    }

    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void sacar(double valorInicial) {
        this.valorInicial -= valorInicial - 5.00;
    }

    public void depositar(double valorInicial) {
        this.valorInicial += valorInicial;
    }
}
