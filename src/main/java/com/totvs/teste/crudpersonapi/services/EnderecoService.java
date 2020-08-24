package com.totvs.teste.crudpersonapi.services;

import com.totvs.teste.crudpersonapi.domain.model.Endereco;

import java.util.List;

public interface EnderecoService {

    public List<Endereco> listarEnderecos();
    public Endereco buscarEnderecoPorId(Long id);
    public Endereco salvarEndereco (Endereco endereco);
    public void excluirEndereco(Long id);
    public Endereco atualizarEndereco(Endereco endereco, Long id);

}
