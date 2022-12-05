package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.TiposCaixa;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TiposCaixa entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TiposCaixaRepository extends JpaRepository<TiposCaixa, Long> {}
