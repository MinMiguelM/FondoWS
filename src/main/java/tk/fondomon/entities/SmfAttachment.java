package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_attachments database table.
 * 
 */
@Entity
@Table(name="smf_attachments")
@NamedQuery(name="SmfAttachment.findAll", query="SELECT s FROM SmfAttachment s")
public class SmfAttachment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_attach")
	private int idAttach;

	private byte approved;

	@Column(name="attachment_type")
	private byte attachmentType;

	private int downloads;

	@Column(name="file_hash")
	private String fileHash;

	private String fileext;

	private String filename;

	private int height;

	@Column(name="id_folder")
	private byte idFolder;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_msg")
	private int idMsg;

	@Column(name="id_thumb")
	private int idThumb;

	@Column(name="mime_type")
	private String mimeType;

	private int size;

	private int width;

	public SmfAttachment() {
	}

	public int getIdAttach() {
		return this.idAttach;
	}

	public void setIdAttach(int idAttach) {
		this.idAttach = idAttach;
	}

	public byte getApproved() {
		return this.approved;
	}

	public void setApproved(byte approved) {
		this.approved = approved;
	}

	public byte getAttachmentType() {
		return this.attachmentType;
	}

	public void setAttachmentType(byte attachmentType) {
		this.attachmentType = attachmentType;
	}

	public int getDownloads() {
		return this.downloads;
	}

	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}

	public String getFileHash() {
		return this.fileHash;
	}

	public void setFileHash(String fileHash) {
		this.fileHash = fileHash;
	}

	public String getFileext() {
		return this.fileext;
	}

	public void setFileext(String fileext) {
		this.fileext = fileext;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public byte getIdFolder() {
		return this.idFolder;
	}

	public void setIdFolder(byte idFolder) {
		this.idFolder = idFolder;
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

	public int getIdThumb() {
		return this.idThumb;
	}

	public void setIdThumb(int idThumb) {
		this.idThumb = idThumb;
	}

	public String getMimeType() {
		return this.mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}