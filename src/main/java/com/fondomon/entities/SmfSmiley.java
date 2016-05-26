package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_smileys database table.
 * 
 */
@Entity
@Table(name="smf_smileys")
@NamedQuery(name="SmfSmiley.findAll", query="SELECT s FROM SmfSmiley s")
public class SmfSmiley implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_smiley")
	private int idSmiley;

	private String code;

	private String description;

	private String filename;

	private byte hidden;

	@Column(name="smiley_order")
	private int smileyOrder;

	@Column(name="smiley_row")
	private byte smileyRow;

	public SmfSmiley() {
	}

	public int getIdSmiley() {
		return this.idSmiley;
	}

	public void setIdSmiley(int idSmiley) {
		this.idSmiley = idSmiley;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public byte getHidden() {
		return this.hidden;
	}

	public void setHidden(byte hidden) {
		this.hidden = hidden;
	}

	public int getSmileyOrder() {
		return this.smileyOrder;
	}

	public void setSmileyOrder(int smileyOrder) {
		this.smileyOrder = smileyOrder;
	}

	public byte getSmileyRow() {
		return this.smileyRow;
	}

	public void setSmileyRow(byte smileyRow) {
		this.smileyRow = smileyRow;
	}

}