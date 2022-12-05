package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.TotalizadoresCaixa;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the TotalizadoresCaixa entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TotalizadoresCaixaRepository extends JpaRepository<TotalizadoresCaixa, Long> {}
