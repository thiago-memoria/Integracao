package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.EquipamentosEmissaoCuponsFiscais;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the EquipamentosEmissaoCuponsFiscais entity.
 */
@SuppressWarnings("unused")
@Repository
public interface EquipamentosEmissaoCuponsFiscaisRepository extends JpaRepository<EquipamentosEmissaoCuponsFiscais, Long> {}
