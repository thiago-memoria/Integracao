package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ContasPagarReceber;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ContasPagarReceber entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ContasPagarReceberRepository extends JpaRepository<ContasPagarReceber, Long> {}
