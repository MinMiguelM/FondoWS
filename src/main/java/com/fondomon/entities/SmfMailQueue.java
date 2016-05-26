package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_mail_queue database table.
 * 
 */
@Entity
@Table(name="smf_mail_queue")
@NamedQuery(name="SmfMailQueue.findAll", query="SELECT s FROM SmfMailQueue s")
public class SmfMailQueue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_mail")
	private int idMail;

	@Lob
	private String body;

	@Lob
	private String headers;

	private byte priority;

	@Column(name="private")
	private byte private_;

	private String recipient;

	@Column(name="send_html")
	private byte sendHtml;

	private String subject;

	@Column(name="time_sent")
	private int timeSent;

	public SmfMailQueue() {
	}

	public int getIdMail() {
		return this.idMail;
	}

	public void setIdMail(int idMail) {
		this.idMail = idMail;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getHeaders() {
		return this.headers;
	}

	public void setHeaders(String headers) {
		this.headers = headers;
	}

	public byte getPriority() {
		return this.priority;
	}

	public void setPriority(byte priority) {
		this.priority = priority;
	}

	public byte getPrivate_() {
		return this.private_;
	}

	public void setPrivate_(byte private_) {
		this.private_ = private_;
	}

	public String getRecipient() {
		return this.recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public byte getSendHtml() {
		return this.sendHtml;
	}

	public void setSendHtml(byte sendHtml) {
		this.sendHtml = sendHtml;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTimeSent() {
		return this.timeSent;
	}

	public void setTimeSent(int timeSent) {
		this.timeSent = timeSent;
	}

}