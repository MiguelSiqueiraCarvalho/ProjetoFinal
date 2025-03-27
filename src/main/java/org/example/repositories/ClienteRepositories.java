package org.example.repositories;

import org.example.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositories extends JpaRepository<Cliente, Long>{
}