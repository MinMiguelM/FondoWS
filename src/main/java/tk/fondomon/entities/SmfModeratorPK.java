package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_moderators database table.
 * 
 */
@Embeddable
public class SmfModeratorPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_board")
	private int idBoard;

	@Column(name="id_member")
	private int idMember;

	public SmfModeratorPK() {
	}
	public int getIdBoard() {
		return this.idBoard;
	}
	public void setIdBoard(int idBoard) {
		this.idBoard = idBoard;
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
		if (!(other instanceof SmfModeratorPK)) {
			return false;
		}
		SmfModeratorPK castOther = (SmfModeratorPK)other;
		return 
			(this.idBoard == castOther.idBoard)
			&& (this.idMember == castOther.idMember);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idBoard;
		hash = hash * prime + this.idMember;
		
		return hash;
	}
}