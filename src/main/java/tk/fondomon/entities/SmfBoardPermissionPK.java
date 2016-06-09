package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_board_permissions database table.
 * 
 */
@Embeddable
public class SmfBoardPermissionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_group")
	private short idGroup;

	@Column(name="id_profile")
	private int idProfile;

	private String permission;

	public SmfBoardPermissionPK() {
	}
	public short getIdGroup() {
		return this.idGroup;
	}
	public void setIdGroup(short idGroup) {
		this.idGroup = idGroup;
	}
	public int getIdProfile() {
		return this.idProfile;
	}
	public void setIdProfile(int idProfile) {
		this.idProfile = idProfile;
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
		if (!(other instanceof SmfBoardPermissionPK)) {
			return false;
		}
		SmfBoardPermissionPK castOther = (SmfBoardPermissionPK)other;
		return 
			(this.idGroup == castOther.idGroup)
			&& (this.idProfile == castOther.idProfile)
			&& this.permission.equals(castOther.permission);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.idGroup);
		hash = hash * prime + this.idProfile;
		hash = hash * prime + this.permission.hashCode();
		
		return hash;
	}
}