package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ControleMovimentacaoProdutos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ControleMovimentacaoProdutos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ControleMovimentacaoProdutosRepository extends JpaRepository<ControleMovimentacaoProdutos, Long> {}
