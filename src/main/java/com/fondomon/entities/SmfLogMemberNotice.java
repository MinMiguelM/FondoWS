package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_member_notices database table.
 * 
 */
@Entity
@Table(name="smf_log_member_notices")
@NamedQuery(name="SmfLogMemberNotice.findAll", query="SELECT s FROM SmfLogMemberNotice s")
public class SmfLogMemberNotice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_notice")
	private int idNotice;

	@Lob
	private String body;

	private String subject;

	public SmfLogMemberNotice() {
	}

	public int getIdNotice() {
		return this.idNotice;
	}

	public void setIdNotice(int idNotice) {
		this.idNotice = idNotice;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}