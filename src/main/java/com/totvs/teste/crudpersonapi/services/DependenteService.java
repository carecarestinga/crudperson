package com.totvs.teste.crudpersonapi.services;

import com.totvs.teste.crudpersonapi.domain.model.Dependente;

import java.util.List;

public interface DependenteService {

    public List<Dependente> listarDependentes();
    public Dependente buscarDependentePorId(Long id);
    public Dependente salvarDependente (Dependente dependente);
    public void excluirDependente(Long id);
    public Dependente atualizarDependente(Dependente dependente, Long id);

}
