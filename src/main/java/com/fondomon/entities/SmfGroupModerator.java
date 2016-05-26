package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_group_moderators database table.
 * 
 */
@Entity
@Table(name="smf_group_moderators")
@NamedQuery(name="SmfGroupModerator.findAll", query="SELECT s FROM SmfGroupModerator s")
public class SmfGroupModerator implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfGroupModeratorPK id;

	public SmfGroupModerator() {
	}

	public SmfGroupModeratorPK getId() {
		return this.id;
	}

	public void setId(SmfGroupModeratorPK id) {
		this.id = id;
	}

}