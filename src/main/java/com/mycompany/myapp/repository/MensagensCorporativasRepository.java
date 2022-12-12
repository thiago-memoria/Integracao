package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.MensagensCorporativas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the MensagensCorporativas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MensagensCorporativasRepository extends JpaRepository<MensagensCorporativas, Long> {}
