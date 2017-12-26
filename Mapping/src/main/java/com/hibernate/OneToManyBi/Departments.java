package com.hibernate.OneToManyBi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
public class Departments {

	@Id
	int dId;

	String dName;

	@OneToMany(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	@JoinTable
//	@JoinColumn
	List<TalentStudents> students;

	public Departments(int dId, String dName, List<TalentStudents> students) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.students = students;
	}

	public Departments() {
		super();
	}

	@Override
	public String toString() {
		return "Departments [dId=" + dId + ", dName=" + dName + ", students=" + students + "]";
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<TalentStudents> getStudents() {
		return students;
	}

	public void setStudents(List<TalentStudents> students) {
		this.students = students;
	}

	
}
