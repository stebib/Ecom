package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgAggregateId generated by hbm2java
 */
@Embeddable
public class PgAggregateId implements java.io.Serializable {

	private Serializable aggfnoid;
	private Serializable aggkind;
	private short aggnumdirectargs;
	private Serializable aggtransfn;
	private Serializable aggfinalfn;
	private Serializable aggcombinefn;
	private Serializable aggserialfn;
	private Serializable aggdeserialfn;
	private Serializable aggmtransfn;
	private Serializable aggminvtransfn;
	private Serializable aggmfinalfn;
	private boolean aggfinalextra;
	private boolean aggmfinalextra;
	private int aggsortop;
	private int aggtranstype;
	private int aggtransspace;
	private int aggmtranstype;
	private int aggmtransspace;
	private String agginitval;
	private String aggminitval;

	public PgAggregateId() {
	}

	public PgAggregateId(Serializable aggfnoid, Serializable aggkind, short aggnumdirectargs, Serializable aggtransfn,
			Serializable aggfinalfn, Serializable aggcombinefn, Serializable aggserialfn, Serializable aggdeserialfn,
			Serializable aggmtransfn, Serializable aggminvtransfn, Serializable aggmfinalfn, boolean aggfinalextra,
			boolean aggmfinalextra, int aggsortop, int aggtranstype, int aggtransspace, int aggmtranstype,
			int aggmtransspace) {
		this.aggfnoid = aggfnoid;
		this.aggkind = aggkind;
		this.aggnumdirectargs = aggnumdirectargs;
		this.aggtransfn = aggtransfn;
		this.aggfinalfn = aggfinalfn;
		this.aggcombinefn = aggcombinefn;
		this.aggserialfn = aggserialfn;
		this.aggdeserialfn = aggdeserialfn;
		this.aggmtransfn = aggmtransfn;
		this.aggminvtransfn = aggminvtransfn;
		this.aggmfinalfn = aggmfinalfn;
		this.aggfinalextra = aggfinalextra;
		this.aggmfinalextra = aggmfinalextra;
		this.aggsortop = aggsortop;
		this.aggtranstype = aggtranstype;
		this.aggtransspace = aggtransspace;
		this.aggmtranstype = aggmtranstype;
		this.aggmtransspace = aggmtransspace;
	}

	public PgAggregateId(Serializable aggfnoid, Serializable aggkind, short aggnumdirectargs, Serializable aggtransfn,
			Serializable aggfinalfn, Serializable aggcombinefn, Serializable aggserialfn, Serializable aggdeserialfn,
			Serializable aggmtransfn, Serializable aggminvtransfn, Serializable aggmfinalfn, boolean aggfinalextra,
			boolean aggmfinalextra, int aggsortop, int aggtranstype, int aggtransspace, int aggmtranstype,
			int aggmtransspace, String agginitval, String aggminitval) {
		this.aggfnoid = aggfnoid;
		this.aggkind = aggkind;
		this.aggnumdirectargs = aggnumdirectargs;
		this.aggtransfn = aggtransfn;
		this.aggfinalfn = aggfinalfn;
		this.aggcombinefn = aggcombinefn;
		this.aggserialfn = aggserialfn;
		this.aggdeserialfn = aggdeserialfn;
		this.aggmtransfn = aggmtransfn;
		this.aggminvtransfn = aggminvtransfn;
		this.aggmfinalfn = aggmfinalfn;
		this.aggfinalextra = aggfinalextra;
		this.aggmfinalextra = aggmfinalextra;
		this.aggsortop = aggsortop;
		this.aggtranstype = aggtranstype;
		this.aggtransspace = aggtransspace;
		this.aggmtranstype = aggmtranstype;
		this.aggmtransspace = aggmtransspace;
		this.agginitval = agginitval;
		this.aggminitval = aggminitval;
	}

	@Column(name = "aggfnoid", unique = true, nullable = false)
	public Serializable getAggfnoid() {
		return this.aggfnoid;
	}

	public void setAggfnoid(Serializable aggfnoid) {
		this.aggfnoid = aggfnoid;
	}

	@Column(name = "aggkind", nullable = false)
	public Serializable getAggkind() {
		return this.aggkind;
	}

	public void setAggkind(Serializable aggkind) {
		this.aggkind = aggkind;
	}

	@Column(name = "aggnumdirectargs", nullable = false)
	public short getAggnumdirectargs() {
		return this.aggnumdirectargs;
	}

	public void setAggnumdirectargs(short aggnumdirectargs) {
		this.aggnumdirectargs = aggnumdirectargs;
	}

	@Column(name = "aggtransfn", nullable = false)
	public Serializable getAggtransfn() {
		return this.aggtransfn;
	}

