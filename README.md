# DIO-BancoDigital

## Resolução do Desafio "Criando um Banco Digital com Java e Orientação a Objetos"
Repositório do desafio ["DIO - Criando um Banco Digital com Java e Orientação a Objetos"](https://github.com/falvojr/lab-banco-digital-oo) por [Venilton Falvo Jr](https://github.com/falvojr]).

## Domínio / Problema

Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java.

Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

```mermaid
---
title: Diagrama de classes - Inicial
---
classDiagram

IConta ..|> Conta
Conta --|> ContaCorrente: implementa
Conta --|> ContaPoupanca: implementa
Cliente "1" --* "1" Conta
Conta "1..*" --o "1" Banco

class Banco{
-String nome
-List~Conta~ contas
}

class Cliente{
-String nome
}

class Conta{
-int AGENCIA_PADRAO$ = 1
-int SEQUENCIAL$

#int agencia
#int numero
#double saldo
#Cliente cliente

+Conta(Cliente cliente)
+sacar(double valor)
+depositar(double valor)
+transferir(double valor, IConta contaDestino)
#imprimirInfosComuns()
}

class ContaCorrente{
+ContaCorrente(Cliente cliente)
+imprimirExtrato()
}

class ContaPoupanca{
+ContaPoupanca(Cliente cliente)
+imprimirExtrato()
}

class IConta{
<<interface>>
sacar(double valor)
depositar(double valor)
transferir(double valor, Conta contaDestino)
exibirResumo()
}
```


## Desafio de Projeto

Agora é a sua hora de brilhar, use todo seu conhecimento em Java e Orientação a Objetos para evoluir o projeto criado nesta aula.

Para isso, seguem algumas sugestões:
- Use todo o seu conhecimento para estender o domínio, incluindo novas classes, atributos e/ou métodos;
- Incluir o Lombok ao projeto para reduzir sua verbosidade de código.

```mermaid
---
title: Diagrama de classes - Final
---
classDiagram

IConta ..|> Conta
Conta --|> ContaCorrente: implementa
Conta --|> ContaPoupanca: implementa
Cliente "1" --* "1" Conta
Conta "1..*" --o "1" Banco

class Banco{
-int CODIGO_BANCO = 999$
-String NOME_BANCO = "Last Bank"$
-List~Conta~ contas
}

class Cliente{
-String primeiroNome
-String sobrenome
}

class Conta{
-int AGENCIA_PADRAO = 1$
-long SEQUENCIAL$

#int agencia
#long numero
#char tipoConta
#Cliente cliente
#double saldo

+Conta(Cliente cliente, char tipoConta)
+sacar(double valor)
+depositar(double valor)
+transferir(double valor, Conta contaDestino)
#exibirDadosDaConta()
}

class ContaCorrente{
+ContaCorrente(Cliente cliente)
+exibirResumo()
}

class ContaPoupanca{
+ContaPoupanca(Cliente cliente)
+exibirResumo()
}

class IConta{
<<interface>>
sacar(double valor)
depositar(double valor)
transferir(double valor, Conta contaDestino)
exibirResumo()
}
```

```mermaid
---
title: Fluxo de telas
---
stateDiagram-v2

    M001 : Tela Inicial
    M011 : Cadastro de conta
    M012 : Acesso a conta
    M002 : Sair do sistema
    M021 : Acesso do banco

    M001 --> M011
    M001 --> M012
    M001 --> M002
    M001 --> M021


```

