package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.MovimentosSistema;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the MovimentosSistema entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MovimentosSistemaRepository extends JpaRepository<MovimentosSistema, Long> {}
