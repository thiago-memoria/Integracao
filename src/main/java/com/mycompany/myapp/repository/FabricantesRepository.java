package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Fabricantes;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Fabricantes entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FabricantesRepository extends JpaRepository<Fabricantes, Long> {}
