package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_group_moderators database table.
 * 
 */
@Embeddable
public class SmfGroupModeratorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_group")
	private int idGroup;

	@Column(name="id_member")
	private int idMember;

	public SmfGroupModeratorPK() {
	}
	public int getIdGroup() {
		return this.idGroup;
	}
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
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
		if (!(other instanceof SmfGroupModeratorPK)) {
			return false;
		}
		SmfGroupModeratorPK castOther = (SmfGroupModeratorPK)other;
		return 
			(this.idGroup == castOther.idGroup)
			&& (this.idMember == castOther.idMember);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idGroup;
		hash = hash * prime + this.idMember;
		
		return hash;
	}
}