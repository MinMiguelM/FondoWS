package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_floodcontrol database table.
 * 
 */
@Entity
@Table(name="smf_log_floodcontrol")
@NamedQuery(name="SmfLogFloodcontrol.findAll", query="SELECT s FROM SmfLogFloodcontrol s")
public class SmfLogFloodcontrol implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogFloodcontrolPK id;

	@Column(name="log_time")
	private int logTime;

	public SmfLogFloodcontrol() {
	}

	public SmfLogFloodcontrolPK getId() {
		return this.id;
	}

	public void setId(SmfLogFloodcontrolPK id) {
		this.id = id;
	}

	public int getLogTime() {
		return this.logTime;
	}

	public void setLogTime(int logTime) {
		this.logTime = logTime;
	}

}