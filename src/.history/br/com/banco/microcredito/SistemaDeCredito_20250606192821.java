package br.com.banco.microcredito;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeCredito {
    private List<SolicitacaoEmprestimo> emprestimosRegistrados = new ArrayList<>();
    private AvaliadorDeRisco avaliador = new AvaliadorDeRisco();

    public void processarSolicitacao(SolicitacaoEmprestimo solicitacao) {
        boolean resultado = avaliador.avaliarSolicitacao(solicitacao);
        emprestimosRegistrados.add(solicitacao);

        if (resultado) {
            System.out.println("Empréstimo aprovado para " + solicitacao.getCliente().getNome());
        } else {
            System.out.println("Empréstimo reprovado para " + solicitacao.getCliente().getNome());
        }
    }

    public List<SolicitacaoEmprestimo> getEmprestimosRegistrados() {
        return emprestimosRegistrados;
    }
}