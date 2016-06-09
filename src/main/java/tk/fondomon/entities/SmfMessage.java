package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_messages database table.
 * 
 */
@Entity
@Table(name="smf_messages")
@NamedQueries({
	@NamedQuery(name="SmfMessage.findAll", query="SELECT s FROM SmfMessage s"),
	// 4 is the number of the board where are the requests.
	@NamedQuery(name="SmfMessage.findRequestsByIdMember", query="SELECT s FROM SmfMessage s WHERE s.idMember = ? and s.idBoard = 4 ORDER BY s.posterTime DESC"),
	@NamedQuery(name="SmfMessage.findAllRequests", query="SELECT s FROM SmfMessage s WHERE s.idBoard = 4 ORDER BY s.posterTime DESC"),
	@NamedQuery(name="SmfMember.findByTimestamp", query="SELECT s FROM SmfMessage s WHERE s.posterTime = ?")
})
public class SmfMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_msg")
	private int idMsg;

	private byte approved;

	@Lob
	private String body;

	private String icon;

	@Column(name="id_board")
	private int idBoard;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_msg_modified")
	private int idMsgModified;

	@Column(name="id_topic")
	private int idTopic;

	@Column(name="modified_name")
	private String modifiedName;

	@Column(name="modified_time")
	private int modifiedTime;

	@Column(name="poster_email")
	private String posterEmail;

	@Column(name="poster_ip")
	private String posterIp;

	@Column(name="poster_name")
	private String posterName;

	@Column(name="poster_time")
	private int posterTime;

	@Column(name="smileys_enabled")
	private byte smileysEnabled;

	private String subject;

	public SmfMessage() {
	}

	public int getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

	public byte getApproved() {
		return this.approved;
	}

	public void setApproved(byte approved) {
		this.approved = approved;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getIdBoard() {
		return this.idBoard;
	}

	public void setIdBoard(int idBoard) {
		this.idBoard = idBoard;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public int getIdMsgModified() {
		return this.idMsgModified;
	}

	public void setIdMsgModified(int idMsgModified) {
		this.idMsgModified = idMsgModified;
	}

	public int getIdTopic() {
		return this.idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public String getModifiedName() {
		return this.modifiedName;
	}

	public void setModifiedName(String modifiedName) {
		this.modifiedName = modifiedName;
	}

	public int getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(int modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getPosterEmail() {
		return this.posterEmail;
	}

	public void setPosterEmail(String posterEmail) {
		this.posterEmail = posterEmail;
	}

	public String getPosterIp() {
		return this.posterIp;
	}

	public void setPosterIp(String posterIp) {
		this.posterIp = posterIp;
	}

	public String getPosterName() {
		return this.posterName;
	}

	public void setPosterName(String posterName) {
		this.posterName = posterName;
	}

	public int getPosterTime() {
		return this.posterTime;
	}

	public void setPosterTime(int posterTime) {
		this.posterTime = posterTime;
	}

	public byte getSmileysEnabled() {
		return this.smileysEnabled;
	}

	public void setSmileysEnabled(byte smileysEnabled) {
		this.smileysEnabled = smileysEnabled;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}