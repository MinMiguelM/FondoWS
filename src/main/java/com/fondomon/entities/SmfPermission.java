package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_permissions database table.
 * 
 */
@Entity
@Table(name="smf_permissions")
@NamedQuery(name="SmfPermission.findAll", query="SELECT s FROM SmfPermission s")
public class SmfPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfPermissionPK id;

	@Column(name="add_deny")
	private byte addDeny;

	public SmfPermission() {
	}

	public SmfPermissionPK getId() {
		return this.id;
	}

	public void setId(SmfPermissionPK id) {
		this.id = id;
	}

	public byte getAddDeny() {
		return this.addDeny;
	}

	public void setAddDeny(byte addDeny) {
		this.addDeny = addDeny;
	}

}