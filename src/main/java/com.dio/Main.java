package com.dio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Teste");
        TerminalBanco terminal = new TerminalBanco();
        int opcao;
        do{
            opcao = terminal.exibirMenuPrincipal();

            do if (opcao == 1) {
                opcao = terminal.exibirCadastrarConta();
            } else if (opcao == 2) {
                terminal.exibirAcessarConta();
            } else {
                System.out.println("erro");
            } while(opcao != 0);

        } while(opcao == -1);

    }
}