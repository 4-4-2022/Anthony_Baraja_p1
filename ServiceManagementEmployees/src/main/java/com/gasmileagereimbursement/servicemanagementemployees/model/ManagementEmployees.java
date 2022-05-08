package com.gasmileagereimbursement.servicemanagementemployees.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="managementemployees")
public class ManagementEmployees {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="managerFName")
	private String mfname;
	
	@Column(name="managerLName")
	private String mlname;
	
	@Column(name="employeeFName")
	private String efname;
	
	@Column(name="employeeLName")
	private String elname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMfname() {
		return mfname;
	}

	public void setMfname(String mfname) {
		this.mfname = mfname;
	}

	public String getMlname() {
		return mlname;
	}

	public void setMlname(String mlname) {
		this.mlname = mlname;
	}

	public String getEfname() {
		return efname;
	}

	public void setEfname(String efname) {
		this.efname = efname;
	}

	public String getElname() {
		return elname;
	}

	public void setElname(String elname) {
		this.elname = elname;
	}

}
