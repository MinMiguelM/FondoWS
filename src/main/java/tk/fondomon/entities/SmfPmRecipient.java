package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_pm_recipients database table.
 * 
 */
@Entity
@Table(name="smf_pm_recipients")
@NamedQuery(name="SmfPmRecipient.findAll", query="SELECT s FROM SmfPmRecipient s")
public class SmfPmRecipient implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfPmRecipientPK id;

	private byte bcc;

	private byte deleted;

	@Column(name="is_new")
	private byte isNew;

	@Column(name="is_read")
	private byte isRead;

	private String labels;

	public SmfPmRecipient() {
	}

	public SmfPmRecipientPK getId() {
		return this.id;
	}

	public void setId(SmfPmRecipientPK id) {
		this.id = id;
	}

	public byte getBcc() {
		return this.bcc;
	}

	public void setBcc(byte bcc) {
		this.bcc = bcc;
	}

	public byte getDeleted() {
		return this.deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	public byte getIsNew() {
		return this.isNew;
	}

	public void setIsNew(byte isNew) {
		this.isNew = isNew;
	}

	public byte getIsRead() {
		return this.isRead;
	}

	public void setIsRead(byte isRead) {
		this.isRead = isRead;
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
	}

}