package com.totvs.teste.crudpersonapi.services.impl;

import com.totvs.teste.crudpersonapi.exceptions.EntidadeNaoEncontrada;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import com.totvs.teste.crudpersonapi.domain.repository.PessoaRepository;
import com.totvs.teste.crudpersonapi.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PessoaServiceImpl implements PessoaService {

    private PessoaRepository pessoaRepository;

    @Autowired
    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    @Override
    public List<PessoaEntity> listarPessoas() {
        return this.pessoaRepository.findAll();
    }

    @Override
    public PessoaEntity buscarPessoaPorId(Long id) {
        Optional<PessoaEntity> pessoaSalva = this.pessoaRepository.findById(id);
        return pessoaSalva.orElseThrow(() -> new EntidadeNaoEncontrada(
                "Pessoa com " + id + " não Encontrada"
        ));
    }

    public PessoaEntity salvarPessoa(PessoaEntity pessoaEntity) {
        return this.pessoaRepository.save(pessoaEntity);
    }

    public void excluirPessoa(Long id) {
        PessoaEntity pessoaEntityExcluir = buscarPessoaPorId(id);
        this.pessoaRepository.delete(pessoaEntityExcluir);
    }

    public PessoaEntity atualizarPessoa(PessoaEntity pessoaEntityEditada, Long id) {
        PessoaEntity pessoaEntitySalva = buscarPessoaPorId(id);
        return this.pessoaRepository.save(pessoaEntitySalva);
    }
}
