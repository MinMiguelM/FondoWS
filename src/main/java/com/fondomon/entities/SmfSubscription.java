package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_subscriptions database table.
 * 
 */
@Entity
@Table(name="smf_subscriptions")
@NamedQuery(name="SmfSubscription.findAll", query="SELECT s FROM SmfSubscription s")
public class SmfSubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_subscribe")
	private int idSubscribe;

	private byte active;

	@Column(name="add_groups")
	private String addGroups;

	@Column(name="allow_partial")
	private byte allowPartial;

	@Lob
	private String cost;

	private String description;

	@Lob
	@Column(name="email_complete")
	private String emailComplete;

	@Column(name="id_group")
	private short idGroup;

	private String length;

	private String name;

	private byte reminder;

	private byte repeatable;

	public SmfSubscription() {
	}

	public int getIdSubscribe() {
		return this.idSubscribe;
	}

	public void setIdSubscribe(int idSubscribe) {
		this.idSubscribe = idSubscribe;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public String getAddGroups() {
		return this.addGroups;
	}

	public void setAddGroups(String addGroups) {
		this.addGroups = addGroups;
	}

	public byte getAllowPartial() {
		return this.allowPartial;
	}

	public void setAllowPartial(byte allowPartial) {
		this.allowPartial = allowPartial;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailComplete() {
		return this.emailComplete;
	}

	public void setEmailComplete(String emailComplete) {
		this.emailComplete = emailComplete;
	}

	public short getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(short idGroup) {
		this.idGroup = idGroup;
	}

	public String getLength() {
		return this.length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getReminder() {
		return this.reminder;
	}

	public void setReminder(byte reminder) {
		this.reminder = reminder;
	}

	public byte getRepeatable() {
		return this.repeatable;
	}

	public void setRepeatable(byte repeatable) {
		this.repeatable = repeatable;
	}

}