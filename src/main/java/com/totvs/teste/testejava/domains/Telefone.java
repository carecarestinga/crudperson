package com.totvs.teste.testejava.domains;

import com.totvs.teste.testejava.domains.enuns.Tipo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Telefone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoPais;
    private String ddd;
    private Integer numero;
    private Tipo tipo;

}
