package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.AcessoTipoMovimento;
import com.mycompany.myapp.repository.AcessoTipoMovimentoRepository;
import com.mycompany.myapp.service.AcessoTipoMovimentoService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link AcessoTipoMovimento}.
 */
@Service
@Transactional
public class AcessoTipoMovimentoServiceImpl implements AcessoTipoMovimentoService {

    private final Logger log = LoggerFactory.getLogger(AcessoTipoMovimentoServiceImpl.class);

    private final AcessoTipoMovimentoRepository acessoTipoMovimentoRepository;

    public AcessoTipoMovimentoServiceImpl(AcessoTipoMovimentoRepository acessoTipoMovimentoRepository) {
        this.acessoTipoMovimentoRepository = acessoTipoMovimentoRepository;
    }

    @Override
    public AcessoTipoMovimento save(AcessoTipoMovimento acessoTipoMovimento) {
        log.debug("Request to save AcessoTipoMovimento : {}", acessoTipoMovimento);
        return acessoTipoMovimentoRepository.save(acessoTipoMovimento);
    }

    @Override
    public AcessoTipoMovimento update(AcessoTipoMovimento acessoTipoMovimento) {
        log.debug("Request to update AcessoTipoMovimento : {}", acessoTipoMovimento);
        return acessoTipoMovimentoRepository.save(acessoTipoMovimento);
    }

    @Override
    public Optional<AcessoTipoMovimento> partialUpdate(AcessoTipoMovimento acessoTipoMovimento) {
        log.debug("Request to partially update AcessoTipoMovimento : {}", acessoTipoMovimento);

        return acessoTipoMovimentoRepository
            .findById(acessoTipoMovimento.getId())
            .map(existingAcessoTipoMovimento -> {
                if (acessoTipoMovimento.getAcs_con() != null) {
                    existingAcessoTipoMovimento.setAcs_con(acessoTipoMovimento.getAcs_con());
                }
                if (acessoTipoMovimento.getAcs_exc() != null) {
                    existingAcessoTipoMovimento.setAcs_exc(acessoTipoMovimento.getAcs_exc());
                }
                if (acessoTipoMovimento.getAcs_alt() != null) {
                    existingAcessoTipoMovimento.setAcs_alt(acessoTipoMovimento.getAcs_alt());
                }
                if (acessoTipoMovimento.getAcs_inc() != null) {
                    existingAcessoTipoMovimento.setAcs_inc(acessoTipoMovimento.getAcs_inc());
                }
                if (acessoTipoMovimento.getAcs_fre() != null) {
                    existingAcessoTipoMovimento.setAcs_fre(acessoTipoMovimento.getAcs_fre());
                }

                return existingAcessoTipoMovimento;
            })
            .map(acessoTipoMovimentoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AcessoTipoMovimento> findAll() {
        log.debug("Request to get all AcessoTipoMovimentos");
        return acessoTipoMovimentoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<AcessoTipoMovimento> findOne(Long id) {
        log.debug("Request to get AcessoTipoMovimento : {}", id);
        return acessoTipoMovimentoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete AcessoTipoMovimento : {}", id);
        acessoTipoMovimentoRepository.deleteById(id);
    }
}
