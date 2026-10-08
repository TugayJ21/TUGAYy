/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class Vehicle {
    
    protected int vehicleID;
    protected String brand;
    protected String model;
    protected String year;
    protected int rentalDays;
    protected int vehicleCount;

    public Vehicle(int vehicleID, String brand, String model, String year, int rentalDays, int vehicleCount) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.rentalDays = rentalDays;
        this.vehicleCount = vehicleCount;
    }

    public void setVehicleID(int vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public int getVehicleID() {
        return vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }
    public void displayVehicleInfo(){
        
        System.out.println("=====Vehicle Information=====");
        System.out.println("Vehicle ID:" + vehicleID);
        System.out.println("Brand:" + brand);
        System.out.println("Moded: " + model);
        System.out.println("year:" + year);
        System.out.println("rental Days:" + rentalDays);
        System.out.println("DailyRate" + dailyRate);
        System.out.println("helmetFee" + helmetFee); 
        System.out.println("DriverFee" + driverFee);
}
