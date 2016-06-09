package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_ban_groups database table.
 * 
 */
@Entity
@Table(name="smf_ban_groups")
@NamedQuery(name="SmfBanGroup.findAll", query="SELECT s FROM SmfBanGroup s")
public class SmfBanGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ban_group")
	private int idBanGroup;

	@Column(name="ban_time")
	private int banTime;

	@Column(name="cannot_access")
	private byte cannotAccess;

	@Column(name="cannot_login")
	private byte cannotLogin;

	@Column(name="cannot_post")
	private byte cannotPost;

	@Column(name="cannot_register")
	private byte cannotRegister;

	@Column(name="expire_time")
	private int expireTime;

	private String name;

	@Lob
	private String notes;

	private String reason;

	public SmfBanGroup() {
	}

	public int getIdBanGroup() {
		return this.idBanGroup;
	}

	public void setIdBanGroup(int idBanGroup) {
		this.idBanGroup = idBanGroup;
	}

	public int getBanTime() {
		return this.banTime;
	}

	public void setBanTime(int banTime) {
		this.banTime = banTime;
	}

	public byte getCannotAccess() {
		return this.cannotAccess;
	}

	public void setCannotAccess(byte cannotAccess) {
		this.cannotAccess = cannotAccess;
	}

	public byte getCannotLogin() {
		return this.cannotLogin;
	}

	public void setCannotLogin(byte cannotLogin) {
		this.cannotLogin = cannotLogin;
	}

	public byte getCannotPost() {
		return this.cannotPost;
	}

	public void setCannotPost(byte cannotPost) {
		this.cannotPost = cannotPost;
	}

	public byte getCannotRegister() {
		return this.cannotRegister;
	}

	public void setCannotRegister(byte cannotRegister) {
		this.cannotRegister = cannotRegister;
	}

	public int getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(int expireTime) {
		this.expireTime = expireTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}