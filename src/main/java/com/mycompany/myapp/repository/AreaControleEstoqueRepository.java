package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AreaControleEstoque;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AreaControleEstoque entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AreaControleEstoqueRepository extends JpaRepository<AreaControleEstoque, Long> {}
