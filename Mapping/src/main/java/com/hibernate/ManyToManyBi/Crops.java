package com.hibernate.ManyToManyBi;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Crop_Info")
public class Crops {

	@Id
	@Column(name="Crop_Id")
	int cropId;

	@Column(name="Crop_Name")
	String cropName;
	
	@ManyToMany(mappedBy = "crop")
	List<Farms> farm;

	public Crops(int cropId, String cropName, List<Farms> farm) {
		super();
		this.cropId = cropId;
		this.cropName = cropName;
		this.farm = farm;
	}

	public Crops() {
		super();

	}

	@Override
	public String toString() {
		return "Crops [cropId=" + cropId + ", cropName=" + cropName + ", farm=" + farm + "]";
	}

	public int getCropId() {
		return cropId;
	}

	public void setCropId(int cropId) {
		this.cropId = cropId;
	}

	public String getCropName() {
		return cropName;
	}

	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	public List<Farms> getFarm() {
		return farm;
	}

	public void setFarm(List<Farms> farm) {
		this.farm = farm;
	}

}
