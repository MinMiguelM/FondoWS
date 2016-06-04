package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_spider_stats database table.
 * 
 */
@Entity
@Table(name="smf_log_spider_stats")
@NamedQuery(name="SmfLogSpiderStat.findAll", query="SELECT s FROM SmfLogSpiderStat s")
public class SmfLogSpiderStat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogSpiderStatPK id;

	@Column(name="last_seen")
	private int lastSeen;

	@Column(name="page_hits")
	private int pageHits;

	public SmfLogSpiderStat() {
	}

	public SmfLogSpiderStatPK getId() {
		return this.id;
	}

	public void setId(SmfLogSpiderStatPK id) {
		this.id = id;
	}

	public int getLastSeen() {
		return this.lastSeen;
	}

	public void setLastSeen(int lastSeen) {
		this.lastSeen = lastSeen;
	}

	public int getPageHits() {
		return this.pageHits;
	}

	public void setPageHits(int pageHits) {
		this.pageHits = pageHits;
	}

}