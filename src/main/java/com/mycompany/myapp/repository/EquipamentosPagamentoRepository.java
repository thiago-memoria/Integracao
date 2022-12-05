package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.EquipamentosPagamento;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the EquipamentosPagamento entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EquipamentosPagamentoRepository extends JpaRepository<EquipamentosPagamento, Long> {}
