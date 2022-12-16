package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.EquipamentosPagamento;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing {@link EquipamentosPagamento}.
 */
public interface EquipamentosPagamentoService {
    /**
     * Save a equipamentosPagamento.
     *
     * @param equipamentosPagamento the entity to save.
     * @return the persisted entity.
     */
    EquipamentosPagamento save(EquipamentosPagamento equipamentosPagamento);

    /**
     * Updates a equipamentosPagamento.
     *
     * @param equipamentosPagamento the entity to update.
     * @return the persisted entity.
     */
    EquipamentosPagamento update(EquipamentosPagamento equipamentosPagamento);

    /**
     * Partially updates a equipamentosPagamento.
     *
     * @param equipamentosPagamento the entity to update partially.
     * @return the persisted entity.
     */
    Optional<EquipamentosPagamento> partialUpdate(EquipamentosPagamento equipamentosPagamento);

    /**
     * Get all the equipamentosPagamentos.
     *
     * @return the list of entities.
     */
    List<EquipamentosPagamento> findAll();

    /**
     * Get the "id" equipamentosPagamento.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<EquipamentosPagamento> findOne(Long id);

    /**
     * Delete the "id" equipamentosPagamento.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
