public class Main {
    public static void main(String[] args) {
        TerminalBanco terminal = new TerminalBanco();
        int opcao;
        do{
            opcao = terminal.exibirMenuPrincipal();
        } while(opcao == -1);

        do if (opcao == 1) {
            opcao = terminal.exibirCadastrarConta();
        } else {
            terminal.exibirAcessarConta();
        } while(opcao != 0);
    }
}