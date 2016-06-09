package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_search_messages database table.
 * 
 */
@Entity
@Table(name="smf_log_search_messages")
@NamedQuery(name="SmfLogSearchMessage.findAll", query="SELECT s FROM SmfLogSearchMessage s")
public class SmfLogSearchMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogSearchMessagePK id;

	public SmfLogSearchMessage() {
	}

	public SmfLogSearchMessagePK getId() {
		return this.id;
	}

	public void setId(SmfLogSearchMessagePK id) {
		this.id = id;
	}

}