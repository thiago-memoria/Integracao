package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.DicionarioColunas;
import com.mycompany.myapp.repository.DicionarioColunasRepository;
import com.mycompany.myapp.service.DicionarioColunasService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link DicionarioColunas}.
 */
@Service
@Transactional
public class DicionarioColunasServiceImpl implements DicionarioColunasService {

    private final Logger log = LoggerFactory.getLogger(DicionarioColunasServiceImpl.class);

    private final DicionarioColunasRepository dicionarioColunasRepository;

    public DicionarioColunasServiceImpl(DicionarioColunasRepository dicionarioColunasRepository) {
        this.dicionarioColunasRepository = dicionarioColunasRepository;
    }

    @Override
    public DicionarioColunas save(DicionarioColunas dicionarioColunas) {
        log.debug("Request to save DicionarioColunas : {}", dicionarioColunas);
        return dicionarioColunasRepository.save(dicionarioColunas);
    }

    @Override
    public DicionarioColunas update(DicionarioColunas dicionarioColunas) {
        log.debug("Request to update DicionarioColunas : {}", dicionarioColunas);
        return dicionarioColunasRepository.save(dicionarioColunas);
    }

    @Override
    public Optional<DicionarioColunas> partialUpdate(DicionarioColunas dicionarioColunas) {
        log.debug("Request to partially update DicionarioColunas : {}", dicionarioColunas);

        return dicionarioColunasRepository
            .findById(dicionarioColunas.getId())
            .map(existingDicionarioColunas -> {
                if (dicionarioColunas.getCmp_nom() != null) {
                    existingDicionarioColunas.setCmp_nom(dicionarioColunas.getCmp_nom());
                }
                if (dicionarioColunas.getCmp_des() != null) {
                    existingDicionarioColunas.setCmp_des(dicionarioColunas.getCmp_des());
                }
                if (dicionarioColunas.getCmp_tip() != null) {
                    existingDicionarioColunas.setCmp_tip(dicionarioColunas.getCmp_tip());
                }
                if (dicionarioColunas.getCmp_tam() != null) {
                    existingDicionarioColunas.setCmp_tam(dicionarioColunas.getCmp_tam());
                }
                if (dicionarioColunas.getCmp_dec() != null) {
                    existingDicionarioColunas.setCmp_dec(dicionarioColunas.getCmp_dec());
                }
                if (dicionarioColunas.getAtz_tip() != null) {
                    existingDicionarioColunas.setAtz_tip(dicionarioColunas.getAtz_tip());
                }
                if (dicionarioColunas.getCmp_pic() != null) {
                    existingDicionarioColunas.setCmp_pic(dicionarioColunas.getCmp_pic());
                }
                if (dicionarioColunas.getCmp_val() != null) {
                    existingDicionarioColunas.setCmp_val(dicionarioColunas.getCmp_val());
                }
                if (dicionarioColunas.getAtz_rot() != null) {
                    existingDicionarioColunas.setAtz_rot(dicionarioColunas.getAtz_rot());
                }
                if (dicionarioColunas.getTab_cns() != null) {
                    existingDicionarioColunas.setTab_cns(dicionarioColunas.getTab_cns());
                }
                if (dicionarioColunas.getCmp_cod() != null) {
                    existingDicionarioColunas.setCmp_cod(dicionarioColunas.getCmp_cod());
                }
                if (dicionarioColunas.getCmp_cns() != null) {
                    existingDicionarioColunas.setCmp_cns(dicionarioColunas.getCmp_cns());
                }
                if (dicionarioColunas.getAtz_alt() != null) {
                    existingDicionarioColunas.setAtz_alt(dicionarioColunas.getAtz_alt());
                }
                if (dicionarioColunas.getCha_pri() != null) {
                    existingDicionarioColunas.setCha_pri(dicionarioColunas.getCha_pri());
                }
                if (dicionarioColunas.getAct_nul() != null) {
                    existingDicionarioColunas.setAct_nul(dicionarioColunas.getAct_nul());
                }
                if (dicionarioColunas.getCmp_def() != null) {
                    existingDicionarioColunas.setCmp_def(dicionarioColunas.getCmp_def());
                }
                if (dicionarioColunas.getCmp_ena() != null) {
                    existingDicionarioColunas.setCmp_ena(dicionarioColunas.getCmp_ena());
                }
                if (dicionarioColunas.getCmp_obr() != null) {
                    existingDicionarioColunas.setCmp_obr(dicionarioColunas.getCmp_obr());
                }

                return existingDicionarioColunas;
            })
            .map(dicionarioColunasRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DicionarioColunas> findAll() {
        log.debug("Request to get all DicionarioColunas");
        return dicionarioColunasRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<DicionarioColunas> findOne(Long id) {
        log.debug("Request to get DicionarioColunas : {}", id);
        return dicionarioColunasRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DicionarioColunas : {}", id);
        dicionarioColunasRepository.deleteById(id);
    }
}
