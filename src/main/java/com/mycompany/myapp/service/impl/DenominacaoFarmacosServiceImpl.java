package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.DenominacaoFarmacos;
import com.mycompany.myapp.repository.DenominacaoFarmacosRepository;
import com.mycompany.myapp.service.DenominacaoFarmacosService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link DenominacaoFarmacos}.
 */
@Service
@Transactional
public class DenominacaoFarmacosServiceImpl implements DenominacaoFarmacosService {

    private final Logger log = LoggerFactory.getLogger(DenominacaoFarmacosServiceImpl.class);

    private final DenominacaoFarmacosRepository denominacaoFarmacosRepository;

    public DenominacaoFarmacosServiceImpl(DenominacaoFarmacosRepository denominacaoFarmacosRepository) {
        this.denominacaoFarmacosRepository = denominacaoFarmacosRepository;
    }

    @Override
    public DenominacaoFarmacos save(DenominacaoFarmacos denominacaoFarmacos) {
        log.debug("Request to save DenominacaoFarmacos : {}", denominacaoFarmacos);
        return denominacaoFarmacosRepository.save(denominacaoFarmacos);
    }

    @Override
    public DenominacaoFarmacos update(DenominacaoFarmacos denominacaoFarmacos) {
        log.debug("Request to update DenominacaoFarmacos : {}", denominacaoFarmacos);
        return denominacaoFarmacosRepository.save(denominacaoFarmacos);
    }

    @Override
    public Optional<DenominacaoFarmacos> partialUpdate(DenominacaoFarmacos denominacaoFarmacos) {
        log.debug("Request to partially update DenominacaoFarmacos : {}", denominacaoFarmacos);

        return denominacaoFarmacosRepository
            .findById(denominacaoFarmacos.getId())
            .map(existingDenominacaoFarmacos -> {
                if (denominacaoFarmacos.getDcb_nom() != null) {
                    existingDenominacaoFarmacos.setDcb_nom(denominacaoFarmacos.getDcb_nom());
                }
                if (denominacaoFarmacos.getCad_dat() != null) {
                    existingDenominacaoFarmacos.setCad_dat(denominacaoFarmacos.getCad_dat());
                }

                return existingDenominacaoFarmacos;
            })
            .map(denominacaoFarmacosRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DenominacaoFarmacos> findAll() {
        log.debug("Request to get all DenominacaoFarmacos");
        return denominacaoFarmacosRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<DenominacaoFarmacos> findOne(Long id) {
        log.debug("Request to get DenominacaoFarmacos : {}", id);
        return denominacaoFarmacosRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DenominacaoFarmacos : {}", id);
        denominacaoFarmacosRepository.deleteById(id);
    }
}
