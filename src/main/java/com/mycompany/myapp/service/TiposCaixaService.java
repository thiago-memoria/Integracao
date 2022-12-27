package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.TiposCaixa;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link TiposCaixa}.
 */
public interface TiposCaixaService {
    /**
     * Save a tiposCaixa.
     *
     * @param tiposCaixa the entity to save.
     * @return the persisted entity.
     */
    TiposCaixa save(TiposCaixa tiposCaixa);

    /**
     * Updates a tiposCaixa.
     *
     * @param tiposCaixa the entity to update.
     * @return the persisted entity.
     */
    TiposCaixa update(TiposCaixa tiposCaixa);

    /**
     * Partially updates a tiposCaixa.
     *
     * @param tiposCaixa the entity to update partially.
     * @return the persisted entity.
     */
    Optional<TiposCaixa> partialUpdate(TiposCaixa tiposCaixa);

    /**
     * Get all the tiposCaixas.
     *
     * @return the list of entities.
     */
    List<TiposCaixa> findAll();

    /**
     * Get the "id" tiposCaixa.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<TiposCaixa> findOne(Long id);

    /**
     * Delete the "id" tiposCaixa.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
