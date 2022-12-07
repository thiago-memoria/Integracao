package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.ParametrosFuncionaisEstacaoTrabalho;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ParametrosFuncionaisEstacaoTrabalho entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ParametrosFuncionaisEstacaoTrabalhoRepository extends JpaRepository<ParametrosFuncionaisEstacaoTrabalho, Long> {}
