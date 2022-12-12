package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Itens;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Itens entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ItensRepository extends JpaRepository<Itens, Long> {}
