package com.coyote.technicalSkills.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseEntityRepository<T> extends JpaRepository<T, Object> {
	
    /*Optional<T> findByIdAndIsActive(Long id, Integer isActive);
    
    Optional<T> findByIdAndIsActive(String id, Integer isActive);
    
    Page<T> findByIdAndIsActive(Pageable pageable, Long id, Integer isActive);
    
    Page<T> findByIdAndIsActive(Pageable pageable, String id, Integer isActive);
    
    Page<T> findAllByIsActive(Pageable pageable, Integer isActive);
    
    List<T> findAllByIdAndIsActive(Long id, Integer isActive);
    
    List<T> findAllByIdAndIsActive(String id, Integer isActive);
    
    List<T> findAllByIsActive(Integer isActive);*/
    
}
