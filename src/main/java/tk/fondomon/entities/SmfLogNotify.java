package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_notify database table.
 * 
 */
@Entity
@Table(name="smf_log_notify")
@NamedQuery(name="SmfLogNotify.findAll", query="SELECT s FROM SmfLogNotify s")
public class SmfLogNotify implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogNotifyPK id;

	private byte sent;

	public SmfLogNotify() {
	}

	public SmfLogNotifyPK getId() {
		return this.id;
	}

	public void setId(SmfLogNotifyPK id) {
		this.id = id;
	}

	public byte getSent() {
		return this.sent;
	}

	public void setSent(byte sent) {
		this.sent = sent;
	}

}