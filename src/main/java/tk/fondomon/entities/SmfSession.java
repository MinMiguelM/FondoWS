package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_sessions database table.
 * 
 */
@Entity
@Table(name="smf_sessions")
@NamedQuery(name="SmfSession.findAll", query="SELECT s FROM SmfSession s")
public class SmfSession implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="session_id")
	private String sessionId;

	@Lob
	private String data;

	@Column(name="last_update")
	private int lastUpdate;

	public SmfSession() {
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(int lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}