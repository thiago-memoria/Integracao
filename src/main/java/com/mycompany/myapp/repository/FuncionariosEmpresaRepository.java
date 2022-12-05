package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.FuncionariosEmpresa;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the FuncionariosEmpresa entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FuncionariosEmpresaRepository extends JpaRepository<FuncionariosEmpresa, Long> {}
