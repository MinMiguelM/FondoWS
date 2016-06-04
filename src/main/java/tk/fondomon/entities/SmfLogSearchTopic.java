package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_search_topics database table.
 * 
 */
@Entity
@Table(name="smf_log_search_topics")
@NamedQuery(name="SmfLogSearchTopic.findAll", query="SELECT s FROM SmfLogSearchTopic s")
public class SmfLogSearchTopic implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogSearchTopicPK id;

	public SmfLogSearchTopic() {
	}

	public SmfLogSearchTopicPK getId() {
		return this.id;
	}

	public void setId(SmfLogSearchTopicPK id) {
		this.id = id;
	}

}