package com.gasmileagereimbursement.servicerequests.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requests")
public class Request {
	
	@Id
	private String id;
	
	@Column(name="employee_id")
	private String employeeId;
	
	@Column(name="request_amount")
	private Double requestAmount;
	
	@Column(name="request_reason")
	private String requestReason;
	
	@Column(name="approval_status")
	private Boolean approvalStatus;
	
	@Column(name="bill_status")
	private Boolean billStatus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Double getRequestAmount() {
		return requestAmount;
	}

	public void setRequestAmount(Double requestAmount) {
		this.requestAmount = requestAmount;
	}

	public String getRequestReason() {
		return requestReason;
	}

	public void setRequestReason(String requestReason) {
		this.requestReason = requestReason;
	}

	public Boolean getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(Boolean approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public Boolean getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(Boolean billStatus) {
		this.billStatus = billStatus;
	}

}
