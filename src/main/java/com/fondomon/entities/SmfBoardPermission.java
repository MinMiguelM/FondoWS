package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_board_permissions database table.
 * 
 */
@Entity
@Table(name="smf_board_permissions")
@NamedQuery(name="SmfBoardPermission.findAll", query="SELECT s FROM SmfBoardPermission s")
public class SmfBoardPermission implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfBoardPermissionPK id;

	@Column(name="add_deny")
	private byte addDeny;

	public SmfBoardPermission() {
	}

	public SmfBoardPermissionPK getId() {
		return this.id;
	}

	public void setId(SmfBoardPermissionPK id) {
		this.id = id;
	}

	public byte getAddDeny() {
		return this.addDeny;
	}

	public void setAddDeny(byte addDeny) {
		this.addDeny = addDeny;
	}

}