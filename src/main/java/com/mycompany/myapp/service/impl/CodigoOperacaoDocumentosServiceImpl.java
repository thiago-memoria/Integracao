package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.CodigoOperacaoDocumentos;
import com.mycompany.myapp.repository.CodigoOperacaoDocumentosRepository;
import com.mycompany.myapp.service.CodigoOperacaoDocumentosService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link CodigoOperacaoDocumentos}.
 */
@Service
@Transactional
public class CodigoOperacaoDocumentosServiceImpl implements CodigoOperacaoDocumentosService {

    private final Logger log = LoggerFactory.getLogger(CodigoOperacaoDocumentosServiceImpl.class);

    private final CodigoOperacaoDocumentosRepository codigoOperacaoDocumentosRepository;

    public CodigoOperacaoDocumentosServiceImpl(CodigoOperacaoDocumentosRepository codigoOperacaoDocumentosRepository) {
        this.codigoOperacaoDocumentosRepository = codigoOperacaoDocumentosRepository;
    }

    @Override
    public CodigoOperacaoDocumentos save(CodigoOperacaoDocumentos codigoOperacaoDocumentos) {
        log.debug("Request to save CodigoOperacaoDocumentos : {}", codigoOperacaoDocumentos);
        return codigoOperacaoDocumentosRepository.save(codigoOperacaoDocumentos);
    }

    @Override
    public CodigoOperacaoDocumentos update(CodigoOperacaoDocumentos codigoOperacaoDocumentos) {
        log.debug("Request to update CodigoOperacaoDocumentos : {}", codigoOperacaoDocumentos);
        // no save call needed as we have no fields that can be updated
        return codigoOperacaoDocumentos;
    }

    @Override
    public Optional<CodigoOperacaoDocumentos> partialUpdate(CodigoOperacaoDocumentos codigoOperacaoDocumentos) {
        log.debug("Request to partially update CodigoOperacaoDocumentos : {}", codigoOperacaoDocumentos);

        return codigoOperacaoDocumentosRepository
            .findById(codigoOperacaoDocumentos.getId())
            .map(existingCodigoOperacaoDocumentos -> {
                return existingCodigoOperacaoDocumentos;
            })// .map(codigoOperacaoDocumentosRepository::save)
        ;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CodigoOperacaoDocumentos> findAll() {
        log.debug("Request to get all CodigoOperacaoDocumentos");
        return codigoOperacaoDocumentosRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CodigoOperacaoDocumentos> findOne(Long id) {
        log.debug("Request to get CodigoOperacaoDocumentos : {}", id);
        return codigoOperacaoDocumentosRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete CodigoOperacaoDocumentos : {}", id);
        codigoOperacaoDocumentosRepository.deleteById(id);
    }
}
