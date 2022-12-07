package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.CadastroLojas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the CadastroLojas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CadastroLojasRepository extends JpaRepository<CadastroLojas, Long> {}
