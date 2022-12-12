package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AcessoTipoMovimento;
import com.mycompany.myapp.domain.AcessoTipoMovimentoId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AcessoTipoMovimento entity.
 */
@Repository
public interface AcessoTipoMovimentoRepository extends JpaRepository<AcessoTipoMovimento, AcessoTipoMovimentoId> {}
