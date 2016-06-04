package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_log_karma database table.
 * 
 */
@Embeddable
public class SmfLogKarmaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_target")
	private int idTarget;

	@Column(name="id_executor")
	private int idExecutor;

	public SmfLogKarmaPK() {
	}
	public int getIdTarget() {
		return this.idTarget;
	}
	public void setIdTarget(int idTarget) {
		this.idTarget = idTarget;
	}
	public int getIdExecutor() {
		return this.idExecutor;
	}
	public void setIdExecutor(int idExecutor) {
		this.idExecutor = idExecutor;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfLogKarmaPK)) {
			return false;
		}
		SmfLogKarmaPK castOther = (SmfLogKarmaPK)other;
		return 
			(this.idTarget == castOther.idTarget)
			&& (this.idExecutor == castOther.idExecutor);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTarget;
		hash = hash * prime + this.idExecutor;
		
		return hash;
	}
}