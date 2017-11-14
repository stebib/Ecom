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
 * PgLargeobject generated by hbm2java
 */
@Entity
@Table(name = "pg_largeobject", schema = "pg_catalog", uniqueConstraints = @UniqueConstraint(columnNames = { "loid",
		"pageno" }))
public class PgLargeobject implements java.io.Serializable {

	private PgLargeobjectId id;

	public PgLargeobject() {
	}

	public PgLargeobject(PgLargeobjectId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "loid", column = @Column(name = "loid", nullable = false)),
			@AttributeOverride(name = "pageno", column = @Column(name = "pageno", nullable = false)),
			@AttributeOverride(name = "data", column = @Column(name = "data", nullable = false)) })
	public PgLargeobjectId getId() {
		return this.id;
	}

	public void setId(PgLargeobjectId id) {
		this.id = id;
	}

}