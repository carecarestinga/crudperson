package com.totvs.teste.testejava.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.testejava.domain.enuns.TipoDependente;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String momeCompleto;
    private TipoDependente tipoDependente;
    @ManyToOne
    @JoinColumn(name = "cod_pessoa")
    @JsonIgnore
    private Pessoa pessoa;

}
