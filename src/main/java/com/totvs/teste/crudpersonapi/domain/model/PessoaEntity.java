package com.totvs.teste.crudpersonapi.domain.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "pessoas")
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_pessoa")
    @SequenceGenerator(name="sequence_pessoa", sequenceName = "sequence_pessoa", allocationSize = 1)
    @Column(name = "ID")
    private Long id;
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;
    @Column(name = "APELIDO", length = 40, nullable = false)
    private String apelido;
    @Column(name = "CPFOUCNPJ")
    private String cpfOuCnpj;
//    @OneToMany(mappedBy = "pessoa_endereco")
//    private List<Endereco> enderecos;
    @Column(name = "PROFISSAO" , length = 40, nullable = false)
    private String profissão;
    @Column(name = "SALARIO")
    private BigDecimal salario;
//    @OneToMany(mappedBy = "pessoa_dependente")
//    private List<Dependente> dependentes;
    @Column(name = "DATA_NASCIMENTO")
    private LocalDateTime dataNascimento;
//    @OneToMany(mappedBy = "pessoa_telefone")
//    private List<Telefone> telefones;


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

//    public List<Endereco> getEnderecos() {
//        return enderecos;
//    }
//
//    public void setEnderecos(List<Endereco> enderecos) {
//        this.enderecos = enderecos;
//    }

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

//    public List<Dependente> getDependentes() {
//        return dependentes;
//    }
//
//    public void setDependentes(List<Dependente> dependentes) {
//        this.dependentes = dependentes;
//    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

//    public List<Telefone> getTelefones() {
//        return telefones;
//    }
//
//    public void setTelefones(List<Telefone> telefones) {
//        this.telefones = telefones;
//    }

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
