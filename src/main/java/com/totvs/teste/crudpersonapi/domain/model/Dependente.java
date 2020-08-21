package com.totvs.teste.crudpersonapi.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.crudpersonapi.domain.enuns.TipoDependente;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String momeCompleto;
    private TipoDependente tipoDependente;
//    @ManyToOne
//    @JoinColumn(name = "cod_pessoa")
//    @JsonIgnore
//    private PessoaEntity pessoa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

//    public PessoaEntity getPessoa() {
//        return pessoa;
//    }
//
//    public void setPessoa(PessoaEntity pessoa) {
//        this.pessoa = pessoa;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dependente that = (Dependente) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
