package com.whiteledger.domain.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "business", uniqueConstraints = @UniqueConstraint(columnNames = "business_owner_id") )
public class Business extends BaseBean {

	private static final long serialVersionUID = 1419254646015336042L;
	private Long businessOwnerId;
	private String family;

	public Business() {
	}

	public Business(long id, Long businessOwnerId, String family) {
		this.businessOwnerId = businessOwnerId;
		this.family = family;
	}

	@Column(name = "business_owner_id", unique = true)
	public Long getBusinessOwnerId() {
		return this.businessOwnerId;
	}

	public void setBusinessOwnerId(Long businessOwnerId) {
		this.businessOwnerId = businessOwnerId;
	}

	@Column(name = "family", length = 256)
	public String getFamily() {
		return this.family;
	}

	public void setFamily(String family) {
		this.family = family;
	}
}
