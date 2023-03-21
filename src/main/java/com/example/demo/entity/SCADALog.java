package com.example.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SCADALog {

    @Id
    private int id;

    private String devices;
    private int status;
    private String measurementvalue;
    private Timestamp timestamp;

    public SCADALog(){
        
    }
    public SCADALog(int id, String devices, int status, String measurementvalue, Timestamp timestamp) {
        this.id = id;
        this.devices = devices;
        this.status = status;
        this.measurementvalue = measurementvalue;
        this.timestamp = timestamp;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDevices() {
        return devices;
    }
    public void setDevices(String devices) {
        this.devices = devices;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMeasurementvalue() {
        return measurementvalue;
    }
    public void setMeasurementvalue(String measurementvalue) {
        this.measurementvalue = measurementvalue;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    // getters and setters
}