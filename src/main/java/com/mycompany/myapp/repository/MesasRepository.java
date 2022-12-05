package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Mesas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Mesas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MesasRepository extends JpaRepository<Mesas, Long> {}
