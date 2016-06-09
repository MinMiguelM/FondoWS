package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_collapsed_categories database table.
 * 
 */
@Embeddable
public class SmfCollapsedCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_cat")
	private byte idCat;

	@Column(name="id_member")
	private int idMember;

	public SmfCollapsedCategoryPK() {
	}
	public byte getIdCat() {
		return this.idCat;
	}
	public void setIdCat(byte idCat) {
		this.idCat = idCat;
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
		if (!(other instanceof SmfCollapsedCategoryPK)) {
			return false;
		}
		SmfCollapsedCategoryPK castOther = (SmfCollapsedCategoryPK)other;
		return 
			(this.idCat == castOther.idCat)
			&& (this.idMember == castOther.idMember);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.idCat);
		hash = hash * prime + this.idMember;
		
		return hash;
	}
}