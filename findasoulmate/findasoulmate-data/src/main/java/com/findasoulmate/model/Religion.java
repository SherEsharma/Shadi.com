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
@Table(name="master_religion")
public class Religion  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Integer getReligionId() {
		return religionId;
	}
	public void setReligionId(Integer religionId) {
		this.religionId = religionId;
	}
	public String getReligionName() {
		return religionName;
	}
	public void setReligionName(String religionName) {
		this.religionName = religionName;
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
		return "Religion [religionId=" + religionId + ", religionName=" + religionName + ", createOn=" + createOn
				+ ", lastUpdate=" + lastUpdate + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_religion_id", unique = true, nullable = false)
	private Integer religionId;
	
	@NotNull
	@Column(name="religion_name")
	private String religionName;
	
	@Transient
	private Date createOn;
	@Transient
	private Date lastUpdate;

}
