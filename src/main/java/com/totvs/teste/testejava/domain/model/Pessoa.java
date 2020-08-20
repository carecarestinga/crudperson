package com.totvs.teste.testejava.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false)
    private String nome;
    @Column(length = 40, nullable = false)
    private String apelido;
    private String cpfOuCnpj;
    @OneToMany(mappedBy = "pessoa_endereco")
    private List<Endereco> enderecos;
    @Column(length = 40, nullable = false)
    private String profissão;
    private BigDecimal salario;
    @OneToMany(mappedBy = "pessoa_dependente")
    private List<Dependente> dependentes;
    private LocalDate dataNascimento;
    @OneToMany(mappedBy = "pessoa_telefone")
    private List<Telefone> telefones;


}
