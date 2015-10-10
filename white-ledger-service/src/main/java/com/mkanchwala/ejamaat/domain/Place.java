package com.mkanchwala.ejamaat.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "place")
public class Place extends BaseBean {

	private static final long serialVersionUID = -1508650354352795242L;
	private String name;
	private Float latitude;
	private Float longitude;
	
	@Column(name = "name", length = 45)
	@JsonView(DataView.SummaryWithAudit.class)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "latitude", precision = 12, scale = 0)
	@JsonView(DataView.FullWithoutAudit.class)
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	
	@Column(name = "longitude", precision = 12, scale = 0)
	@JsonView(DataView.FullWithoutAudit.class)
	public Float getLongitude() {
		return longitude;
	}
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
}