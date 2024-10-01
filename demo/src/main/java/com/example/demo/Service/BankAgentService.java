package com.example.demo.Service;

import com.example.demo.Models.Client;
import com.example.demo.Models.PedidoAluguel;

public class BankAgentService {
    
public void analisarCredito(PedidoAluguel pedidoAluguel){ 
        Client cliente = pedidoAluguel.getCliente();

        System.out.println("Profissão: " + cliente.getProfissao());

        String entidades[] = cliente.getEntidadesEmpregadoras();
        System.out.println("Entidades empregadoras:");
        for (String entidade : entidades) {
            System.out.println("- " + entidade);
        }

        double[] rendimentos = cliente.getRendimentos();
        System.out.println("Rendimentos:");
        for (Double rendimento : rendimentos) {
            System.out.println("- R$ " + rendimento);
        }
}

public boolean concederCredito(double[] rendimentos){
double somador = 0;
    for(int i = 0; i<3; i++){
        somador = somador + rendimentos[i];
}
if(somador>4999){
    return true;
} else {
    return false;
}
}
}
