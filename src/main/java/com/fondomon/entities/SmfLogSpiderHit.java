package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_spider_hits database table.
 * 
 */
@Entity
@Table(name="smf_log_spider_hits")
@NamedQuery(name="SmfLogSpiderHit.findAll", query="SELECT s FROM SmfLogSpiderHit s")
public class SmfLogSpiderHit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_hit")
	private int idHit;

	@Column(name="id_spider")
	private int idSpider;

	@Column(name="log_time")
	private int logTime;

	private byte processed;

	private String url;

	public SmfLogSpiderHit() {
	}

	public int getIdHit() {
		return this.idHit;
	}

	public void setIdHit(int idHit) {
		this.idHit = idHit;
	}

	public int getIdSpider() {
		return this.idSpider;
	}

	public void setIdSpider(int idSpider) {
		this.idSpider = idSpider;
	}

	public int getLogTime() {
		return this.logTime;
	}

	public void setLogTime(int logTime) {
		this.logTime = logTime;
	}

	public byte getProcessed() {
		return this.processed;
	}

	public void setProcessed(byte processed) {
		this.processed = processed;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}