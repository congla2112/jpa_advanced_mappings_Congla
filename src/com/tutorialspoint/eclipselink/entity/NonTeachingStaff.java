package com.tutorialspoint.eclipselink.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value ="NS")

public class NonTeachingStaff extends Staff {
	
	private String areaexpertise;
	
	

	public NonTeachingStaff(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.areaexpertise = areaexpertise;
		
	}



	public NonTeachingStaff() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getAreaexpertise() {
		return areaexpertise;
	}



	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
	
	
	
	
}
