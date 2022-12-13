package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.EmpresasConvenioClientes;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link EmpresasConvenioClientes}.
 */
public interface EmpresasConvenioClientesService {
    /**
     * Save a empresasConvenioClientes.
     *
     * @param empresasConvenioClientes the entity to save.
     * @return the persisted entity.
     */
    EmpresasConvenioClientes save(EmpresasConvenioClientes empresasConvenioClientes);

    /**
     * Updates a empresasConvenioClientes.
     *
     * @param empresasConvenioClientes the entity to update.
     * @return the persisted entity.
     */
    EmpresasConvenioClientes update(EmpresasConvenioClientes empresasConvenioClientes);

    /**
     * Partially updates a empresasConvenioClientes.
     *
     * @param empresasConvenioClientes the entity to update partially.
     * @return the persisted entity.
     */
    Optional<EmpresasConvenioClientes> partialUpdate(EmpresasConvenioClientes empresasConvenioClientes);

    /**
     * Get all the empresasConvenioClientes.
     *
     * @return the list of entities.
     */
    List<EmpresasConvenioClientes> findAll();

    /**
     * Get the "id" empresasConvenioClientes.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<EmpresasConvenioClientes> findOne(Long id);

    /**
     * Delete the "id" empresasConvenioClientes.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
