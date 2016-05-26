package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_mark_read database table.
 * 
 */
@Entity
@Table(name="smf_log_mark_read")
@NamedQuery(name="SmfLogMarkRead.findAll", query="SELECT s FROM SmfLogMarkRead s")
public class SmfLogMarkRead implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogMarkReadPK id;

	@Column(name="id_msg")
	private int idMsg;

	public SmfLogMarkRead() {
	}

	public SmfLogMarkReadPK getId() {
		return this.id;
	}

	public void setId(SmfLogMarkReadPK id) {
		this.id = id;
	}

	public int getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

}