package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_cf_forms database table.
 * 
 */
@Entity
@Table(name="smf_cf_forms")
@NamedQuery(name="SmfCfForm.findAll", query="SELECT s FROM SmfCfForm s")
public class SmfCfForm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_form")
	private short idForm;

	@Lob
	@Column(name="form_exit")
	private String formExit;

	@Lob
	private String icon;

	@Column(name="id_board")
	private short idBoard;

	@Lob
	private String output;

	@Lob
	private String subject;

	@Lob
	@Column(name="template_function")
	private String templateFunction;

	@Lob
	private String title;

	public SmfCfForm() {
	}

	public short getIdForm() {
		return this.idForm;
	}

	public void setIdForm(short idForm) {
		this.idForm = idForm;
	}

	public String getFormExit() {
		return this.formExit;
	}

	public void setFormExit(String formExit) {
		this.formExit = formExit;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public short getIdBoard() {
		return this.idBoard;
	}

	public void setIdBoard(short idBoard) {
		this.idBoard = idBoard;
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTemplateFunction() {
		return this.templateFunction;
	}

	public void setTemplateFunction(String templateFunction) {
		this.templateFunction = templateFunction;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}