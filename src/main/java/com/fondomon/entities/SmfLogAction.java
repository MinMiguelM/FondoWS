package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_actions database table.
 * 
 */
@Entity
@Table(name="smf_log_actions")
@NamedQuery(name="SmfLogAction.findAll", query="SELECT s FROM SmfLogAction s")
public class SmfLogAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_action")
	private int idAction;

	private String action;

	@Lob
	private String extra;

	@Column(name="id_board")
	private int idBoard;

	@Column(name="id_log")
	private byte idLog;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_msg")
	private int idMsg;

	@Column(name="id_topic")
	private int idTopic;

	private String ip;

	@Column(name="log_time")
	private int logTime;

	public SmfLogAction() {
	}

	public int getIdAction() {
		return this.idAction;
	}

	public void setIdAction(int idAction) {
		this.idAction = idAction;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getExtra() {
		return this.extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public int getIdBoard() {
		return this.idBoard;
	}

	public void setIdBoard(int idBoard) {
		this.idBoard = idBoard;
	}

	public byte getIdLog() {
		return this.idLog;
	}

	public void setIdLog(byte idLog) {
		this.idLog = idLog;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public int getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

	public int getIdTopic() {
		return this.idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getLogTime() {
		return this.logTime;
	}

	public void setLogTime(int logTime) {
		this.logTime = logTime;
	}

}