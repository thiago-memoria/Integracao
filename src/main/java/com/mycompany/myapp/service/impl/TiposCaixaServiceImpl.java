package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.TiposCaixa;
import com.mycompany.myapp.repository.TiposCaixaRepository;
import com.mycompany.myapp.service.TiposCaixaService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link TiposCaixa}.
 */
@Service
@Transactional
public class TiposCaixaServiceImpl implements TiposCaixaService {

    private final Logger log = LoggerFactory.getLogger(TiposCaixaServiceImpl.class);

    private final TiposCaixaRepository tiposCaixaRepository;

    public TiposCaixaServiceImpl(TiposCaixaRepository tiposCaixaRepository) {
        this.tiposCaixaRepository = tiposCaixaRepository;
    }

    @Override
    public TiposCaixa save(TiposCaixa tiposCaixa) {
        log.debug("Request to save TiposCaixa : {}", tiposCaixa);
        return tiposCaixaRepository.save(tiposCaixa);
    }

    @Override
    public TiposCaixa update(TiposCaixa tiposCaixa) {
        log.debug("Request to update TiposCaixa : {}", tiposCaixa);
        // no save call needed as we have no fields that can be updated
        return tiposCaixa;
    }

    @Override
    public Optional<TiposCaixa> partialUpdate(TiposCaixa tiposCaixa) {
        log.debug("Request to partially update TiposCaixa : {}", tiposCaixa);

        return tiposCaixaRepository
            .findById(tiposCaixa.getId())
            .map(existingTiposCaixa -> {
                return existingTiposCaixa;
            })// .map(tiposCaixaRepository::save)
        ;
    }

    @Override
    @Transactional(readOnly = true)
    public List<TiposCaixa> findAll() {
        log.debug("Request to get all TiposCaixas");
        return tiposCaixaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<TiposCaixa> findOne(Long id) {
        log.debug("Request to get TiposCaixa : {}", id);
        return tiposCaixaRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete TiposCaixa : {}", id);
        tiposCaixaRepository.deleteById(id);
    }
}
