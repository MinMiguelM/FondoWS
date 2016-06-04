package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_permission_profiles database table.
 * 
 */
@Entity
@Table(name="smf_permission_profiles")
@NamedQuery(name="SmfPermissionProfile.findAll", query="SELECT s FROM SmfPermissionProfile s")
public class SmfPermissionProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_profile")
	private short idProfile;

	@Column(name="profile_name")
	private String profileName;

	public SmfPermissionProfile() {
	}

	public short getIdProfile() {
		return this.idProfile;
	}

	public void setIdProfile(short idProfile) {
		this.idProfile = idProfile;
	}

	public String getProfileName() {
		return this.profileName;
	}

	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}

}