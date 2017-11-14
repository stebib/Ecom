package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgTsDictId generated by hbm2java
 */
@Embeddable
public class PgTsDictId implements java.io.Serializable {

	private String dictname;
	private int dictnamespace;
	private int dictowner;
	private int dicttemplate;
	private String dictinitoption;

	public PgTsDictId() {
	}

	public PgTsDictId(String dictname, int dictnamespace, int dictowner, int dicttemplate) {
		this.dictname = dictname;
		this.dictnamespace = dictnamespace;
		this.dictowner = dictowner;
		this.dicttemplate = dicttemplate;
	}

	public PgTsDictId(String dictname, int dictnamespace, int dictowner, int dicttemplate, String dictinitoption) {
		this.dictname = dictname;
		this.dictnamespace = dictnamespace;
		this.dictowner = dictowner;
		this.dicttemplate = dicttemplate;
		this.dictinitoption = dictinitoption;
	}

	@Column(name = "dictname", nullable = false, length = 64)
	public String getDictname() {
		return this.dictname;
	}

	public void setDictname(String dictname) {
		this.dictname = dictname;
	}

	@Column(name = "dictnamespace", nullable = false)
	public int getDictnamespace() {
		return this.dictnamespace;
	}

	public void setDictnamespace(int dictnamespace) {
		this.dictnamespace = dictnamespace;
	}

	@Column(name = "dictowner", nullable = false)
	public int getDictowner() {
		return this.dictowner;
	}

	public void setDictowner(int dictowner) {
		this.dictowner = dictowner;
	}

	@Column(name = "dicttemplate", nullable = false)
	public int getDicttemplate() {
		return this.dicttemplate;
	}

	public void setDicttemplate(int dicttemplate) {
		this.dicttemplate = dicttemplate;
	}

	@Column(name = "dictinitoption")
	public String getDictinitoption() {
		return this.dictinitoption;
	}

	public void setDictinitoption(String dictinitoption) {
		this.dictinitoption = dictinitoption;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgTsDictId))
			return false;
		PgTsDictId castOther = (PgTsDictId) other;

		return ((this.getDictname() == castOther.getDictname()) || (this.getDictname() != null
				&& castOther.getDictname() != null && this.getDictname().equals(castOther.getDictname())))
				&& (this.getDictnamespace() == castOther.getDictnamespace())
				&& (this.getDictowner() == castOther.getDictowner())
				&& (this.getDicttemplate() == castOther.getDicttemplate())
				&& ((this.getDictinitoption() == castOther.getDictinitoption())
						|| (this.getDictinitoption() != null && castOther.getDictinitoption() != null
								&& this.getDictinitoption().equals(castOther.getDictinitoption())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDictname() == null ? 0 : this.getDictname().hashCode());
		result = 37 * result + this.getDictnamespace();
		result = 37 * result + this.getDictowner();
		result = 37 * result + this.getDicttemplate();
		result = 37 * result + (getDictinitoption() == null ? 0 : this.getDictinitoption().hashCode());
		return result;
	}

}