	public void setAggtransfn(Serializable aggtransfn) {
		this.aggtransfn = aggtransfn;
	}

	@Column(name = "aggfinalfn", nullable = false)
	public Serializable getAggfinalfn() {
		return this.aggfinalfn;
	}

	public void setAggfinalfn(Serializable aggfinalfn) {
		this.aggfinalfn = aggfinalfn;
	}

	@Column(name = "aggcombinefn", nullable = false)
	public Serializable getAggcombinefn() {
		return this.aggcombinefn;
	}

	public void setAggcombinefn(Serializable aggcombinefn) {
		this.aggcombinefn = aggcombinefn;
	}

	@Column(name = "aggserialfn", nullable = false)
	public Serializable getAggserialfn() {
		return this.aggserialfn;
	}

	public void setAggserialfn(Serializable aggserialfn) {
		this.aggserialfn = aggserialfn;
	}

	@Column(name = "aggdeserialfn", nullable = false)
	public Serializable getAggdeserialfn() {
		return this.aggdeserialfn;
	}

	public void setAggdeserialfn(Serializable aggdeserialfn) {
		this.aggdeserialfn = aggdeserialfn;
	}

	@Column(name = "aggmtransfn", nullable = false)
	public Serializable getAggmtransfn() {
		return this.aggmtransfn;
	}

	public void setAggmtransfn(Serializable aggmtransfn) {
		this.aggmtransfn = aggmtransfn;
	}

	@Column(name = "aggminvtransfn", nullable = false)
	public Serializable getAggminvtransfn() {
		return this.aggminvtransfn;
	}

	public void setAggminvtransfn(Serializable aggminvtransfn) {
		this.aggminvtransfn = aggminvtransfn;
	}

	@Column(name = "aggmfinalfn", nullable = false)
	public Serializable getAggmfinalfn() {
		return this.aggmfinalfn;
	}

	public void setAggmfinalfn(Serializable aggmfinalfn) {
		this.aggmfinalfn = aggmfinalfn;
	}

	@Column(name = "aggfinalextra", nullable = false)
	public boolean isAggfinalextra() {
		return this.aggfinalextra;
	}

	public void setAggfinalextra(boolean aggfinalextra) {
		this.aggfinalextra = aggfinalextra;
	}

	@Column(name = "aggmfinalextra", nullable = false)
	public boolean isAggmfinalextra() {
		return this.aggmfinalextra;
	}

	public void setAggmfinalextra(boolean aggmfinalextra) {
		this.aggmfinalextra = aggmfinalextra;
	}

	@Column(name = "aggsortop", nullable = false)
	public int getAggsortop() {
		return this.aggsortop;
	}

	public void setAggsortop(int aggsortop) {
		this.aggsortop = aggsortop;
	}

	@Column(name = "aggtranstype", nullable = false)
	public int getAggtranstype() {
		return this.aggtranstype;
	}

	public void setAggtranstype(int aggtranstype) {
		this.aggtranstype = aggtranstype;
	}

	@Column(name = "aggtransspace", nullable = false)
	public int getAggtransspace() {
		return this.aggtransspace;
	}

	public void setAggtransspace(int aggtransspace) {
		this.aggtransspace = aggtransspace;
	}

	@Column(name = "aggmtranstype", nullable = false)
	public int getAggmtranstype() {
		return this.aggmtranstype;
	}

	public void setAggmtranstype(int aggmtranstype) {
		this.aggmtranstype = aggmtranstype;
	}

	@Column(name = "aggmtransspace", nullable = false)
	public int getAggmtransspace() {
		return this.aggmtransspace;
	}

	public void setAggmtransspace(int aggmtransspace) {
		this.aggmtransspace = aggmtransspace;
	}

	@Column(name = "agginitval")
	public String getAgginitval() {
		return this.agginitval;
	}

	public void setAgginitval(String agginitval) {
		this.agginitval = agginitval;
	}

	@Column(name = "aggminitval")
	public String getAggminitval() {
		return this.aggminitval;
	}

