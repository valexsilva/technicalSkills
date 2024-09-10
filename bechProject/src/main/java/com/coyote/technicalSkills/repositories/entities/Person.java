package com.coyote.technicalSkills.repositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Person extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7191664622438622623L;
	
	/**
	 * 
	 */
	@Id
	@Column(name = "DAS_ID", nullable = false)
    private Long personId;
	
	/**
	 * The name rfcFactoring.
	 */
	@Column(name = "NAME", nullable = false)
    private String nombre;
	
	/**
	 * The name rfcFactoring.
	 */
	@Column(name = "LAST_NAME", nullable = false)
    private String apellido;
	
	
}
