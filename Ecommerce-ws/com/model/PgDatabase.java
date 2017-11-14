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
 * PgDatabase generated by hbm2java
 */
@Entity
@Table(name = "pg_database", schema = "pg_catalog", uniqueConstraints = { @UniqueConstraint(columnNames = "datname"),
		@UniqueConstraint(columnNames = "oid") })
public class PgDatabase implements java.io.Serializable {

	private PgDatabaseId id;

	public PgDatabase() {
	}

	public PgDatabase(PgDatabaseId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "datname", column = @Column(name = "datname", unique = true, nullable = false, length = 64)),
			@AttributeOverride(name = "datdba", column = @Column(name = "datdba", nullable = false)),
			@AttributeOverride(name = "encoding", column = @Column(name = "encoding", nullable = false)),
			@AttributeOverride(name = "datcollate", column = @Column(name = "datcollate", nullable = false, length = 64)),
			@AttributeOverride(name = "datctype", column = @Column(name = "datctype", nullable = false, length = 64)),
			@AttributeOverride(name = "datistemplate", column = @Column(name = "datistemplate", nullable = false)),
			@AttributeOverride(name = "datallowconn", column = @Column(name = "datallowconn", nullable = false)),
			@AttributeOverride(name = "datconnlimit", column = @Column(name = "datconnlimit", nullable = false)),
			@AttributeOverride(name = "datlastsysoid", column = @Column(name = "datlastsysoid", nullable = false)),
			@AttributeOverride(name = "datfrozenxid", column = @Column(name = "datfrozenxid", nullable = false)),
			@AttributeOverride(name = "datminmxid", column = @Column(name = "datminmxid", nullable = false)),
			@AttributeOverride(name = "dattablespace", column = @Column(name = "dattablespace", nullable = false)),
			@AttributeOverride(name = "datacl", column = @Column(name = "datacl")) })
	public PgDatabaseId getId() {
		return this.id;
	}

	public void setId(PgDatabaseId id) {
		this.id = id;
	}

}