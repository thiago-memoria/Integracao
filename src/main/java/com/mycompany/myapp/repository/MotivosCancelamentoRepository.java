package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.MotivosCancelamento;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the MotivosCancelamento entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MotivosCancelamentoRepository extends JpaRepository<MotivosCancelamento, Long> {}
