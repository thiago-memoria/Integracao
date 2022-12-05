package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AutorizacaoImpressaoDocumentos;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the AutorizacaoImpressaoDocumentos entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AutorizacaoImpressaoDocumentosRepository extends JpaRepository<AutorizacaoImpressaoDocumentos, Long> {}
