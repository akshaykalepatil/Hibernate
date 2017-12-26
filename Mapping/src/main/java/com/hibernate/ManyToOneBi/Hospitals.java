package com.hibernate.ManyToOneBi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Hospital_Info")
public class Hospitals {

	@Id
	@Column(name = "Hosp_Id")
	int Hospital_Id;

	@Column(name = "Hosp_Name")
	String Hospotal_Name;

	@ManyToOne
//	@PrimaryKeyJoinColumn
//	@JoinColumn
	@JoinTable(name="Hospital_Patients_Id")
	Patients patients;

	public Hospitals(int hospital_Id, String hospotal_Name, Patients patients) {
		super();
		Hospital_Id = hospital_Id;
		Hospotal_Name = hospotal_Name;
		this.patients = patients;
	}

	public Hospitals() {
		super();
	}

	@Override
	public String toString() {
		return "Hospitals [Hospital_Id=" + Hospital_Id + ", Hospotal_Name=" + Hospotal_Name + ", patients=" + patients
				+ "]";
	}

	public int getHospital_Id() {
		return Hospital_Id;
	}

	public void setHospital_Id(int hospital_Id) {
		Hospital_Id = hospital_Id;
	}

	public String getHospotal_Name() {
		return Hospotal_Name;
	}

	public void setHospotal_Name(String hospotal_Name) {
		Hospotal_Name = hospotal_Name;
	}

	public Patients getPatients() {
		return patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

}
