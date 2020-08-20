package com.totvs.teste.testejava.services;

import com.totvs.teste.testejava.domain.model.Pessoa;

import java.util.List;

public interface PessoaService {

    public List<Pessoa> listarPessoas();
    public Pessoa buscarPessoaporId(Long id);
    public Pessoa salvarPessoa (Pessoa pessoa);
    public void excluirPessoa(Long id);
    public Pessoa atualizarPessoa(Pessoa pessoa, Long id);

}
