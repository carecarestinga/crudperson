package com.totvs.teste.crudpersonapi.resources.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.crudpersonapi.domain.enuns.TipoDependente;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import java.io.Serializable;

public class DependenteDto implements Serializable {


//    private Long id_dependente;
    private String nomeCompleto;
    private TipoDependente tipoDependente;
    @JsonIgnore
    private PessoaEntity pessoaEntity;


//    public Long getId_dependente() {
//        return id_dependente;
//    }
//
//    public void setId_dependente(Long id_dependente) {
//        this.id_dependente = id_dependente;
//    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public TipoDependente getTipoDependente() {
        return tipoDependente;
    }

    public void setTipoDependente(TipoDependente tipoDependente) {
        this.tipoDependente = tipoDependente;
    }

    public PessoaEntity getPessoaEntity() {
        return pessoaEntity;
    }

    public void setPessoaEntity(PessoaEntity pessoaEntity) {
        this.pessoaEntity = pessoaEntity;
    }

}
