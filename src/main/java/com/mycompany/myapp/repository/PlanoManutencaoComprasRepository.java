package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.PlanoManutencaoCompras;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the PlanoManutencaoCompras entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PlanoManutencaoComprasRepository extends JpaRepository<PlanoManutencaoCompras, Long> {}
