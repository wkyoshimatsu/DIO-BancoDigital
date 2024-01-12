import java.util.Scanner;

public class TerminalBanco {
    public int exibirMenuPrincipal(){
        System.out.println("Bem vindo ao Banco");
        System.out.println("Selecione uma das opções abaixo");
        System.out.println("1 - Cadastrar Conta");
        System.out.println("2 - Acessar Conta");
        System.out.println("Digite a opção desejada: ");
        final int [] OPCOES_VALIDAS = {1, 2};
        Scanner scanner = new Scanner(System.in);
        try {
            int opcao = scanner.nextInt();
            checarOpcao(opcao, OPCOES_VALIDAS);
            return opcao;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        } finally {
            scanner.close();
        }
    }

    static void checarOpcao(int opcao, int [] opcoesValidas) {
        for (int i = 0; i < opcoesValidas.length; i++){
            if(opcao != opcoesValidas[i]){
                throw new IllegalArgumentException("Opção inválida");
            }
        }
    }

    public void exibirCadastrarConta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastrar Conta");

        System.out.println("Digite seu nome: ");
        String primeiroNome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("c - Conta Corrente");
        System.out.println("p - Conta Poupança");
        System.out.println("Digite a opção desejada: ");
        char opcaoConta = scanner.next().toLowerCase().charAt(0);
        scanner.close();

        Cliente novoCliente = new Cliente(primeiroNome, sobrenome);

        if(opcaoConta == 'c'){
            ContaCorrente contaCorrente = new ContaCorrente(novoCliente);
            contaCorrente.exibirDados();
        }
    }
    public void exibirAcessarConta(){

    }
    
    
    /*int opcaoTelaInicial (){
        System.out.println();

    }*/


    
}