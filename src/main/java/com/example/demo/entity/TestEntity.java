package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TestEntity {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long partyId;
	private Date dateTime;
	private long productCode;
	private long activityCode;
	private long status;
	private String provider;
	private boolean actualStatus;

	public TestEntity() {
		super();
	}

	public TestEntity(Long partyId, /* Date dateTime, */ long productCode, long activityCode, long status, String provider,
			boolean actualStatus) {
		super();
		this.partyId = partyId;
		/* this.dateTime = dateTime; */
		this.productCode = productCode;
		this.activityCode = activityCode;
		this.status = status;
		this.provider = provider;
		this.actualStatus = actualStatus;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPartyId() {
		return partyId;
	}

	public void setPartyId(Long partyId) {
		this.partyId = partyId;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public long getProductCode() {
		return productCode;
	}

	public void setProductCode(long productCode) {
		this.productCode = productCode;
	}

	public long getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(long activityCode) {
		this.activityCode = activityCode;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public boolean isActualStatus() {
		return actualStatus;
	}

	public void setActualStatus(boolean actualStatus) {
		this.actualStatus = actualStatus;
	}

	@Override
	public String toString() {
		return "TestEntity [partyId=" + partyId + ", dateTime=" + dateTime + ", productCode=" + productCode
				+ ", activityCode=" + activityCode + ", status=" + status + ", provider=" + provider + ", actualStatus="
				+ actualStatus + "]";
	}

}
