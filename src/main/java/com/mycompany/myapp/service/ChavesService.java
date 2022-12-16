package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Chaves;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Chaves}.
 */
public interface ChavesService {
    /**
     * Save a chaves.
     *
     * @param chaves the entity to save.
     * @return the persisted entity.
     */
    Chaves save(Chaves chaves);

    /**
     * Updates a chaves.
     *
     * @param chaves the entity to update.
     * @return the persisted entity.
     */
    Chaves update(Chaves chaves);

    /**
     * Partially updates a chaves.
     *
     * @param chaves the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Chaves> partialUpdate(Chaves chaves);

    /**
     * Get all the chaves.
     *
     * @return the list of entities.
     */
    List<Chaves> findAll();

    /**
     * Get the "id" chaves.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Chaves> findOne(Long id);

    /**
     * Delete the "id" chaves.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
