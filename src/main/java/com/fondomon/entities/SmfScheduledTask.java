package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_scheduled_tasks database table.
 * 
 */
@Entity
@Table(name="smf_scheduled_tasks")
@NamedQuery(name="SmfScheduledTask.findAll", query="SELECT s FROM SmfScheduledTask s")
public class SmfScheduledTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_task")
	private short idTask;

	private byte disabled;

	@Column(name="next_time")
	private int nextTime;

	private String task;

	@Column(name="time_offset")
	private int timeOffset;

	@Column(name="time_regularity")
	private short timeRegularity;

	@Column(name="time_unit")
	private String timeUnit;

	public SmfScheduledTask() {
	}

	public short getIdTask() {
		return this.idTask;
	}

	public void setIdTask(short idTask) {
		this.idTask = idTask;
	}

	public byte getDisabled() {
		return this.disabled;
	}

	public void setDisabled(byte disabled) {
		this.disabled = disabled;
	}

	public int getNextTime() {
		return this.nextTime;
	}

	public void setNextTime(int nextTime) {
		this.nextTime = nextTime;
	}

	public String getTask() {
		return this.task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getTimeOffset() {
		return this.timeOffset;
	}

	public void setTimeOffset(int timeOffset) {
		this.timeOffset = timeOffset;
	}

	public short getTimeRegularity() {
		return this.timeRegularity;
	}

	public void setTimeRegularity(short timeRegularity) {
		this.timeRegularity = timeRegularity;
	}

	public String getTimeUnit() {
		return this.timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

}