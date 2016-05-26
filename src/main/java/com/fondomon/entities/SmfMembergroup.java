package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_membergroups database table.
 * 
 */
@Entity
@Table(name="smf_membergroups")
@NamedQuery(name="SmfMembergroup.findAll", query="SELECT s FROM SmfMembergroup s")
public class SmfMembergroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_group")
	private int idGroup;

	@Lob
	private String description;

	@Column(name="group_name")
	private String groupName;

	@Column(name="group_type")
	private byte groupType;

	private byte hidden;

	@Column(name="id_parent")
	private short idParent;

	@Column(name="max_messages")
	private int maxMessages;

	@Column(name="min_posts")
	private int minPosts;

	@Column(name="online_color")
	private String onlineColor;

	private String stars;

	public SmfMembergroup() {
	}

	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public byte getGroupType() {
		return this.groupType;
	}

	public void setGroupType(byte groupType) {
		this.groupType = groupType;
	}

	public byte getHidden() {
		return this.hidden;
	}

	public void setHidden(byte hidden) {
		this.hidden = hidden;
	}

	public short getIdParent() {
		return this.idParent;
	}

	public void setIdParent(short idParent) {
		this.idParent = idParent;
	}

	public int getMaxMessages() {
		return this.maxMessages;
	}

	public void setMaxMessages(int maxMessages) {
		this.maxMessages = maxMessages;
	}

	public int getMinPosts() {
		return this.minPosts;
	}

	public void setMinPosts(int minPosts) {
		this.minPosts = minPosts;
	}

	public String getOnlineColor() {
		return this.onlineColor;
	}

	public void setOnlineColor(String onlineColor) {
		this.onlineColor = onlineColor;
	}

	public String getStars() {
		return this.stars;
	}

	public void setStars(String stars) {
		this.stars = stars;
	}

}