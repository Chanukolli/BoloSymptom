package com.example.appcontest;

public class OneHealthUser {
    private String name;
    private String email;
    private String password;
    private  int id;
    private int noOfVisits;
    private boolean isHealthy;
    private final int DEFAULT_ID=-1;

    public OneHealthUser(){

    }
    public OneHealthUser(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.id=DEFAULT_ID;
        this.noOfVisits=0;
        this.isHealthy=true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public int getNoOfVisits() {
        return noOfVisits;
    }

    public void updateVisits(int visits) {
        noOfVisits += visits;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "OneHealthUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", id=" + id +
                ", noOfVisits=" + noOfVisits +
                ", isHealthy=" + isHealthy +
                ", DEFAULT_ID=" + DEFAULT_ID +
                '}';
    }
}
