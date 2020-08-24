package com.totvs.teste.crudpersonapi.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pessoas")
public class PessoaEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 40, nullable = false)
    private String apelido;
    @Column(name = "CPFOUCNPJ")
    private String cpfOuCnpj;

    @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
    @JoinTable(name="endereco_pessoa",
            joinColumns={@JoinColumn(name="pessoa_id",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="endereco_id",
                    referencedColumnName="id_endereco")})
    private List<Endereco> enderecos;

    @Column(length = 40, nullable = false)
    private String profissão;
    @Column
    private BigDecimal salario;

    @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
    @JoinTable(name="dependente_pessoa",
            joinColumns={@JoinColumn(name="pessoa_id",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="dependente_id",
                    referencedColumnName="id_dependente")})
    private List<Dependente> dependentes;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dataNascimento;

    @OneToMany(cascade=CascadeType.ALL, orphanRemoval=true)
    @JoinTable(name="telefone_pessoa",
            joinColumns={@JoinColumn(name="pessoa_id",
                    referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="telefone_id",
                    referencedColumnName="id_telefone")})
    private List<Telefone> telefones;


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

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
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

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaEntity that = (PessoaEntity) o;
        return id.equals(that.id) &&
                cpfOuCnpj.equals(that.cpfOuCnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpfOuCnpj);
    }
}
