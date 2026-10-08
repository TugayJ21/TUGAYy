/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class sedan {
    
    protected double dailyRate;
    protected double insuranceFee;

    public sedan(double dailyRate, double insuranceFee) {
        this.dailyRate = dailyRate;
        this.insuranceFee = insuranceFee;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }
    
    
}
