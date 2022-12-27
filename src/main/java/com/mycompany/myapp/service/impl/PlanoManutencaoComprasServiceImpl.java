package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.PlanoManutencaoCompras;
import com.mycompany.myapp.repository.PlanoManutencaoComprasRepository;
import com.mycompany.myapp.service.PlanoManutencaoComprasService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link PlanoManutencaoCompras}.
 */
@Service
@Transactional
public class PlanoManutencaoComprasServiceImpl implements PlanoManutencaoComprasService {

    private final Logger log = LoggerFactory.getLogger(PlanoManutencaoComprasServiceImpl.class);

    private final PlanoManutencaoComprasRepository planoManutencaoComprasRepository;

    public PlanoManutencaoComprasServiceImpl(PlanoManutencaoComprasRepository planoManutencaoComprasRepository) {
        this.planoManutencaoComprasRepository = planoManutencaoComprasRepository;
    }

    @Override
    public PlanoManutencaoCompras save(PlanoManutencaoCompras planoManutencaoCompras) {
        log.debug("Request to save PlanoManutencaoCompras : {}", planoManutencaoCompras);
        return planoManutencaoComprasRepository.save(planoManutencaoCompras);
    }

    @Override
    public PlanoManutencaoCompras update(PlanoManutencaoCompras planoManutencaoCompras) {
        log.debug("Request to update PlanoManutencaoCompras : {}", planoManutencaoCompras);
        return planoManutencaoComprasRepository.save(planoManutencaoCompras);
    }

    @Override
    public Optional<PlanoManutencaoCompras> partialUpdate(PlanoManutencaoCompras planoManutencaoCompras) {
        log.debug("Request to partially update PlanoManutencaoCompras : {}", planoManutencaoCompras);

        return planoManutencaoComprasRepository
            .findById(planoManutencaoCompras.getId())
            .map(existingPlanoManutencaoCompras -> {
                if (planoManutencaoCompras.getCla_per() != null) {
                    existingPlanoManutencaoCompras.setCla_per(planoManutencaoCompras.getCla_per());
                }
                if (planoManutencaoCompras.getCla_dia() != null) {
                    existingPlanoManutencaoCompras.setCla_dia(planoManutencaoCompras.getCla_dia());
                }
                if (planoManutencaoCompras.getMoviment() != null) {
                    existingPlanoManutencaoCompras.setMoviment(planoManutencaoCompras.getMoviment());
                }
                if (planoManutencaoCompras.getCad_dat() != null) {
                    existingPlanoManutencaoCompras.setCad_dat(planoManutencaoCompras.getCad_dat());
                }

                return existingPlanoManutencaoCompras;
            })
            .map(planoManutencaoComprasRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PlanoManutencaoCompras> findAll() {
        log.debug("Request to get all PlanoManutencaoCompras");
        return planoManutencaoComprasRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<PlanoManutencaoCompras> findOne(Long id) {
        log.debug("Request to get PlanoManutencaoCompras : {}", id);
        return planoManutencaoComprasRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete PlanoManutencaoCompras : {}", id);
        planoManutencaoComprasRepository.deleteById(id);
    }
}
