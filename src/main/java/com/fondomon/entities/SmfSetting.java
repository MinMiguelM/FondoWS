package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_settings database table.
 * 
 */
@Entity
@Table(name="smf_settings")
@NamedQuery(name="SmfSetting.findAll", query="SELECT s FROM SmfSetting s")
public class SmfSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String variable;

	@Lob
	private String value;

	public SmfSetting() {
	}

	public String getVariable() {
		return this.variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}