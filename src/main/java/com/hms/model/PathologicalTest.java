/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Banna
 */
public class PathologicalTest {
    String title;
    double cost;
    boolean isAvailable;
    
    public PathologicalTest(String title,
                    double cost,
                    boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable;               
    }
    public String show(){
        String output = "Test name: "+this.title+"\n"
                + "Cost: "+this.cost+"\n"
                + "Availability: "+this.isAvailable;
        return output;
    }
    void search(String title){
        if(this.title == title)
            show();
        else
            System.out.println("Not found");
    }
}
