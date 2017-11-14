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
 * PgAmop generated by hbm2java
 */
@Entity
@Table(name = "pg_amop", schema = "pg_catalog", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "amopfamily", "amoplefttype", "amoprighttype", "amopstrategy" }),
		@UniqueConstraint(columnNames = "oid"),
		@UniqueConstraint(columnNames = { "amopopr", "amoppurpose", "amopfamily" }) })
public class PgAmop implements java.io.Serializable {

	private PgAmopId id;

	public PgAmop() {
	}

	public PgAmop(PgAmopId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "amopfamily", column = @Column(name = "amopfamily", nullable = false)),
			@AttributeOverride(name = "amoplefttype", column = @Column(name = "amoplefttype", nullable = false)),
			@AttributeOverride(name = "amoprighttype", column = @Column(name = "amoprighttype", nullable = false)),
			@AttributeOverride(name = "amopstrategy", column = @Column(name = "amopstrategy", nullable = false)),
			@AttributeOverride(name = "amoppurpose", column = @Column(name = "amoppurpose", nullable = false)),
			@AttributeOverride(name = "amopopr", column = @Column(name = "amopopr", nullable = false)),
			@AttributeOverride(name = "amopmethod", column = @Column(name = "amopmethod", nullable = false)),
			@AttributeOverride(name = "amopsortfamily", column = @Column(name = "amopsortfamily", nullable = false)) })
	public PgAmopId getId() {
		return this.id;
	}

	public void setId(PgAmopId id) {
		this.id = id;
	}

}
