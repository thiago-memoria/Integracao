package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.EquipamentosPagamento;
import com.mycompany.myapp.repository.EquipamentosPagamentoRepository;
import com.mycompany.myapp.service.EquipamentosPagamentoService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link EquipamentosPagamento}.
 */
@Service
@Transactional
public class EquipamentosPagamentoServiceImpl implements EquipamentosPagamentoService {

    private final Logger log = LoggerFactory.getLogger(EquipamentosPagamentoServiceImpl.class);

    private final EquipamentosPagamentoRepository equipamentosPagamentoRepository;

    public EquipamentosPagamentoServiceImpl(EquipamentosPagamentoRepository equipamentosPagamentoRepository) {
        this.equipamentosPagamentoRepository = equipamentosPagamentoRepository;
    }

    @Override
    public EquipamentosPagamento save(EquipamentosPagamento equipamentosPagamento) {
        log.debug("Request to save EquipamentosPagamento : {}", equipamentosPagamento);
        return equipamentosPagamentoRepository.save(equipamentosPagamento);
    }

    @Override
    public EquipamentosPagamento update(EquipamentosPagamento equipamentosPagamento) {
        log.debug("Request to update EquipamentosPagamento : {}", equipamentosPagamento);
        return equipamentosPagamentoRepository.save(equipamentosPagamento);
    }

    @Override
    public Optional<EquipamentosPagamento> partialUpdate(EquipamentosPagamento equipamentosPagamento) {
        log.debug("Request to partially update EquipamentosPagamento : {}", equipamentosPagamento);

        return equipamentosPagamentoRepository
            .findById(equipamentosPagamento.getId())
            .map(existingEquipamentosPagamento -> {
                if (equipamentosPagamento.getPos_nom() != null) {
                    existingEquipamentosPagamento.setPos_nom(equipamentosPagamento.getPos_nom());
                }
                if (equipamentosPagamento.getPos_ser() != null) {
                    existingEquipamentosPagamento.setPos_ser(equipamentosPagamento.getPos_ser());
                }
                if (equipamentosPagamento.getPos_adq() != null) {
                    existingEquipamentosPagamento.setPos_adq(equipamentosPagamento.getPos_adq());
                }
                if (equipamentosPagamento.getPos_est() != null) {
                    existingEquipamentosPagamento.setPos_est(equipamentosPagamento.getPos_est());
                }
                if (equipamentosPagamento.getPos_cgc() != null) {
                    existingEquipamentosPagamento.setPos_cgc(equipamentosPagamento.getPos_cgc());
                }
                if (equipamentosPagamento.getPos_cav() != null) {
                    existingEquipamentosPagamento.setPos_cav(equipamentosPagamento.getPos_cav());
                }
                if (equipamentosPagamento.getPos_chr() != null) {
                    existingEquipamentosPagamento.setPos_chr(equipamentosPagamento.getPos_chr());
                }
                if (equipamentosPagamento.getCad_dat() != null) {
                    existingEquipamentosPagamento.setCad_dat(equipamentosPagamento.getCad_dat());
                }
                if (equipamentosPagamento.getCad_fun() != null) {
                    existingEquipamentosPagamento.setCad_fun(equipamentosPagamento.getCad_fun());
                }

                return existingEquipamentosPagamento;
            })
            .map(equipamentosPagamentoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EquipamentosPagamento> findAll() {
        log.debug("Request to get all EquipamentosPagamentos");
        return equipamentosPagamentoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EquipamentosPagamento> findOne(Long id) {
        log.debug("Request to get EquipamentosPagamento : {}", id);
        return equipamentosPagamentoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete EquipamentosPagamento : {}", id);
        equipamentosPagamentoRepository.deleteById(id);
    }
}
