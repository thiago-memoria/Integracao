package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.FormasPagamento;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the FormasPagamento entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FormasPagamentoRepository extends JpaRepository<FormasPagamento, Long> {}
