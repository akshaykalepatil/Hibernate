package com.hibernate.ManyToManyBi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Farm_Info")
public class Farms {
	@Id
	@Column(name="Farm_No")
	int farmNo;

	@Column(name="Farm_Owner")
	String farmOwner;

	@ManyToMany(cascade = CascadeType.ALL)
//	@PrimaryKeyJoinColumn
//	@JoinColumn
	@JoinTable(name="Farm_Crop_Id")
	List<Crops> crop;

	public Farms(int farmNo, String farmOwner, List<Crops> crop) {
		super();
		this.farmNo = farmNo;
		this.farmOwner = farmOwner;
		this.crop = crop;
	}

	public Farms() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Farms [farmNo=" + farmNo + ", farmOwner=" + farmOwner + ", crop=" + crop + "]";
	}

	public int getFarmNo() {
		return farmNo;
	}

	public void setFarmNo(int farmNo) {
		this.farmNo = farmNo;
	}

	public String getFarmOwner() {
		return farmOwner;
	}

	public void setFarmOwner(String farmOwner) {
		this.farmOwner = farmOwner;
	}

	public List<Crops> getCrop() {
		return crop;
	}

	public void setCrop(List<Crops> crop) {
		this.crop = crop;
	}

}
