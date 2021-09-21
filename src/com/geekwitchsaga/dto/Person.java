package com.geekwitchsaga.dto;

public class Person {

	private int ageOfDeath;
    private int yearOfDeath;
    
    public Person(int ageOfDeath,int yearOfDeath ) {
    	this.ageOfDeath = ageOfDeath;
    	this.yearOfDeath = yearOfDeath;
    }
    
	public int getAgeOfDeath() {
		return ageOfDeath;
	}
	public void setAgeOfDeath(int ageOfDeath) {
		this.ageOfDeath = ageOfDeath;
	}
	public int getYearOfDeath() {
		return yearOfDeath;
	}
	public void setYearOfDeath(int yearOfDeath) {
		this.yearOfDeath = yearOfDeath;
	}
	public int getBornAge() {
		return yearOfDeath - ageOfDeath;
	}

}
