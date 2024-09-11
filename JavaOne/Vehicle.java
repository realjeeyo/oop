/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaone;

/**
 *
 * @author User
 */
public class Vehicle {
    private int topSpeed;
    private int currSpeed;
    private String color;
    private String model;
    private String manufacturer;
    private String plateNumber;
    private boolean disabled;
    
    public Vehicle(){
    }
    
    public Vehicle(int topSpeed, String color, String model, String manufacturer, String plateNumber){
        this.topSpeed = topSpeed;
        this.currSpeed = 0;
        this.color = color;
        this.model = model;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.disabled = false;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCurrSpeed() {
        return currSpeed;
    }

    public void setCurrSpeed(int currSpeed) {
        this.currSpeed = currSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public boolean accelerate(){
        if (this.currSpeed + 10 > this.topSpeed){
            this.currSpeed += 10;
            this.disabled = true;
            System.out.println("The car has crashed!");
            return false;
        }
        if (!this.disabled){
            this.currSpeed += 10;
            System.out.println("The " + color + " " + manufacturer + " " + model + " with plate number " + plateNumber + " went from " + (currSpeed - 10) + " kph to " + currSpeed + " kph.");
            return true;
        } else {
            System.out.println("The car is broken and cannot accelerate!");
            return false;
        }
    }
    
    public boolean decelerate(){
        if (this.currSpeed <= 0){
            System.out.println("The car is stopped!");
            return false;
        }
        if (!this.disabled){    
            this.currSpeed-=10;
            System.out.println("The " + color + " " + manufacturer + " " + model + " with plate number " + plateNumber + " went from " + (currSpeed + 10) + " kph to " + currSpeed + " kph.");
            return true;
        } else {
            System.out.println("The car is broken and cannot decelerate!");
            return false;
        }
    }
    
    public void repair(){
        this.disabled = false;
        this.currSpeed = 0;
        System.out.println("Successfully repaired the vehicle!");
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("\n");
        sb.append(color);
        sb.append(" ");
        sb.append(manufacturer);
        sb.append(" ");
        sb.append(model);
        sb.append("\nPlate Number: ");
        sb.append(plateNumber);
        sb.append("\nCurrent Speed: ");
        sb.append(currSpeed);
        sb.append("\nTop Speed: ");
        sb.append(topSpeed);
        
        return sb.toString();
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    
    
    
}

/*
Class Name: Vehicle
Properties:
- topSpeed : int
- currSpeed : int
- color : String
- model : String
- manufacturer : String
- plateNumber : String
- disabled : boolean
Methods:
+ accelerate() : boolean
+ decelerate() : boolean
+ toString() : String
+ display() : void
*/