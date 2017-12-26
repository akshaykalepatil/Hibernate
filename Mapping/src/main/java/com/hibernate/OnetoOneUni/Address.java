package com.hibernate.OnetoOneUni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	@Id
	@Column
	int addId;
	
	@Column
	String city;

	@Column
	int pinCode;

	public Address(int addId, String city, int pinCode) {
		super();
		this.addId = addId;
		this.city = city;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", city=" + city + ", pinCode=" + pinCode + "]";
	}

	public Address() {
		super();
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	
}
