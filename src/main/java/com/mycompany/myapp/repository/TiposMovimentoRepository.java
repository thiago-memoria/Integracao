package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.TiposMovimento;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the TiposMovimento entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TiposMovimentoRepository extends JpaRepository<TiposMovimento, Long> {}
