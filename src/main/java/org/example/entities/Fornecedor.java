package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Fornecedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
        private Long id;

    @Column(length = 155, name = "ServicoSocial", nullable = false)
        private String servicoSocial;

    @Column(length = 155, name = "NomeFantasia", nullable = false)
        private String nomeFantasia;

    @Column(length = 14, name = "CNPJ", nullable = false)
        private String cnpj;

    @Column(length = 50, name = "Status", nullable = false)
        private String status;

    public Fornecedor() {
    }

    public Fornecedor(Long id, String servicoSocial, String nomeFantasia, String cnpj, String status) {
        this.id = id;
        this.servicoSocial = servicoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServicoSocial() {
        return servicoSocial;
    }

    public void setServicoSocial(String servicoSocial) {
        this.servicoSocial = servicoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
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
