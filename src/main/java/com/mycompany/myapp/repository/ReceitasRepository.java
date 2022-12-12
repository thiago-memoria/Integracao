package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Receitas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Receitas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ReceitasRepository extends JpaRepository<Receitas, Long> {}
