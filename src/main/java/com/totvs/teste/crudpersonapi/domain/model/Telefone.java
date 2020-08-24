package com.totvs.teste.crudpersonapi.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.crudpersonapi.domain.enuns.Tipo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Telefone implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_telefone;
    private String codigoPais;
    private String ddd;
    private Integer numero;
    private Tipo tipo;
    @JsonIgnore
    @OneToOne(cascade=CascadeType.ALL)
    @JoinTable(name="telefone_pessoa",
            joinColumns={@JoinColumn(name="telefone_id",
                    referencedColumnName="id_telefone")},
            inverseJoinColumns={@JoinColumn(name="pessoa_id",
                    referencedColumnName="id")})
    private PessoaEntity pessoa;

    public Long getId_telefone() {
        return id_telefone;
    }

    public void setId_telefone(Long id_telefone) {
        this.id_telefone = id_telefone;
    }

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
        Telefone telefone = (Telefone) o;
        return id_telefone.equals(telefone.id_telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_telefone);
    }
}
