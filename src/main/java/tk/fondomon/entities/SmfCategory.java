package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_categories database table.
 * 
 */
@Entity
@Table(name="smf_categories")
@NamedQuery(name="SmfCategory.findAll", query="SELECT s FROM SmfCategory s")
public class SmfCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_cat")
	private byte idCat;

	@Column(name="can_collapse")
	private byte canCollapse;

	@Column(name="cat_order")
	private byte catOrder;

	private String name;

	public SmfCategory() {
	}

	public byte getIdCat() {
		return this.idCat;
	}

	public void setIdCat(byte idCat) {
		this.idCat = idCat;
	}

	public byte getCanCollapse() {
		return this.canCollapse;
	}

	public void setCanCollapse(byte canCollapse) {
		this.canCollapse = canCollapse;
	}

	public byte getCatOrder() {
		return this.catOrder;
	}

	public void setCatOrder(byte catOrder) {
		this.catOrder = catOrder;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}