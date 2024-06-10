package com.dio;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Banco {
    private int codigoBanco;
    private String nomeBanco;
    private List<Conta> contas;
}
