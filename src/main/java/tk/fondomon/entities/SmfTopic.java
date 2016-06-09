package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_topics database table.
 * 
 */
@Entity
@Table(name="smf_topics")
@NamedQuery(name="SmfTopic.findAll", query="SELECT s FROM SmfTopic s")
public class SmfTopic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_topic")
	private int idTopic;

	private byte approved;

	@Column(name="id_board")
	private int idBoard;

	@Column(name="id_first_msg")
	private int idFirstMsg;

	@Column(name="id_last_msg")
	private int idLastMsg;

	@Column(name="id_member_started")
	private int idMemberStarted;

	@Column(name="id_member_updated")
	private int idMemberUpdated;

	@Column(name="id_poll")
	private int idPoll;

	@Column(name="id_previous_board")
	private short idPreviousBoard;

	@Column(name="id_previous_topic")
	private int idPreviousTopic;

	@Column(name="is_sticky")
	private byte isSticky;

	private byte locked;

	@Column(name="num_replies")
	private int numReplies;

	@Column(name="num_views")
	private int numViews;

	@Column(name="unapproved_posts")
	private short unapprovedPosts;

	public SmfTopic() {
	}

	public int getIdTopic() {
		return this.idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public byte getApproved() {
		return this.approved;
	}

	public void setApproved(byte approved) {
		this.approved = approved;
	}

	public int getIdBoard() {
		return this.idBoard;
	}

	public void setIdBoard(int idBoard) {
		this.idBoard = idBoard;
	}

	public int getIdFirstMsg() {
		return this.idFirstMsg;
	}

	public void setIdFirstMsg(int idFirstMsg) {
		this.idFirstMsg = idFirstMsg;
	}

	public int getIdLastMsg() {
		return this.idLastMsg;
	}

	public void setIdLastMsg(int idLastMsg) {
		this.idLastMsg = idLastMsg;
	}

	public int getIdMemberStarted() {
		return this.idMemberStarted;
	}

	public void setIdMemberStarted(int idMemberStarted) {
		this.idMemberStarted = idMemberStarted;
	}

	public int getIdMemberUpdated() {
		return this.idMemberUpdated;
	}

	public void setIdMemberUpdated(int idMemberUpdated) {
		this.idMemberUpdated = idMemberUpdated;
	}

	public int getIdPoll() {
		return this.idPoll;
	}

	public void setIdPoll(int idPoll) {
		this.idPoll = idPoll;
	}

	public short getIdPreviousBoard() {
		return this.idPreviousBoard;
	}

	public void setIdPreviousBoard(short idPreviousBoard) {
		this.idPreviousBoard = idPreviousBoard;
	}

	public int getIdPreviousTopic() {
		return this.idPreviousTopic;
	}

	public void setIdPreviousTopic(int idPreviousTopic) {
		this.idPreviousTopic = idPreviousTopic;
	}

	public byte getIsSticky() {
		return this.isSticky;
	}

	public void setIsSticky(byte isSticky) {
		this.isSticky = isSticky;
	}

	public byte getLocked() {
		return this.locked;
	}

	public void setLocked(byte locked) {
		this.locked = locked;
	}

	public int getNumReplies() {
		return this.numReplies;
	}

	public void setNumReplies(int numReplies) {
		this.numReplies = numReplies;
	}

	public int getNumViews() {
		return this.numViews;
	}

	public void setNumViews(int numViews) {
		this.numViews = numViews;
	}

	public short getUnapprovedPosts() {
		return this.unapprovedPosts;
	}

	public void setUnapprovedPosts(short unapprovedPosts) {
		this.unapprovedPosts = unapprovedPosts;
	}

}