package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.SubgrupoProdutos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the SubgrupoProdutos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SubgrupoProdutosRepository extends JpaRepository<SubgrupoProdutos, Long> {}
