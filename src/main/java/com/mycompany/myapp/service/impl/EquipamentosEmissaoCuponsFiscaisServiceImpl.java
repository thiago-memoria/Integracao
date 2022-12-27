package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.EquipamentosEmissaoCuponsFiscais;
import com.mycompany.myapp.repository.EquipamentosEmissaoCuponsFiscaisRepository;
import com.mycompany.myapp.service.EquipamentosEmissaoCuponsFiscaisService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link EquipamentosEmissaoCuponsFiscais}.
 */
@Service
@Transactional
public class EquipamentosEmissaoCuponsFiscaisServiceImpl implements EquipamentosEmissaoCuponsFiscaisService {

    private final Logger log = LoggerFactory.getLogger(EquipamentosEmissaoCuponsFiscaisServiceImpl.class);

    private final EquipamentosEmissaoCuponsFiscaisRepository equipamentosEmissaoCuponsFiscaisRepository;

    public EquipamentosEmissaoCuponsFiscaisServiceImpl(
        EquipamentosEmissaoCuponsFiscaisRepository equipamentosEmissaoCuponsFiscaisRepository
    ) {
        this.equipamentosEmissaoCuponsFiscaisRepository = equipamentosEmissaoCuponsFiscaisRepository;
    }

    @Override
    public EquipamentosEmissaoCuponsFiscais save(EquipamentosEmissaoCuponsFiscais equipamentosEmissaoCuponsFiscais) {
        log.debug("Request to save EquipamentosEmissaoCuponsFiscais : {}", equipamentosEmissaoCuponsFiscais);
        return equipamentosEmissaoCuponsFiscaisRepository.save(equipamentosEmissaoCuponsFiscais);
    }

    @Override
    public EquipamentosEmissaoCuponsFiscais update(EquipamentosEmissaoCuponsFiscais equipamentosEmissaoCuponsFiscais) {
        log.debug("Request to update EquipamentosEmissaoCuponsFiscais : {}", equipamentosEmissaoCuponsFiscais);
        return equipamentosEmissaoCuponsFiscaisRepository.save(equipamentosEmissaoCuponsFiscais);
    }

    @Override
    public Optional<EquipamentosEmissaoCuponsFiscais> partialUpdate(EquipamentosEmissaoCuponsFiscais equipamentosEmissaoCuponsFiscais) {
        log.debug("Request to partially update EquipamentosEmissaoCuponsFiscais : {}", equipamentosEmissaoCuponsFiscais);

        return equipamentosEmissaoCuponsFiscaisRepository
            .findById(equipamentosEmissaoCuponsFiscais.getId())
            .map(existingEquipamentosEmissaoCuponsFiscais -> {
                if (equipamentosEmissaoCuponsFiscais.getEcf_mar() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_mar(equipamentosEmissaoCuponsFiscais.getEcf_mar());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_mod() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_mod(equipamentosEmissaoCuponsFiscais.getEcf_mod());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_tip() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_tip(equipamentosEmissaoCuponsFiscais.getEcf_tip());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_nfa() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_nfa(equipamentosEmissaoCuponsFiscais.getEcf_nfa());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_por() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_por(equipamentosEmissaoCuponsFiscais.getEcf_por());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_cni() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_cni(equipamentosEmissaoCuponsFiscais.getEcf_cni());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_vsb() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_vsb(equipamentosEmissaoCuponsFiscais.getEcf_vsb());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_dsb() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_dsb(equipamentosEmissaoCuponsFiscais.getEcf_dsb());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_hsb() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_hsb(equipamentosEmissaoCuponsFiscais.getEcf_hsb());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_lot() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_lot(equipamentosEmissaoCuponsFiscais.getEcf_lot());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_pre() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_pre(equipamentosEmissaoCuponsFiscais.getEcf_pre());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_dav() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_dav(equipamentosEmissaoCuponsFiscais.getEcf_dav());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_dnf() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_dnf(equipamentosEmissaoCuponsFiscais.getEcf_dnf());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_mfa() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_mfa(equipamentosEmissaoCuponsFiscais.getEcf_mfa());
                }
                if (equipamentosEmissaoCuponsFiscais.getCad_dat() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setCad_dat(equipamentosEmissaoCuponsFiscais.getCad_dat());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_usu() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_usu(equipamentosEmissaoCuponsFiscais.getEcf_usu());
                }
                if (equipamentosEmissaoCuponsFiscais.getEcf_tgt() != null) {
                    existingEquipamentosEmissaoCuponsFiscais.setEcf_tgt(equipamentosEmissaoCuponsFiscais.getEcf_tgt());
                }

                return existingEquipamentosEmissaoCuponsFiscais;
            })
            .map(equipamentosEmissaoCuponsFiscaisRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EquipamentosEmissaoCuponsFiscais> findAll() {
        log.debug("Request to get all EquipamentosEmissaoCuponsFiscais");
        return equipamentosEmissaoCuponsFiscaisRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<EquipamentosEmissaoCuponsFiscais> findOne(Long id) {
        log.debug("Request to get EquipamentosEmissaoCuponsFiscais : {}", id);
        return equipamentosEmissaoCuponsFiscaisRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete EquipamentosEmissaoCuponsFiscais : {}", id);
        equipamentosEmissaoCuponsFiscaisRepository.deleteById(id);
    }
}
