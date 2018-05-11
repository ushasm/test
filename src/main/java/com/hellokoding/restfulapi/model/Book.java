package com.hellokoding.restfulapi.model;

import javax.persistence.*;

@Entity
public class Book{
    private int id;
    private String deviceId;
    private int temperature;
    private String time;

    public Book() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdeviceId() {
        return deviceId;
    }

    public void setdeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public int gettemperature() {
        return temperature;
    }

    public void settemperature(int temperature) {
        this.temperature = temperature;
    }

    public String gettime() {
        return time;
    }

    public void settime(String time) {
        this.time = time;
    }
}
