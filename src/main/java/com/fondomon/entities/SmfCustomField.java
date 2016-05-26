package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_custom_fields database table.
 * 
 */
@Entity
@Table(name="smf_custom_fields")
@NamedQuery(name="SmfCustomField.findAll", query="SELECT s FROM SmfCustomField s")
public class SmfCustomField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_field")
	private short idField;

	private byte active;

	private byte bbc;

	@Column(name="can_search")
	private byte canSearch;

	@Column(name="col_name")
	private String colName;

	@Column(name="default_value")
	private String defaultValue;

	@Lob
	private String enclose;

	@Column(name="field_desc")
	private String fieldDesc;

	@Column(name="field_length")
	private short fieldLength;

	@Column(name="field_name")
	private String fieldName;

	@Lob
	@Column(name="field_options")
	private String fieldOptions;

	@Column(name="field_type")
	private String fieldType;

	private String mask;

	private byte placement;

	@Column(name="private")
	private byte private_;

	@Column(name="show_display")
	private byte showDisplay;

	@Column(name="show_profile")
	private String showProfile;

	@Column(name="show_reg")
	private byte showReg;

	public SmfCustomField() {
	}

	public short getIdField() {
		return this.idField;
	}

	public void setIdField(short idField) {
		this.idField = idField;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public byte getBbc() {
		return this.bbc;
	}

	public void setBbc(byte bbc) {
		this.bbc = bbc;
	}

	public byte getCanSearch() {
		return this.canSearch;
	}

	public void setCanSearch(byte canSearch) {
		this.canSearch = canSearch;
	}

	public String getColName() {
		return this.colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getEnclose() {
		return this.enclose;
	}

	public void setEnclose(String enclose) {
		this.enclose = enclose;
	}

	public String getFieldDesc() {
		return this.fieldDesc;
	}

	public void setFieldDesc(String fieldDesc) {
		this.fieldDesc = fieldDesc;
	}

	public short getFieldLength() {
		return this.fieldLength;
	}

	public void setFieldLength(short fieldLength) {
		this.fieldLength = fieldLength;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldOptions() {
		return this.fieldOptions;
	}

	public void setFieldOptions(String fieldOptions) {
		this.fieldOptions = fieldOptions;
	}

	public String getFieldType() {
		return this.fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getMask() {
		return this.mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public byte getPlacement() {
		return this.placement;
	}

	public void setPlacement(byte placement) {
		this.placement = placement;
	}

	public byte getPrivate_() {
		return this.private_;
	}

	public void setPrivate_(byte private_) {
		this.private_ = private_;
	}

	public byte getShowDisplay() {
		return this.showDisplay;
	}

	public void setShowDisplay(byte showDisplay) {
		this.showDisplay = showDisplay;
	}

	public String getShowProfile() {
		return this.showProfile;
	}

	public void setShowProfile(String showProfile) {
		this.showProfile = showProfile;
	}

	public byte getShowReg() {
		return this.showReg;
	}

	public void setShowReg(byte showReg) {
		this.showReg = showReg;
	}

}