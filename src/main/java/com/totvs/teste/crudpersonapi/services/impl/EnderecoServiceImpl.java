package com.totvs.teste.crudpersonapi.services.impl;

import com.totvs.teste.crudpersonapi.domain.model.Endereco;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import com.totvs.teste.crudpersonapi.domain.repository.EnderecoRepository;
import com.totvs.teste.crudpersonapi.exceptions.EntidadeNaoEncontrada;
import com.totvs.teste.crudpersonapi.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoServiceImpl implements EnderecoService {
    private EnderecoRepository enderecoRepository;
    @Autowired
    public EnderecoServiceImpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public List<Endereco> listarEnderecos() {
        return this.enderecoRepository.findAll();
    }

    @Override
    public Endereco buscarEnderecoPorId(Long id) {
        Optional<Endereco> enderecoSalva = this.enderecoRepository.findById(id);
        return enderecoSalva.orElseThrow(() -> new EntidadeNaoEncontrada(
                "Endereco com " + id + " não Encontrada"
        ));
    }

    @Override
    public Endereco salvarEndereco(Endereco endereco) {
        return this.enderecoRepository.save(endereco);
    }

    @Override
    public void excluirEndereco(Long id) {
        Endereco enderecoExcluir = buscarEnderecoPorId(id);
        this.enderecoRepository.delete(enderecoExcluir);
    }

    @Override
    public Endereco atualizarEndereco(Endereco endereco, Long id) {
        Endereco enderecoSalva = buscarEnderecoPorId(id);
        return this.enderecoRepository.save(enderecoSalva);
    }
}
