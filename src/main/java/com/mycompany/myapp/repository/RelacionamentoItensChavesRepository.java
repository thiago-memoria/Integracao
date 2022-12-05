package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.RelacionamentoItensChaves;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the RelacionamentoItensChaves entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RelacionamentoItensChavesRepository extends JpaRepository<RelacionamentoItensChaves, Long> {}
