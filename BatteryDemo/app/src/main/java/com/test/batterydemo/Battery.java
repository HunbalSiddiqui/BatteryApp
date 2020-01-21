package com.test.batterydemo;

public class Battery {
    private float voltage=0;
    private float cost=0;
    private String name="";
    public float getVoltage() {
        return this.voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public float getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
