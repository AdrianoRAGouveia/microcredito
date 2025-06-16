package br.com.banco.microcredito;

public class SolicitacaoEmprestimo {
    private Cliente cliente;
    private double valorSolicitado;
    private boolean aprovado;

    public SolicitacaoEmprestimo(Cliente cliente, double valorSolicitado) {
        this.cliente = cliente;
        this.valorSolicitado = valorSolicitado;
        this.aprovado = false;
    }

    public Cliente getCliente() { return cliente; }
    public double getValorSolicitado() { return valorSolicitado; }
    public boolean isAprovado() { return aprovado; }
    public void setAprovado(boolean aprovado) { this.aprovado = aprovado; }
}