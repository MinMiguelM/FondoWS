package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_log_boards database table.
 * 
 */
@Embeddable
public class SmfLogBoardPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_board")
	private int idBoard;

	public SmfLogBoardPK() {
	}
	public int getIdMember() {
		return this.idMember;
	}
	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}
	public int getIdBoard() {
		return this.idBoard;
	}
	public void setIdBoard(int idBoard) {
		this.idBoard = idBoard;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfLogBoardPK)) {
			return false;
		}
		SmfLogBoardPK castOther = (SmfLogBoardPK)other;
		return 
			(this.idMember == castOther.idMember)
			&& (this.idBoard == castOther.idBoard);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idMember;
		hash = hash * prime + this.idBoard;
		
		return hash;
	}
}