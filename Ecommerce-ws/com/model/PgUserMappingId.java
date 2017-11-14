package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgUserMappingId generated by hbm2java
 */
@Embeddable
public class PgUserMappingId implements java.io.Serializable {

	private int umuser;
	private int umserver;
	private Serializable umoptions;

	public PgUserMappingId() {
	}

	public PgUserMappingId(int umuser, int umserver) {
		this.umuser = umuser;
		this.umserver = umserver;
	}

	public PgUserMappingId(int umuser, int umserver, Serializable umoptions) {
		this.umuser = umuser;
		this.umserver = umserver;
		this.umoptions = umoptions;
	}

	@Column(name = "umuser", nullable = false)
	public int getUmuser() {
		return this.umuser;
	}

	public void setUmuser(int umuser) {
		this.umuser = umuser;
	}

	@Column(name = "umserver", nullable = false)
	public int getUmserver() {
		return this.umserver;
	}

	public void setUmserver(int umserver) {
		this.umserver = umserver;
	}

	@Column(name = "umoptions")
	public Serializable getUmoptions() {
		return this.umoptions;
	}

	public void setUmoptions(Serializable umoptions) {
		this.umoptions = umoptions;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgUserMappingId))
			return false;
		PgUserMappingId castOther = (PgUserMappingId) other;

		return (this.getUmuser() == castOther.getUmuser()) && (this.getUmserver() == castOther.getUmserver())
				&& ((this.getUmoptions() == castOther.getUmoptions()) || (this.getUmoptions() != null
						&& castOther.getUmoptions() != null && this.getUmoptions().equals(castOther.getUmoptions())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUmuser();
		result = 37 * result + this.getUmserver();
		result = 37 * result + (getUmoptions() == null ? 0 : this.getUmoptions().hashCode());
		return result;
	}

}