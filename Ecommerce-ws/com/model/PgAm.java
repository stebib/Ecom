package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * PgAm generated by hbm2java
 */
@Entity
@Table(name = "pg_am", schema = "pg_catalog", uniqueConstraints = { @UniqueConstraint(columnNames = "amname"),
		@UniqueConstraint(columnNames = "oid") })
public class PgAm implements java.io.Serializable {

	private PgAmId id;

	public PgAm() {
	}

	public PgAm(PgAmId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "amname", column = @Column(name = "amname", unique = true, nullable = false, length = 64)),
			@AttributeOverride(name = "amhandler", column = @Column(name = "amhandler", nullable = false)),
			@AttributeOverride(name = "amtype", column = @Column(name = "amtype", nullable = false)) })
	public PgAmId getId() {
		return this.id;
	}

	public void setId(PgAmId id) {
		this.id = id;
	}

}
