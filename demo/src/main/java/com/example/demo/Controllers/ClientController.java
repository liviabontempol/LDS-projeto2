/*package com.example.demo.Controllers;


import com.example.demo.Models.Client;
import com.example.demo.Service.ClientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clients")
public class ClientController {
    
    @Autowired
    private ClientService clientService;
    
    
    }
    
    // Mostrar formulário para criar um novo cliente
    @GetMapping("/novo")
    public String mostrarFormularioNovo(Model model) {
        model.addAttribute("client", new Client());
        return "clients/form";
    }
    
    // Salvar um cliente (criação ou atualização)
    @PostMapping
    public String salvarCliente(@Valid @ModelAttribute Client client, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "clients/form";
        }
        clientService.salvarCliente(client);
        return "redirect:/clients";
    }
    
    // Mostrar formulário para editar um cliente existente
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicao(@PathVariable Long id, Model model) {
        Client client = clientService.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("ID inválido: " + id));
        model.addAttribute("client", client);
        return "clients/form";
    }
    
    // Deletar um cliente
    @GetMapping("/deletar/{id}")
    public String deletarCliente(@PathVariable Long id, Model model) {
        clientService.deletarCliente(id);
        return "redirect:/clients";
    }
}
*/