package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_permissions database table.
 * 
 */
@Embeddable
public class SmfPermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_group")
	private short idGroup;

	private String permission;

	public SmfPermissionPK() {
	}
	public short getIdGroup() {
		return this.idGroup;
	}
	public void setIdGroup(short idGroup) {
		this.idGroup = idGroup;
	}
	public String getPermission() {
		return this.permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfPermissionPK)) {
			return false;
		}
		SmfPermissionPK castOther = (SmfPermissionPK)other;
		return 
			(this.idGroup == castOther.idGroup)
			&& this.permission.equals(castOther.permission);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.idGroup);
		hash = hash * prime + this.permission.hashCode();
		
		return hash;
	}
}