package com.example.demo.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table
public class Client extends User{
    @NotNull
    @Column(unique = true)

    private long rg;
    
    @NotNull
    @Column(unique = true)
    private long cpf;
    @Column(name = "Profissao")
    private String profissao;
    private String[] entidadesEmpregadoras;
    private double[] rendimentos;
    
      public Client(String email, String password, long rg, long cpf, String nome, String endereco, String profissao,
            String[] entidadesEmpregadoras, double[] rendimentos) {
        super(email, password, nome, endereco);
        this.rg = rg;
        this.cpf = cpf;
        this.profissao = profissao;
        this.entidadesEmpregadoras = entidadesEmpregadoras;
        this.rendimentos = rendimentos;
    }
    
//getters e setters

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String[] getEntidadesEmpregadoras() {
        return entidadesEmpregadoras;
    }

    public void setEntidadesEmpregadoras(String[] entidadesEmpregadoras) {
        this.entidadesEmpregadoras = entidadesEmpregadoras;
    }

    public double[] getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(double[] rendimentos) {
        this.rendimentos = rendimentos;
    }

    public long getRg() {
        return rg;
    }

    public long getCpf() {
        return cpf;
    }


    }   




