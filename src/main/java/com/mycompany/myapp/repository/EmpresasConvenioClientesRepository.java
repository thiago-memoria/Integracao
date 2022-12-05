package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.EmpresasConvenioClientes;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the EmpresasConvenioClientes entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EmpresasConvenioClientesRepository extends JpaRepository<EmpresasConvenioClientes, Long> {}
