package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_reported database table.
 * 
 */
@Entity
@Table(name="smf_log_reported")
@NamedQuery(name="SmfLogReported.findAll", query="SELECT s FROM SmfLogReported s")
public class SmfLogReported implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_report")
	private int idReport;

	@Lob
	private String body;

	private byte closed;

	@Column(name="id_board")
	private int idBoard;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_msg")
	private int idMsg;

	@Column(name="id_topic")
	private int idTopic;

	@Column(name="ignore_all")
	private byte ignoreAll;

	private String membername;

	@Column(name="num_reports")
	private int numReports;

	private String subject;

	@Column(name="time_started")
	private int timeStarted;

	@Column(name="time_updated")
	private int timeUpdated;

	public SmfLogReported() {
	}

	public int getIdReport() {
		return this.idReport;
	}

	public void setIdReport(int idReport) {
		this.idReport = idReport;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public byte getClosed() {
		return this.closed;
	}

	public void setClosed(byte closed) {
		this.closed = closed;
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

	public int getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

	public int getIdTopic() {
		return this.idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public byte getIgnoreAll() {
		return this.ignoreAll;
	}

	public void setIgnoreAll(byte ignoreAll) {
		this.ignoreAll = ignoreAll;
	}

	public String getMembername() {
		return this.membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public int getNumReports() {
		return this.numReports;
	}

	public void setNumReports(int numReports) {
		this.numReports = numReports;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTimeStarted() {
		return this.timeStarted;
	}

	public void setTimeStarted(int timeStarted) {
		this.timeStarted = timeStarted;
	}

	public int getTimeUpdated() {
		return this.timeUpdated;
	}

	public void setTimeUpdated(int timeUpdated) {
		this.timeUpdated = timeUpdated;
	}

}