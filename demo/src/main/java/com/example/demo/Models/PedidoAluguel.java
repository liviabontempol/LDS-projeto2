package com.example.demo.Models;

import com.example.demo.Models.enums.StatusPedido;
import com.example.demo.Models.enums.TipoContrato;

import jakarta.persistence.*;

@Entity
public class PedidoAluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    private Client cliente;
    
    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    @ManyToOne
    private Agent agente;
    
    public Agent getAgente() {
        return agente;
    }

    public void setAgente(Agent agente) {
        this.agente = agente;
    }

    @ManyToOne
    private Automovel automovel;
    
    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    @Enumerated(EnumType.STRING)
    private TipoContrato tipoContrato;
    
    @Enumerated(EnumType.STRING)
    private StatusPedido statusPedido;
    
}

