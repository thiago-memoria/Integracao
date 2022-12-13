package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.AutorizacaoImpressaoDocumentos;
import com.mycompany.myapp.repository.AutorizacaoImpressaoDocumentosRepository;
import com.mycompany.myapp.service.AutorizacaoImpressaoDocumentosService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link AutorizacaoImpressaoDocumentos}.
 */
@Service
@Transactional
public class AutorizacaoImpressaoDocumentosServiceImpl implements AutorizacaoImpressaoDocumentosService {

    private final Logger log = LoggerFactory.getLogger(AutorizacaoImpressaoDocumentosServiceImpl.class);

    private final AutorizacaoImpressaoDocumentosRepository autorizacaoImpressaoDocumentosRepository;

    public AutorizacaoImpressaoDocumentosServiceImpl(AutorizacaoImpressaoDocumentosRepository autorizacaoImpressaoDocumentosRepository) {
        this.autorizacaoImpressaoDocumentosRepository = autorizacaoImpressaoDocumentosRepository;
    }

    @Override
    public AutorizacaoImpressaoDocumentos save(AutorizacaoImpressaoDocumentos autorizacaoImpressaoDocumentos) {
        log.debug("Request to save AutorizacaoImpressaoDocumentos : {}", autorizacaoImpressaoDocumentos);
        return autorizacaoImpressaoDocumentosRepository.save(autorizacaoImpressaoDocumentos);
    }

    @Override
    public AutorizacaoImpressaoDocumentos update(AutorizacaoImpressaoDocumentos autorizacaoImpressaoDocumentos) {
        log.debug("Request to update AutorizacaoImpressaoDocumentos : {}", autorizacaoImpressaoDocumentos);
        // no save call needed as we have no fields that can be updated
        return autorizacaoImpressaoDocumentos;
    }

    @Override
    public Optional<AutorizacaoImpressaoDocumentos> partialUpdate(AutorizacaoImpressaoDocumentos autorizacaoImpressaoDocumentos) {
        log.debug("Request to partially update AutorizacaoImpressaoDocumentos : {}", autorizacaoImpressaoDocumentos);

        return autorizacaoImpressaoDocumentosRepository
            .findById(autorizacaoImpressaoDocumentos.getId())
            .map(existingAutorizacaoImpressaoDocumentos -> {
                return existingAutorizacaoImpressaoDocumentos;
            })// .map(autorizacaoImpressaoDocumentosRepository::save)
        ;
    }

    @Override
    @Transactional(readOnly = true)
    public List<AutorizacaoImpressaoDocumentos> findAll() {
        log.debug("Request to get all AutorizacaoImpressaoDocumentos");
        return autorizacaoImpressaoDocumentosRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AutorizacaoImpressaoDocumentos> findOne(Long id) {
        log.debug("Request to get AutorizacaoImpressaoDocumentos : {}", id);
        return autorizacaoImpressaoDocumentosRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete AutorizacaoImpressaoDocumentos : {}", id);
        autorizacaoImpressaoDocumentosRepository.deleteById(id);
    }
}
