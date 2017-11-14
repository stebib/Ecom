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
 * PgProc generated by hbm2java
 */
@Entity
@Table(name = "pg_proc", schema = "pg_catalog", uniqueConstraints = { @UniqueConstraint(columnNames = "oid"),
		@UniqueConstraint(columnNames = { "proname", "proargtypes", "pronamespace" }) })
public class PgProc implements java.io.Serializable {

	private PgProcId id;

	public PgProc() {
	}

	public PgProc(PgProcId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "proname", column = @Column(name = "proname", nullable = false, length = 64)),
			@AttributeOverride(name = "pronamespace", column = @Column(name = "pronamespace", nullable = false)),
			@AttributeOverride(name = "proowner", column = @Column(name = "proowner", nullable = false)),
			@AttributeOverride(name = "prolang", column = @Column(name = "prolang", nullable = false)),
			@AttributeOverride(name = "procost", column = @Column(name = "procost", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "prorows", column = @Column(name = "prorows", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "provariadic", column = @Column(name = "provariadic", nullable = false)),
			@AttributeOverride(name = "protransform", column = @Column(name = "protransform", nullable = false)),
			@AttributeOverride(name = "proisagg", column = @Column(name = "proisagg", nullable = false)),
			@AttributeOverride(name = "proiswindow", column = @Column(name = "proiswindow", nullable = false)),
			@AttributeOverride(name = "prosecdef", column = @Column(name = "prosecdef", nullable = false)),
			@AttributeOverride(name = "proleakproof", column = @Column(name = "proleakproof", nullable = false)),
			@AttributeOverride(name = "proisstrict", column = @Column(name = "proisstrict", nullable = false)),
			@AttributeOverride(name = "proretset", column = @Column(name = "proretset", nullable = false)),
			@AttributeOverride(name = "provolatile", column = @Column(name = "provolatile", nullable = false)),
			@AttributeOverride(name = "proparallel", column = @Column(name = "proparallel", nullable = false)),
			@AttributeOverride(name = "pronargs", column = @Column(name = "pronargs", nullable = false)),
			@AttributeOverride(name = "pronargdefaults", column = @Column(name = "pronargdefaults", nullable = false)),
			@AttributeOverride(name = "prorettype", column = @Column(name = "prorettype", nullable = false)),
			@AttributeOverride(name = "proargtypes", column = @Column(name = "proargtypes", nullable = false)),
			@AttributeOverride(name = "proallargtypes", column = @Column(name = "proallargtypes")),
			@AttributeOverride(name = "proargmodes", column = @Column(name = "proargmodes")),
			@AttributeOverride(name = "proargnames", column = @Column(name = "proargnames")),
			@AttributeOverride(name = "proargdefaults", column = @Column(name = "proargdefaults")),
			@AttributeOverride(name = "protrftypes", column = @Column(name = "protrftypes")),
			@AttributeOverride(name = "prosrc", column = @Column(name = "prosrc", nullable = false)),
			@AttributeOverride(name = "probin", column = @Column(name = "probin")),
			@AttributeOverride(name = "proconfig", column = @Column(name = "proconfig")),
			@AttributeOverride(name = "proacl", column = @Column(name = "proacl")) })
	public PgProcId getId() {
		return this.id;
	}

	public void setId(PgProcId id) {
		this.id = id;
	}

}