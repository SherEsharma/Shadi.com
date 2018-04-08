package com.findasoulmate.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="master_mother_tongue")
public class MotherLanguage implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Integer getMotherTongueId() {
		return motherTongueId;
	}
	public void setMotherTongueId(Integer motherTongueId) {
		this.motherTongueId = motherTongueId;
	}
	public String getMotherTongueName() {
		return motherTongueName;
	}
	public void setMotherTongueName(String motherTongueName) {
		this.motherTongueName = motherTongueName;
	}
	public Date getCreateOn() {
		return createOn;
	}
	public void setCreateOn(Date createOn) {
		this.createOn = createOn;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "MotherLanguage [motherTongueId=" + motherTongueId + ", motherTongueName=" + motherTongueName
				+ ", createOn=" + createOn + ", lastUpdate=" + lastUpdate + "]";
	}
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "mother_tongue_id", unique = true, nullable = false)
	private Integer motherTongueId;
	
	@NotNull
	@Column(name="mother_tongue_name")
	private String motherTongueName;
	
	
	@Transient
	private Date createOn;
	@Transient
	private Date lastUpdate;

}
