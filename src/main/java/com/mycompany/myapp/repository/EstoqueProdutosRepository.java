package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.EstoqueProdutos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the EstoqueProdutos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EstoqueProdutosRepository extends JpaRepository<EstoqueProdutos, Long> {}
