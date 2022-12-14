package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.EspecialidadesMedicas;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link EspecialidadesMedicas}.
 */
public interface EspecialidadesMedicasService {
    /**
     * Save a especialidadesMedicas.
     *
     * @param especialidadesMedicas the entity to save.
     * @return the persisted entity.
     */
    EspecialidadesMedicas save(EspecialidadesMedicas especialidadesMedicas);

    /**
     * Updates a especialidadesMedicas.
     *
     * @param especialidadesMedicas the entity to update.
     * @return the persisted entity.
     */
    EspecialidadesMedicas update(EspecialidadesMedicas especialidadesMedicas);

    /**
     * Partially updates a especialidadesMedicas.
     *
     * @param especialidadesMedicas the entity to update partially.
     * @return the persisted entity.
     */
    Optional<EspecialidadesMedicas> partialUpdate(EspecialidadesMedicas especialidadesMedicas);

    /**
     * Get all the especialidadesMedicas.
     *
     * @return the list of entities.
     */
    List<EspecialidadesMedicas> findAll();

    /**
     * Get the "id" especialidadesMedicas.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<EspecialidadesMedicas> findOne(Long id);

    /**
     * Delete the "id" especialidadesMedicas.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
