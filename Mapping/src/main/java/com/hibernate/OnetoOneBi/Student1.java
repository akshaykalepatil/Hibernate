package com.hibernate.OnetoOneBi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.hibernate.OnetoOneUni.Address;

@Entity
@Table(name = "Student1")
public class Student1 {
	@Id
	@Column
	int id;
	
	@Column
	String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	//@JoinColumn
	//@JoinTable(name="Combined_Table")
	Address1 address1;

	public Student1(int id, String name, Address1 address1) {
		super();
		this.id = id;
		this.name = name;
		this.address1 = address1;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", address1=" + address1 + "]";
	}

	public Student1() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddress1() {
		return address1;
	}

	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}

}