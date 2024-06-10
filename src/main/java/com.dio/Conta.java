package com.dio;

import lombok.Getter;

public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static long SEQUENCIAL = 1;

    @Getter
    protected int agencia;
    @Getter
    protected long numero;
    @Getter
    protected double saldo;
    protected Cliente cliente;
    protected char tipoConta;

    public Conta(Cliente cliente, char tipoConta){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.tipoConta = tipoConta;

    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        System.out.println("====================================================");
        System.out.println("Saque de " + valor + "realizado com sucesso");
        System.out.println("Seu saldo atual é: " + this.saldo);
        System.out.println("====================================================");
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("====================================================");
        System.out.println("Depósito de " + valor + " realizado com sucesso");
        System.out.println("Seu saldo atual é: " + this.saldo);
        System.out.println("====================================================");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("====================================================");
        System.out.println("Transferência de " + valor + " realizada com sucesso");
        System.out.println("Seu saldo atual é: " + this.saldo);
        System.out.println("====================================================");
    }

    public void exibirResumo() {
        System.out.println("====================================================");
        System.out.println("              Resumo da Conta Corrente");
        super.exibirDadosDaConta();
        System.out.println("====================================================");
    }

    protected void exibirDadosDaConta(){
        System.out.printf("Titular: %s %s%n", this.cliente.getPrimeiroNome(), this.cliente.getSobrenome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }
}
