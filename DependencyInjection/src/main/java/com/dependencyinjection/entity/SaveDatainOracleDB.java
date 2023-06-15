package com.dependencyinjection.entity;

public class SaveDatainOracleDB implements SaveData{
	@Override
	public void save()
      {
    	  System.out.println("Data saved in Oracle database.");
      }
}
