package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_cf_fields database table.
 * 
 */
@Entity
@Table(name="smf_cf_fields")
@NamedQuery(name="SmfCfField.findAll", query="SELECT s FROM SmfCfField s")
public class SmfCfField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_field")
	private short idField;

	@Column(name="id_form")
	private short idForm;

	@Lob
	private String text;

	@Lob
	private String title;

	@Lob
	private String type;

	@Lob
	@Column(name="type_vars")
	private String typeVars;

	public SmfCfField() {
	}

	public short getIdField() {
		return this.idField;
	}

	public void setIdField(short idField) {
		this.idField = idField;
	}

	public short getIdForm() {
		return this.idForm;
	}

	public void setIdForm(short idForm) {
		this.idForm = idForm;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTypeVars() {
		return this.typeVars;
	}

	public void setTypeVars(String typeVars) {
		this.typeVars = typeVars;
	}

}