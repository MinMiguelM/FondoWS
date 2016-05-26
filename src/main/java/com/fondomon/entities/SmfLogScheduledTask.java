package com.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_scheduled_tasks database table.
 * 
 */
@Entity
@Table(name="smf_log_scheduled_tasks")
@NamedQuery(name="SmfLogScheduledTask.findAll", query="SELECT s FROM SmfLogScheduledTask s")
public class SmfLogScheduledTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_log")
	private int idLog;

	@Column(name="id_task")
	private short idTask;

	@Column(name="time_run")
	private int timeRun;

	@Column(name="time_taken")
	private float timeTaken;

	public SmfLogScheduledTask() {
	}

	public int getIdLog() {
		return this.idLog;
	}

	public void setIdLog(int idLog) {
		this.idLog = idLog;
	}

	public short getIdTask() {
		return this.idTask;
	}

	public void setIdTask(short idTask) {
		this.idTask = idTask;
	}

	public int getTimeRun() {
		return this.timeRun;
	}

	public void setTimeRun(int timeRun) {
		this.timeRun = timeRun;
	}

	public float getTimeTaken() {
		return this.timeTaken;
	}

	public void setTimeTaken(float timeTaken) {
		this.timeTaken = timeTaken;
	}

}