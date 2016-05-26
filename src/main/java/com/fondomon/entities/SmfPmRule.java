package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_pm_rules database table.
 * 
 */
@Entity
@Table(name="smf_pm_rules")
@NamedQuery(name="SmfPmRule.findAll", query="SELECT s FROM SmfPmRule s")
public class SmfPmRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_rule")
	private int idRule;

	@Lob
	private String actions;

	@Lob
	private String criteria;

	@Column(name="delete_pm")
	private byte deletePm;

	@Column(name="id_member")
	private int idMember;

	@Column(name="is_or")
	private byte isOr;

	@Column(name="rule_name")
	private String ruleName;

	public SmfPmRule() {
	}

	public int getIdRule() {
		return this.idRule;
	}

	public void setIdRule(int idRule) {
		this.idRule = idRule;
	}

	public String getActions() {
		return this.actions;
	}

	public void setActions(String actions) {
		this.actions = actions;
	}

	public String getCriteria() {
		return this.criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public byte getDeletePm() {
		return this.deletePm;
	}

	public void setDeletePm(byte deletePm) {
		this.deletePm = deletePm;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public byte getIsOr() {
		return this.isOr;
	}

	public void setIsOr(byte isOr) {
		this.isOr = isOr;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

}