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
 * PgType generated by hbm2java
 */
@Entity
@Table(name = "pg_type", schema = "pg_catalog", uniqueConstraints = { @UniqueConstraint(columnNames = "oid"),
		@UniqueConstraint(columnNames = { "typname", "typnamespace" }) })
public class PgType implements java.io.Serializable {

	private PgTypeId id;

	public PgType() {
	}

	public PgType(PgTypeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "typname", column = @Column(name = "typname", nullable = false, length = 64)),
			@AttributeOverride(name = "typnamespace", column = @Column(name = "typnamespace", nullable = false)),
			@AttributeOverride(name = "typowner", column = @Column(name = "typowner", nullable = false)),
			@AttributeOverride(name = "typlen", column = @Column(name = "typlen", nullable = false)),
			@AttributeOverride(name = "typbyval", column = @Column(name = "typbyval", nullable = false)),
			@AttributeOverride(name = "typtype", column = @Column(name = "typtype", nullable = false)),
			@AttributeOverride(name = "typcategory", column = @Column(name = "typcategory", nullable = false)),
			@AttributeOverride(name = "typispreferred", column = @Column(name = "typispreferred", nullable = false)),
			@AttributeOverride(name = "typisdefined", column = @Column(name = "typisdefined", nullable = false)),
			@AttributeOverride(name = "typdelim", column = @Column(name = "typdelim", nullable = false)),
			@AttributeOverride(name = "typrelid", column = @Column(name = "typrelid", nullable = false)),
			@AttributeOverride(name = "typelem", column = @Column(name = "typelem", nullable = false)),
			@AttributeOverride(name = "typarray", column = @Column(name = "typarray", nullable = false)),
			@AttributeOverride(name = "typinput", column = @Column(name = "typinput", nullable = false)),
			@AttributeOverride(name = "typoutput", column = @Column(name = "typoutput", nullable = false)),
			@AttributeOverride(name = "typreceive", column = @Column(name = "typreceive", nullable = false)),
			@AttributeOverride(name = "typsend", column = @Column(name = "typsend", nullable = false)),
			@AttributeOverride(name = "typmodin", column = @Column(name = "typmodin", nullable = false)),
			@AttributeOverride(name = "typmodout", column = @Column(name = "typmodout", nullable = false)),
			@AttributeOverride(name = "typanalyze", column = @Column(name = "typanalyze", nullable = false)),
			@AttributeOverride(name = "typalign", column = @Column(name = "typalign", nullable = false)),
			@AttributeOverride(name = "typstorage", column = @Column(name = "typstorage", nullable = false)),
			@AttributeOverride(name = "typnotnull", column = @Column(name = "typnotnull", nullable = false)),
			@AttributeOverride(name = "typbasetype", column = @Column(name = "typbasetype", nullable = false)),
			@AttributeOverride(name = "typtypmod", column = @Column(name = "typtypmod", nullable = false)),
			@AttributeOverride(name = "typndims", column = @Column(name = "typndims", nullable = false)),
			@AttributeOverride(name = "typcollation", column = @Column(name = "typcollation", nullable = false)),
			@AttributeOverride(name = "typdefaultbin", column = @Column(name = "typdefaultbin")),
			@AttributeOverride(name = "typdefault", column = @Column(name = "typdefault")),
			@AttributeOverride(name = "typacl", column = @Column(name = "typacl")) })
	public PgTypeId getId() {
		return this.id;
	}

	public void setId(PgTypeId id) {
		this.id = id;
	}

}