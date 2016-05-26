package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_online database table.
 * 
 */
@Entity
@Table(name="smf_log_online")
@NamedQuery(name="SmfLogOnline.findAll", query="SELECT s FROM SmfLogOnline s")
public class SmfLogOnline implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String session;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_spider")
	private int idSpider;

	private int ip;

	@Column(name="log_time")
	private int logTime;

	@Lob
	private String url;

	public SmfLogOnline() {
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public int getIdSpider() {
		return this.idSpider;
	}

	public void setIdSpider(int idSpider) {
		this.idSpider = idSpider;
	}

	public int getIp() {
		return this.ip;
	}

	public void setIp(int ip) {
		this.ip = ip;
	}

	public int getLogTime() {
		return this.logTime;
	}

	public void setLogTime(int logTime) {
		this.logTime = logTime;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}