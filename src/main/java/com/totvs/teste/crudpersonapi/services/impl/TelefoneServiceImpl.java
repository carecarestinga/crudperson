package com.totvs.teste.crudpersonapi.services.impl;

import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import com.totvs.teste.crudpersonapi.domain.model.Telefone;
import com.totvs.teste.crudpersonapi.domain.repository.TelefoneRepository;
import com.totvs.teste.crudpersonapi.exceptions.EntidadeNaoEncontrada;
import com.totvs.teste.crudpersonapi.services.TelefoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefoneServiceImpl implements TelefoneService {
    private TelefoneRepository telefoneRepository;
    @Autowired
    public TelefoneServiceImpl(TelefoneRepository telefoneRepository) {
        this.telefoneRepository = telefoneRepository;
    }

    public List<Telefone> listarTelefones() {
        return this.telefoneRepository.findAll();
    }

    @Override
    public Telefone buscarTelefonePorId(Long id) {
        Optional<Telefone> telefoneSalva = this.telefoneRepository.findById(id);
        return telefoneSalva.orElseThrow(() -> new EntidadeNaoEncontrada(
                "Telefone com " + id + " não Encontrado"
        ));
    }

    @Override
    public Telefone salvarTelefone(Telefone telefone) {
        return this.telefoneRepository.save(telefone);
    }

    @Override
    public void excluirTelefone(Long id) {
        Telefone telefoneExcluir = buscarTelefonePorId(id);
        this.telefoneRepository.delete(telefoneExcluir);
    }

    @Override
    public Telefone atualizarTelefone(Telefone telefoneEditada, Long id) {
        Telefone telefoneSalva = buscarTelefonePorId(id);
        return this.telefoneRepository.save(telefoneSalva);
    }
}
