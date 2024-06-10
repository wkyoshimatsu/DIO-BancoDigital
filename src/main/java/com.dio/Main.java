package com.dio;

public class Main {
    public static void main(String[] args) {
        Cliente joseCampos = new Cliente();
        joseCampos.setNome("José Campos");

        Conta contaCorrente = new ContaCorrente(joseCampos);
        Conta contaPoupanca = new ContaPoupanca(joseCampos);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);

        contaCorrente.exibirResumo();
        contaPoupanca.exibirResumo();
    }
}