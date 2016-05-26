package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_poll_choices database table.
 * 
 */
@Entity
@Table(name="smf_poll_choices")
@NamedQuery(name="SmfPollChoice.findAll", query="SELECT s FROM SmfPollChoice s")
public class SmfPollChoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfPollChoicePK id;

	private String label;

	private int votes;

	public SmfPollChoice() {
	}

	public SmfPollChoicePK getId() {
		return this.id;
	}

	public void setId(SmfPollChoicePK id) {
		this.id = id;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getVotes() {
		return this.votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

}