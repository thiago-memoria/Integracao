package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.GrupoProdutos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the GrupoProdutos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface GrupoProdutosRepository extends JpaRepository<GrupoProdutos, Long> {}
