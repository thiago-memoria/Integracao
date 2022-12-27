package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.Chaves;
import com.mycompany.myapp.repository.ChavesRepository;
import com.mycompany.myapp.service.ChavesService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Chaves}.
 */
@Service
@Transactional
public class ChavesServiceImpl implements ChavesService {

    private final Logger log = LoggerFactory.getLogger(ChavesServiceImpl.class);

    private final ChavesRepository chavesRepository;

    public ChavesServiceImpl(ChavesRepository chavesRepository) {
        this.chavesRepository = chavesRepository;
    }

    @Override
    public Chaves save(Chaves chaves) {
        log.debug("Request to save Chaves : {}", chaves);
        return chavesRepository.save(chaves);
    }

    @Override
    public Chaves update(Chaves chaves) {
        log.debug("Request to update Chaves : {}", chaves);
        return chavesRepository.save(chaves);
    }

    @Override
    public Optional<Chaves> partialUpdate(Chaves chaves) {
        log.debug("Request to partially update Chaves : {}", chaves);

        return chavesRepository
            .findById(chaves.getId())
            .map(existingChaves -> {
                if (chaves.getCha_nom() != null) {
                    existingChaves.setCha_nom(chaves.getCha_nom());
                }
                if (chaves.getCha_abr() != null) {
                    existingChaves.setCha_abr(chaves.getCha_abr());
                }

                return existingChaves;
            })
            .map(chavesRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Chaves> findAll() {
        log.debug("Request to get all Chaves");
        return chavesRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Chaves> findOne(Long id) {
        log.debug("Request to get Chaves : {}", id);
        return chavesRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Chaves : {}", id);
        chavesRepository.deleteById(id);
    }
}
