package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_banned database table.
 * 
 */
@Entity
@Table(name="smf_log_banned")
@NamedQuery(name="SmfLogBanned.findAll", query="SELECT s FROM SmfLogBanned s")
public class SmfLogBanned implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ban_log")
	private int idBanLog;

	private String email;

	@Column(name="id_member")
	private int idMember;

	private String ip;

	@Column(name="log_time")
	private int logTime;

	public SmfLogBanned() {
	}

	public int getIdBanLog() {
		return this.idBanLog;
	}

	public void setIdBanLog(int idBanLog) {
		this.idBanLog = idBanLog;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getLogTime() {
		return this.logTime;
	}

	public void setLogTime(int logTime) {
		this.logTime = logTime;
	}

}