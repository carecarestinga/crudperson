package com.totvs.teste.crudpersonapi.resources.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.crudpersonapi.domain.enuns.Tipo;
import com.totvs.teste.crudpersonapi.domain.enuns.TipoLogradouro;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import java.io.Serializable;


public class EnderecoDto implements Serializable {

//    private Long id_endereco;
    private Tipo tipo; //(Comercial, Residencial, contato)
    private TipoLogradouro tipoLogradouro; // (Rua, avenida, estrada)
    private String nomeLogradouro;
    private Integer numeroLogradouro;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    @JsonIgnore
    private PessoaEntity pessoaEntity;
//
//    public Long getId_endereco() {
//        return id_endereco;
//    }
//
//    public void setId_endereco(Long id_endereco) {
//        this.id_endereco = id_endereco;
//    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public TipoLogradouro getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public void setNomeLogradouro(String nomeLogradouro) {
        this.nomeLogradouro = nomeLogradouro;
    }

    public Integer getNumeroLogradouro() {
        return numeroLogradouro;
    }

    public void setNumeroLogradouro(Integer numeroLogradouro) {
        this.numeroLogradouro = numeroLogradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public PessoaEntity getPessoaEntity() {
        return pessoaEntity;
    }

    public void setPessoaEntity(PessoaEntity pessoaEntity) {
        this.pessoaEntity = pessoaEntity;
    }

}
