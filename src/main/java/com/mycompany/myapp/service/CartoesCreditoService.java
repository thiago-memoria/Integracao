package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.CartoesCredito;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link CartoesCredito}.
 */
public interface CartoesCreditoService {
    /**
     * Save a cartoesCredito.
     *
     * @param cartoesCredito the entity to save.
     * @return the persisted entity.
     */
    CartoesCredito save(CartoesCredito cartoesCredito);

    /**
     * Updates a cartoesCredito.
     *
     * @param cartoesCredito the entity to update.
     * @return the persisted entity.
     */
    CartoesCredito update(CartoesCredito cartoesCredito);

    /**
     * Partially updates a cartoesCredito.
     *
     * @param cartoesCredito the entity to update partially.
     * @return the persisted entity.
     */
    Optional<CartoesCredito> partialUpdate(CartoesCredito cartoesCredito);

    /**
     * Get all the cartoesCreditos.
     *
     * @return the list of entities.
     */
    List<CartoesCredito> findAll();

    /**
     * Get the "id" cartoesCredito.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<CartoesCredito> findOne(Long id);

    /**
     * Delete the "id" cartoesCredito.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
