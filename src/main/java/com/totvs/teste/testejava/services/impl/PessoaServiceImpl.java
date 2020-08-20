package com.totvs.teste.testejava.services.impl;

import com.totvs.teste.testejava.domain.model.Pessoa;
import com.totvs.teste.testejava.exceptions.PessoaNaoEncontrada;

import com.totvs.teste.testejava.domain.repository.PessoaRepository;
import com.totvs.teste.testejava.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listarPessoas() {
        return this.pessoaRepository.findAll();
    }

    public Pessoa buscarPessoaporId(Long id) {
        Optional<Pessoa> pessoaSalva = this.pessoaRepository.findById(id);
        return pessoaSalva.orElseThrow(() -> new PessoaNaoEncontrada(
                "Pessoa com " +id + "não Encontrada"
        ));
    }

    public Pessoa salvarPessoa(Pessoa pessoa) {
        return this.pessoaRepository.save(pessoa);
    }

    public void excluirPessoa(Long id) {
        Pessoa pessoaExcluir = buscarPessoaporId(id);
        this.pessoaRepository.deleteById(pessoaExcluir.getId());
    }

    public Pessoa atualizarPessoa(Pessoa pessoa, Long id) {
        Pessoa pessoaSalva = buscarPessoaporId(id);
        pessoaSalva.setApelido(pessoa.getApelido());
        return this.pessoaRepository.save(pessoaSalva);
    }
}
