package com.gasmileagereimbursement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {
	
	private String id;
	private String employeeId;
	private Double requestAmount;
	private String requestReason;
	private Boolean approvalStatus;
	private Boolean billStatus;
	
	public Request() {}
	
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
	@Override
	public String toString() {
		return "Request [id=" + id + ", employeeId=" + employeeId + ", requestAmount=" + requestAmount
				+ ", requestReason=" + requestReason + ", approvalStatus=" + approvalStatus + ", billStatus="
				+ billStatus + "]";
	}

}
