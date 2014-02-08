package com.sd.training.struts2.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity	
@Table(name="bic_code")
public class Bic {
	
	
	private String bankcode;
	private String countrycode;
	private String locationcode;
	private String branchcode;
	@Column(name="bank_code")
	public String getBankcode() {
		return bankcode;
	}
	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}
	@Column(name="country_code")
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	@Column(name="location_code")
	public String getLocationcode() {
		return locationcode;
	}
	public void setLocationcode(String locationcode) {
		this.locationcode = locationcode;
	}
	@Column(name="branch_code")
	public String getBranchcode() {
		return branchcode;
	}
	public void setBranchcode(String branchcode) {
		this.branchcode = branchcode;
	}

}