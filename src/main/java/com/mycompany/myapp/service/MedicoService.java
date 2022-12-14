package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Medico;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Medico}.
 */
public interface MedicoService {
    /**
     * Save a medico.
     *
     * @param medico the entity to save.
     * @return the persisted entity.
     */
    Medico save(Medico medico);

    /**
     * Updates a medico.
     *
     * @param medico the entity to update.
     * @return the persisted entity.
     */
    Medico update(Medico medico);

    /**
     * Partially updates a medico.
     *
     * @param medico the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Medico> partialUpdate(Medico medico);

    /**
     * Get all the medicos.
     *
     * @return the list of entities.
     */
    List<Medico> findAll();

    /**
     * Get the "id" medico.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Medico> findOne(Long id);

    /**
     * Delete the "id" medico.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
