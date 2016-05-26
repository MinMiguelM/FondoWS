package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_log_search_subjects database table.
 * 
 */
@Embeddable
public class SmfLogSearchSubjectPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String word;

	@Column(name="id_topic")
	private int idTopic;

	public SmfLogSearchSubjectPK() {
	}
	public String getWord() {
		return this.word;
	}
	public void setWord(String word) {
		this.word = word;
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
		if (!(other instanceof SmfLogSearchSubjectPK)) {
			return false;
		}
		SmfLogSearchSubjectPK castOther = (SmfLogSearchSubjectPK)other;
		return 
			this.word.equals(castOther.word)
			&& (this.idTopic == castOther.idTopic);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.word.hashCode();
		hash = hash * prime + this.idTopic;
		
		return hash;
	}
}