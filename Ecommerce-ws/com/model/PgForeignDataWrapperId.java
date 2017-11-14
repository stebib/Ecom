package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgForeignDataWrapperId generated by hbm2java
 */
@Embeddable
public class PgForeignDataWrapperId implements java.io.Serializable {

	private String fdwname;
	private int fdwowner;
	private int fdwhandler;
	private int fdwvalidator;
	private Serializable fdwacl;
	private Serializable fdwoptions;

	public PgForeignDataWrapperId() {
	}

	public PgForeignDataWrapperId(String fdwname, int fdwowner, int fdwhandler, int fdwvalidator) {
		this.fdwname = fdwname;
		this.fdwowner = fdwowner;
		this.fdwhandler = fdwhandler;
		this.fdwvalidator = fdwvalidator;
	}

	public PgForeignDataWrapperId(String fdwname, int fdwowner, int fdwhandler, int fdwvalidator, Serializable fdwacl,
			Serializable fdwoptions) {
		this.fdwname = fdwname;
		this.fdwowner = fdwowner;
		this.fdwhandler = fdwhandler;
		this.fdwvalidator = fdwvalidator;
		this.fdwacl = fdwacl;
		this.fdwoptions = fdwoptions;
	}

	@Column(name = "fdwname", unique = true, nullable = false, length = 64)
	public String getFdwname() {
		return this.fdwname;
	}

	public void setFdwname(String fdwname) {
		this.fdwname = fdwname;
	}

	@Column(name = "fdwowner", nullable = false)
	public int getFdwowner() {
		return this.fdwowner;
	}

	public void setFdwowner(int fdwowner) {
		this.fdwowner = fdwowner;
	}

	@Column(name = "fdwhandler", nullable = false)
	public int getFdwhandler() {
		return this.fdwhandler;
	}

	public void setFdwhandler(int fdwhandler) {
		this.fdwhandler = fdwhandler;
	}

	@Column(name = "fdwvalidator", nullable = false)
	public int getFdwvalidator() {
		return this.fdwvalidator;
	}

	public void setFdwvalidator(int fdwvalidator) {
		this.fdwvalidator = fdwvalidator;
	}

	@Column(name = "fdwacl")
	public Serializable getFdwacl() {
		return this.fdwacl;
	}

	public void setFdwacl(Serializable fdwacl) {
		this.fdwacl = fdwacl;
	}

	@Column(name = "fdwoptions")
	public Serializable getFdwoptions() {
		return this.fdwoptions;
	}

	public void setFdwoptions(Serializable fdwoptions) {
		this.fdwoptions = fdwoptions;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgForeignDataWrapperId))
			return false;
		PgForeignDataWrapperId castOther = (PgForeignDataWrapperId) other;

		return ((this.getFdwname() == castOther.getFdwname()) || (this.getFdwname() != null
				&& castOther.getFdwname() != null && this.getFdwname().equals(castOther.getFdwname())))
				&& (this.getFdwowner() == castOther.getFdwowner())
				&& (this.getFdwhandler() == castOther.getFdwhandler())
				&& (this.getFdwvalidator() == castOther.getFdwvalidator())
				&& ((this.getFdwacl() == castOther.getFdwacl()) || (this.getFdwacl() != null
						&& castOther.getFdwacl() != null && this.getFdwacl().equals(castOther.getFdwacl())))
				&& ((this.getFdwoptions() == castOther.getFdwoptions())
						|| (this.getFdwoptions() != null && castOther.getFdwoptions() != null
								&& this.getFdwoptions().equals(castOther.getFdwoptions())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getFdwname() == null ? 0 : this.getFdwname().hashCode());
		result = 37 * result + this.getFdwowner();
		result = 37 * result + this.getFdwhandler();
		result = 37 * result + this.getFdwvalidator();
		result = 37 * result + (getFdwacl() == null ? 0 : this.getFdwacl().hashCode());
		result = 37 * result + (getFdwoptions() == null ? 0 : this.getFdwoptions().hashCode());
		return result;
	}

}