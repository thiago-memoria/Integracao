package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.CodigoOperacaoDocumentos;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link CodigoOperacaoDocumentos}.
 */
public interface CodigoOperacaoDocumentosService {
    /**
     * Save a codigoOperacaoDocumentos.
     *
     * @param codigoOperacaoDocumentos the entity to save.
     * @return the persisted entity.
     */
    CodigoOperacaoDocumentos save(CodigoOperacaoDocumentos codigoOperacaoDocumentos);

    /**
     * Updates a codigoOperacaoDocumentos.
     *
     * @param codigoOperacaoDocumentos the entity to update.
     * @return the persisted entity.
     */
    CodigoOperacaoDocumentos update(CodigoOperacaoDocumentos codigoOperacaoDocumentos);

    /**
     * Partially updates a codigoOperacaoDocumentos.
     *
     * @param codigoOperacaoDocumentos the entity to update partially.
     * @return the persisted entity.
     */
    Optional<CodigoOperacaoDocumentos> partialUpdate(CodigoOperacaoDocumentos codigoOperacaoDocumentos);

    /**
     * Get all the codigoOperacaoDocumentos.
     *
     * @return the list of entities.
     */
    List<CodigoOperacaoDocumentos> findAll();

    /**
     * Get the "id" codigoOperacaoDocumentos.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<CodigoOperacaoDocumentos> findOne(Long id);

    /**
     * Delete the "id" codigoOperacaoDocumentos.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
