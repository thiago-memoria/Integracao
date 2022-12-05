package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.TipoCaixa;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the TipoCaixa entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TipoCaixaRepository extends JpaRepository<TipoCaixa, Long> {}
