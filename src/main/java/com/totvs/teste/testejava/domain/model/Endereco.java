package com.totvs.teste.testejava.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.totvs.teste.testejava.domain.enuns.Tipo;
import com.totvs.teste.testejava.domain.enuns.TipoLogradouro;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
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
    @ManyToOne
    @JoinColumn(name = "cod_pessoa")
    @JsonIgnore
    private Pessoa pessoa;


}
