package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.PontoEntradaSaida;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the PontoEntradaSaida entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PontoEntradaSaidaRepository extends JpaRepository<PontoEntradaSaida, Long> {}
