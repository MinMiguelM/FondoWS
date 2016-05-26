package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_karma database table.
 * 
 */
@Entity
@Table(name="smf_log_karma")
@NamedQuery(name="SmfLogKarma.findAll", query="SELECT s FROM SmfLogKarma s")
public class SmfLogKarma implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogKarmaPK id;

	private byte action;

	@Column(name="log_time")
	private int logTime;

	public SmfLogKarma() {
	}

	public SmfLogKarmaPK getId() {
		return this.id;
	}

	public void setId(SmfLogKarmaPK id) {
		this.id = id;
	}

	public byte getAction() {
		return this.action;
	}

	public void setAction(byte action) {
		this.action = action;
	}

	public int getLogTime() {
		return this.logTime;
	}

	public void setLogTime(int logTime) {
		this.logTime = logTime;
	}

}