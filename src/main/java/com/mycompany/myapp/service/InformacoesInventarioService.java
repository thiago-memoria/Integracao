package com.mycompany.myapp.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.domain.InformacoesInventario;
import com.mycompany.myapp.domain.InformacoesInventarioId;

/**
 * Service Interface for managing {@link InformacoesInventario}.
 */
public interface InformacoesInventarioService {
    /**
     * Save a informacoesInventario.
     *
     * @param informacoesInventario the entity to save.
     * @return the persisted entity.
     */
    InformacoesInventario save(InformacoesInventario informacoesInventario);

    /**
     * Updates a informacoesInventario.
     *
     * @param informacoesInventario the entity to update.
     * @return the persisted entity.
     */
    InformacoesInventario update(InformacoesInventario informacoesInventario);

    /**
     * Partially updates a informacoesInventario.
     *
     * @param informacoesInventario the entity to update partially.
     * @return the persisted entity.
     */
    Optional<InformacoesInventario> partialUpdate(InformacoesInventario informacoesInventario);

    /**
     * Get all the informacoesInventarios.
     *
     * @return the list of entities.
     */
    List<InformacoesInventario> findAll();

    /**
     * Get the "id" informacoesInventario.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<InformacoesInventario> findOne(InformacoesInventarioId id);

    /**
     * Delete the "id" informacoesInventario.
     *
     * @param id the id of the entity.
     */
    void delete(InformacoesInventarioId id);
}
