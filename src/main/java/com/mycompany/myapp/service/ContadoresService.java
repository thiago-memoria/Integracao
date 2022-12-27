package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Contadores;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Contadores}.
 */
public interface ContadoresService {
    /**
     * Save a contadores.
     *
     * @param contadores the entity to save.
     * @return the persisted entity.
     */
    Contadores save(Contadores contadores);

    /**
     * Updates a contadores.
     *
     * @param contadores the entity to update.
     * @return the persisted entity.
     */
    Contadores update(Contadores contadores);

    /**
     * Partially updates a contadores.
     *
     * @param contadores the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Contadores> partialUpdate(Contadores contadores);

    /**
     * Get all the contadores.
     *
     * @return the list of entities.
     */
    List<Contadores> findAll();

    /**
     * Get the "id" contadores.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Contadores> findOne(Long id);

    /**
     * Delete the "id" contadores.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
