/**
 * 
 */
package com.example.domain;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

/**
 * @author Harry.Lee
 *
 */
@Entity
@Table(schema = "sf", name="user_tb")
@DynamicInsert
@SequenceGenerator(
        name="USER_SQ_GEN", //시퀀스 제너레이터 이름
        schema = "sf", //스키마
        sequenceName="user_sq", //DB Sequence name
        initialValue=1, //시작갑
        allocationSize=1 //메모리 캐싱 크기                                
        )
public class UserDo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Timestamp addedAt;
	private Date birthDt;
	private String emailAccount;
	private String emailDomain;
	private String firstNm;
	private String gender;
	private String lastNm;
	private String statusCd;
	private String typeCd;
	
	@Id
	@Column(name="uid", columnDefinition = "int4")
	@GeneratedValue(strategy = GenerationType. SEQUENCE, generator = "USER_SQ_GEN")
	private Long uid;
	private Timestamp updatedAt;
	private Integer updatedBy;

	/**
	 * @return the addedAt
	 */
	public Timestamp getAddedAt() {
		return addedAt;
	}

	/**
	 * @param addedAt the addedAt to set
	 */
	public void setAddedAt(Timestamp addedAt) {
		this.addedAt = addedAt;
	}

	/**
	 * @return the birthDt
	 */
	public Date getBirthDt() {
		return birthDt;
	}

	/**
	 * @param birthDt the birthDt to set
	 */
	public void setBirthDt(Date birthDt) {
		this.birthDt = birthDt;
	}

	/**
	 * @return the emailAccount
	 */
	public String getEmailAccount() {
		return emailAccount;
	}

	/**
	 * @param emailAccount the emailAccount to set
	 */
	public void setEmailAccount(String emailAccount) {
		this.emailAccount = emailAccount;
	}

	/**
	 * @return the emailDomain
	 */
	public String getEmailDomain() {
		return emailDomain;
	}

	/**
	 * @param emailDomain the emailDomain to set
	 */
	public void setEmailDomain(String emailDomain) {
		this.emailDomain = emailDomain;
	}

	/**
	 * @return the firstNm
	 */
	public String getFirstNm() {
		return firstNm;
	}

	/**
	 * @param firstNm the firstNm to set
	 */
	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the lastNm
	 */
	public String getLastNm() {
		return lastNm;
	}

	/**
	 * @param lastNm the lastNm to set
	 */
	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	/**
	 * @return the statusCd
	 */
	public String getStatusCd() {
		return statusCd;
	}

	/**
	 * @param statusCd the statusCd to set
	 */
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}

	/**
	 * @return the typeCd
	 */
	public String getTypeCd() {
		return typeCd;
	}

	/**
	 * @param typeCd the typeCd to set
	 */
	public void setTypeCd(String typeCd) {
		this.typeCd = typeCd;
	}

	/**
	 * @return the uid
	 */
	public Long getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(Long uid) {
		this.uid = uid;
	}

	/**
	 * @return the updatedAt
	 */
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * @param updatedAt the updatedAt to set
	 */
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * @return the updatedBy
	 */
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	/**
	 * @param updatedBy the updatedBy to set
	 */
	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public String toString() {
		return "UserDo [addedAt=" + addedAt + ", birthDt=" + birthDt + ", emailAccount=" + emailAccount
				+ ", emailDomain=" + emailDomain + ", firstNm=" + firstNm + ", gender=" + gender + ", lastNm=" + lastNm
				+ ", statusCd=" + statusCd + ", typeCd=" + typeCd + ", uid=" + uid + ", updatedAt=" + updatedAt
				+ ", updatedBy=" + updatedBy + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}