package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.Medico;
import com.mycompany.myapp.repository.MedicoRepository;
import com.mycompany.myapp.service.MedicoService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Medico}.
 */
@Service
@Transactional
public class MedicoServiceImpl implements MedicoService {

    private final Logger log = LoggerFactory.getLogger(MedicoServiceImpl.class);

    private final MedicoRepository medicoRepository;

    public MedicoServiceImpl(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @Override
    public Medico save(Medico medico) {
        log.debug("Request to save Medico : {}", medico);
        return medicoRepository.save(medico);
    }

    @Override
    public Medico update(Medico medico) {
        log.debug("Request to update Medico : {}", medico);
        return medicoRepository.save(medico);
    }

    @Override
    public Optional<Medico> partialUpdate(Medico medico) {
        log.debug("Request to partially update Medico : {}", medico);

        return medicoRepository
            .findById(medico.getId())
            .map(existingMedico -> {
                if (medico.getMed_nom() != null) {
                    existingMedico.setMed_nom(medico.getMed_nom());
                }
                if (medico.getMed_end() != null) {
                    existingMedico.setMed_end(medico.getMed_end());
                }
                if (medico.getMed_bai() != null) {
                    existingMedico.setMed_bai(medico.getMed_bai());
                }
                if (medico.getMed_cid() != null) {
                    existingMedico.setMed_cid(medico.getMed_cid());
                }
                if (medico.getMed_est() != null) {
                    existingMedico.setMed_est(medico.getMed_est());
                }
                if (medico.getMed_cep() != null) {
                    existingMedico.setMed_cep(medico.getMed_cep());
                }
                if (medico.getMed_tel() != null) {
                    existingMedico.setMed_tel(medico.getMed_tel());
                }
                if (medico.getMed_dtn() != null) {
                    existingMedico.setMed_dtn(medico.getMed_dtn());
                }
                if (medico.getCad_dat() != null) {
                    existingMedico.setCad_dat(medico.getCad_dat());
                }
                if (medico.getMed_ufc() != null) {
                    existingMedico.setMed_ufc(medico.getMed_ufc());
                }
                if (medico.getMed_fax() != null) {
                    existingMedico.setMed_fax(medico.getMed_fax());
                }
                if (medico.getMed_num() != null) {
                    existingMedico.setMed_num(medico.getMed_num());
                }
                if (medico.getMed_cpl() != null) {
                    existingMedico.setMed_cpl(medico.getMed_cpl());
                }
                if (medico.getMed_ema() != null) {
                    existingMedico.setMed_ema(medico.getMed_ema());
                }

                return existingMedico;
            })
            .map(medicoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Medico> findAll() {
        log.debug("Request to get all Medicos");
        return medicoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Medico> findOne(Long id) {
        log.debug("Request to get Medico : {}", id);
        return medicoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Medico : {}", id);
        medicoRepository.deleteById(id);
    }
}
