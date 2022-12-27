package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.Contadores;
import com.mycompany.myapp.repository.ContadoresRepository;
import com.mycompany.myapp.service.ContadoresService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Contadores}.
 */
@Service
@Transactional
public class ContadoresServiceImpl implements ContadoresService {

    private final Logger log = LoggerFactory.getLogger(ContadoresServiceImpl.class);

    private final ContadoresRepository contadoresRepository;

    public ContadoresServiceImpl(ContadoresRepository contadoresRepository) {
        this.contadoresRepository = contadoresRepository;
    }

    @Override
    public Contadores save(Contadores contadores) {
        log.debug("Request to save Contadores : {}", contadores);
        return contadoresRepository.save(contadores);
    }

    @Override
    public Contadores update(Contadores contadores) {
        log.debug("Request to update Contadores : {}", contadores);
        // no save call needed as we have no fields that can be updated
        return contadores;
    }

    @Override
    public Optional<Contadores> partialUpdate(Contadores contadores) {
        log.debug("Request to partially update Contadores : {}", contadores);

        return contadoresRepository
            .findById(contadores.getId())
            .map(existingContadores -> {
                return existingContadores;
            })// .map(contadoresRepository::save)
        ;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Contadores> findAll() {
        log.debug("Request to get all Contadores");
        return contadoresRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Contadores> findOne(Long id) {
        log.debug("Request to get Contadores : {}", id);
        return contadoresRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Contadores : {}", id);
        contadoresRepository.deleteById(id);
    }
}
