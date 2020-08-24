package com.totvs.teste.crudpersonapi.resources.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class PessoaDto implements Serializable {

    private Long id;
    private String nome;
    private String apelido;
    private String cpfOuCnpj;
    private List<EnderecoDto> enderecos;
    private String profissão;
    private BigDecimal salario;
    private List<DependenteDto> dependentes;
    private LocalDateTime dataNascimento;
    private List<TelefoneDto> telefones;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public List<EnderecoDto> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoDto> enderecos) {
        this.enderecos = enderecos;
    }

    public String getProfissão() {
        return profissão;
    }

    public void setProfissão(String profissão) {
        this.profissão = profissão;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public List<DependenteDto> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<DependenteDto> dependentes) {
        this.dependentes = dependentes;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<TelefoneDto> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<TelefoneDto> telefones) {
        this.telefones = telefones;
    }
}
