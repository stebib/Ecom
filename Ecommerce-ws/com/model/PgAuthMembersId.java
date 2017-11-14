package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PgAuthMembersId generated by hbm2java
 */
@Embeddable
public class PgAuthMembersId implements java.io.Serializable {

	private int roleid;
	private int member;
	private int grantor;
	private boolean adminOption;

	public PgAuthMembersId() {
	}

	public PgAuthMembersId(int roleid, int member, int grantor, boolean adminOption) {
		this.roleid = roleid;
		this.member = member;
		this.grantor = grantor;
		this.adminOption = adminOption;
	}

	@Column(name = "roleid", nullable = false)
	public int getRoleid() {
		return this.roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	@Column(name = "member", nullable = false)
	public int getMember() {
		return this.member;
	}

	public void setMember(int member) {
		this.member = member;
	}

	@Column(name = "grantor", nullable = false)
	public int getGrantor() {
		return this.grantor;
	}

	public void setGrantor(int grantor) {
		this.grantor = grantor;
	}

	@Column(name = "admin_option", nullable = false)
	public boolean isAdminOption() {
		return this.adminOption;
	}

	public void setAdminOption(boolean adminOption) {
		this.adminOption = adminOption;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PgAuthMembersId))
			return false;
		PgAuthMembersId castOther = (PgAuthMembersId) other;

		return (this.getRoleid() == castOther.getRoleid()) && (this.getMember() == castOther.getMember())
				&& (this.getGrantor() == castOther.getGrantor()) && (this.isAdminOption() == castOther.isAdminOption());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRoleid();
		result = 37 * result + this.getMember();
		result = 37 * result + this.getGrantor();
		result = 37 * result + (this.isAdminOption() ? 1 : 0);
		return result;
	}

}