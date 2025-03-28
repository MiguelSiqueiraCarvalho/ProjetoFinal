package org.example.dto;

import java.io.Serializable;

public class FornecedorDTO implements Serializable {

    private Long id;
    private String RazaoSocial;
    private String NomeFantasia;
    private String cnpj;
    private String status;
    private String ConTelefoneComercial;
    private String ConCelular;
    private String ConEmail;
    private  String ConEmailSecundario;

    public FornecedorDTO() {
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

    public void setRazaoSocial(String razaoSocial) {
        RazaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        NomeFantasia = nomeFantasia;
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

    public String getConTelefoneComercial() {
        return ConTelefoneComercial;
    }

    public void setConTelefoneComercial(String conTelefoneComercial) {
        ConTelefoneComercial = conTelefoneComercial;
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
}
