package tk.fondomon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the smf_members database table.
 * 
 */
@Entity
@Table(name="smf_members")
@NamedQueries({
	@NamedQuery(name="SmfMember.findAll", query="SELECT s FROM SmfMember s"),
	@NamedQuery(name="SmfMember.findByMemberName", query="SELECT s FROM SmfMember s where s.memberName = ?")
})
public class SmfMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_member")
	private int idMember;

	@Column(name="additional_groups")
	private String additionalGroups;

	private String aim;

	private String avatar;

	@Temporal(TemporalType.DATE)
	private Date birthdate;

	@Lob
	@Column(name="buddy_list")
	private String buddyList;

	@Column(name="date_registered")
	private int dateRegistered;

	@Column(name="email_address")
	private String emailAddress;

	private byte gender;

	@Column(name="hide_email")
	private byte hideEmail;

	private String icq;

	@Column(name="id_group")
	private int idGroup;

	@Column(name="id_msg_last_visit")
	private int idMsgLastVisit;

	@Column(name="id_post_group")
	private int idPostGroup;

	@Column(name="id_theme")
	private byte idTheme;

	@Lob
	@Column(name="ignore_boards")
	private String ignoreBoards;

	@Column(name="instant_messages")
	private short instantMessages;

	@Column(name="is_activated")
	private byte isActivated;

	@Column(name="karma_bad")
	private int karmaBad;

	@Column(name="karma_good")
	private int karmaGood;

	@Column(name="last_login")
	private int lastLogin;

	private String lngfile;

	private String location;

	@Column(name="member_ip")
	private String memberIp;

	@Column(name="member_ip2")
	private String memberIp2;

	@Column(name="member_name")
	private String memberName;

	@Lob
	@Column(name="message_labels")
	private String messageLabels;

	@Column(name="mod_prefs")
	private String modPrefs;

	private String msn;

	@Column(name="new_pm")
	private byte newPm;

	@Column(name="notify_announcements")
	private byte notifyAnnouncements;

	@Column(name="notify_regularity")
	private byte notifyRegularity;

	@Column(name="notify_send_body")
	private byte notifySendBody;

	@Column(name="notify_types")
	private byte notifyTypes;

	@Lob
	@Column(name="openid_uri")
	private String openidUri;

	private String passwd;

	@Column(name="passwd_flood")
	private String passwdFlood;

	@Column(name="password_salt")
	private String passwordSalt;

	@Column(name="personal_text")
	private String personalText;

	@Column(name="pm_email_notify")
	private byte pmEmailNotify;

	@Column(name="pm_ignore_list")
	private String pmIgnoreList;

	@Column(name="pm_prefs")
	private int pmPrefs;

	@Column(name="pm_receive_from")
	private byte pmReceiveFrom;

	private int posts;

	@Column(name="real_name")
	private String realName;

	@Column(name="secret_answer")
	private String secretAnswer;

	@Column(name="secret_question")
	private String secretQuestion;

	@Column(name="show_online")
	private byte showOnline;

	@Lob
	private String signature;

	@Column(name="smiley_set")
	private String smileySet;

	@Column(name="time_format")
	private String timeFormat;

	@Column(name="time_offset")
	private float timeOffset;

	@Column(name="total_time_logged_in")
	private int totalTimeLoggedIn;

	@Column(name="unread_messages")
	private short unreadMessages;

	private String usertitle;

	@Column(name="validation_code")
	private String validationCode;

	private byte warning;

	@Column(name="website_title")
	private String websiteTitle;

	@Column(name="website_url")
	private String websiteUrl;

	private String yim;
	
	private String quota;
	
	private String balance;
	
	private String contributions;
	
	@Column(name="amount_credits")
	private String amountCredits;
	
	@Column(name="value_credits")
	private String valueCredits;

	public SmfMember() {
	}

	public int getIdMember() {
		return this.idMember;
	}

	public void setIdMember(int idMember) {
		this.idMember = idMember;
	}

	public String getAdditionalGroups() {
		return this.additionalGroups;
	}

	public void setAdditionalGroups(String additionalGroups) {
		this.additionalGroups = additionalGroups;
	}

	public String getAim() {
		return this.aim;
	}

	public void setAim(String aim) {
		this.aim = aim;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getBuddyList() {
		return this.buddyList;
	}

	public void setBuddyList(String buddyList) {
		this.buddyList = buddyList;
	}

	public int getDateRegistered() {
		return this.dateRegistered;
	}

	public void setDateRegistered(int dateRegistered) {
		this.dateRegistered = dateRegistered;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public byte getGender() {
		return this.gender;
	}

	public void setGender(byte gender) {
		this.gender = gender;
	}

	public byte getHideEmail() {
		return this.hideEmail;
	}

	public void setHideEmail(byte hideEmail) {
		this.hideEmail = hideEmail;
	}

	public String getIcq() {
		return this.icq;
	}

	public void setIcq(String icq) {
		this.icq = icq;
	}

	public int getIdGroup() {
		return this.idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}

	public int getIdMsgLastVisit() {
		return this.idMsgLastVisit;
	}

	public void setIdMsgLastVisit(int idMsgLastVisit) {
		this.idMsgLastVisit = idMsgLastVisit;
	}

	public int getIdPostGroup() {
		return this.idPostGroup;
	}

	public void setIdPostGroup(int idPostGroup) {
		this.idPostGroup = idPostGroup;
	}

	public byte getIdTheme() {
		return this.idTheme;
	}

	public void setIdTheme(byte idTheme) {
		this.idTheme = idTheme;
	}

	public String getIgnoreBoards() {
		return this.ignoreBoards;
	}

	public void setIgnoreBoards(String ignoreBoards) {
		this.ignoreBoards = ignoreBoards;
	}

	public short getInstantMessages() {
		return this.instantMessages;
	}

	public void setInstantMessages(short instantMessages) {
		this.instantMessages = instantMessages;
	}

	public byte getIsActivated() {
		return this.isActivated;
	}

	public void setIsActivated(byte isActivated) {
		this.isActivated = isActivated;
	}

	public int getKarmaBad() {
		return this.karmaBad;
	}

	public void setKarmaBad(int karmaBad) {
		this.karmaBad = karmaBad;
	}

	public int getKarmaGood() {
		return this.karmaGood;
	}

	public void setKarmaGood(int karmaGood) {
		this.karmaGood = karmaGood;
	}

	public int getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(int lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLngfile() {
		return this.lngfile;
	}

	public void setLngfile(String lngfile) {
		this.lngfile = lngfile;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMemberIp() {
		return this.memberIp;
	}

	public void setMemberIp(String memberIp) {
		this.memberIp = memberIp;
	}

	public String getMemberIp2() {
		return this.memberIp2;
	}

	public void setMemberIp2(String memberIp2) {
		this.memberIp2 = memberIp2;
	}

	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMessageLabels() {
		return this.messageLabels;
	}

	public void setMessageLabels(String messageLabels) {
		this.messageLabels = messageLabels;
	}

	public String getModPrefs() {
		return this.modPrefs;
	}

	public void setModPrefs(String modPrefs) {
		this.modPrefs = modPrefs;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}

	public byte getNewPm() {
		return this.newPm;
	}

	public void setNewPm(byte newPm) {
		this.newPm = newPm;
	}

	public byte getNotifyAnnouncements() {
		return this.notifyAnnouncements;
	}

	public void setNotifyAnnouncements(byte notifyAnnouncements) {
		this.notifyAnnouncements = notifyAnnouncements;
	}

	public byte getNotifyRegularity() {
		return this.notifyRegularity;
	}

	public void setNotifyRegularity(byte notifyRegularity) {
		this.notifyRegularity = notifyRegularity;
	}

	public byte getNotifySendBody() {
		return this.notifySendBody;
	}

	public void setNotifySendBody(byte notifySendBody) {
		this.notifySendBody = notifySendBody;
	}

	public byte getNotifyTypes() {
		return this.notifyTypes;
	}

	public void setNotifyTypes(byte notifyTypes) {
		this.notifyTypes = notifyTypes;
	}

	public String getOpenidUri() {
		return this.openidUri;
	}

	public void setOpenidUri(String openidUri) {
		this.openidUri = openidUri;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getPasswdFlood() {
		return this.passwdFlood;
	}

	public void setPasswdFlood(String passwdFlood) {
		this.passwdFlood = passwdFlood;
	}

	public String getPasswordSalt() {
		return this.passwordSalt;
	}

	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}

	public String getPersonalText() {
		return this.personalText;
	}

	public void setPersonalText(String personalText) {
		this.personalText = personalText;
	}

	public byte getPmEmailNotify() {
		return this.pmEmailNotify;
	}

	public void setPmEmailNotify(byte pmEmailNotify) {
		this.pmEmailNotify = pmEmailNotify;
	}

	public String getPmIgnoreList() {
		return this.pmIgnoreList;
	}

	public void setPmIgnoreList(String pmIgnoreList) {
		this.pmIgnoreList = pmIgnoreList;
	}

	public int getPmPrefs() {
		return this.pmPrefs;
	}

	public void setPmPrefs(int pmPrefs) {
		this.pmPrefs = pmPrefs;
	}

	public byte getPmReceiveFrom() {
		return this.pmReceiveFrom;
	}

	public void setPmReceiveFrom(byte pmReceiveFrom) {
		this.pmReceiveFrom = pmReceiveFrom;
	}

	public int getPosts() {
		return this.posts;
	}

	public void setPosts(int posts) {
		this.posts = posts;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getSecretAnswer() {
		return this.secretAnswer;
	}

	public void setSecretAnswer(String secretAnswer) {
		this.secretAnswer = secretAnswer;
	}

	public String getSecretQuestion() {
		return this.secretQuestion;
	}

	public void setSecretQuestion(String secretQuestion) {
		this.secretQuestion = secretQuestion;
	}

	public byte getShowOnline() {
		return this.showOnline;
	}

	public void setShowOnline(byte showOnline) {
		this.showOnline = showOnline;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSmileySet() {
		return this.smileySet;
	}

	public void setSmileySet(String smileySet) {
		this.smileySet = smileySet;
	}

	public String getTimeFormat() {
		return this.timeFormat;
	}

	public void setTimeFormat(String timeFormat) {
		this.timeFormat = timeFormat;
	}

	public float getTimeOffset() {
		return this.timeOffset;
	}

	public void setTimeOffset(float timeOffset) {
		this.timeOffset = timeOffset;
	}

	public int getTotalTimeLoggedIn() {
		return this.totalTimeLoggedIn;
	}

	public void setTotalTimeLoggedIn(int totalTimeLoggedIn) {
		this.totalTimeLoggedIn = totalTimeLoggedIn;
	}

	public short getUnreadMessages() {
		return this.unreadMessages;
	}

	public void setUnreadMessages(short unreadMessages) {
		this.unreadMessages = unreadMessages;
	}

	public String getUsertitle() {
		return this.usertitle;
	}

	public void setUsertitle(String usertitle) {
		this.usertitle = usertitle;
	}

	public String getValidationCode() {
		return this.validationCode;
	}

	public void setValidationCode(String validationCode) {
		this.validationCode = validationCode;
	}

	public byte getWarning() {
		return this.warning;
	}

	public void setWarning(byte warning) {
		this.warning = warning;
	}

	public String getWebsiteTitle() {
		return this.websiteTitle;
	}

	public void setWebsiteTitle(String websiteTitle) {
		this.websiteTitle = websiteTitle;
	}

	public String getWebsiteUrl() {
		return this.websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getYim() {
		return this.yim;
	}

	public void setYim(String yim) {
		this.yim = yim;
	}
	
	public String getQuota(){
		return this.quota;
	}
	
	public void setQuota(String quota){
		this.quota = quota;
	}

	/**
	 * @return the balance
	 */
	public String getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}

	/**
	 * @return the contributions
	 */
	public String getContributions() {
		return contributions;
	}

	/**
	 * @param contributions the contributions to set
	 */
	public void setContributions(String contributions) {
		this.contributions = contributions;
	}

	/**
	 * @return the amountCredits
	 */
	public String getAmountCredits() {
		return amountCredits;
	}

	/**
	 * @param amountCredits the amountCredits to set
	 */
	public void setAmountCredits(String amountCredits) {
		this.amountCredits = amountCredits;
	}

	/**
	 * @return the valueCredits
	 */
	public String getValueCredits() {
		return valueCredits;
	}

	/**
	 * @param valueCredits the valueCredits to set
	 */
	public void setValueCredits(String valueCredits) {
		this.valueCredits = valueCredits;
	}

}