package com.totvs.teste.testejava.domains;

import com.totvs.teste.testejava.domains.enuns.TipoDependente;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Dependente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String momeCompleto;
    private TipoDependente tipoDependente;

}
