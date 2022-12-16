package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.Clientes;
import com.mycompany.myapp.repository.ClientesRepository;
import com.mycompany.myapp.service.ClientesService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link Clientes}.
 */
@Service
@Transactional
public class ClientesServiceImpl implements ClientesService {

    private final Logger log = LoggerFactory.getLogger(ClientesServiceImpl.class);

    private final ClientesRepository clientesRepository;

    public ClientesServiceImpl(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    @Override
    public Clientes save(Clientes clientes) {
        log.debug("Request to save Clientes : {}", clientes);
        return clientesRepository.save(clientes);
    }

    @Override
    public Clientes update(Clientes clientes) {
        log.debug("Request to update Clientes : {}", clientes);
        return clientesRepository.save(clientes);
    }

    @Override
    public Optional<Clientes> partialUpdate(Clientes clientes) {
        log.debug("Request to partially update Clientes : {}", clientes);

        return clientesRepository
            .findById(clientes.getId())
            .map(existingClientes -> {
                if (clientes.getCli_nom() != null) {
                    existingClientes.setCli_nom(clientes.getCli_nom());
                }
                if (clientes.getCli_end() != null) {
                    existingClientes.setCli_end(clientes.getCli_end());
                }
                if (clientes.getCli_ptr() != null) {
                    existingClientes.setCli_ptr(clientes.getCli_ptr());
                }
                if (clientes.getCli_bai() != null) {
                    existingClientes.setCli_bai(clientes.getCli_bai());
                }
                if (clientes.getCli_cid() != null) {
                    existingClientes.setCli_cid(clientes.getCli_cid());
                }
                if (clientes.getCli_est() != null) {
                    existingClientes.setCli_est(clientes.getCli_est());
                }
                if (clientes.getCli_cep() != null) {
                    existingClientes.setCli_cep(clientes.getCli_cep());
                }
                if (clientes.getCli_tel() != null) {
                    existingClientes.setCli_tel(clientes.getCli_tel());
                }
                if (clientes.getCli_cel() != null) {
                    existingClientes.setCli_cel(clientes.getCli_cel());
                }
                if (clientes.getCli_dtn() != null) {
                    existingClientes.setCli_dtn(clientes.getCli_dtn());
                }
                if (clientes.getCli_tip() != null) {
                    existingClientes.setCli_tip(clientes.getCli_tip());
                }
                if (clientes.getCli_mat() != null) {
                    existingClientes.setCli_mat(clientes.getCli_mat());
                }
                if (clientes.getCli_car() != null) {
                    existingClientes.setCli_car(clientes.getCli_car());
                }
                if (clientes.getCli_set() != null) {
                    existingClientes.setCli_set(clientes.getCli_set());
                }
                if (clientes.getCli_ide() != null) {
                    existingClientes.setCli_ide(clientes.getCli_ide());
                }
                if (clientes.getCli_des() != null) {
                    existingClientes.setCli_des(clientes.getCli_des());
                }
                if (clientes.getCli_pra() != null) {
                    existingClientes.setCli_pra(clientes.getCli_pra());
                }
                if (clientes.getCli_dia() != null) {
                    existingClientes.setCli_dia(clientes.getCli_dia());
                }
                if (clientes.getCli_blo() != null) {
                    existingClientes.setCli_blo(clientes.getCli_blo());
                }
                if (clientes.getCli_cre() != null) {
                    existingClientes.setCli_cre(clientes.getCli_cre());
                }
                if (clientes.getCli_deb() != null) {
                    existingClientes.setCli_deb(clientes.getCli_deb());
                }
                if (clientes.getCli_obs() != null) {
                    existingClientes.setCli_obs(clientes.getCli_obs());
                }
                if (clientes.getCli_obsContentType() != null) {
                    existingClientes.setCli_obsContentType(clientes.getCli_obsContentType());
                }
                if (clientes.getCli_cta() != null) {
                    existingClientes.setCli_cta(clientes.getCli_cta());
                }
                if (clientes.getCli_val() != null) {
                    existingClientes.setCli_val(clientes.getCli_val());
                }
                if (clientes.getCli_cse() != null) {
                    existingClientes.setCli_cse(clientes.getCli_cse());
                }
                if (clientes.getCli_cgc() != null) {
                    existingClientes.setCli_cgc(clientes.getCli_cgc());
                }
                if (clientes.getCli_raz() != null) {
                    existingClientes.setCli_raz(clientes.getCli_raz());
                }
                if (clientes.getCli_cgf() != null) {
                    existingClientes.setCli_cgf(clientes.getCli_cgf());
                }
                if (clientes.getCad_dat() != null) {
                    existingClientes.setCad_dat(clientes.getCad_dat());
                }
                if (clientes.getCli_mcp() != null) {
                    existingClientes.setCli_mcp(clientes.getCli_mcp());
                }
                if (clientes.getCli_pto() != null) {
                    existingClientes.setCli_pto(clientes.getCli_pto());
                }
                if (clientes.getCli_fid() != null) {
                    existingClientes.setCli_fid(clientes.getCli_fid());
                }
                if (clientes.getCli_bbl() != null) {
                    existingClientes.setCli_bbl(clientes.getCli_bbl());
                }
                if (clientes.getCli_bmo() != null) {
                    existingClientes.setCli_bmo(clientes.getCli_bmo());
                }
                if (clientes.getCli_cnt() != null) {
                    existingClientes.setCli_cnt(clientes.getCli_cnt());
                }
                if (clientes.getCli_dep() != null) {
                    existingClientes.setCli_dep(clientes.getCli_dep());
                }
                if (clientes.getCli_civ() != null) {
                    existingClientes.setCli_civ(clientes.getCli_civ());
                }
                if (clientes.getCli_nat() != null) {
                    existingClientes.setCli_nat(clientes.getCli_nat());
                }
                if (clientes.getCli_pro() != null) {
                    existingClientes.setCli_pro(clientes.getCli_pro());
                }
                if (clientes.getCli_tra() != null) {
                    existingClientes.setCli_tra(clientes.getCli_tra());
                }
                if (clientes.getCli_fil() != null) {
                    existingClientes.setCli_fil(clientes.getCli_fil());
                }
                if (clientes.getCli_cnj() != null) {
                    existingClientes.setCli_cnj(clientes.getCli_cnj());
                }
                if (clientes.getCli_tbp() != null) {
                    existingClientes.setCli_tbp(clientes.getCli_tbp());
                }
                if (clientes.getCli_fpg() != null) {
                    existingClientes.setCli_fpg(clientes.getCli_fpg());
                }
                if (clientes.getCli_edc() != null) {
                    existingClientes.setCli_edc(clientes.getCli_edc());
                }
                if (clientes.getCli_bac() != null) {
                    existingClientes.setCli_bac(clientes.getCli_bac());
                }
                if (clientes.getCli_cic() != null) {
                    existingClientes.setCli_cic(clientes.getCli_cic());
                }
                if (clientes.getCli_esc() != null) {
                    existingClientes.setCli_esc(clientes.getCli_esc());
                }
                if (clientes.getCli_cec() != null) {
                    existingClientes.setCli_cec(clientes.getCli_cec());
                }
                if (clientes.getCli_sal() != null) {
                    existingClientes.setCli_sal(clientes.getCli_sal());
                }
                if (clientes.getCli_dma() != null) {
                    existingClientes.setCli_dma(clientes.getCli_dma());
                }
                if (clientes.getCli_pla() != null) {
                    existingClientes.setCli_pla(clientes.getCli_pla());
                }
                if (clientes.getCli_tec() != null) {
                    existingClientes.setCli_tec(clientes.getCli_tec());
                }
                if (clientes.getCli_img() != null) {
                    existingClientes.setCli_img(clientes.getCli_img());
                }
                if (clientes.getCli_imgContentType() != null) {
                    existingClientes.setCli_imgContentType(clientes.getCli_imgContentType());
                }
                if (clientes.getCli_esp() != null) {
                    existingClientes.setCli_esp(clientes.getCli_esp());
                }
                if (clientes.getCli_cro() != null) {
                    existingClientes.setCli_cro(clientes.getCli_cro());
                }
                if (clientes.getCli_mun() != null) {
                    existingClientes.setCli_mun(clientes.getCli_mun());
                }
                if (clientes.getCad_exc() != null) {
                    existingClientes.setCad_exc(clientes.getCad_exc());
                }

                return existingClientes;
            })
            .map(clientesRepository::save);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Clientes> findAll() {
        log.debug("Request to get all Clientes");
        return clientesRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Clientes> findOne(Long id) {
        log.debug("Request to get Clientes : {}", id);
        return clientesRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Clientes : {}", id);
        clientesRepository.deleteById(id);
    }
}
