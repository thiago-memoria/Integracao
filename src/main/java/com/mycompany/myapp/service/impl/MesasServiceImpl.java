package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.Mesas;
import com.mycompany.myapp.repository.MesasRepository;
import com.mycompany.myapp.service.MesasService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Mesas}.
 */
@Service
@Transactional
public class MesasServiceImpl implements MesasService {

    private final Logger log = LoggerFactory.getLogger(MesasServiceImpl.class);

    private final MesasRepository mesasRepository;

    public MesasServiceImpl(MesasRepository mesasRepository) {
        this.mesasRepository = mesasRepository;
    }

    @Override
    public Mesas save(Mesas mesas) {
        log.debug("Request to save Mesas : {}", mesas);
        return mesasRepository.save(mesas);
    }

    @Override
    public Mesas update(Mesas mesas) {
        log.debug("Request to update Mesas : {}", mesas);
        return mesasRepository.save(mesas);
    }

    @Override
    public Optional<Mesas> partialUpdate(Mesas mesas) {
        log.debug("Request to partially update Mesas : {}", mesas);

        return mesasRepository
            .findById(mesas.getId())
            .map(existingMesas -> {
                if (mesas.getMes_loc() != null) {
                    existingMesas.setMes_loc(mesas.getMes_loc());
                }
                if (mesas.getCad_dat() != null) {
                    existingMesas.setCad_dat(mesas.getCad_dat());
                }
                if (mesas.getCad_exc() != null) {
                    existingMesas.setCad_exc(mesas.getCad_exc());
                }

                return existingMesas;
            })
            .map(mesasRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Mesas> findAll() {
        log.debug("Request to get all Mesas");
        return mesasRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Mesas> findOne(Long id) {
        log.debug("Request to get Mesas : {}", id);
        return mesasRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Mesas : {}", id);
        mesasRepository.deleteById(id);
    }
}
