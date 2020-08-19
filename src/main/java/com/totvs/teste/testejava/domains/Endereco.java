package com.totvs.teste.testejava.domains;

import com.totvs.teste.testejava.domains.enuns.Tipo;
import com.totvs.teste.testejava.domains.enuns.TipoLogradouro;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Tipo tipo; //(Comercial, Residencial, contato)
    private TipoLogradouro tipoLogradouro; // (Rua, avenida, estrada)
    private String nomeLogradouro;
    private Integer numeroLogradouro;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;


}
