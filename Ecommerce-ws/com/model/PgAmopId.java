package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgAmopId generated by hbm2java
 */
@Embeddable
public class PgAmopId implements java.io.Serializable {

	private int amopfamily;
	private int amoplefttype;
	private int amoprighttype;
	private short amopstrategy;
	private Serializable amoppurpose;
	private int amopopr;
	private int amopmethod;
	private int amopsortfamily;

	public PgAmopId() {
	}

	public PgAmopId(int amopfamily, int amoplefttype, int amoprighttype, short amopstrategy, Serializable amoppurpose,
			int amopopr, int amopmethod, int amopsortfamily) {
		this.amopfamily = amopfamily;
		this.amoplefttype = amoplefttype;
		this.amoprighttype = amoprighttype;
		this.amopstrategy = amopstrategy;
		this.amoppurpose = amoppurpose;
		this.amopopr = amopopr;
		this.amopmethod = amopmethod;
		this.amopsortfamily = amopsortfamily;
	}

	@Column(name = "amopfamily", nullable = false)
	public int getAmopfamily() {
		return this.amopfamily;
	}

	public void setAmopfamily(int amopfamily) {
		this.amopfamily = amopfamily;
	}

	@Column(name = "amoplefttype", nullable = false)
	public int getAmoplefttype() {
		return this.amoplefttype;
	}

	public void setAmoplefttype(int amoplefttype) {
		this.amoplefttype = amoplefttype;
	}

	@Column(name = "amoprighttype", nullable = false)
	public int getAmoprighttype() {
		return this.amoprighttype;
	}

	public void setAmoprighttype(int amoprighttype) {
		this.amoprighttype = amoprighttype;
	}

	@Column(name = "amopstrategy", nullable = false)
	public short getAmopstrategy() {
		return this.amopstrategy;
	}

	public void setAmopstrategy(short amopstrategy) {
		this.amopstrategy = amopstrategy;
	}

	@Column(name = "amoppurpose", nullable = false)
	public Serializable getAmoppurpose() {
		return this.amoppurpose;
	}

	public void setAmoppurpose(Serializable amoppurpose) {
		this.amoppurpose = amoppurpose;
	}

	@Column(name = "amopopr", nullable = false)
	public int getAmopopr() {
		return this.amopopr;
	}

	public void setAmopopr(int amopopr) {
		this.amopopr = amopopr;
	}

	@Column(name = "amopmethod", nullable = false)
	public int getAmopmethod() {
		return this.amopmethod;
	}

	public void setAmopmethod(int amopmethod) {
		this.amopmethod = amopmethod;
	}

	@Column(name = "amopsortfamily", nullable = false)
	public int getAmopsortfamily() {
		return this.amopsortfamily;
	}

	public void setAmopsortfamily(int amopsortfamily) {
		this.amopsortfamily = amopsortfamily;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgAmopId))
			return false;
		PgAmopId castOther = (PgAmopId) other;

		return (this.getAmopfamily() == castOther.getAmopfamily())
				&& (this.getAmoplefttype() == castOther.getAmoplefttype())
				&& (this.getAmoprighttype() == castOther.getAmoprighttype())
				&& (this.getAmopstrategy() == castOther.getAmopstrategy())
				&& ((this.getAmoppurpose() == castOther.getAmoppurpose())
						|| (this.getAmoppurpose() != null && castOther.getAmoppurpose() != null
								&& this.getAmoppurpose().equals(castOther.getAmoppurpose())))
				&& (this.getAmopopr() == castOther.getAmopopr()) && (this.getAmopmethod() == castOther.getAmopmethod())
				&& (this.getAmopsortfamily() == castOther.getAmopsortfamily());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAmopfamily();
		result = 37 * result + this.getAmoplefttype();
		result = 37 * result + this.getAmoprighttype();
		result = 37 * result + this.getAmopstrategy();
		result = 37 * result + (getAmoppurpose() == null ? 0 : this.getAmoppurpose().hashCode());
		result = 37 * result + this.getAmopopr();
		result = 37 * result + this.getAmopmethod();
		result = 37 * result + this.getAmopsortfamily();
		return result;
	}

}
