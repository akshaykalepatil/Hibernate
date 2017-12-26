package com.hibernate.OneToManyBi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class TalentStudents {

	@Id
	int sId;

	String sName;

	@ManyToOne
	Departments department;

	public TalentStudents(int sId, String sName, Departments department) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.department = department;
	}

	@Override
	public String toString() {
		return "TalentStudents [sId=" + sId + ", sName=" + sName + ", department=" + department + "]";
	}

	public TalentStudents() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

}
