package com.mkanchwala.ejamaat.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "sabeel", uniqueConstraints = @UniqueConstraint(columnNames = "sabeel_owner_id") )
public class Sabeel extends BaseBean {

	private static final long serialVersionUID = 1419254646015336042L;
	private Long sabeelOwnerId;
	private String family;

	public Sabeel() {
	}

	public Sabeel(long id, Long sabeelOwnerId, String family) {
		this.sabeelOwnerId = sabeelOwnerId;
		this.family = family;
	}

	@Column(name = "sabeel_owner_id", unique = true)
	public Long getSabeelOwnerId() {
		return this.sabeelOwnerId;
	}

	public void setSabeelOwnerId(Long sabeelOwnerId) {
		this.sabeelOwnerId = sabeelOwnerId;
	}

	@Column(name = "family", length = 256)
	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
}
