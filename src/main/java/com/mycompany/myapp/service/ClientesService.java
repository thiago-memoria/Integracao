package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Clientes;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link Clientes}.
 */
public interface ClientesService {
    /**
     * Save a clientes.
     *
     * @param clientes the entity to save.
     * @return the persisted entity.
     */
    Clientes save(Clientes clientes);

    /**
     * Updates a clientes.
     *
     * @param clientes the entity to update.
     * @return the persisted entity.
     */
    Clientes update(Clientes clientes);

    /**
     * Partially updates a clientes.
     *
     * @param clientes the entity to update partially.
     * @return the persisted entity.
     */
    Optional<Clientes> partialUpdate(Clientes clientes);

    /**
     * Get all the clientes.
     *
     * @return the list of entities.
     */
    List<Clientes> findAll();

    /**
     * Get the "id" clientes.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<Clientes> findOne(Long id);

    /**
     * Delete the "id" clientes.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
