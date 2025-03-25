package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
        private Long id;

    @Column(length = 155, name = "Descricao", nullable = false)
        private String descricao;

    @Column(name = "PrecoCusto", nullable = false)
        private double precoCusto;

    @Column(name = "PrecoVenda", nullable = false)
        private double precoVenda;

    @Column(name = "Estoque", nullable = false)
        private int estoque;
}
