package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ComposicaoTabela;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ComposicaoTabela entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ComposicaoTabelaRepository extends JpaRepository<ComposicaoTabela, Long> {}
