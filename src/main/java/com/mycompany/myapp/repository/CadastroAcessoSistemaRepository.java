package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.CadastroAcessoSistema;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the CadastroAcessoSistema entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CadastroAcessoSistemaRepository extends JpaRepository<CadastroAcessoSistema, Long> {}
