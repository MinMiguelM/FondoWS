package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_digest database table.
 * 
 */
@Entity
@Table(name="smf_log_digest")
@NamedQuery(name="SmfLogDigest.findAll", query="SELECT s FROM SmfLogDigest s")
public class SmfLogDigest implements Serializable {
	private static final long serialVersionUID = 1L;

	private byte daily;

	private int exclude;

	@Id
	@Column(name="id_msg")
	private int idMsg;

	@Column(name="id_topic")
	private int idTopic;

	@Column(name="note_type")
	private String noteType;

	public SmfLogDigest() {
	}

	public byte getDaily() {
		return this.daily;
	}

	public void setDaily(byte daily) {
		this.daily = daily;
	}

	public int getExclude() {
		return this.exclude;
	}

	public void setExclude(int exclude) {
		this.exclude = exclude;
	}

	public int getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

	public int getIdTopic() {
		return this.idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public String getNoteType() {
		return this.noteType;
	}

	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}

}