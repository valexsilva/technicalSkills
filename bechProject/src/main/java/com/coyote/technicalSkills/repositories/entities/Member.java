package com.coyote.technicalSkills.repositories.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7191664622438622623L;
	
	/**
	 * MEMBER_ID.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "MEMBER_ID", nullable = false)
    private Long id;
	
	/**
	 * The person.
	 */
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DAS_ID", referencedColumnName = "DAS_ID", nullable = false)
    private Person person;
	
}
