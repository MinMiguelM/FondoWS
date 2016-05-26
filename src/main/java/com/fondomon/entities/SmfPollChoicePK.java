package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_poll_choices database table.
 * 
 */
@Embeddable
public class SmfPollChoicePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_poll")
	private int idPoll;

	@Column(name="id_choice")
	private byte idChoice;

	public SmfPollChoicePK() {
	}
	public int getIdPoll() {
		return this.idPoll;
	}
	public void setIdPoll(int idPoll) {
		this.idPoll = idPoll;
	}
	public byte getIdChoice() {
		return this.idChoice;
	}
	public void setIdChoice(byte idChoice) {
		this.idChoice = idChoice;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfPollChoicePK)) {
			return false;
		}
		SmfPollChoicePK castOther = (SmfPollChoicePK)other;
		return 
			(this.idPoll == castOther.idPoll)
			&& (this.idChoice == castOther.idChoice);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idPoll;
		hash = hash * prime + ((int) this.idChoice);
		
		return hash;
	}
}