package com.mycompany.myapp.service;

import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.domain.DicionarioColunas;
import com.mycompany.myapp.domain.DicionarioColunasId;

/**
 * Service Interface for managing {@link DicionarioColunas}.
 */
public interface DicionarioColunasService {
    /**
     * Save a dicionarioColunas.
     *
     * @param dicionarioColunas the entity to save.
     * @return the persisted entity.
     */
    DicionarioColunas save(DicionarioColunas dicionarioColunas);

    /**
     * Updates a dicionarioColunas.
     *
     * @param dicionarioColunas the entity to update.
     * @return the persisted entity.
     */
    DicionarioColunas update(DicionarioColunas dicionarioColunas);

    /**
     * Partially updates a dicionarioColunas.
     *
     * @param dicionarioColunas the entity to update partially.
     * @return the persisted entity.
     */
    Optional<DicionarioColunas> partialUpdate(DicionarioColunas dicionarioColunas);

    /**
     * Get all the dicionarioColunas.
     *
     * @return the list of entities.
     */
    List<DicionarioColunas> findAll();

    /**
     * Get the "id" dicionarioColunas.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DicionarioColunas> findOne(DicionarioColunasId id);

    /**
     * Delete the "id" dicionarioColunas.
     *
     * @param id the id of the entity.
     */
    void delete(DicionarioColunasId id);
}
