package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Desconto;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Desconto entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DescontoRepository extends JpaRepository<Desconto, Long> {}
