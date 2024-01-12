public class Main {
    public static void main(String[] args) {
        TerminalBanco terminal = new TerminalBanco();
        int opcao;
        do{
            opcao = terminal.exibirMenuPrincipal();
        } while(opcao == -1);

        if (opcao == 1){
            terminal.exibirCadastrarConta();
        } else {
            terminal.exibirAcessarConta();
        }
    }
}