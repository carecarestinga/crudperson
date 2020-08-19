package com.totvs.teste.testejava.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String apelido;
    private String cpfOuCnpj;
    private List<Endereco> enderecos;
    private String profissão;
    private BigDecimal salario;
    private List<Dependente> dependentes;
    private LocalDate dataNascimento;
    private List<Telefone> telefones;


}
