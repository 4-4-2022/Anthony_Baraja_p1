package com.gasmileagereimbursement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Boring {
	private String activity;
	private Double accessibility;
	private String type;
	private Integer participants;
	private Integer price;
	
	public Boring() {}
	
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public Double getAccessibility() {
		return accessibility;
	}
	public void setAccessibility(Double accessibility) {
		this.accessibility = accessibility;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getParticipants() {
		return participants;
	}
	public void setParticipants(Integer participants) {
		this.participants = participants;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Boring [activity=" + activity + ", accessibility=" + accessibility + ", type=" + type
				+ ", participants=" + participants + ", price=" + price + "]";
	}
	

}
