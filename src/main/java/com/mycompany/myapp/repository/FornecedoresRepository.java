package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Fornecedores;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Fornecedores entity.
 */
@SuppressWarnings("unused")
@Repository
public interface FornecedoresRepository extends JpaRepository<Fornecedores, Long> {}
