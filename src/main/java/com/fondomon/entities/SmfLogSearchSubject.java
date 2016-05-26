package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_search_subjects database table.
 * 
 */
@Entity
@Table(name="smf_log_search_subjects")
@NamedQuery(name="SmfLogSearchSubject.findAll", query="SELECT s FROM SmfLogSearchSubject s")
public class SmfLogSearchSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogSearchSubjectPK id;

	public SmfLogSearchSubject() {
	}

	public SmfLogSearchSubjectPK getId() {
		return this.id;
	}

	public void setId(SmfLogSearchSubjectPK id) {
		this.id = id;
	}

}