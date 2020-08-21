package com.totvs.teste.crudpersonapi.resources.dto;

import com.totvs.teste.crudpersonapi.domain.enuns.Tipo;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;

public class TelefoneDto {

    private String codigoPais;
    private String ddd;
    private Integer numero;
    private Tipo tipo;
    private PessoaEntity pessoaEntity;

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
