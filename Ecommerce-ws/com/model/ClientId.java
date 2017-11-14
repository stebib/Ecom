package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ClientId generated by hbm2java
 */
@Embeddable
public class ClientId implements java.io.Serializable {

	private String idCard;
	private String firstname;
	private String lastName;
	private String profession;
	private String login;
	private String password;
	private String socialStatus;
	private Date birthDate;

	public ClientId() {
	}

	public ClientId(String idCard, String login) {
		this.idCard = idCard;
		this.login = login;
	}

	public ClientId(String idCard, String firstname, String lastName, String profession, String login, String password,
			String socialStatus, Date birthDate) {
		this.idCard = idCard;
		this.firstname = firstname;
		this.lastName = lastName;
		this.profession = profession;
		this.login = login;
		this.password = password;
		this.socialStatus = socialStatus;
		this.birthDate = birthDate;
	}

	@Column(name = "ID_card", nullable = false, length = 64)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "Firstname", length = 64)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "LastName", length = 64)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "Profession", length = 64)
	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Column(name = "Login", nullable = false, length = 64)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "Password", length = 64)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "SocialStatus", length = 64)
	public String getSocialStatus() {
		return this.socialStatus;
	}

	public void setSocialStatus(String socialStatus) {
		this.socialStatus = socialStatus;
	}

	@Column(name = "BirthDate", length = 4)
	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ClientId))
			return false;
		ClientId castOther = (ClientId) other;

		return ((this.getIdCard() == castOther.getIdCard()) || (this.getIdCard() != null
				&& castOther.getIdCard() != null && this.getIdCard().equals(castOther.getIdCard())))
				&& ((this.getFirstname() == castOther.getFirstname()) || (this.getFirstname() != null
						&& castOther.getFirstname() != null && this.getFirstname().equals(castOther.getFirstname())))
				&& ((this.getLastName() == castOther.getLastName()) || (this.getLastName() != null
						&& castOther.getLastName() != null && this.getLastName().equals(castOther.getLastName())))
				&& ((this.getProfession() == castOther.getProfession()) || (this.getProfession() != null
						&& castOther.getProfession() != null && this.getProfession().equals(castOther.getProfession())))
				&& ((this.getLogin() == castOther.getLogin()) || (this.getLogin() != null
						&& castOther.getLogin() != null && this.getLogin().equals(castOther.getLogin())))
				&& ((this.getPassword() == castOther.getPassword()) || (this.getPassword() != null
						&& castOther.getPassword() != null && this.getPassword().equals(castOther.getPassword())))
				&& ((this.getSocialStatus() == castOther.getSocialStatus())
						|| (this.getSocialStatus() != null && castOther.getSocialStatus() != null
								&& this.getSocialStatus().equals(castOther.getSocialStatus())))
				&& ((this.getBirthDate() == castOther.getBirthDate()) || (this.getBirthDate() != null
						&& castOther.getBirthDate() != null && this.getBirthDate().equals(castOther.getBirthDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdCard() == null ? 0 : this.getIdCard().hashCode());
		result = 37 * result + (getFirstname() == null ? 0 : this.getFirstname().hashCode());
		result = 37 * result + (getLastName() == null ? 0 : this.getLastName().hashCode());
		result = 37 * result + (getProfession() == null ? 0 : this.getProfession().hashCode());
		result = 37 * result + (getLogin() == null ? 0 : this.getLogin().hashCode());
		result = 37 * result + (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result + (getSocialStatus() == null ? 0 : this.getSocialStatus().hashCode());
		result = 37 * result + (getBirthDate() == null ? 0 : this.getBirthDate().hashCode());
		return result;
	}

}
