package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.AcompanhamentoClinico;
import com.mycompany.myapp.repository.AcompanhamentoClinicoRepository;
import com.mycompany.myapp.service.AcompanhamentoClinicoService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link AcompanhamentoClinico}.
 */
@Service
@Transactional
public class AcompanhamentoClinicoServiceImpl implements AcompanhamentoClinicoService {

    private final Logger log = LoggerFactory.getLogger(AcompanhamentoClinicoServiceImpl.class);

    private final AcompanhamentoClinicoRepository acompanhamentoClinicoRepository;

    public AcompanhamentoClinicoServiceImpl(AcompanhamentoClinicoRepository acompanhamentoClinicoRepository) {
        this.acompanhamentoClinicoRepository = acompanhamentoClinicoRepository;
    }

    @Override
    public AcompanhamentoClinico save(AcompanhamentoClinico acompanhamentoClinico) {
        log.debug("Request to save AcompanhamentoClinico : {}", acompanhamentoClinico);
        return acompanhamentoClinicoRepository.save(acompanhamentoClinico);
    }

    @Override
    public AcompanhamentoClinico update(AcompanhamentoClinico acompanhamentoClinico) {
        log.debug("Request to update AcompanhamentoClinico : {}", acompanhamentoClinico);
        return acompanhamentoClinicoRepository.save(acompanhamentoClinico);
    }

    @Override
    public Optional<AcompanhamentoClinico> partialUpdate(AcompanhamentoClinico acompanhamentoClinico) {
        log.debug("Request to partially update AcompanhamentoClinico : {}", acompanhamentoClinico);

        return acompanhamentoClinicoRepository
            .findById(acompanhamentoClinico.getId())
            .map(existingAcompanhamentoClinico -> {
                if (acompanhamentoClinico.getCli_dat() != null) {
                    existingAcompanhamentoClinico.setCli_dat(acompanhamentoClinico.getCli_dat());
                }
                if (acompanhamentoClinico.getCli_pra() != null) {
                    existingAcompanhamentoClinico.setCli_pra(acompanhamentoClinico.getCli_pra());
                }
                if (acompanhamentoClinico.getCli_txg() != null) {
                    existingAcompanhamentoClinico.setCli_txg(acompanhamentoClinico.getCli_txg());
                }

                return existingAcompanhamentoClinico;
            })
            .map(acompanhamentoClinicoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AcompanhamentoClinico> findAll() {
        log.debug("Request to get all AcompanhamentoClinicos");
        return acompanhamentoClinicoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AcompanhamentoClinico> findOne(Long id) {
        log.debug("Request to get AcompanhamentoClinico : {}", id);
        return acompanhamentoClinicoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete AcompanhamentoClinico : {}", id);
        acompanhamentoClinicoRepository.deleteById(id);
    }
}
