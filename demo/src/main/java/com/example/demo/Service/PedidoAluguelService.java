/*package com.example.demo.Service;
import com.example.demo.Models.enums.TipoContrato;
import com.example.demo.Models.Automovel;
import com.example.demo.Models.BankAgent;
import com.example.demo.Models.Client;
import com.example.demo.Models.Agent;
import com.example.demo.Models.enums.StatusPedido;

public class PedidoAluguelService {
    private Object statusPedido;

    public boolean criarPedido(Client cliente, Automovel automovel, Agent agente, StatusPedido statusPedido) {
        this.cliente = cliente;
        this.automovel = automovel;
        this.Agent = agente;
        this.statusPedido = StatusPedido.EM_ANALISE;
        return true;
    }
    
    public boolean modificarPedido(Client cliente, Automovel automovel, Agent agente) {

        this.cliente = cliente;
        this.automovel = automovel;
        this.agente = agente;
        return true;
    }
    
    public boolean cancelarPedido() {
        // Implementar lógica de cancelamento
        this.statusPedido = StatusPedido.NEGADO;
        return true;
    }
    
    public boolean avaliarPedido() {
        // Implementar lógica de avaliação
        // Exemplo simplificado
        if (agente instanceof BankAgent) {
            BankAgent bankAgent = (BankAgent) agente;
            boolean creditoConcedido = bankAgent.analisarCredito(this, cliente.getRendimento().stream().mapToDouble(Double::doubleValue).sum());
            this.statusPedido = creditoConcedido ? StatusPedido.APROVADO : StatusPedido.NEGADO;
            return creditoConcedido;
        }
        return false;
    }
    
}
*/