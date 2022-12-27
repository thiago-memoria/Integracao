package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.PlanoManutencaoCompras;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link PlanoManutencaoCompras}.
 */
public interface PlanoManutencaoComprasService {
    /**
     * Save a planoManutencaoCompras.
     *
     * @param planoManutencaoCompras the entity to save.
     * @return the persisted entity.
     */
    PlanoManutencaoCompras save(PlanoManutencaoCompras planoManutencaoCompras);

    /**
     * Updates a planoManutencaoCompras.
     *
     * @param planoManutencaoCompras the entity to update.
     * @return the persisted entity.
     */
    PlanoManutencaoCompras update(PlanoManutencaoCompras planoManutencaoCompras);

    /**
     * Partially updates a planoManutencaoCompras.
     *
     * @param planoManutencaoCompras the entity to update partially.
     * @return the persisted entity.
     */
    Optional<PlanoManutencaoCompras> partialUpdate(PlanoManutencaoCompras planoManutencaoCompras);

    /**
     * Get all the planoManutencaoCompras.
     *
     * @return the list of entities.
     */
    List<PlanoManutencaoCompras> findAll();

    /**
     * Get the "id" planoManutencaoCompras.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<PlanoManutencaoCompras> findOne(Long id);

    /**
     * Delete the "id" planoManutencaoCompras.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
