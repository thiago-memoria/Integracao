package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.CodigoOperacaoDocumentos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the CodigoOperacaoDocumentos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface CodigoOperacaoDocumentosRepository extends JpaRepository<CodigoOperacaoDocumentos, Long> {}
