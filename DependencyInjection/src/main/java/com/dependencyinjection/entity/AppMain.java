package com.dependencyinjection.entity;

public class AppMain {
	
	    public static void main(String[] args) {
	    	
	        SaveDatainMySQLDB mysqlDB = new SaveDatainMySQLDB();
	        SaveDatainOracleDB oracleDB = new SaveDatainOracleDB();

	        Employee employ1 = new Employee(mysqlDB);
	        employ1.saveDataToDB(); // Saves data in MySQL database

	        employ1.setSaveData(oracleDB);
	        employ1.saveDataToDB(); // Saves data in Oracle database
	    }
	}

