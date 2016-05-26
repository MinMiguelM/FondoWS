package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_comments database table.
 * 
 */
@Entity
@Table(name="smf_log_comments")
@NamedQuery(name="SmfLogComment.findAll", query="SELECT s FROM SmfLogComment s")
public class SmfLogComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_comment")
	private int idComment;

	@Lob
	private String body;

	@Column(name="comment_type")
	private String commentType;

	private byte counter;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_notice")
	private int idNotice;

	@Column(name="id_recipient")
	private int idRecipient;

	@Column(name="log_time")
	private int logTime;

	@Column(name="member_name")
	private String memberName;

	@Column(name="recipient_name")
	private String recipientName;

	public SmfLogComment() {
	}

	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCommentType() {
		return this.commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public byte getCounter() {
		return this.counter;
	}

	public void setCounter(byte counter) {
		this.counter = counter;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public int getIdNotice() {
		return this.idNotice;
	}

	public void setIdNotice(int idNotice) {
		this.idNotice = idNotice;
	}

	public int getIdRecipient() {
		return this.idRecipient;
	}

	public void setIdRecipient(int idRecipient) {
		this.idRecipient = idRecipient;
	}

	public int getLogTime() {
		return this.logTime;
	}

	public void setLogTime(int logTime) {
		this.logTime = logTime;
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getRecipientName() {
		return this.recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

}