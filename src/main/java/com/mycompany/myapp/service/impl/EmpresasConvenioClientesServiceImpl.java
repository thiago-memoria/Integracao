package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.EmpresasConvenioClientes;
import com.mycompany.myapp.repository.EmpresasConvenioClientesRepository;
import com.mycompany.myapp.service.EmpresasConvenioClientesService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link EmpresasConvenioClientes}.
 */
@Service
@Transactional
public class EmpresasConvenioClientesServiceImpl implements EmpresasConvenioClientesService {

    private final Logger log = LoggerFactory.getLogger(EmpresasConvenioClientesServiceImpl.class);

    private final EmpresasConvenioClientesRepository empresasConvenioClientesRepository;

    public EmpresasConvenioClientesServiceImpl(EmpresasConvenioClientesRepository empresasConvenioClientesRepository) {
        this.empresasConvenioClientesRepository = empresasConvenioClientesRepository;
    }

    @Override
    public EmpresasConvenioClientes save(EmpresasConvenioClientes empresasConvenioClientes) {
        log.debug("Request to save EmpresasConvenioClientes : {}", empresasConvenioClientes);
        return empresasConvenioClientesRepository.save(empresasConvenioClientes);
    }

    @Override
    public EmpresasConvenioClientes update(EmpresasConvenioClientes empresasConvenioClientes) {
        log.debug("Request to update EmpresasConvenioClientes : {}", empresasConvenioClientes);
        // no save call needed as we have no fields that can be updated
        return empresasConvenioClientes;
    }

    @Override
    public Optional<EmpresasConvenioClientes> partialUpdate(EmpresasConvenioClientes empresasConvenioClientes) {
        log.debug("Request to partially update EmpresasConvenioClientes : {}", empresasConvenioClientes);

        return empresasConvenioClientesRepository
            .findById(empresasConvenioClientes.getId())
            .map(existingEmpresasConvenioClientes -> {
                return existingEmpresasConvenioClientes;
            })// .map(empresasConvenioClientesRepository::save)
        ;
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmpresasConvenioClientes> findAll() {
        log.debug("Request to get all EmpresasConvenioClientes");
        return empresasConvenioClientesRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EmpresasConvenioClientes> findOne(Long id) {
        log.debug("Request to get EmpresasConvenioClientes : {}", id);
        return empresasConvenioClientesRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete EmpresasConvenioClientes : {}", id);
        empresasConvenioClientesRepository.deleteById(id);
    }
}
