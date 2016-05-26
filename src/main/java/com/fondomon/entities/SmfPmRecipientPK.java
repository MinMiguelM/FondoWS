package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_pm_recipients database table.
 * 
 */
@Embeddable
public class SmfPmRecipientPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_pm")
	private int idPm;

	@Column(name="id_member")
	private int idMember;

	public SmfPmRecipientPK() {
	}
	public int getIdPm() {
		return this.idPm;
	}
	public void setIdPm(int idPm) {
		this.idPm = idPm;
	}
	public int getIdMember() {
		return this.idMember;
	}
	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfPmRecipientPK)) {
			return false;
		}
		SmfPmRecipientPK castOther = (SmfPmRecipientPK)other;
		return 
			(this.idPm == castOther.idPm)
			&& (this.idMember == castOther.idMember);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPm;
		hash = hash * prime + this.idMember;
		
		return hash;
	}
}