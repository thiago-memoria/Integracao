package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.EspecialidadesMedicas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the EspecialidadesMedicas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EspecialidadesMedicasRepository extends JpaRepository<EspecialidadesMedicas, Long> {}
