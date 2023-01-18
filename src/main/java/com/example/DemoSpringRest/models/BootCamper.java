package com.example.DemoSpringRest.models;

public class BootCamper {

    private String name;
    private double value;

    public BootCamper(){

    }

    public BootCamper(String name, double value) {
        this.name = name;
        this.value=value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
