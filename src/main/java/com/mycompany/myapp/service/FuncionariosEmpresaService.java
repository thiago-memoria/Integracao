package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.FuncionariosEmpresa;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link FuncionariosEmpresa}.
 */
public interface FuncionariosEmpresaService {
    /**
     * Save a funcionariosEmpresa.
     *
     * @param funcionariosEmpresa the entity to save.
     * @return the persisted entity.
     */
    FuncionariosEmpresa save(FuncionariosEmpresa funcionariosEmpresa);

    /**
     * Updates a funcionariosEmpresa.
     *
     * @param funcionariosEmpresa the entity to update.
     * @return the persisted entity.
     */
    FuncionariosEmpresa update(FuncionariosEmpresa funcionariosEmpresa);

    /**
     * Partially updates a funcionariosEmpresa.
     *
     * @param funcionariosEmpresa the entity to update partially.
     * @return the persisted entity.
     */
    Optional<FuncionariosEmpresa> partialUpdate(FuncionariosEmpresa funcionariosEmpresa);

    /**
     * Get all the funcionariosEmpresas.
     *
     * @return the list of entities.
     */
    List<FuncionariosEmpresa> findAll();

    /**
     * Get the "id" funcionariosEmpresa.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<FuncionariosEmpresa> findOne(Long id);

    /**
     * Delete the "id" funcionariosEmpresa.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
