package br.com.banco.microcredito;

public class AvaliadorDeRisco {

    public int calcularScore(Cliente cliente) {
        int scoreBase = cliente.getHistoricoCredito();

        if (cliente.getIdade() < 21) scoreBase -= 10;
        if (cliente.getRendaMensal() < 1500) scoreBase -= 20;

        return Math.max(0, Math.min(100, scoreBase));
    }

    public boolean avaliarSolicitacao(SolicitacaoEmprestimo solicitacao) {
        int score = calcularScore(solicitacao.getCliente());

        if (score >= 60 && solicitacao.getValorSolicitado() <= solicitacao.getCliente().getRendaMensal() * 5) {
            solicitacao.setAprovado(true);
            return true;
        } else {
            solicitacao.setAprovado(false);
            return false;
        }
    }
}