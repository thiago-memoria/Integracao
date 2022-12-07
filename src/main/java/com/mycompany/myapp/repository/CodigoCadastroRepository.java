package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.CodigoCadastro;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the CodigoCadastro entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CodigoCadastroRepository extends JpaRepository<CodigoCadastro, Long> {}
