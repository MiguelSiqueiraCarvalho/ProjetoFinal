package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Contato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTATO")
    private Long id;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "CON_FOR_ID")
    private Fornecedor conFornecedor;

    @Column(length = 25, name = "CELULAR", nullable = false)
    private String ConCelular;

    @Column(length = 155, name = "EMAIL", nullable = false)
    private String ConEmail;

    @Column(length = 155, name = "EmailSecundario", nullable = false)
    private  String ConEmailSecundario;

    @Column(length = 25, name = "ConTelefoneComercial", nullable = false)
    private String ConTelefoneComercial;


    public Contato() {
    }

    public Contato(Long id, Fornecedor conFornecedor, String conCelular, String conEmail, String conEmailSecundario, String conTelefoneComercial) {
        this.id = id;
        this.conFornecedor = conFornecedor;
        ConCelular = conCelular;
        ConEmail = conEmail;
        ConEmailSecundario = conEmailSecundario;
        ConTelefoneComercial = conTelefoneComercial;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fornecedor getConFornecedor() {
        return conFornecedor;
    }

    public void setConFornecedor(Fornecedor conFornecedor) {
        this.conFornecedor = conFornecedor;
    }

    public String getConCelular() {
        return ConCelular;
    }

    public void setConCelular(String conCelular) {
        ConCelular = conCelular;
    }

    public String getConEmail() {
        return ConEmail;
    }

    public void setConEmail(String conEmail) {
        ConEmail = conEmail;
    }

    public String getConEmailSecundario() {
        return ConEmailSecundario;
    }

    public void setConEmailSecundario(String conEmailSecundario) {
        ConEmailSecundario = conEmailSecundario;
    }

    public String getConTelefoneComercial() {
        return ConTelefoneComercial;
    }

    public void setConTelefoneComercial(String conTelefoneComercial) {
        ConTelefoneComercial = conTelefoneComercial;
    }
}
