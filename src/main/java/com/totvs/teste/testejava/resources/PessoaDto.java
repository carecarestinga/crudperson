package com.totvs.teste.testejava.resources;

import com.totvs.teste.testejava.domain.model.Dependente;
import com.totvs.teste.testejava.domain.model.Endereco;
import com.totvs.teste.testejava.domain.model.Telefone;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class PessoaDto {

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
