package com.totvs.teste.crudpersonapi.domain.repository;

import com.totvs.teste.crudpersonapi.domain.model.Dependente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependenteRepository extends JpaRepository<Dependente, Long> {
}
