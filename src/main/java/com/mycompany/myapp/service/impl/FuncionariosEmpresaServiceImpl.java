package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.FuncionariosEmpresa;
import com.mycompany.myapp.repository.FuncionariosEmpresaRepository;
import com.mycompany.myapp.service.FuncionariosEmpresaService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link FuncionariosEmpresa}.
 */
@Service
@Transactional
public class FuncionariosEmpresaServiceImpl implements FuncionariosEmpresaService {

    private final Logger log = LoggerFactory.getLogger(FuncionariosEmpresaServiceImpl.class);

    private final FuncionariosEmpresaRepository funcionariosEmpresaRepository;

    public FuncionariosEmpresaServiceImpl(FuncionariosEmpresaRepository funcionariosEmpresaRepository) {
        this.funcionariosEmpresaRepository = funcionariosEmpresaRepository;
    }

    @Override
    public FuncionariosEmpresa save(FuncionariosEmpresa funcionariosEmpresa) {
        log.debug("Request to save FuncionariosEmpresa : {}", funcionariosEmpresa);
        return funcionariosEmpresaRepository.save(funcionariosEmpresa);
    }

    @Override
    public FuncionariosEmpresa update(FuncionariosEmpresa funcionariosEmpresa) {
        log.debug("Request to update FuncionariosEmpresa : {}", funcionariosEmpresa);
        return funcionariosEmpresaRepository.save(funcionariosEmpresa);
    }

