package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ControleEstoquePremios;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ControleEstoquePremios entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ControleEstoquePremiosRepository extends JpaRepository<ControleEstoquePremios, Long> {}
