package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_group_requests database table.
 * 
 */
@Entity
@Table(name="smf_log_group_requests")
@NamedQuery(name="SmfLogGroupRequest.findAll", query="SELECT s FROM SmfLogGroupRequest s")
public class SmfLogGroupRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_request")
	private int idRequest;

	@Column(name="id_group")
	private int idGroup;

	@Column(name="id_member")
	private int idMember;

	@Lob
	private String reason;

	@Column(name="time_applied")
	private int timeApplied;

	public SmfLogGroupRequest() {
	}

	public int getIdRequest() {
		return this.idRequest;
	}

	public void setIdRequest(int idRequest) {
		this.idRequest = idRequest;
	}

	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getTimeApplied() {
		return this.timeApplied;
	}

	public void setTimeApplied(int timeApplied) {
		this.timeApplied = timeApplied;
	}

}