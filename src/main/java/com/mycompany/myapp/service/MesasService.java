package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Mesas;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Mesas}.
 */
public interface MesasService {
    /**
     * Save a mesas.
     *
     * @param mesas the entity to save.
     * @return the persisted entity.
     */
    Mesas save(Mesas mesas);

    /**
     * Updates a mesas.
     *
     * @param mesas the entity to update.
     * @return the persisted entity.
     */
    Mesas update(Mesas mesas);

    /**
     * Partially updates a mesas.
     *
     * @param mesas the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Mesas> partialUpdate(Mesas mesas);

    /**
     * Get all the mesas.
     *
     * @return the list of entities.
     */
    List<Mesas> findAll();

    /**
     * Get the "id" mesas.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Mesas> findOne(Long id);

    /**
     * Delete the "id" mesas.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
