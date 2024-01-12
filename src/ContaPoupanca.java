public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void exibirResumo() {
        System.out.println("====================================================");
        System.out.println("============= Resumo da Conta Poupança =============");
        super.exibirDados();
        System.out.println("====================================================");
    }
}