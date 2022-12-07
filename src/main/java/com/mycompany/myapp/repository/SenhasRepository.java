package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Senhas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Senhas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SenhasRepository extends JpaRepository<Senhas, Long> {}
