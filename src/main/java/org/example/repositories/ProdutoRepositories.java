package org.example.repositories;

import org.example.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepositories extends JpaRepository<Produto, Long> {
}
