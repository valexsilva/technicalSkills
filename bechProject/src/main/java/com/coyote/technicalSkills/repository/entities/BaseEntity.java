package com.coyote.technicalSkills.repository.entities;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * The type Base entity.
 * @EntityListeners(AuditingEntityListener.class) 
 * Configura la auditoría automática para esa entidad. 
 * Spring Data JPA se encargará de llenar las propiedades de auditoría según corresponda.
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -724919057234957127L;

	/**
     * The Created date.
     */
    @Column(name = "CREATED_ON")
    @CreatedDate
    private Date createdDate;

    /**
     * The Modified date.
     */
    @Column(name = "MODIFIED_ON")
    @LastModifiedDate
    private Date modifiedDate;

    /**
     * The Created by.
     */
    @Column(name = "CREATED_BY")
    @CreatedBy
    private String createdBy;

    /**
     * The Modified by.
     */
    @Column(name = "MODIFIED_BY")
    @LastModifiedBy
    private String modifiedBy;

    /**
     * The Is active.
     */
    @Column(name = "IS_ACTIVE")
    private Integer isActive;
    
}
