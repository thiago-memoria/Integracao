package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.TotalMensalProdutos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the TotalMensalProdutos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TotalMensalProdutosRepository extends JpaRepository<TotalMensalProdutos, Long> {}
