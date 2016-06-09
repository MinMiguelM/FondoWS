package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_boards database table.
 * 
 */
@Entity
@Table(name="smf_log_boards")
@NamedQuery(name="SmfLogBoard.findAll", query="SELECT s FROM SmfLogBoard s")
public class SmfLogBoard implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogBoardPK id;

	@Column(name="id_msg")
	private int idMsg;

	public SmfLogBoard() {
	}

	public SmfLogBoardPK getId() {
		return this.id;
	}

	public void setId(SmfLogBoardPK id) {
		this.id = id;
	}

	public int getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

}