package com.hibernate.ManyToOneUni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Company_Info")
public class Company {

	@Id
	@Column(name = "Company_Id")
	int compId;

	@Column(name = "Company_Name")
	String compName;

	public Company(int compId, String compName) {
		super();
		this.compId = compId;
		this.compName = compName;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Company [compId=" + compId + ", compName=" + compName + "]";
	}

	public int getCompId() {
		return compId;
	}

	public void setCompId(int compId) {
		this.compId = compId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

}
