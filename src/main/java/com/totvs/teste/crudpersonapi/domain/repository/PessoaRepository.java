package com.totvs.teste.crudpersonapi.domain.repository;

import com.totvs.teste.crudpersonapi.domain.model.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
 //       Optional<PessoaEntity> findByCpf(@Param("cpf") String cpf);

}
