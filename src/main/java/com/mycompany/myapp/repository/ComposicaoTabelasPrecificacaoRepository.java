package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ComposicaoTabelasPrecificacao;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ComposicaoTabelasPrecificacao entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ComposicaoTabelasPrecificacaoRepository extends JpaRepository<ComposicaoTabelasPrecificacao, Long> {}
