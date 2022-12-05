package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.InformacoesInventario;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the InformacoesInventario entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InformacoesInventarioRepository extends JpaRepository<InformacoesInventario, Long> {}
