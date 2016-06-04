package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_log_search_messages database table.
 * 
 */
@Embeddable
public class SmfLogSearchMessagePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_search")
	private byte idSearch;

	@Column(name="id_msg")
	private int idMsg;

	public SmfLogSearchMessagePK() {
	}
	public byte getIdSearch() {
		return this.idSearch;
	}
	public void setIdSearch(byte idSearch) {
		this.idSearch = idSearch;
	}
	public int getIdMsg() {
		return this.idMsg;
	}
	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfLogSearchMessagePK)) {
			return false;
		}
		SmfLogSearchMessagePK castOther = (SmfLogSearchMessagePK)other;
		return 
			(this.idSearch == castOther.idSearch)
			&& (this.idMsg == castOther.idMsg);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.idSearch);
		hash = hash * prime + this.idMsg;
		
		return hash;
	}
}