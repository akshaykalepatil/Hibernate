package com.hibernate.OneToManyUni;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "College_info")
public class College {

	@Id
	@GeneratedValue
	@Column(name = "Clg_ID")
	int clgId;

	@Column(name = "Clg_Name")
	String clgName;

	@OneToMany(cascade = CascadeType.ALL)
	// @PrimaryKeyJoinColumn
	@JoinColumn
	//@JoinTable(name = "Combined_Table")
	List<Students> students;

	public College(int clgId, String clgName, List<Students> students) {
		super();
		this.clgId = clgId;
		this.clgName = clgName;
		this.students = students;
	}

	public College() {
		super();
	}

	@Override
	public String toString() {
		return "College [clgId=" + clgId + ", clgName=" + clgName + ", students=" + students + "]";
	}

	public int getClgId() {
		return clgId;
	}

	public void setClgId(int clgId) {
		this.clgId = clgId;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}

}
