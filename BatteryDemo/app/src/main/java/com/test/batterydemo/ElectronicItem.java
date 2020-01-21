package com.test.batterydemo;

import java.util.ArrayList;

public class ElectronicItem {
    private String name="";
    private float  consumption=0;
    private float ampere=0;
    private float volt=0;
    private float height=0;
    private float width=0;
    private String category="";
    private String item_type="";
    private ArrayList local_list=new ArrayList();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        local_list.add("Name: "+name);
        this.name = name;
    }

    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
        local_list.add("Consumption: "+consumption);
    }

    public float getAmpere() {
        return ampere;
    }

    public void setAmpere(float ampere) {
        this.ampere = ampere;
        local_list.add("Ampere: "+ampere);
    }

    public float getVolt() {
        return volt;
    }

    public void setVolt(float volt) {
        this.volt = volt;
        local_list.add("Voltage: "+volt);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
        local_list.add("Height: "+height);
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
        local_list.add("Width: "+width);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
        local_list.add("Category: "+category);
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
        local_list.add("Item-Type: "+item_type);
    }

    public ArrayList get_all_details(){
        return  this.local_list;
    }
}
