package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_ban_items database table.
 * 
 */
@Entity
@Table(name="smf_ban_items")
@NamedQuery(name="SmfBanItem.findAll", query="SELECT s FROM SmfBanItem s")
public class SmfBanItem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ban")
	private int idBan;

	@Column(name="email_address")
	private String emailAddress;

	private int hits;

	private String hostname;

	@Column(name="id_ban_group")
	private int idBanGroup;

	@Column(name="id_member")
	private int idMember;

	@Column(name="ip_high1")
	private byte ipHigh1;

	@Column(name="ip_high2")
	private byte ipHigh2;

	@Column(name="ip_high3")
	private byte ipHigh3;

	@Column(name="ip_high4")
	private byte ipHigh4;

	@Column(name="ip_low1")
	private byte ipLow1;

	@Column(name="ip_low2")
	private byte ipLow2;

	@Column(name="ip_low3")
	private byte ipLow3;

	@Column(name="ip_low4")
	private byte ipLow4;

	public SmfBanItem() {
	}

	public int getIdBan() {
		return this.idBan;
	}

	public void setIdBan(int idBan) {
		this.idBan = idBan;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getHits() {
		return this.hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public String getHostname() {
		return this.hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getIdBanGroup() {
		return this.idBanGroup;
	}

	public void setIdBanGroup(int idBanGroup) {
		this.idBanGroup = idBanGroup;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public byte getIpHigh1() {
		return this.ipHigh1;
	}

	public void setIpHigh1(byte ipHigh1) {
		this.ipHigh1 = ipHigh1;
	}

	public byte getIpHigh2() {
		return this.ipHigh2;
	}

	public void setIpHigh2(byte ipHigh2) {
		this.ipHigh2 = ipHigh2;
	}

	public byte getIpHigh3() {
		return this.ipHigh3;
	}

	public void setIpHigh3(byte ipHigh3) {
		this.ipHigh3 = ipHigh3;
	}

	public byte getIpHigh4() {
		return this.ipHigh4;
	}

	public void setIpHigh4(byte ipHigh4) {
		this.ipHigh4 = ipHigh4;
	}

	public byte getIpLow1() {
		return this.ipLow1;
	}

	public void setIpLow1(byte ipLow1) {
		this.ipLow1 = ipLow1;
	}

	public byte getIpLow2() {
		return this.ipLow2;
	}

	public void setIpLow2(byte ipLow2) {
		this.ipLow2 = ipLow2;
	}

	public byte getIpLow3() {
		return this.ipLow3;
	}

	public void setIpLow3(byte ipLow3) {
		this.ipLow3 = ipLow3;
	}

	public byte getIpLow4() {
		return this.ipLow4;
	}

	public void setIpLow4(byte ipLow4) {
		this.ipLow4 = ipLow4;
	}

}