package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_log_floodcontrol database table.
 * 
 */
@Embeddable
public class SmfLogFloodcontrolPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String ip;

	@Column(name="log_type")
	private String logType;

	public SmfLogFloodcontrolPK() {
	}
	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLogType() {
		return this.logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfLogFloodcontrolPK)) {
			return false;
		}
		SmfLogFloodcontrolPK castOther = (SmfLogFloodcontrolPK)other;
		return 
			this.ip.equals(castOther.ip)
			&& this.logType.equals(castOther.logType);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ip.hashCode();
		hash = hash * prime + this.logType.hashCode();
		
		return hash;
	}
}