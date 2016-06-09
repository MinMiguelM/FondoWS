package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_collapsed_categories database table.
 * 
 */
@Entity
@Table(name="smf_collapsed_categories")
@NamedQuery(name="SmfCollapsedCategory.findAll", query="SELECT s FROM SmfCollapsedCategory s")
public class SmfCollapsedCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfCollapsedCategoryPK id;

	public SmfCollapsedCategory() {
	}

	public SmfCollapsedCategoryPK getId() {
		return this.id;
	}

	public void setId(SmfCollapsedCategoryPK id) {
		this.id = id;
	}

}