package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_errors database table.
 * 
 */
@Entity
@Table(name="smf_log_errors")
@NamedQuery(name="SmfLogError.findAll", query="SELECT s FROM SmfLogError s")
public class SmfLogError implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_error")
	private int idError;

	@Column(name="error_type")
	private String errorType;

	private String file;

	@Column(name="id_member")
	private int idMember;

	private String ip;

	private int line;

	@Column(name="log_time")
	private int logTime;

	@Lob
	private String message;

	private String session;

	@Lob
	private String url;

	public SmfLogError() {
	}

	public int getIdError() {
		return this.idError;
	}

	public void setIdError(int idError) {
		this.idError = idError;
	}

	public String getErrorType() {
		return this.errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public String getFile() {
		return this.file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getLine() {
		return this.line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getLogTime() {
		return this.logTime;
	}

	public void setLogTime(int logTime) {
		this.logTime = logTime;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSession() {
		return this.session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}