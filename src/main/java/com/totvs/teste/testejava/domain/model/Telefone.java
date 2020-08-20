package com.totvs.teste.testejava.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.testejava.domain.enuns.Tipo;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoPais;
    private String ddd;
    private Integer numero;
    private Tipo tipo;
    @ManyToOne
    @JoinColumn(name = "cod_pessoa")
    @JsonIgnore
    private Pessoa pessoa;

}
