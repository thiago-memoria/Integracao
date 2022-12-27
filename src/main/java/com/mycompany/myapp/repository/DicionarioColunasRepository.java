package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.DicionarioColunas;
import com.mycompany.myapp.domain.DicionarioColunasId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DicionarioColunas entity.
 */
@Repository
public interface DicionarioColunasRepository extends JpaRepository<DicionarioColunas, DicionarioColunasId> {
}
