package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_moderators database table.
 * 
 */
@Entity
@Table(name="smf_moderators")
@NamedQuery(name="SmfModerator.findAll", query="SELECT s FROM SmfModerator s")
public class SmfModerator implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfModeratorPK id;

	public SmfModerator() {
	}

	public SmfModeratorPK getId() {
		return this.id;
	}

	public void setId(SmfModeratorPK id) {
		this.id = id;
	}

}