	public void setAggminitval(String aggminitval) {
		this.aggminitval = aggminitval;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgAggregateId))
			return false;
		PgAggregateId castOther = (PgAggregateId) other;

		return ((this.getAggfnoid() == castOther.getAggfnoid()) || (this.getAggfnoid() != null
				&& castOther.getAggfnoid() != null && this.getAggfnoid().equals(castOther.getAggfnoid())))
				&& ((this.getAggkind() == castOther.getAggkind()) || (this.getAggkind() != null
						&& castOther.getAggkind() != null && this.getAggkind().equals(castOther.getAggkind())))
				&& (this.getAggnumdirectargs() == castOther.getAggnumdirectargs())
				&& ((this.getAggtransfn() == castOther.getAggtransfn()) || (this.getAggtransfn() != null
						&& castOther.getAggtransfn() != null && this.getAggtransfn().equals(castOther.getAggtransfn())))
				&& ((this.getAggfinalfn() == castOther.getAggfinalfn()) || (this.getAggfinalfn() != null
						&& castOther.getAggfinalfn() != null && this.getAggfinalfn().equals(castOther.getAggfinalfn())))
				&& ((this.getAggcombinefn() == castOther.getAggcombinefn())
						|| (this.getAggcombinefn() != null && castOther.getAggcombinefn() != null
								&& this.getAggcombinefn().equals(castOther.getAggcombinefn())))
				&& ((this.getAggserialfn() == castOther.getAggserialfn())
						|| (this.getAggserialfn() != null && castOther.getAggserialfn() != null
								&& this.getAggserialfn().equals(castOther.getAggserialfn())))
				&& ((this.getAggdeserialfn() == castOther.getAggdeserialfn())
						|| (this.getAggdeserialfn() != null && castOther.getAggdeserialfn() != null
								&& this.getAggdeserialfn().equals(castOther.getAggdeserialfn())))
				&& ((this.getAggmtransfn() == castOther.getAggmtransfn())
						|| (this.getAggmtransfn() != null && castOther.getAggmtransfn() != null
								&& this.getAggmtransfn().equals(castOther.getAggmtransfn())))
				&& ((this.getAggminvtransfn() == castOther.getAggminvtransfn())
						|| (this.getAggminvtransfn() != null && castOther.getAggminvtransfn() != null
								&& this.getAggminvtransfn().equals(castOther.getAggminvtransfn())))
				&& ((this.getAggmfinalfn() == castOther.getAggmfinalfn())
						|| (this.getAggmfinalfn() != null && castOther.getAggmfinalfn() != null
								&& this.getAggmfinalfn().equals(castOther.getAggmfinalfn())))
				&& (this.isAggfinalextra() == castOther.isAggfinalextra())
				&& (this.isAggmfinalextra() == castOther.isAggmfinalextra())
				&& (this.getAggsortop() == castOther.getAggsortop())
				&& (this.getAggtranstype() == castOther.getAggtranstype())
				&& (this.getAggtransspace() == castOther.getAggtransspace())
				&& (this.getAggmtranstype() == castOther.getAggmtranstype())
				&& (this.getAggmtransspace() == castOther.getAggmtransspace())
				&& ((this.getAgginitval() == castOther.getAgginitval()) || (this.getAgginitval() != null
						&& castOther.getAgginitval() != null && this.getAgginitval().equals(castOther.getAgginitval())))
				&& ((this.getAggminitval() == castOther.getAggminitval())
						|| (this.getAggminitval() != null && castOther.getAggminitval() != null
								&& this.getAggminitval().equals(castOther.getAggminitval())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAggfnoid() == null ? 0 : this.getAggfnoid().hashCode());
		result = 37 * result + (getAggkind() == null ? 0 : this.getAggkind().hashCode());
		result = 37 * result + this.getAggnumdirectargs();
		result = 37 * result + (getAggtransfn() == null ? 0 : this.getAggtransfn().hashCode());
		result = 37 * result + (getAggfinalfn() == null ? 0 : this.getAggfinalfn().hashCode());
		result = 37 * result + (getAggcombinefn() == null ? 0 : this.getAggcombinefn().hashCode());
		result = 37 * result + (getAggserialfn() == null ? 0 : this.getAggserialfn().hashCode());
		result = 37 * result + (getAggdeserialfn() == null ? 0 : this.getAggdeserialfn().hashCode());
		result = 37 * result + (getAggmtransfn() == null ? 0 : this.getAggmtransfn().hashCode());
		result = 37 * result + (getAggminvtransfn() == null ? 0 : this.getAggminvtransfn().hashCode());
		result = 37 * result + (getAggmfinalfn() == null ? 0 : this.getAggmfinalfn().hashCode());
		result = 37 * result + (this.isAggfinalextra() ? 1 : 0);
		result = 37 * result + (this.isAggmfinalextra() ? 1 : 0);
		result = 37 * result + this.getAggsortop();
		result = 37 * result + this.getAggtranstype();
		result = 37 * result + this.getAggtransspace();
		result = 37 * result + this.getAggmtranstype();
		result = 37 * result + this.getAggmtransspace();
		result = 37 * result + (getAgginitval() == null ? 0 : this.getAgginitval().hashCode());
		result = 37 * result + (getAggminitval() == null ? 0 : this.getAggminitval().hashCode());
		return result;
	}

}