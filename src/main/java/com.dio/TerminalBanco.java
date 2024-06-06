package com.dio;

import java.util.*;

public class TerminalBanco {
    private final int [] OPCOES_VALIDAS_MENU_PRINCIPAL = {1, 2, 3};
    private final int [] OPCOES_VALIDAS_CADASTRO_CONTA = {1, 2};

    public int exibirMenuPrincipal(){

        System.out.println("Bem vindo ao Banco");
        System.out.println("Selecione uma das opções abaixo");
        System.out.println("1 - Cadastrar Conta");
        System.out.println("2 - Acessar Conta");
        System.out.println("3 - Sair");
        System.out.println("Digite a opção desejada:");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        boolean eValido = false;

        for (int opcaoValida : OPCOES_VALIDAS_MENU_PRINCIPAL) {
            if (opcao == opcaoValida) {
                eValido = true;
                break;
            }
        }

        if (eValido) {
            return opcao;
        } else {
            System.out.println("Opção inválida");
            return -1;
        }

    }

    public int exibirCadastrarConta(){
        System.out.println("Cadastro de Conta");
        System.out.println("Digite seu nome:");
        Scanner scanner = new Scanner(System.in);
        String primeiroNome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        Cliente novoCliente = new Cliente(primeiroNome, sobrenome);

        System.out.println("Selecione o tipo de conta que deseja criar");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        System.out.println("Digite a opção desejada:");

        int opcao = scanner.nextInt();
        boolean eValido = false;

        for (int opcaoValida : OPCOES_VALIDAS_CADASTRO_CONTA) {
            if (opcao == opcaoValida) {
                eValido = true;
                break;
            }
        }

        if (!eValido) {
            System.out.println("Opção inválida");
            return -1;
        }

        if (opcao == 1){
            ContaCorrente contaCorrente = new ContaCorrente(novoCliente);
            contaCorrente.exibirDados();
        } else if (opcao == 2){
            ContaPoupanca contaPoupanca = new ContaPoupanca(novoCliente);
            contaPoupanca.exibirDados();
        }

        System.out.println("====================================================");
        System.out.println("Conta criada com sucesso!");
        System.out.println("====================================================");
        return 0;
    }

    public void exibirAcessarConta(){
        System.out.println("Acessar Conta");
    }

    static void checarOpcao(int opcao, int [] opcoesValidas) {
        for (int opcoesValida : opcoesValidas) {
            if (opcao != opcoesValida) {
                throw new IllegalArgumentException("Opção inválida");
            }
        }
    }
}