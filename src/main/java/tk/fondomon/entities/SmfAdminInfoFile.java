package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_admin_info_files database table.
 * 
 */
@Entity
@Table(name="smf_admin_info_files")
@NamedQuery(name="SmfAdminInfoFile.findAll", query="SELECT s FROM SmfAdminInfoFile s")
public class SmfAdminInfoFile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_file")
	private byte idFile;

	@Lob
	private String data;

	private String filename;

	private String filetype;

	private String parameters;

	private String path;

	public SmfAdminInfoFile() {
	}

	public byte getIdFile() {
		return this.idFile;
	}

	public void setIdFile(byte idFile) {
		this.idFile = idFile;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFiletype() {
		return this.filetype;
	}

	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}