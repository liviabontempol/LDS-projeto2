package com.example.demo.Service;

import com.example.demo.Repositories.ClientRepository;
import com.example.demo.Models.Client;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.*;;

@Service
public class ClientService {
@Autowired
     private ClientRepository clientRepository;

     public Optional<Client> findByCpf(){
        return this.clientRepository.findByCpf(null);
     }

     public Optional<Client> findByEmail(){
        return this.clientRepository.findByEmail(null);     
    }

    @Transactional
    public Client createClient(Client obj) {
        obj.setId(null);
        obj = this.clientRepository.save(obj);
        return obj;
    }

    @Transactional
    public Client updateClient(Long id, Client clientDetails) {
        Client client = clientRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Client not found with id: " + id));

        client.setNome(clientDetails.getNome());
        client.setProfissao(clientDetails.getProfissao());
        client.setEntidadesEmpregadoras(clientDetails.getEntidadesEmpregadoras());
        client.setRendimentos(clientDetails.getRendimentos());

        return clientRepository.save(client);
    }

    @Transactional
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
    }
    //introduzir, modificar, consultar e cancelar pedidos de aluguel (assinatura). Por outro lado, os agentes (empresas e bancos) podem modificar e avaliar pedidos.

