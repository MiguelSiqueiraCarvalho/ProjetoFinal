package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
        private Long id;


    @OneToMany(mappedBy = "conFornecedor", cascade = CascadeType.ALL)
     private List<Contato> contatos = new ArrayList<>();


    @Column(length = 155, name = "RazaoSocial", nullable = false)
        private String RazaoSocial;

    @Column(length = 155, name = "NomeFantasia", nullable = false)
        private String NomeFantasia;

    @Column(length = 14, name = "CNPJ", nullable = false)
        private String cnpj;

    @Column(length = 50, name = "Status", nullable = false)
        private String status;

    public Fornecedor() {
    }

    public Fornecedor(Long id, String RazaoSocial, String NomeFantasia, String cnpj, String status) {
        this.id = id;
        this.RazaoSocial = RazaoSocial;
        this.NomeFantasia = NomeFantasia;
        this.cnpj = cnpj;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
