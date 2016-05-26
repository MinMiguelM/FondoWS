package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_spiders database table.
 * 
 */
@Entity
@Table(name="smf_spiders")
@NamedQuery(name="SmfSpider.findAll", query="SELECT s FROM SmfSpider s")
public class SmfSpider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_spider")
	private int idSpider;

	@Column(name="ip_info")
	private String ipInfo;

	@Column(name="spider_name")
	private String spiderName;

	@Column(name="user_agent")
	private String userAgent;

	public SmfSpider() {
	}

	public int getIdSpider() {
		return this.idSpider;
	}

	public void setIdSpider(int idSpider) {
		this.idSpider = idSpider;
	}

	public String getIpInfo() {
		return this.ipInfo;
	}

	public void setIpInfo(String ipInfo) {
		this.ipInfo = ipInfo;
	}

	public String getSpiderName() {
		return this.spiderName;
	}

	public void setSpiderName(String spiderName) {
		this.spiderName = spiderName;
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

}