package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.AutorizacaoImpressaoDocumentos;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link AutorizacaoImpressaoDocumentos}.
 */
public interface AutorizacaoImpressaoDocumentosService {
    /**
     * Save a autorizacaoImpressaoDocumentos.
     *
     * @param autorizacaoImpressaoDocumentos the entity to save.
     * @return the persisted entity.
     */
    AutorizacaoImpressaoDocumentos save(AutorizacaoImpressaoDocumentos autorizacaoImpressaoDocumentos);

    /**
     * Updates a autorizacaoImpressaoDocumentos.
     *
     * @param autorizacaoImpressaoDocumentos the entity to update.
     * @return the persisted entity.
     */
    AutorizacaoImpressaoDocumentos update(AutorizacaoImpressaoDocumentos autorizacaoImpressaoDocumentos);

    /**
     * Partially updates a autorizacaoImpressaoDocumentos.
     *
     * @param autorizacaoImpressaoDocumentos the entity to update partially.
     * @return the persisted entity.
     */
    Optional<AutorizacaoImpressaoDocumentos> partialUpdate(AutorizacaoImpressaoDocumentos autorizacaoImpressaoDocumentos);

    /**
     * Get all the autorizacaoImpressaoDocumentos.
     *
     * @return the list of entities.
     */
    List<AutorizacaoImpressaoDocumentos> findAll();

    /**
     * Get the "id" autorizacaoImpressaoDocumentos.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AutorizacaoImpressaoDocumentos> findOne(Long id);

    /**
     * Delete the "id" autorizacaoImpressaoDocumentos.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
