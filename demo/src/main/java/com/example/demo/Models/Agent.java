package com.example.demo.Models;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Agent extends User {
    @NotNull
    @Column(unique = true)
    private long cnpj;

    public Agent(String email, String password, String nome, String endereco, @NotNull long cnpj) {
        super(email, password, nome, endereco);
        this.cnpj = cnpj;
    }
    
    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    
}
