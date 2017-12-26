package com.hibernate.ManyToOneBi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Patients_Info")
public class Patients {
	@Id
	int patient_Id;

	String patient_Name;

	@OneToMany(cascade=CascadeType.ALL, mappedBy = "patients")
	List<Hospitals> hospitals;

	public Patients(int patient_Id, String patient_Name, List<Hospitals> hospitals) {
		super();
		this.patient_Id = patient_Id;
		this.patient_Name = patient_Name;
		this.hospitals = hospitals;
	}

	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patients [patient_Id=" + patient_Id + ", patient_Name=" + patient_Name + ", hospitals=" + hospitals
				+ "]";
	}

	public int getPatient_Id() {
		return patient_Id;
	}

	public void setPatient_Id(int patient_Id) {
		this.patient_Id = patient_Id;
	}

	public String getPatient_Name() {
		return patient_Name;
	}

	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}

	public List<Hospitals> getHospitals() {
		return hospitals;
	}

	public void setHospitals(List<Hospitals> hospitals) {
		this.hospitals = hospitals;
	}

}
