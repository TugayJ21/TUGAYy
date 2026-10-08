/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Motorcyle extends Vehicle {
    
    public Motorcyle(int vehicleID, String brand, String model, String year, int rentalDays, int vehicleCount) {
        super(vehicleID, brand, model, year, rentalDays, vehicleCount);
    }
    @Override
    public double calculateRentalFee(){
        return (rentalDays * dailyRate) + helmet;
    }
      
}
