package com.totvs.teste.crudpersonapi.services.impl;

import com.totvs.teste.crudpersonapi.domain.model.Dependente;
import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import com.totvs.teste.crudpersonapi.domain.repository.DependenteRepository;
import com.totvs.teste.crudpersonapi.exceptions.EntidadeNaoEncontrada;
import com.totvs.teste.crudpersonapi.services.DependenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DependenteServiceImpl implements DependenteService {
    private DependenteRepository dependenteRepository;
    @Autowired
    public DependenteServiceImpl(DependenteRepository dependenteRepository) {
        this.dependenteRepository = dependenteRepository;
    }

    @Override
    public List<Dependente> listarDependentes() {
        return this.dependenteRepository.findAll();
    }

    @Override
    public Dependente buscarDependentePorId(Long id) {
        Optional<Dependente> dependenteSalva = this.dependenteRepository.findById(id);
        return dependenteSalva.orElseThrow(() -> new EntidadeNaoEncontrada(
                "Dependente com " + id + " não Encontrada"
        ));
    }

    @Override
    public Dependente salvarDependente(Dependente dependente) {
        return this.dependenteRepository.save(dependente);
    }

    @Override
    public void excluirDependente(Long id) {
        Dependente dependenteExcluir = buscarDependentePorId(id);
        this.dependenteRepository.delete(dependenteExcluir);
    }

    @Override
    public Dependente atualizarDependente(Dependente dependente, Long id) {
        Dependente dependenteSalva = buscarDependentePorId(id);
        return this.dependenteRepository.save(dependenteSalva);
    }
}
