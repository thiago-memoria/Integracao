package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Chaves;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Chaves entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ChavesRepository extends JpaRepository<Chaves, Long> {}
