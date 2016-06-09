package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_log_topics database table.
 * 
 */
@Embeddable
public class SmfLogTopicPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_topic")
	private int idTopic;

	public SmfLogTopicPK() {
	}
	public int getIdMember() {
		return this.idMember;
	}
	public void setIdMember(int idMember) {
		this.idMember = idMember;
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
		if (!(other instanceof SmfLogTopicPK)) {
			return false;
		}
		SmfLogTopicPK castOther = (SmfLogTopicPK)other;
		return 
			(this.idMember == castOther.idMember)
			&& (this.idTopic == castOther.idTopic);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idMember;
		hash = hash * prime + this.idTopic;
		
		return hash;
	}
}