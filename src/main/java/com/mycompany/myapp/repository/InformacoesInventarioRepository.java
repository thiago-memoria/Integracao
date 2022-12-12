package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.InformacoesInventario;
import com.mycompany.myapp.domain.InformacoesInventarioId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the InformacoesInventario entity.
 */
@Repository
public interface InformacoesInventarioRepository extends JpaRepository<InformacoesInventario, InformacoesInventarioId> {
}
