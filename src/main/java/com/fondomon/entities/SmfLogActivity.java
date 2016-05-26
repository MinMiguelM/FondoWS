package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the smf_log_activity database table.
 * 
 */
@Entity
@Table(name="smf_log_activity")
@NamedQuery(name="SmfLogActivity.findAll", query="SELECT s FROM SmfLogActivity s")
public class SmfLogActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Temporal(TemporalType.DATE)
	private Date date;

	private int hits;

	@Column(name="most_on")
	private int mostOn;

	private int posts;

	private int registers;

	private int topics;

	public SmfLogActivity() {
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getHits() {
		return this.hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public int getMostOn() {
		return this.mostOn;
	}

	public void setMostOn(int mostOn) {
		this.mostOn = mostOn;
	}

	public int getPosts() {
		return this.posts;
	}

	public void setPosts(int posts) {
		this.posts = posts;
	}

	public int getRegisters() {
		return this.registers;
	}

	public void setRegisters(int registers) {
		this.registers = registers;
	}

	public int getTopics() {
		return this.topics;
	}

	public void setTopics(int topics) {
		this.topics = topics;
	}

}