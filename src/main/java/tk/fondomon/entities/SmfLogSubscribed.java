package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_subscribed database table.
 * 
 */
@Entity
@Table(name="smf_log_subscribed")
@NamedQuery(name="SmfLogSubscribed.findAll", query="SELECT s FROM SmfLogSubscribed s")
public class SmfLogSubscribed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_sublog")
	private int idSublog;

	@Column(name="end_time")
	private int endTime;

	@Column(name="id_member")
	private int idMember;

	@Column(name="id_subscribe")
	private int idSubscribe;

	@Column(name="old_id_group")
	private short oldIdGroup;

	@Column(name="payments_pending")
	private byte paymentsPending;

	@Lob
	@Column(name="pending_details")
	private String pendingDetails;

	@Column(name="reminder_sent")
	private byte reminderSent;

	@Column(name="start_time")
	private int startTime;

	private byte status;

	@Column(name="vendor_ref")
	private String vendorRef;

	public SmfLogSubscribed() {
	}

	public int getIdSublog() {
		return this.idSublog;
	}

	public void setIdSublog(int idSublog) {
		this.idSublog = idSublog;
	}

	public int getEndTime() {
		return this.endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public int getIdSubscribe() {
		return this.idSubscribe;
	}

	public void setIdSubscribe(int idSubscribe) {
		this.idSubscribe = idSubscribe;
	}

	public short getOldIdGroup() {
		return this.oldIdGroup;
	}

	public void setOldIdGroup(short oldIdGroup) {
		this.oldIdGroup = oldIdGroup;
	}

	public byte getPaymentsPending() {
		return this.paymentsPending;
	}

	public void setPaymentsPending(byte paymentsPending) {
		this.paymentsPending = paymentsPending;
	}

	public String getPendingDetails() {
		return this.pendingDetails;
	}

	public void setPendingDetails(String pendingDetails) {
		this.pendingDetails = pendingDetails;
	}

	public byte getReminderSent() {
		return this.reminderSent;
	}

	public void setReminderSent(byte reminderSent) {
		this.reminderSent = reminderSent;
	}

	public int getStartTime() {
		return this.startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getVendorRef() {
		return this.vendorRef;
	}

	public void setVendorRef(String vendorRef) {
		this.vendorRef = vendorRef;
	}

}