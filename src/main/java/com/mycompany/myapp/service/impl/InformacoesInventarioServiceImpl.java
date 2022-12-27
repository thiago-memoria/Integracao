package com.mycompany.myapp.service.impl;

import java.util.List;
import java.util.Optional;

import com.mycompany.myapp.domain.InformacoesInventario;
import com.mycompany.myapp.domain.InformacoesInventarioId;
import com.mycompany.myapp.repository.InformacoesInventarioRepository;
import com.mycompany.myapp.service.InformacoesInventarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link InformacoesInventario}.
 */
@Service
@Transactional
public class InformacoesInventarioServiceImpl implements InformacoesInventarioService {

    private final Logger log = LoggerFactory.getLogger(InformacoesInventarioServiceImpl.class);

    private final InformacoesInventarioRepository informacoesInventarioRepository;

    public InformacoesInventarioServiceImpl(InformacoesInventarioRepository informacoesInventarioRepository) {
        this.informacoesInventarioRepository = informacoesInventarioRepository;
    }

    @Override
    public InformacoesInventario save(InformacoesInventario informacoesInventario) {
        log.debug("Request to save InformacoesInventario : {}", informacoesInventario);
        return informacoesInventarioRepository.save(informacoesInventario);
    }

    @Override
    public InformacoesInventario update(InformacoesInventario informacoesInventario) {
        log.debug("Request to update InformacoesInventario : {}", informacoesInventario);
        return informacoesInventarioRepository.save(informacoesInventario);
    }

    @Override
    public Optional<InformacoesInventario> partialUpdate(InformacoesInventario informacoesInventario) {
        log.debug("Request to partially update InformacoesInventario : {}", informacoesInventario);

        return informacoesInventarioRepository
            .findById(informacoesInventario.getId())
            .map(existingInformacoesInventario -> {
                if (informacoesInventario.getIte_bar() != null) {
                    existingInformacoesInventario.setIte_bar(informacoesInventario.getIte_bar());
                }
                if (informacoesInventario.getEst_qan() != null) {
                    existingInformacoesInventario.setEst_qan(informacoesInventario.getEst_qan());
                }
                if (informacoesInventario.getEst_qtd() != null) {
                    existingInformacoesInventario.setEst_qtd(informacoesInventario.getEst_qtd());
                }
                if (informacoesInventario.getEst_pre() != null) {
                    existingInformacoesInventario.setEst_pre(informacoesInventario.getEst_pre());
                }
                if (informacoesInventario.getEst_val() != null) {
                    existingInformacoesInventario.setEst_val(informacoesInventario.getEst_val());
                }
                if (informacoesInventario.getEst_pag() != null) {
                    existingInformacoesInventario.setEst_pag(informacoesInventario.getEst_pag());
                }
                if (informacoesInventario.getEst_dat() != null) {
                    existingInformacoesInventario.setEst_dat(informacoesInventario.getEst_dat());
                }
                if (informacoesInventario.getEst_hor() != null) {
                    existingInformacoesInventario.setEst_hor(informacoesInventario.getEst_hor());
                }

                return existingInformacoesInventario;
            })
            .map(informacoesInventarioRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<InformacoesInventario> findAll() {
        log.debug("Request to get all InformacoesInventarios");
        return informacoesInventarioRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<InformacoesInventario> findOne(InformacoesInventarioId id) {
        log.debug("Request to get InformacoesInventario : {}", id);
        return informacoesInventarioRepository.findById(id);
    }

    @Override
    public void delete(InformacoesInventarioId id) {
        log.debug("Request to delete InformacoesInventario : {}", id);
        informacoesInventarioRepository.deleteById(id);
    }
}
