package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the smf_calendar_holidays database table.
 * 
 */
@Entity
@Table(name="smf_calendar_holidays")
@NamedQuery(name="SmfCalendarHoliday.findAll", query="SELECT s FROM SmfCalendarHoliday s")
public class SmfCalendarHoliday implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_holiday")
	private int idHoliday;

	@Temporal(TemporalType.DATE)
	@Column(name="event_date")
	private Date eventDate;

	private String title;

	public SmfCalendarHoliday() {
	}

	public int getIdHoliday() {
		return this.idHoliday;
	}

	public void setIdHoliday(int idHoliday) {
		this.idHoliday = idHoliday;
	}

	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}