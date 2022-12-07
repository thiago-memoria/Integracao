package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.IdentifcacaoTabelasPrecificacao;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the IdentifcacaoTabelasPrecificacao entity.
 */
@SuppressWarnings("unused")
@Repository
public interface IdentifcacaoTabelasPrecificacaoRepository extends JpaRepository<IdentifcacaoTabelasPrecificacao, Long> {}
