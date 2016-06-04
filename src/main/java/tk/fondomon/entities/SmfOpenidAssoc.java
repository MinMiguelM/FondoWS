package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_openid_assoc database table.
 * 
 */
@Entity
@Table(name="smf_openid_assoc")
@NamedQuery(name="SmfOpenidAssoc.findAll", query="SELECT s FROM SmfOpenidAssoc s")
public class SmfOpenidAssoc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfOpenidAssocPK id;

	@Column(name="assoc_type")
	private String assocType;

	private int expires;

	private int issued;

	@Lob
	private String secret;

	public SmfOpenidAssoc() {
	}

	public SmfOpenidAssocPK getId() {
		return this.id;
	}

	public void setId(SmfOpenidAssocPK id) {
		this.id = id;
	}

	public String getAssocType() {
		return this.assocType;
	}

	public void setAssocType(String assocType) {
		this.assocType = assocType;
	}

	public int getExpires() {
		return this.expires;
	}

	public void setExpires(int expires) {
		this.expires = expires;
	}

	public int getIssued() {
		return this.issued;
	}

	public void setIssued(int issued) {
		this.issued = issued;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

}