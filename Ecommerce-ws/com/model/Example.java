package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Example generated by hbm2java
 */
@Entity
@Table(name = "example", schema = "public")
public class Example implements java.io.Serializable {

	private String aaa;

	public Example() {
	}

	public Example(String aaa) {
		this.aaa = aaa;
	}

	@Id

	@Column(name = "aaa", length = 64)
	public String getAaa() {
		return this.aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}

}