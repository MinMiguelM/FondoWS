package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_personal_messages database table.
 * 
 */
@Entity
@Table(name="smf_personal_messages")
@NamedQuery(name="SmfPersonalMessage.findAll", query="SELECT s FROM SmfPersonalMessage s")
public class SmfPersonalMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_pm")
	private int idPm;

	@Lob
	private String body;

	@Column(name="deleted_by_sender")
	private byte deletedBySender;

	@Column(name="from_name")
	private String fromName;

	@Column(name="id_member_from")
	private int idMemberFrom;

	@Column(name="id_pm_head")
	private int idPmHead;

	private int msgtime;

	private String subject;

	public SmfPersonalMessage() {
	}

	public int getIdPm() {
		return this.idPm;
	}

	public void setIdPm(int idPm) {
		this.idPm = idPm;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public byte getDeletedBySender() {
		return this.deletedBySender;
	}

	public void setDeletedBySender(byte deletedBySender) {
		this.deletedBySender = deletedBySender;
	}

	public String getFromName() {
		return this.fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public int getIdMemberFrom() {
		return this.idMemberFrom;
	}

	public void setIdMemberFrom(int idMemberFrom) {
		this.idMemberFrom = idMemberFrom;
	}

	public int getIdPmHead() {
		return this.idPmHead;
	}

	public void setIdPmHead(int idPmHead) {
		this.idPmHead = idPmHead;
	}

	public int getMsgtime() {
		return this.msgtime;
	}

	public void setMsgtime(int msgtime) {
		this.msgtime = msgtime;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}