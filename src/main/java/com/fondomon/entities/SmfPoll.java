package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_polls database table.
 * 
 */
@Entity
@Table(name="smf_polls")
@NamedQuery(name="SmfPoll.findAll", query="SELECT s FROM SmfPoll s")
public class SmfPoll implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_poll")
	private int idPoll;

	@Column(name="change_vote")
	private byte changeVote;

	@Column(name="expire_time")
	private int expireTime;

	@Column(name="guest_vote")
	private byte guestVote;

	@Column(name="hide_results")
	private byte hideResults;

	@Column(name="id_member")
	private int idMember;

	@Column(name="max_votes")
	private byte maxVotes;

	@Column(name="num_guest_voters")
	private int numGuestVoters;

	@Column(name="poster_name")
	private String posterName;

	private String question;

	@Column(name="reset_poll")
	private int resetPoll;

	@Column(name="voting_locked")
	private byte votingLocked;

	public SmfPoll() {
	}

	public int getIdPoll() {
		return this.idPoll;
	}

	public void setIdPoll(int idPoll) {
		this.idPoll = idPoll;
	}

	public byte getChangeVote() {
		return this.changeVote;
	}

	public void setChangeVote(byte changeVote) {
		this.changeVote = changeVote;
	}

	public int getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(int expireTime) {
		this.expireTime = expireTime;
	}

	public byte getGuestVote() {
		return this.guestVote;
	}

	public void setGuestVote(byte guestVote) {
		this.guestVote = guestVote;
	}

	public byte getHideResults() {
		return this.hideResults;
	}

	public void setHideResults(byte hideResults) {
		this.hideResults = hideResults;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public byte getMaxVotes() {
		return this.maxVotes;
	}

	public void setMaxVotes(byte maxVotes) {
		this.maxVotes = maxVotes;
	}

	public int getNumGuestVoters() {
		return this.numGuestVoters;
	}

	public void setNumGuestVoters(int numGuestVoters) {
		this.numGuestVoters = numGuestVoters;
	}

	public String getPosterName() {
		return this.posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getResetPoll() {
		return this.resetPoll;
	}

	public void setResetPoll(int resetPoll) {
		this.resetPoll = resetPoll;
	}

	public byte getVotingLocked() {
		return this.votingLocked;
	}

	public void setVotingLocked(byte votingLocked) {
		this.votingLocked = votingLocked;
	}

}