    @Override
    public Optional<FuncionariosEmpresa> partialUpdate(FuncionariosEmpresa funcionariosEmpresa) {
        log.debug("Request to partially update FuncionariosEmpresa : {}", funcionariosEmpresa);

        return funcionariosEmpresaRepository
            .findById(funcionariosEmpresa.getId())
            .map(existingFuncionariosEmpresa -> {
                if (funcionariosEmpresa.getFun_nom() != null) {
                    existingFuncionariosEmpresa.setFun_nom(funcionariosEmpresa.getFun_nom());
                }
                if (funcionariosEmpresa.getFun_ncp() != null) {
                    existingFuncionariosEmpresa.setFun_ncp(funcionariosEmpresa.getFun_ncp());
                }
                if (funcionariosEmpresa.getFun_end() != null) {
                    existingFuncionariosEmpresa.setFun_end(funcionariosEmpresa.getFun_end());
                }
                if (funcionariosEmpresa.getFun_bai() != null) {
                    existingFuncionariosEmpresa.setFun_bai(funcionariosEmpresa.getFun_bai());
                }
                if (funcionariosEmpresa.getFun_cid() != null) {
                    existingFuncionariosEmpresa.setFun_cid(funcionariosEmpresa.getFun_cid());
                }
                if (funcionariosEmpresa.getFun_est() != null) {
                    existingFuncionariosEmpresa.setFun_est(funcionariosEmpresa.getFun_est());
                }
                if (funcionariosEmpresa.getFun_cep() != null) {
                    existingFuncionariosEmpresa.setFun_cep(funcionariosEmpresa.getFun_cep());
                }
                if (funcionariosEmpresa.getFun_tel() != null) {
                    existingFuncionariosEmpresa.setFun_tel(funcionariosEmpresa.getFun_tel());
                }
                if (funcionariosEmpresa.getFun_dtn() != null) {
                    existingFuncionariosEmpresa.setFun_dtn(funcionariosEmpresa.getFun_dtn());
                }
                if (funcionariosEmpresa.getFun_cre() != null) {
                    existingFuncionariosEmpresa.setFun_cre(funcionariosEmpresa.getFun_cre());
                }
                if (funcionariosEmpresa.getFun_deb() != null) {
                    existingFuncionariosEmpresa.setFun_deb(funcionariosEmpresa.getFun_deb());
                }
                if (funcionariosEmpresa.getFun_cxa() != null) {
                    existingFuncionariosEmpresa.setFun_cxa(funcionariosEmpresa.getFun_cxa());
                }
                if (funcionariosEmpresa.getFun_tip() != null) {
                    existingFuncionariosEmpresa.setFun_tip(funcionariosEmpresa.getFun_tip());
                }
                if (funcionariosEmpresa.getFun_en1() != null) {
                    existingFuncionariosEmpresa.setFun_en1(funcionariosEmpresa.getFun_en1());
                }
                if (funcionariosEmpresa.getFun_sa1() != null) {
                    existingFuncionariosEmpresa.setFun_sa1(funcionariosEmpresa.getFun_sa1());
                }
                if (funcionariosEmpresa.getFun_en2() != null) {
                    existingFuncionariosEmpresa.setFun_en2(funcionariosEmpresa.getFun_en2());
                }
                if (funcionariosEmpresa.getFun_sa2() != null) {
                    existingFuncionariosEmpresa.setFun_sa2(funcionariosEmpresa.getFun_sa2());
                }
                if (funcionariosEmpresa.getFun_sb1() != null) {
                    existingFuncionariosEmpresa.setFun_sb1(funcionariosEmpresa.getFun_sb1());
                }
                if (funcionariosEmpresa.getFun_sb2() != null) {
                    existingFuncionariosEmpresa.setFun_sb2(funcionariosEmpresa.getFun_sb2());
                }
                if (funcionariosEmpresa.getFun_do1() != null) {
                    existingFuncionariosEmpresa.setFun_do1(funcionariosEmpresa.getFun_do1());
                }
                if (funcionariosEmpresa.getFun_do2() != null) {
                    existingFuncionariosEmpresa.setFun_do2(funcionariosEmpresa.getFun_do2());
                }
                if (funcionariosEmpresa.getFun_tol() != null) {
                    existingFuncionariosEmpresa.setFun_tol(funcionariosEmpresa.getFun_tol());
                }
                if (funcionariosEmpresa.getCad_dat() != null) {
                    existingFuncionariosEmpresa.setCad_dat(funcionariosEmpresa.getCad_dat());
                }
                if (funcionariosEmpresa.getCad_fun() != null) {
                    existingFuncionariosEmpresa.setCad_fun(funcionariosEmpresa.getCad_fun());
                }
                if (funcionariosEmpresa.getFun_cpf() != null) {
                    existingFuncionariosEmpresa.setFun_cpf(funcionariosEmpresa.getFun_cpf());
                }
                if (funcionariosEmpresa.getCad_exc() != null) {
                    existingFuncionariosEmpresa.setCad_exc(funcionariosEmpresa.getCad_exc());
                }
                if (funcionariosEmpresa.getFun_num() != null) {
                    existingFuncionariosEmpresa.setFun_num(funcionariosEmpresa.getFun_num());
                }
                if (funcionariosEmpresa.getFun_cpl() != null) {
                    existingFuncionariosEmpresa.setFun_cpl(funcionariosEmpresa.getFun_cpl());
                }
                if (funcionariosEmpresa.getFun_dta() != null) {
                    existingFuncionariosEmpresa.setFun_dta(funcionariosEmpresa.getFun_dta());
                }
                if (funcionariosEmpresa.getFun_dtd() != null) {
                    existingFuncionariosEmpresa.setFun_dtd(funcionariosEmpresa.getFun_dtd());
                }
                if (funcionariosEmpresa.getFun_img() != null) {
                    existingFuncionariosEmpresa.setFun_img(funcionariosEmpresa.getFun_img());
                }
                if (funcionariosEmpresa.getFun_imgContentType() != null) {
                    existingFuncionariosEmpresa.setFun_imgContentType(funcionariosEmpresa.getFun_imgContentType());
                }
                if (funcionariosEmpresa.getFun_ema() != null) {
                    existingFuncionariosEmpresa.setFun_ema(funcionariosEmpresa.getFun_ema());
                }
                if (funcionariosEmpresa.getFun_ide() != null) {
                    existingFuncionariosEmpresa.setFun_ide(funcionariosEmpresa.getFun_ide());
                }
                if (funcionariosEmpresa.getFun_fpu() != null) {
                    existingFuncionariosEmpresa.setFun_fpu(funcionariosEmpresa.getFun_fpu());
                }
                if (funcionariosEmpresa.getFun_fps() != null) {
                    existingFuncionariosEmpresa.setFun_fps(funcionariosEmpresa.getFun_fps());
                }
                if (funcionariosEmpresa.getFun_tbp() != null) {
                    existingFuncionariosEmpresa.setFun_tbp(funcionariosEmpresa.getFun_tbp());
                }
                if (funcionariosEmpresa.getFun_dca() != null) {
                    existingFuncionariosEmpresa.setFun_dca(funcionariosEmpresa.getFun_dca());
                }
                if (funcionariosEmpresa.getFun_dcb() != null) {
                    existingFuncionariosEmpresa.setFun_dcb(funcionariosEmpresa.getFun_dcb());
                }
                if (funcionariosEmpresa.getFun_set() != null) {
                    existingFuncionariosEmpresa.setFun_set(funcionariosEmpresa.getFun_set());
                }
                if (funcionariosEmpresa.getFun_sab() != null) {
                    existingFuncionariosEmpresa.setFun_sab(funcionariosEmpresa.getFun_sab());
                }
                if (funcionariosEmpresa.getFun_sad() != null) {
                    existingFuncionariosEmpresa.setFun_sad(funcionariosEmpresa.getFun_sad());
                }
                if (funcionariosEmpresa.getFun_saa() != null) {
                    existingFuncionariosEmpresa.setFun_saa(funcionariosEmpresa.getFun_saa());
                }
                if (funcionariosEmpresa.getFun_sal() != null) {
                    existingFuncionariosEmpresa.setFun_sal(funcionariosEmpresa.getFun_sal());
                }
                if (funcionariosEmpresa.getFun_crf() != null) {
                    existingFuncionariosEmpresa.setFun_crf(funcionariosEmpresa.getFun_crf());
                }
                if (funcionariosEmpresa.getFun_rcr() != null) {
                    existingFuncionariosEmpresa.setFun_rcr(funcionariosEmpresa.getFun_rcr());
                }
                if (funcionariosEmpresa.getFun_dcr() != null) {
                    existingFuncionariosEmpresa.setFun_dcr(funcionariosEmpresa.getFun_dcr());
                }

                return existingFuncionariosEmpresa;
            })
            .map(funcionariosEmpresaRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<FuncionariosEmpresa> findAll() {
        log.debug("Request to get all FuncionariosEmpresas");
        return funcionariosEmpresaRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<FuncionariosEmpresa> findOne(Long id) {
        log.debug("Request to get FuncionariosEmpresa : {}", id);
        return funcionariosEmpresaRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete FuncionariosEmpresa : {}", id);
        funcionariosEmpresaRepository.deleteById(id);
    }
}
