package com.dependencyinjection.entity;

public class Employee {

	    private SaveData saveData;

	    // Constructor injection
	    public Employee(SaveData saveData) {
	        this.saveData = saveData;
	    }

	    // Setter injection
	    public void setSaveData(SaveData saveData) {
	        this.saveData = saveData;
	    }

	    public void saveDataToDB() {
	        saveData.save();
	    }
	}


