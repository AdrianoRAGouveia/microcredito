package br.com.banco.microcredito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CadastroCliente cadastro = new CadastroCliente();
        SistemaDeCredito sistema = new SistemaDeCredito();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nBem-vindo ao Sistema de Microcrédito!\n");
        System.out.print("Você é cliente do banco? (S / N): ");
        String resposta = scanner.nextLine();

        Cliente cliente = null;

        if (resposta.equalsIgnoreCase("S")) {
            System.out.print("Informe seu nome para buscar o cadastro: ");
            String nome = scanner.nextLine();

            if (cadastro.clienteExiste(nome)) {
                cliente = cadastro.buscarCliente(nome);
                System.out.println("Cliente encontrado: " + cliente.getNome());
            } else {
                System.out.println("Cliente não encontrado. É necessário realizar o cadastro primeiro.");
                cliente = cadastrarNovoCliente(scanner, cadastro);
            }

        } else if (resposta.equalsIgnoreCase("N")) {
            cliente = cadastrarNovoCliente(scanner, cadastro);
        } else {
            System.out.println("Resposta inválida. Encerrando o programa.");
            scanner.close();
            return;
        }

        System.out.print("Informe o valor que deseja solicitar de empréstimo: ");
        double valorSolicitado = scanner.nextDouble();

        SolicitacaoEmprestimo solicitacao = new SolicitacaoEmprestimo(cliente, valorSolicitado);
        sistema.processarSolicitacao(solicitacao);

        System.out.println("\nClientes cadastrados no banco:");
        for (Cliente c : cadastro.getClientesCadastrados()) {
            System.out.println("- " + c.getNome());
        }

        scanner.close();
    }

    private static Cliente cadastrarNovoCliente(Scanner scanner, CadastroCliente cadastro) {
        System.out.println("Vamos realizar seu cadastro:");

        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("  CPF (somente números): ");
        int cpf = Integer.parseInt(scanner.nextLine());


        System.out.print("Idade: ");
        int idade = Integer.parseInt(scanner.nextLine());

        
        System.out.print("Renda mensal: ");
        double rendaMensal = Double.parseDouble(scanner.nextLine());

        System.out.print("Histórico de crédito (score de 0 a 100): ");
        int historicoCredito = Integer.parseInt(scanner.nextLine());

        return cadastro.cadastrarCliente(nome, idade, rendaMensal, historicoCredito);
    }
}