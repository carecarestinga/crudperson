package com.totvs.teste.crudpersonapi.services;

import com.totvs.teste.crudpersonapi.domain.model.Dependente;
import com.totvs.teste.crudpersonapi.domain.model.Endereco;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;

import java.util.List;

public interface PessoaService {

    public List<PessoaEntity> listarPessoas();
    public PessoaEntity buscarPessoaPorId(Long id);
    public PessoaEntity salvarPessoa (PessoaEntity pessoaEntity);
    public void excluirPessoa(Long id);
    public PessoaEntity atualizarPessoa(PessoaEntity pessoaEntity, Long id);

}
