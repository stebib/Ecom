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
 * PgForeignDataWrapper generated by hbm2java
 */
@Entity
@Table(name = "pg_foreign_data_wrapper", schema = "pg_catalog", uniqueConstraints = {
		@UniqueConstraint(columnNames = "fdwname"), @UniqueConstraint(columnNames = "oid") })
public class PgForeignDataWrapper implements java.io.Serializable {

	private PgForeignDataWrapperId id;

	public PgForeignDataWrapper() {
	}

	public PgForeignDataWrapper(PgForeignDataWrapperId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "fdwname", column = @Column(name = "fdwname", unique = true, nullable = false, length = 64)),
			@AttributeOverride(name = "fdwowner", column = @Column(name = "fdwowner", nullable = false)),
			@AttributeOverride(name = "fdwhandler", column = @Column(name = "fdwhandler", nullable = false)),
			@AttributeOverride(name = "fdwvalidator", column = @Column(name = "fdwvalidator", nullable = false)),
			@AttributeOverride(name = "fdwacl", column = @Column(name = "fdwacl")),
			@AttributeOverride(name = "fdwoptions", column = @Column(name = "fdwoptions")) })
	public PgForeignDataWrapperId getId() {
		return this.id;
	}

	public void setId(PgForeignDataWrapperId id) {
		this.id = id;
	}

}
