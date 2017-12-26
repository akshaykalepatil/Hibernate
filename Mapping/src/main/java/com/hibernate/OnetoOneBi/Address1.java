package com.hibernate.OnetoOneBi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address1 {
	@Id
	@Column
	int addId;
	
	@Column
	String city;

	@Column
	int pinCode;
	
	@OneToOne
	Student1 student1;

	public Address1(int addId, String city, int pinCode, Student1 student1) {
		super();
		this.addId = addId;
		this.city = city;
		this.pinCode = pinCode;
		this.student1 = student1;
	}

	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address1 [addId=" + addId + ", city=" + city + ", pinCode=" + pinCode + ", student1=" + student1 + "]";
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

	public Student1 getStudent1() {
		return student1;
	}

	public void setStudent1(Student1 student1) {
		this.student1 = student1;
	}

	

}
