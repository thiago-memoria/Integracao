package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.DenominacaoFarmacos;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link DenominacaoFarmacos}.
 */
public interface DenominacaoFarmacosService {
    /**
     * Save a denominacaoFarmacos.
     *
     * @param denominacaoFarmacos the entity to save.
     * @return the persisted entity.
     */
    DenominacaoFarmacos save(DenominacaoFarmacos denominacaoFarmacos);

    /**
     * Updates a denominacaoFarmacos.
     *
     * @param denominacaoFarmacos the entity to update.
     * @return the persisted entity.
     */
    DenominacaoFarmacos update(DenominacaoFarmacos denominacaoFarmacos);

    /**
     * Partially updates a denominacaoFarmacos.
     *
     * @param denominacaoFarmacos the entity to update partially.
     * @return the persisted entity.
     */
    Optional<DenominacaoFarmacos> partialUpdate(DenominacaoFarmacos denominacaoFarmacos);

    /**
     * Get all the denominacaoFarmacos.
     *
     * @return the list of entities.
     */
    List<DenominacaoFarmacos> findAll();

    /**
     * Get the "id" denominacaoFarmacos.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DenominacaoFarmacos> findOne(Long id);

    /**
     * Delete the "id" denominacaoFarmacos.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
