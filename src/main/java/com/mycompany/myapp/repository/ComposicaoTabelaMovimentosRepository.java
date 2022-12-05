package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ComposicaoTabelaMovimentos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ComposicaoTabelaMovimentos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ComposicaoTabelaMovimentosRepository extends JpaRepository<ComposicaoTabelaMovimentos, Long> {}
