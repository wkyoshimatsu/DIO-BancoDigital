package com.dio;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente,'p');
    }

    @Override
    public void exibirResumo() {
        System.out.println("====================================================");
        System.out.println("              Resumo da Conta Poupança");
        super.exibirDadosDaConta();
        System.out.println("====================================================");
    }
}