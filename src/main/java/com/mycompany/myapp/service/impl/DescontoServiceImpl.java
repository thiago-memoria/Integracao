package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.Desconto;
import com.mycompany.myapp.repository.DescontoRepository;
import com.mycompany.myapp.service.DescontoService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Desconto}.
 */
@Service
@Transactional
public class DescontoServiceImpl implements DescontoService {

    private final Logger log = LoggerFactory.getLogger(DescontoServiceImpl.class);

    private final DescontoRepository descontoRepository;

    public DescontoServiceImpl(DescontoRepository descontoRepository) {
        this.descontoRepository = descontoRepository;
    }

    @Override
    public Desconto save(Desconto desconto) {
        log.debug("Request to save Desconto : {}", desconto);
        return descontoRepository.save(desconto);
    }

    @Override
    public Desconto update(Desconto desconto) {
        log.debug("Request to update Desconto : {}", desconto);
        return descontoRepository.save(desconto);
    }

    @Override
    public Optional<Desconto> partialUpdate(Desconto desconto) {
        log.debug("Request to partially update Desconto : {}", desconto);

        return descontoRepository
            .findById(desconto.getId())
            .map(existingDesconto -> {
                if (desconto.getDes_raz() != null) {
                    existingDesconto.setDes_raz(desconto.getDes_raz());
                }
                if (desconto.getDes_end() != null) {
                    existingDesconto.setDes_end(desconto.getDes_end());
                }
                if (desconto.getDes_cgc() != null) {
                    existingDesconto.setDes_cgc(desconto.getDes_cgc());
                }
                if (desconto.getDes_cgf() != null) {
                    existingDesconto.setDes_cgf(desconto.getDes_cgf());
                }
                if (desconto.getDes_cim() != null) {
                    existingDesconto.setDes_cim(desconto.getDes_cim());
                }
                if (desconto.getDes_tel() != null) {
                    existingDesconto.setDes_tel(desconto.getDes_tel());
                }
                if (desconto.getDes_cnt() != null) {
                    existingDesconto.setDes_cnt(desconto.getDes_cnt());
                }
                if (desconto.getDes_nom() != null) {
                    existingDesconto.setDes_nom(desconto.getDes_nom());
                }
                if (desconto.getDes_ver() != null) {
                    existingDesconto.setDes_ver(desconto.getDes_ver());
                }
                if (desconto.getDes_exe() != null) {
                    existingDesconto.setDes_exe(desconto.getDes_exe());
                }
                if (desconto.getDes_dll() != null) {
                    existingDesconto.setDes_dll(desconto.getDes_dll());
                }
                if (desconto.getDes_txt() != null) {
                    existingDesconto.setDes_txt(desconto.getDes_txt());
                }
                if (desconto.getDes_req() != null) {
                    existingDesconto.setDes_req(desconto.getDes_req());
                }
                if (desconto.getDes_lau() != null) {
                    existingDesconto.setDes_lau(desconto.getDes_lau());
                }
                if (desconto.getDes_md5() != null) {
                    existingDesconto.setDes_md5(desconto.getDes_md5());
                }
                if (desconto.getDes_pub() != null) {
                    existingDesconto.setDes_pub(desconto.getDes_pub());
                }
                if (desconto.getDes_pri() != null) {
                    existingDesconto.setDes_pri(desconto.getDes_pri());
                }

                return existingDesconto;
            })
            .map(descontoRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Desconto> findAll() {
        log.debug("Request to get all Descontos");
        return descontoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Desconto> findOne(Long id) {
        log.debug("Request to get Desconto : {}", id);
        return descontoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Desconto : {}", id);
        descontoRepository.deleteById(id);
    }
}
