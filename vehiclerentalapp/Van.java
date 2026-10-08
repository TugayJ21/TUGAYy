/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Van extends Vehicle {
    
    public Van(int vehicleID, String brand, String model, String year, int rentalDays, int vehicleCount ) {
        super(vehicleID, brand, model, year, rentalDays, vehicleCount);
    }
    
    public double calculationRentalRate(){
        
        return(rentalDays * dailyRate) + driverFee;
    }

    @Override
    public int getVehicleID() {
        return vehicleID;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getYear() {
        return year;
    }

    @Override
    public int getRentalDays() {
        return rentalDays;
    }
    @Override
    public int getVehicleCount() {
        return vehicleCount;
    }
    
    
   
    
            
    
}
