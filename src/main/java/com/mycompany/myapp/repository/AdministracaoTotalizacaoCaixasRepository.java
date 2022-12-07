package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AdministracaoTotalizacaoCaixas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AdministracaoTotalizacaoCaixas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AdministracaoTotalizacaoCaixasRepository extends JpaRepository<AdministracaoTotalizacaoCaixas, Long> {}
