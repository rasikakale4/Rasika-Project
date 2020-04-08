package com.example.cics;

public class Model {
    private String District;

    public Model(){}

    public Model(String District){
        this.District = District;
    }

    public void setModel(String District){
        this.District = District;
    }

    public String getModel(){
        return this.District;
    }
}
