package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_openid_assoc database table.
 * 
 */
@Embeddable
public class SmfOpenidAssocPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Lob
	@Column(name="server_url")
	private String serverUrl;

	private String handle;

	public SmfOpenidAssocPK() {
	}
	public String getServerUrl() {
		return this.serverUrl;
	}
	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}
	public String getHandle() {
		return this.handle;
	}
	public void setHandle(String handle) {
		this.handle = handle;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfOpenidAssocPK)) {
			return false;
		}
		SmfOpenidAssocPK castOther = (SmfOpenidAssocPK)other;
		return 
			this.serverUrl.equals(castOther.serverUrl)
			&& this.handle.equals(castOther.handle);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.serverUrl.hashCode();
		hash = hash * prime + this.handle.hashCode();
		
		return hash;
	}
}