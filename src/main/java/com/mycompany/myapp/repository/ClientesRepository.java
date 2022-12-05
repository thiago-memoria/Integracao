package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Clientes;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Clientes entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {}
