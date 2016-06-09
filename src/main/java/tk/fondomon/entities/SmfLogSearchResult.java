package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_search_results database table.
 * 
 */
@Entity
@Table(name="smf_log_search_results")
@NamedQuery(name="SmfLogSearchResult.findAll", query="SELECT s FROM SmfLogSearchResult s")
public class SmfLogSearchResult implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SmfLogSearchResultPK id;

	@Column(name="id_msg")
	private int idMsg;

	@Column(name="num_matches")
	private int numMatches;

	private int relevance;

	public SmfLogSearchResult() {
	}

	public SmfLogSearchResultPK getId() {
		return this.id;
	}

	public void setId(SmfLogSearchResultPK id) {
		this.id = id;
	}

	public int getIdMsg() {
		return this.idMsg;
	}

	public void setIdMsg(int idMsg) {
		this.idMsg = idMsg;
	}

	public int getNumMatches() {
		return this.numMatches;
	}

	public void setNumMatches(int numMatches) {
		this.numMatches = numMatches;
	}

	public int getRelevance() {
		return this.relevance;
	}

	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}

}