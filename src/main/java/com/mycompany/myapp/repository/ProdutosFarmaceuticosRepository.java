package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ProdutosFarmaceuticos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ProdutosFarmaceuticos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProdutosFarmaceuticosRepository extends JpaRepository<ProdutosFarmaceuticos, Long> {}
