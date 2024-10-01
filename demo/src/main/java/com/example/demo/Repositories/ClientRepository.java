package com.example.demo.Repositories;

import com.example.demo.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByCpf(Long cpf);
    Optional<Client> findByEmail(String email);

}


