public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 0001;
    private static long SEQUENCIAL = 00001;

    protected int agencia;
    protected long numero;
    protected double saldo;

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

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
    }


    public int getAgencia() {
        return agencia;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
