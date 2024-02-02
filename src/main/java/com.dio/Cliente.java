package com.dio;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {
    private String primeiroNome;
    private String sobrenome;

    public Cliente(String primeiroNome, String sobrenome) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
    }
}
