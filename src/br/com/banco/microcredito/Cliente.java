package br.com.banco.microcredito;

public class Cliente {
    private String nome;
    private int idade;
    private double rendaMensal;
    private int historicoCredito;

    public Cliente(String nome, int idade, double rendaMensal, int historicoCredito) {
        this.nome = nome;
        this.idade = idade;
        this.rendaMensal = rendaMensal;
        this.historicoCredito = historicoCredito;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public double getRendaMensal() { return rendaMensal; }
    public int getHistoricoCredito() { return historicoCredito; }
}