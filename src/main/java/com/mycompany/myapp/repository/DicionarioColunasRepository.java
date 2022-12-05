package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.DicionarioColunas;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the DicionarioColunas entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DicionarioColunasRepository extends JpaRepository<DicionarioColunas, Long> {}
