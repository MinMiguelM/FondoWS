package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_boards database table.
 * 
 */
@Entity
@Table(name="smf_boards")
@NamedQuery(name="SmfBoard.findAll", query="SELECT s FROM SmfBoard s")
public class SmfBoard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_board")
	private int idBoard;

	@Column(name="board_order")
	private short boardOrder;

	@Column(name="child_level")
	private byte childLevel;

	@Column(name="count_posts")
	private byte countPosts;

	@Lob
	private String description;

	@Column(name="id_cat")
	private byte idCat;

	@Column(name="id_last_msg")
	private int idLastMsg;

	@Column(name="id_msg_updated")
	private int idMsgUpdated;

	@Column(name="id_parent")
	private int idParent;

	@Column(name="id_profile")
	private int idProfile;

	@Column(name="id_theme")
	private byte idTheme;

	@Column(name="member_groups")
	private String memberGroups;

	private String name;

	@Column(name="num_posts")
	private int numPosts;

	@Column(name="num_topics")
	private int numTopics;

	@Column(name="override_theme")
	private byte overrideTheme;

	private String redirect;

	@Column(name="unapproved_posts")
	private short unapprovedPosts;

	@Column(name="unapproved_topics")
	private short unapprovedTopics;

	public SmfBoard() {
	}

	public int getIdBoard() {
		return this.idBoard;
	}

	public void setIdBoard(int idBoard) {
		this.idBoard = idBoard;
	}

	public short getBoardOrder() {
		return this.boardOrder;
	}

	public void setBoardOrder(short boardOrder) {
		this.boardOrder = boardOrder;
	}

	public byte getChildLevel() {
		return this.childLevel;
	}

	public void setChildLevel(byte childLevel) {
		this.childLevel = childLevel;
	}

	public byte getCountPosts() {
		return this.countPosts;
	}

	public void setCountPosts(byte countPosts) {
		this.countPosts = countPosts;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getIdCat() {
		return this.idCat;
	}

	public void setIdCat(byte idCat) {
		this.idCat = idCat;
	}

	public int getIdLastMsg() {
		return this.idLastMsg;
	}

	public void setIdLastMsg(int idLastMsg) {
		this.idLastMsg = idLastMsg;
	}

	public int getIdMsgUpdated() {
		return this.idMsgUpdated;
	}

	public void setIdMsgUpdated(int idMsgUpdated) {
		this.idMsgUpdated = idMsgUpdated;
	}

	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public int getIdProfile() {
		return this.idProfile;
	}

	public void setIdProfile(int idProfile) {
		this.idProfile = idProfile;
	}

	public byte getIdTheme() {
		return this.idTheme;
	}

	public void setIdTheme(byte idTheme) {
		this.idTheme = idTheme;
	}

	public String getMemberGroups() {
		return this.memberGroups;
	}

	public void setMemberGroups(String memberGroups) {
		this.memberGroups = memberGroups;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumPosts() {
		return this.numPosts;
	}

	public void setNumPosts(int numPosts) {
		this.numPosts = numPosts;
	}

	public int getNumTopics() {
		return this.numTopics;
	}

	public void setNumTopics(int numTopics) {
		this.numTopics = numTopics;
	}

	public byte getOverrideTheme() {
		return this.overrideTheme;
	}

	public void setOverrideTheme(byte overrideTheme) {
		this.overrideTheme = overrideTheme;
	}

	public String getRedirect() {
		return this.redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}

	public short getUnapprovedPosts() {
		return this.unapprovedPosts;
	}

	public void setUnapprovedPosts(short unapprovedPosts) {
		this.unapprovedPosts = unapprovedPosts;
	}

	public short getUnapprovedTopics() {
		return this.unapprovedTopics;
	}

	public void setUnapprovedTopics(short unapprovedTopics) {
		this.unapprovedTopics = unapprovedTopics;
	}

}