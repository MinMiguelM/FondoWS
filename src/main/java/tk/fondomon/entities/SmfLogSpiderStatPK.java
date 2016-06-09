package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the smf_log_spider_stats database table.
 * 
 */
@Embeddable
public class SmfLogSpiderStatPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="stat_date")
	private java.util.Date statDate;

	@Column(name="id_spider")
	private int idSpider;

	public SmfLogSpiderStatPK() {
	}
	public java.util.Date getStatDate() {
		return this.statDate;
	}
	public void setStatDate(java.util.Date statDate) {
		this.statDate = statDate;
	}
	public int getIdSpider() {
		return this.idSpider;
	}
	public void setIdSpider(int idSpider) {
		this.idSpider = idSpider;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SmfLogSpiderStatPK)) {
			return false;
		}
		SmfLogSpiderStatPK castOther = (SmfLogSpiderStatPK)other;
		return 
			this.statDate.equals(castOther.statDate)
			&& (this.idSpider == castOther.idSpider);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.statDate.hashCode();
		hash = hash * prime + this.idSpider;
		
		return hash;
	}
}