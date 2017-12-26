package com.hibernate.ManyToOneUni;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Info")
public class Employee {
	@Id
	@Column(name = "Emp_Id")
	int empId;

	@Column(name = "Emp_Name")
	String empName;


	@ManyToOne(cascade = CascadeType.ALL)
//	@PrimaryKeyJoinColumn
//	@JoinColumn
	@JoinTable(name="Combined_Table")
	Company company;

	public Employee(int empId, String empName, Company company) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.company = company;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", company=" + company + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}
