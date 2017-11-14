package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgRangeId generated by hbm2java
 */
@Embeddable
public class PgRangeId implements java.io.Serializable {

	private int rngtypid;
	private int rngsubtype;
	private int rngcollation;
	private int rngsubopc;
	private Serializable rngcanonical;
	private Serializable rngsubdiff;

	public PgRangeId() {
	}

	public PgRangeId(int rngtypid, int rngsubtype, int rngcollation, int rngsubopc, Serializable rngcanonical,
			Serializable rngsubdiff) {
		this.rngtypid = rngtypid;
		this.rngsubtype = rngsubtype;
		this.rngcollation = rngcollation;
		this.rngsubopc = rngsubopc;
		this.rngcanonical = rngcanonical;
		this.rngsubdiff = rngsubdiff;
	}

	@Column(name = "rngtypid", unique = true, nullable = false)
	public int getRngtypid() {
		return this.rngtypid;
	}

	public void setRngtypid(int rngtypid) {
		this.rngtypid = rngtypid;
	}

	@Column(name = "rngsubtype", nullable = false)
	public int getRngsubtype() {
		return this.rngsubtype;
	}

	public void setRngsubtype(int rngsubtype) {
		this.rngsubtype = rngsubtype;
	}

	@Column(name = "rngcollation", nullable = false)
	public int getRngcollation() {
		return this.rngcollation;
	}

	public void setRngcollation(int rngcollation) {
		this.rngcollation = rngcollation;
	}

	@Column(name = "rngsubopc", nullable = false)
	public int getRngsubopc() {
		return this.rngsubopc;
	}

	public void setRngsubopc(int rngsubopc) {
		this.rngsubopc = rngsubopc;
	}

	@Column(name = "rngcanonical", nullable = false)
	public Serializable getRngcanonical() {
		return this.rngcanonical;
	}

	public void setRngcanonical(Serializable rngcanonical) {
		this.rngcanonical = rngcanonical;
	}

	@Column(name = "rngsubdiff", nullable = false)
	public Serializable getRngsubdiff() {
		return this.rngsubdiff;
	}

	public void setRngsubdiff(Serializable rngsubdiff) {
		this.rngsubdiff = rngsubdiff;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgRangeId))
			return false;
		PgRangeId castOther = (PgRangeId) other;

		return (this.getRngtypid() == castOther.getRngtypid()) && (this.getRngsubtype() == castOther.getRngsubtype())
				&& (this.getRngcollation() == castOther.getRngcollation())
				&& (this.getRngsubopc() == castOther.getRngsubopc())
				&& ((this.getRngcanonical() == castOther.getRngcanonical())
						|| (this.getRngcanonical() != null && castOther.getRngcanonical() != null
								&& this.getRngcanonical().equals(castOther.getRngcanonical())))
				&& ((this.getRngsubdiff() == castOther.getRngsubdiff())
						|| (this.getRngsubdiff() != null && castOther.getRngsubdiff() != null
								&& this.getRngsubdiff().equals(castOther.getRngsubdiff())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRngtypid();
		result = 37 * result + this.getRngsubtype();
		result = 37 * result + this.getRngcollation();
		result = 37 * result + this.getRngsubopc();
		result = 37 * result + (getRngcanonical() == null ? 0 : this.getRngcanonical().hashCode());
		result = 37 * result + (getRngsubdiff() == null ? 0 : this.getRngsubdiff().hashCode());
		return result;
	}

}
