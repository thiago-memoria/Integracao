package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.DenominacaoFarmacos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DenominacaoFarmacos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DenominacaoFarmacosRepository extends JpaRepository<DenominacaoFarmacos, Long> {}
