package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.EquipamentosEmissaoCuponsFiscais;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link EquipamentosEmissaoCuponsFiscais}.
 */
public interface EquipamentosEmissaoCuponsFiscaisService {
    /**
     * Save a equipamentosEmissaoCuponsFiscais.
     *
     * @param equipamentosEmissaoCuponsFiscais the entity to save.
     * @return the persisted entity.
     */
    EquipamentosEmissaoCuponsFiscais save(EquipamentosEmissaoCuponsFiscais equipamentosEmissaoCuponsFiscais);

    /**
     * Updates a equipamentosEmissaoCuponsFiscais.
     *
     * @param equipamentosEmissaoCuponsFiscais the entity to update.
     * @return the persisted entity.
     */
    EquipamentosEmissaoCuponsFiscais update(EquipamentosEmissaoCuponsFiscais equipamentosEmissaoCuponsFiscais);

    /**
     * Partially updates a equipamentosEmissaoCuponsFiscais.
     *
     * @param equipamentosEmissaoCuponsFiscais the entity to update partially.
     * @return the persisted entity.
     */
    Optional<EquipamentosEmissaoCuponsFiscais> partialUpdate(EquipamentosEmissaoCuponsFiscais equipamentosEmissaoCuponsFiscais);

    /**
     * Get all the equipamentosEmissaoCuponsFiscais.
     *
     * @return the list of entities.
     */
    List<EquipamentosEmissaoCuponsFiscais> findAll();

    /**
     * Get the "id" equipamentosEmissaoCuponsFiscais.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<EquipamentosEmissaoCuponsFiscais> findOne(Long id);

    /**
     * Delete the "id" equipamentosEmissaoCuponsFiscais.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
