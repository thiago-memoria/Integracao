package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.AcompanhamentoClinico;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link AcompanhamentoClinico}.
 */
public interface AcompanhamentoClinicoService {
    /**
     * Save a acompanhamentoClinico.
     *
     * @param acompanhamentoClinico the entity to save.
     * @return the persisted entity.
     */
    AcompanhamentoClinico save(AcompanhamentoClinico acompanhamentoClinico);

    /**
     * Updates a acompanhamentoClinico.
     *
     * @param acompanhamentoClinico the entity to update.
     * @return the persisted entity.
     */
    AcompanhamentoClinico update(AcompanhamentoClinico acompanhamentoClinico);

    /**
     * Partially updates a acompanhamentoClinico.
     *
     * @param acompanhamentoClinico the entity to update partially.
     * @return the persisted entity.
     */
    Optional<AcompanhamentoClinico> partialUpdate(AcompanhamentoClinico acompanhamentoClinico);

    /**
     * Get all the acompanhamentoClinicos.
     *
     * @return the list of entities.
     */
    List<AcompanhamentoClinico> findAll();

    /**
     * Get the "id" acompanhamentoClinico.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<AcompanhamentoClinico> findOne(Long id);

    /**
     * Delete the "id" acompanhamentoClinico.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
