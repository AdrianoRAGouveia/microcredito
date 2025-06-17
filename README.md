# **Programação de Soluções Computacionais.**

## Microcrédito para solicitação de Empréstimo

### Avaliação A3


# _OBJETIVO_ #  

O projeto Sistema de Crédito Pessoal tem como finalidade gerenciar clientes e avaliar solicitações de empréstimos, utilizando uma lógica de risco baseada na renda do cliente e no valor solicitado.

O sistema permite:

 -Consultar se o pedinte é cliente do Banco, se não for, realiza Cadastro de clientes com Nome, Idade, renda e Score de pessoa física que vai de 0 a 100.
 -Solicitação do valor de empréstimos vinculados a um cliente existente.
 -Avaliação de risco baseada em uma regra de proporção entre renda e valor do empréstimo.
Ao final, realiza a lógica de requisitos para aprovação ou reprovação do emprestimo e realiza o cadastro no "banco de dados" do banco.

# _Instruções de Execução_ #  

Abra o terminal na pasta dos arquivos e execute:
| javac .java Java Main |

# _Exemplo de Uso_ #  

Cliente Felipe Veiga | APROVADO |
- O banco realiza a pergunta se é cliente ou não.
- Se não, realizará o cadastro.
- O cliente fornecerá o Nome, Idade, Renda Mensal e Histórico de Crédito (Score de 0 a 100).
- Após realizar o cadastro, o cliente informa o valor que deseja solicitar de empréstimo.
- O banco retornará APROVADO ou REPROVADO.
- Ao final mostrará um histórico de cadastro no Banco.  


     # EXEMPLO NA PRÁTICA#
Bem-vindo ao Sistema de Microcrédito!

Você é cliente do banco? (S / N): N

Vamos realizar seu cadastro:

Nome completo: Felipe Veiga

Idade: 25

Renda mensal: 1500

Histórico de crédito (score de 0 a 100): 60

Cliente cadastrado com sucesso: Felipe Veiga        

Informe o valor que deseja solicitar de empréstimo: 7000

Empréstimo aprovado para Felipe Veiga

Clientes cadastrados no banco:       
1. Felipe Veiga

