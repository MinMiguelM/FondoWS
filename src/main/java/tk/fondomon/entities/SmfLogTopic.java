package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_topics database table.
 * 
 */
@Entity
@Table(name="smf_log_topics")
@NamedQuery(name="SmfLogTopic.findAll", query="SELECT s FROM SmfLogTopic s")
public class SmfLogTopic implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogTopicPK id;

	@Column(name="id_msg")
	private int idMsg;

	public SmfLogTopic() {
	}

	public SmfLogTopicPK getId() {
		return this.id;
	}

	public void setId(SmfLogTopicPK id) {
		this.id = id;
	}

	public int getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

}