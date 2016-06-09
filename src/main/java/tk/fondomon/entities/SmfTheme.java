package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_themes database table.
 * 
 */
@Entity
@Table(name="smf_themes")
@NamedQuery(name="SmfTheme.findAll", query="SELECT s FROM SmfTheme s")
public class SmfTheme implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfThemePK id;

	@Lob
	private String value;

	public SmfTheme() {
	}

	public SmfThemePK getId() {
		return this.id;
	}

	public void setId(SmfThemePK id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}