package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_reported_comments database table.
 * 
 */
@Entity
@Table(name="smf_log_reported_comments")
@NamedQuery(name="SmfLogReportedComment.findAll", query="SELECT s FROM SmfLogReportedComment s")
public class SmfLogReportedComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_comment")
	private int idComment;

	private String comment;

	@Column(name="email_address")
	private String emailAddress;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_report")
	private int idReport;

	@Column(name="member_ip")
	private String memberIp;

	private String membername;

	@Column(name="time_sent")
	private int timeSent;

	public SmfLogReportedComment() {
	}

	public int getIdComment() {
		return this.idComment;
	}

	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public int getIdReport() {
		return this.idReport;
	}

	public void setIdReport(int idReport) {
		this.idReport = idReport;
	}

	public String getMemberIp() {
		return this.memberIp;
	}

	public void setMemberIp(String memberIp) {
		this.memberIp = memberIp;
	}

	public String getMembername() {
		return this.membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public int getTimeSent() {
		return this.timeSent;
	}

	public void setTimeSent(int timeSent) {
		this.timeSent = timeSent;
	}

}