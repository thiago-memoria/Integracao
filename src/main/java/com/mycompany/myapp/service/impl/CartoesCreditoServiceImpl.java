package com.mycompany.myapp.service.impl;

import com.mycompany.myapp.domain.CartoesCredito;
import com.mycompany.myapp.repository.CartoesCreditoRepository;
import com.mycompany.myapp.service.CartoesCreditoService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link CartoesCredito}.
 */
@Service
@Transactional
public class CartoesCreditoServiceImpl implements CartoesCreditoService {

    private final Logger log = LoggerFactory.getLogger(CartoesCreditoServiceImpl.class);

    private final CartoesCreditoRepository cartoesCreditoRepository;

    public CartoesCreditoServiceImpl(CartoesCreditoRepository cartoesCreditoRepository) {
        this.cartoesCreditoRepository = cartoesCreditoRepository;
    }

    @Override
    public CartoesCredito save(CartoesCredito cartoesCredito) {
        log.debug("Request to save CartoesCredito : {}", cartoesCredito);
        return cartoesCreditoRepository.save(cartoesCredito);
    }

    @Override
    public CartoesCredito update(CartoesCredito cartoesCredito) {
        log.debug("Request to update CartoesCredito : {}", cartoesCredito);
        // no save call needed as we have no fields that can be updated
        return cartoesCredito;
    }

    @Override
    public Optional<CartoesCredito> partialUpdate(CartoesCredito cartoesCredito) {
        log.debug("Request to partially update CartoesCredito : {}", cartoesCredito);

        return cartoesCreditoRepository
            .findById(cartoesCredito.getId())
            .map(existingCartoesCredito -> {
                return existingCartoesCredito;
            })// .map(cartoesCreditoRepository::save)
        ;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CartoesCredito> findAll() {
        log.debug("Request to get all CartoesCreditos");
        return cartoesCreditoRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CartoesCredito> findOne(Long id) {
        log.debug("Request to get CartoesCredito : {}", id);
        return cartoesCreditoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete CartoesCredito : {}", id);
        cartoesCreditoRepository.deleteById(id);
    }
}
