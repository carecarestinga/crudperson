package com.totvs.teste.crudpersonapi.services;

import com.totvs.teste.crudpersonapi.domain.model.Dependente;
import com.totvs.teste.crudpersonapi.domain.model.Telefone;

import java.util.List;

public interface TelefoneService {

    public List<Telefone> listarTelefones();
    public Telefone buscarTelefonePorId(Long id);
    public Telefone salvarTelefone (Telefone telefone);
    public void excluirTelefone(Long id);
    public Telefone atualizarTelefone(Telefone telefone, Long id);

}
