package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.CartoesCredito;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the CartoesCredito entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CartoesCreditoRepository extends JpaRepository<CartoesCredito, Long> {}
