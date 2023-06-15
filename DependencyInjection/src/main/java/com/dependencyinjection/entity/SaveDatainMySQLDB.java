package com.dependencyinjection.entity;

class SaveDatainMySQLDB implements SaveData {
    @Override
    public void save() {
       
        System.out.println("Data saved in MySQL database.");
    }
}