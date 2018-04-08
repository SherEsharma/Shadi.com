package com.findasoulmate.model;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class UserMobileOTP   implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Integer mobileOTP;
	
	
	@Size(min=6, max=6)
	@NotBlank
	private Integer mobileOTPConform;

	public Integer getMobileOTP() {
		return mobileOTP;
	}

	public void setMobileOTP(Integer mobileOTP) {
		this.mobileOTP = mobileOTP;
	}

	public Integer getMobileOTPConform() {
		return mobileOTPConform;
	}

	public void setMobileOTPConform(Integer mobileOTPConform) {
		this.mobileOTPConform = mobileOTPConform;
	}

	@Override
	public String toString() {
		return "UserMobileOTP [mobileOTP=" + mobileOTP + ", mobileOTPConform=" + mobileOTPConform + "]";
	}
	
	
	
	
	

}
