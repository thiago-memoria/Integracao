package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ParametroFuncionaisCentroCusto;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ParametroFuncionaisCentroCusto entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParametroFuncionaisCentroCustoRepository extends JpaRepository<ParametroFuncionaisCentroCusto, Long> {}
