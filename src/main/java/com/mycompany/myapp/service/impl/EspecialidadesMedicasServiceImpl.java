package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.EspecialidadesMedicas;
import com.mycompany.myapp.repository.EspecialidadesMedicasRepository;
import com.mycompany.myapp.service.EspecialidadesMedicasService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link EspecialidadesMedicas}.
 */
@Service
@Transactional
public class EspecialidadesMedicasServiceImpl implements EspecialidadesMedicasService {

    private final Logger log = LoggerFactory.getLogger(EspecialidadesMedicasServiceImpl.class);

    private final EspecialidadesMedicasRepository especialidadesMedicasRepository;

    public EspecialidadesMedicasServiceImpl(EspecialidadesMedicasRepository especialidadesMedicasRepository) {
        this.especialidadesMedicasRepository = especialidadesMedicasRepository;
    }

    @Override
    public EspecialidadesMedicas save(EspecialidadesMedicas especialidadesMedicas) {
        log.debug("Request to save EspecialidadesMedicas : {}", especialidadesMedicas);
        return especialidadesMedicasRepository.save(especialidadesMedicas);
    }

    @Override
    public EspecialidadesMedicas update(EspecialidadesMedicas especialidadesMedicas) {
        log.debug("Request to update EspecialidadesMedicas : {}", especialidadesMedicas);
        return especialidadesMedicasRepository.save(especialidadesMedicas);
    }

    @Override
    public Optional<EspecialidadesMedicas> partialUpdate(EspecialidadesMedicas especialidadesMedicas) {
        log.debug("Request to partially update EspecialidadesMedicas : {}", especialidadesMedicas);

        return especialidadesMedicasRepository
            .findById(especialidadesMedicas.getId())
            .map(existingEspecialidadesMedicas -> {
                if (especialidadesMedicas.getEsp_des() != null) {
                    existingEspecialidadesMedicas.setEsp_des(especialidadesMedicas.getEsp_des());
                }
                if (especialidadesMedicas.getCad_dat() != null) {
                    existingEspecialidadesMedicas.setCad_dat(especialidadesMedicas.getCad_dat());
                }

                return existingEspecialidadesMedicas;
            })
            .map(especialidadesMedicasRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EspecialidadesMedicas> findAll() {
        log.debug("Request to get all EspecialidadesMedicas");
        return especialidadesMedicasRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EspecialidadesMedicas> findOne(Long id) {
        log.debug("Request to get EspecialidadesMedicas : {}", id);
        return especialidadesMedicasRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete EspecialidadesMedicas : {}", id);
        especialidadesMedicasRepository.deleteById(id);
    }
}
