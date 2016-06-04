package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the smf_log_packages database table.
 * 
 */
@Entity
@Table(name="smf_log_packages")
@NamedQuery(name="SmfLogPackage.findAll", query="SELECT s FROM SmfLogPackage s")
public class SmfLogPackage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_install")
	private int idInstall;

	@Lob
	@Column(name="db_changes")
	private String dbChanges;

	@Lob
	@Column(name="failed_steps")
	private String failedSteps;

	private String filename;

	@Column(name="id_member_installed")
	private int idMemberInstalled;

	@Column(name="id_member_removed")
	private int idMemberRemoved;

	@Column(name="install_state")
	private byte installState;

	@Column(name="member_installed")
	private String memberInstalled;

	@Column(name="member_removed")
	private String memberRemoved;

	private String name;

	@Column(name="package_id")
	private String packageId;

	@Column(name="themes_installed")
	private String themesInstalled;

	@Column(name="time_installed")
	private int timeInstalled;

	@Column(name="time_removed")
	private int timeRemoved;

	private String version;

	public SmfLogPackage() {
	}

	public int getIdInstall() {
		return this.idInstall;
	}

	public void setIdInstall(int idInstall) {
		this.idInstall = idInstall;
	}

	public String getDbChanges() {
		return this.dbChanges;
	}

	public void setDbChanges(String dbChanges) {
		this.dbChanges = dbChanges;
	}

	public String getFailedSteps() {
		return this.failedSteps;
	}

	public void setFailedSteps(String failedSteps) {
		this.failedSteps = failedSteps;
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getIdMemberInstalled() {
		return this.idMemberInstalled;
	}

	public void setIdMemberInstalled(int idMemberInstalled) {
		this.idMemberInstalled = idMemberInstalled;
	}

	public int getIdMemberRemoved() {
		return this.idMemberRemoved;
	}

	public void setIdMemberRemoved(int idMemberRemoved) {
		this.idMemberRemoved = idMemberRemoved;
	}

	public byte getInstallState() {
		return this.installState;
	}

	public void setInstallState(byte installState) {
		this.installState = installState;
	}

	public String getMemberInstalled() {
		return this.memberInstalled;
	}

	public void setMemberInstalled(String memberInstalled) {
		this.memberInstalled = memberInstalled;
	}

	public String getMemberRemoved() {
		return this.memberRemoved;
	}

	public void setMemberRemoved(String memberRemoved) {
		this.memberRemoved = memberRemoved;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackageId() {
		return this.packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getThemesInstalled() {
		return this.themesInstalled;
	}

	public void setThemesInstalled(String themesInstalled) {
		this.themesInstalled = themesInstalled;
	}

	public int getTimeInstalled() {
		return this.timeInstalled;
	}

	public void setTimeInstalled(int timeInstalled) {
		this.timeInstalled = timeInstalled;
	}

	public int getTimeRemoved() {
		return this.timeRemoved;
	}

	public void setTimeRemoved(int timeRemoved) {
		this.timeRemoved = timeRemoved;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}