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
 * PgTsConfig generated by hbm2java
 */
@Entity
@Table(name = "pg_ts_config", schema = "pg_catalog", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "cfgname", "cfgnamespace" }), @UniqueConstraint(columnNames = "oid") })
public class PgTsConfig implements java.io.Serializable {

	private PgTsConfigId id;

	public PgTsConfig() {
	}

	public PgTsConfig(PgTsConfigId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cfgname", column = @Column(name = "cfgname", nullable = false, length = 64)),
			@AttributeOverride(name = "cfgnamespace", column = @Column(name = "cfgnamespace", nullable = false)),
			@AttributeOverride(name = "cfgowner", column = @Column(name = "cfgowner", nullable = false)),
			@AttributeOverride(name = "cfgparser", column = @Column(name = "cfgparser", nullable = false)) })
	public PgTsConfigId getId() {
		return this.id;
	}

	public void setId(PgTsConfigId id) {
		this.id = id;
	}

}