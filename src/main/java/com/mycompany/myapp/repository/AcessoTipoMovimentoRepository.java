package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AcessoTipoMovimento;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AcessoTipoMovimento entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AcessoTipoMovimentoRepository extends JpaRepository<AcessoTipoMovimento, Long> {}
