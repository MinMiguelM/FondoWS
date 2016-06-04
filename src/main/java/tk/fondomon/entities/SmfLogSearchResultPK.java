package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_log_search_results database table.
 * 
 */
@Embeddable
public class SmfLogSearchResultPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_search")
	private byte idSearch;

	@Column(name="id_topic")
	private int idTopic;

	public SmfLogSearchResultPK() {
	}
	public byte getIdSearch() {
		return this.idSearch;
	}
	public void setIdSearch(byte idSearch) {
		this.idSearch = idSearch;
	}
	public int getIdTopic() {
		return this.idTopic;
	}
	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfLogSearchResultPK)) {
			return false;
		}
		SmfLogSearchResultPK castOther = (SmfLogSearchResultPK)other;
		return 
			(this.idSearch == castOther.idSearch)
			&& (this.idTopic == castOther.idTopic);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) this.idSearch);
		hash = hash * prime + this.idTopic;
		
		return hash;
	}
}