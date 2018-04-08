package com.findasoulmate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "user_registration")
public class Registration {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_reg_id",unique = true, nullable = false)
	private Integer userId;
	
	@Size(min=3, max=45) 
	@Column(name="user_name")
	private String userName;
	
	@Size(min=6,max=15)
	@Column(name = "user_passoword")
	private String userPassword;
	
	@Email @NotEmpty
	@Column(name = "user_email")
	private String useremail;
	
	
	@NotEmpty
	@Column(name = "user_profile_created_by")
	private String userProfileCreateBy;
	
	
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@Past @NotNull
	@Column(name = "user_dob")
	private Date userDOB;

	@NotNull 
	@Column(name = "user_gender")
	private Integer userGender;
	
	@NotNull
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name = "mother_tongue_id", referencedColumnName = "mother_tongue_id")
	private MotherLanguage language;

	@NotNull
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name = "user_religion_id", referencedColumnName = "user_religion_id")
	private Religion religion;
	
	@Size(min=10) 
	@NotBlank
	@Column(name = "user_mobile")
	private String userMobileNumber;
	
	
	
	

	

	
	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserProfileCreateBy() {
		return userProfileCreateBy;
	}

	public void setUserProfileCreateBy(String userProfileCreateBy) {
		this.userProfileCreateBy = userProfileCreateBy;
	}

	

	public Date getUserDOB() {
		return userDOB;
	}

	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}

	public Integer getUserGender() {
		return userGender;
	}

	public void setUserGender(Integer userGender) {
		this.userGender = userGender;
	}

	public MotherLanguage getLanguage() {
		return language;
	}

	public void setLanguage(MotherLanguage language) {
		this.language = language;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	@Override
	public String toString() {
		return "Registration [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword
				+ ", useremail=" + useremail + ", userProfileCreateBy=" + userProfileCreateBy + ", userDOB=" + userDOB
				+ ", userGender=" + userGender + ", language=" + language + ", religion=" + religion
				+ ", userMobileNumber=" + userMobileNumber + "]";
	}

	
}
