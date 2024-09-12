package com.coyote.authApi.repository.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Table(name = "user")
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User implements Serializable, UserDetails  {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 7804596977750694864L;

	/**
     * The Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;

    /**
     * The DAS_ID.
     */
    @Column(name = "DAS_ID",nullable = false)
    private String personId;

    /**
     * The email.
     */
    @Column(unique = true, length = 100, nullable = false)
    private String email;

    /**
     * The password.
     */
    @Column(nullable = false)
    private String password;
   
    /**
     * The Is active.
     */
    @Column(name = "IS_ACTIVE")
    private Integer isActive;

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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		
		return personId;
	}

	@Override
	public boolean isAccountNonExpired() {
		return isActive==1;
	}

	@Override
	public boolean isAccountNonLocked() {
		return isActive==1;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return isActive==1;
	}

	@Override
	public boolean isEnabled() {
		return isActive==1;
	}
}