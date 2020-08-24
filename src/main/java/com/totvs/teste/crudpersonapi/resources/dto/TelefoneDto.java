package com.totvs.teste.crudpersonapi.resources.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.crudpersonapi.domain.enuns.Tipo;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import java.io.Serializable;

public class TelefoneDto implements Serializable {

//    private Long id_telefone;
    private String codigoPais;
    private String ddd;
    private Integer numero;
    private Tipo tipo;
    @JsonIgnore
    private PessoaEntity pessoaEntity;

//    public Long getId_telefone() {
//        return id_telefone;
//    }
//
//    public void setId_telefone(Long id_telefone) {
//        this.id_telefone = id_telefone;
//    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public PessoaEntity getPessoaEntity() {
        return pessoaEntity;
    }

    public void setPessoaEntity(PessoaEntity pessoaEntity) {
        this.pessoaEntity = pessoaEntity;
    }

}
