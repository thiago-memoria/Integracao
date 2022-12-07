package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.RotasEntrega;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the RotasEntrega entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RotasEntregaRepository extends JpaRepository<RotasEntrega, Long> {}
