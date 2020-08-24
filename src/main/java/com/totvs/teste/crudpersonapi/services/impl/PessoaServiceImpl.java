package com.totvs.teste.crudpersonapi.services.impl;

import com.totvs.teste.crudpersonapi.exceptions.PessoaNaoEncontrada;
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
    public PessoaEntity buscarPessoaporId(Long id) {
        Optional<PessoaEntity> pessoaSalva = this.pessoaRepository.findById(id);
        return pessoaSalva.orElseThrow(() -> new PessoaNaoEncontrada(
                "Pessoa com " +id + "não Encontrada"
        ));
    }

    public PessoaEntity salvarPessoa(PessoaEntity pessoaEntity) {
        return this.pessoaRepository.save(pessoaEntity);
    }

    public void excluirPessoa(Long id) {
        PessoaEntity pessoaEntityExcluir = buscarPessoaporId(id);
        this.pessoaRepository.delete(pessoaEntityExcluir);
    }

    public PessoaEntity atualizarPessoa(PessoaEntity pessoaEntityEditada, Long id) {
        PessoaEntity pessoaEntitySalva = buscarPessoaporId(id);
        editandoPessoa(pessoaEntityEditada, pessoaEntitySalva);
        return this.pessoaRepository.save(pessoaEntitySalva);
    }

    private void editandoPessoa(PessoaEntity pessoaEntityEditada, PessoaEntity pessoaEntitySalva) {
        pessoaEntitySalva
                .setNome(pessoaEntityEditada.getNome());
    }

}
