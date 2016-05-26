package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_themes database table.
 * 
 */
@Embeddable
public class SmfThemePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_theme")
	private byte idTheme;

	@Column(name="id_member")
	private int idMember;

	private String variable;

	public SmfThemePK() {
	}
	public byte getIdTheme() {
		return this.idTheme;
	}
	public void setIdTheme(byte idTheme) {
		this.idTheme = idTheme;
	}
	public int getIdMember() {
		return this.idMember;
	}
	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}
	public String getVariable() {
		return this.variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfThemePK)) {
			return false;
		}
		SmfThemePK castOther = (SmfThemePK)other;
		return 
			(this.idTheme == castOther.idTheme)
			&& (this.idMember == castOther.idMember)
			&& this.variable.equals(castOther.variable);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.idTheme);
		hash = hash * prime + this.idMember;
		hash = hash * prime + this.variable.hashCode();
		
		return hash;
	}
}