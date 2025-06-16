package br.com.banco.microcredito;

import java.util.ArrayList;
import java.util.List;

public class CadastroCliente {
    private List<Cliente> clientesCadastrados = new ArrayList<>();

    public boolean clienteExiste(String nome) {
        for (Cliente cliente : clientesCadastrados) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public Cliente buscarCliente(String nome) {
        for (Cliente cliente : clientesCadastrados) {
            if (cliente.getNome().equalsIgnoreCase(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public Cliente cadastrarCliente(String nome, int idade, double rendaMensal, int historicoCredito) {
        if (clienteExiste(nome)) {
            System.out.println("Cliente já cadastrado: " + nome);
            return buscarCliente(nome);
        } else {
            Cliente novoCliente = new Cliente(nome, idade, rendaMensal, historicoCredito);
            clientesCadastrados.add(novoCliente);
            System.out.println("Cliente cadastrado com sucesso: " + nome);
            return novoCliente;
        }
    }

    public List<Cliente> getClientesCadastrados() {
        return clientesCadastrados;
    }
}