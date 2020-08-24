package com.totvs.teste.crudpersonapi.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.crudpersonapi.domain.enuns.TipoDependente;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Dependente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_dependente;
    private String nomeCompleto;
    private TipoDependente tipoDependente;
    @JsonIgnore
    @OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name="dependente_pessoa",
            joinColumns={@JoinColumn(name="dependente_id",
                    referencedColumnName="id_dependente")},
            inverseJoinColumns={@JoinColumn(name="pessoa_id",
                    referencedColumnName="id")})
    private PessoaEntity pessoa;

    public Long getId_dependente() {
        return id_dependente;
    }

    public void setId_dependente(Long id_dependente) {
        this.id_dependente = id_dependente;
    }

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

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dependente that = (Dependente) o;
        return id_dependente.equals(that.id_dependente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_dependente);
    }
}
