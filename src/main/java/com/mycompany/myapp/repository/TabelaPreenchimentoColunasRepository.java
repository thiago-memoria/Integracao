package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.TabelaPreenchimentoColunas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the TabelaPreenchimentoColunas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TabelaPreenchimentoColunasRepository extends JpaRepository<TabelaPreenchimentoColunas, Long> {}
