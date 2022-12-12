package com.mycompany.myapp.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.domain.AcessoTipoMovimento;
import com.mycompany.myapp.domain.AcessoTipoMovimentoId;

/**
 * Service Interface for managing {@link AcessoTipoMovimento}.
 */
public interface AcessoTipoMovimentoService {
    /**
     * Save a acessoTipoMovimento.
     *
     * @param acessoTipoMovimento the entity to save.
     * @return the persisted entity.
     */
    AcessoTipoMovimento save(AcessoTipoMovimento acessoTipoMovimento);

    /**
     * Updates a acessoTipoMovimento.
     *
     * @param acessoTipoMovimento the entity to update.
     * @return the persisted entity.
     */
    AcessoTipoMovimento update(AcessoTipoMovimento acessoTipoMovimento);

    /**
     * Partially updates a acessoTipoMovimento.
     *
     * @param acessoTipoMovimento the entity to update partially.
     * @return the persisted entity.
     */
    Optional<AcessoTipoMovimento> partialUpdate(AcessoTipoMovimento acessoTipoMovimento);

    /**
     * Get all the acessoTipoMovimentos.
     *
     * @return the list of entities.
     */
    List<AcessoTipoMovimento> findAll();

    /**
     * Get the "id" acessoTipoMovimento.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AcessoTipoMovimento> findOne(AcessoTipoMovimentoId id);

    /**
     * Delete the "id" acessoTipoMovimento.
     *
     * @param id the id of the entity.
     */
    void delete(AcessoTipoMovimentoId id);
}
