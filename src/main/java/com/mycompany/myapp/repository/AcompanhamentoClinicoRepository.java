package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AcompanhamentoClinico;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AcompanhamentoClinico entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AcompanhamentoClinicoRepository extends JpaRepository<AcompanhamentoClinico, Long> {}
