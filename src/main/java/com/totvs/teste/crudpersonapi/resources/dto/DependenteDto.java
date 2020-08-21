package com.totvs.teste.crudpersonapi.resources.dto;

import com.totvs.teste.crudpersonapi.domain.enuns.TipoDependente;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;

public class DependenteDto {

    private String momeCompleto;
    private TipoDependente tipoDependente;
    private PessoaEntity pessoaEntity;


    public String getMomeCompleto() {
        return momeCompleto;
    }

    public void setMomeCompleto(String momeCompleto) {
        this.momeCompleto = momeCompleto;
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
