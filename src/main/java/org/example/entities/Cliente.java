package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 55, name = "Nome", nullable = false)
    private String nome;

    @Column(length = 14, name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "DataNascimento", nullable = false)
    private LocalDate DataNascimento;

    @Column(length = 55, name = "Status", nullable = false)
    private String status;

    public Cliente(){
    }

    public Cliente(Long id, String nome, String cpf, LocalDate dataNascimento, String status) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        DataNascimento = dataNascimento;
        this.status = status;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
