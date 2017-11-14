package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgReplicationOriginId generated by hbm2java
 */
@Embeddable
public class PgReplicationOriginId implements java.io.Serializable {

	private int roident;
	private String roname;

	public PgReplicationOriginId() {
	}

	public PgReplicationOriginId(int roident, String roname) {
		this.roident = roident;
		this.roname = roname;
	}

	@Column(name = "roident", unique = true, nullable = false)
	public int getRoident() {
		return this.roident;
	}

	public void setRoident(int roident) {
		this.roident = roident;
	}

	@Column(name = "roname", unique = true, nullable = false)
	public String getRoname() {
		return this.roname;
	}

	public void setRoname(String roname) {
		this.roname = roname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgReplicationOriginId))
			return false;
		PgReplicationOriginId castOther = (PgReplicationOriginId) other;

		return (this.getRoident() == castOther.getRoident())
				&& ((this.getRoname() == castOther.getRoname()) || (this.getRoname() != null
						&& castOther.getRoname() != null && this.getRoname().equals(castOther.getRoname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRoident();
		result = 37 * result + (getRoname() == null ? 0 : this.getRoname().hashCode());
		return result;
	}

}