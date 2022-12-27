package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Desconto;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Desconto}.
 */
public interface DescontoService {
    /**
     * Save a desconto.
     *
     * @param desconto the entity to save.
     * @return the persisted entity.
     */
    Desconto save(Desconto desconto);

    /**
     * Updates a desconto.
     *
     * @param desconto the entity to update.
     * @return the persisted entity.
     */
    Desconto update(Desconto desconto);

    /**
     * Partially updates a desconto.
     *
     * @param desconto the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Desconto> partialUpdate(Desconto desconto);

    /**
     * Get all the descontos.
     *
     * @return the list of entities.
     */
    List<Desconto> findAll();

    /**
     * Get the "id" desconto.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Desconto> findOne(Long id);

    /**
     * Delete the "id" desconto.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
