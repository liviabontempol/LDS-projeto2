package com.example.demo.Models;


import jakarta.validation.constraints.NotNull;

public class BankAgent extends Agent {

public BankAgent(String email, String password, String nome, String endereco, @NotNull long cnpj) {
    super(email, password, nome, endereco, cnpj);
}

}
