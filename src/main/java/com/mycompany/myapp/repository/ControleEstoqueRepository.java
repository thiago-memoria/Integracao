package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ControleEstoque;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ControleEstoque entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ControleEstoqueRepository extends JpaRepository<ControleEstoque, Long> {}
