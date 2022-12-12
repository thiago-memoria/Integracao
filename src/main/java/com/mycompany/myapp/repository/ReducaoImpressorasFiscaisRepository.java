package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ReducaoImpressorasFiscais;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ReducaoImpressorasFiscais entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ReducaoImpressorasFiscaisRepository extends JpaRepository<ReducaoImpressorasFiscais, Long> {}
