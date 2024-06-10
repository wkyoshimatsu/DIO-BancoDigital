package com.dio;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente, 'c');
    }

    @Override
    public void exibirResumo() {
        System.out.println("====================================================");
        System.out.println("              Resumo da Conta Corrente");
        super.exibirDadosDaConta();
        System.out.println("====================================================");
    }
}
