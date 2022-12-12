package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Formulas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Formulas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FormulasRepository extends JpaRepository<Formulas, Long> {}
