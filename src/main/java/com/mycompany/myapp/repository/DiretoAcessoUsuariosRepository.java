package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.DiretoAcessoUsuarios;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DiretoAcessoUsuarios entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DiretoAcessoUsuariosRepository extends JpaRepository<DiretoAcessoUsuarios, Long> {}
