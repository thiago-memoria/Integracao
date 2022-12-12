package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Transportadoras;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Transportadoras entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TransportadorasRepository extends JpaRepository<Transportadoras, Long> {}
