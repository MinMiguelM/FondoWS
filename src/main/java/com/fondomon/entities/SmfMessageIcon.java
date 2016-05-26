package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_message_icons database table.
 * 
 */
@Entity
@Table(name="smf_message_icons")
@NamedQuery(name="SmfMessageIcon.findAll", query="SELECT s FROM SmfMessageIcon s")
public class SmfMessageIcon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_icon")
	private int idIcon;

	private String filename;

	@Column(name="icon_order")
	private int iconOrder;

	@Column(name="id_board")
	private int idBoard;

	private String title;

	public SmfMessageIcon() {
	}

	public int getIdIcon() {
		return this.idIcon;
	}

	public void setIdIcon(int idIcon) {
		this.idIcon = idIcon;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getIconOrder() {
		return this.iconOrder;
	}

	public void setIconOrder(int iconOrder) {
		this.iconOrder = iconOrder;
	}

	public int getIdBoard() {
		return this.idBoard;
	}

	public void setIdBoard(int idBoard) {
		this.idBoard = idBoard;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}