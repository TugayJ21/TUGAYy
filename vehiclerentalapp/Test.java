/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Vehicle [] vehicles  = new Vehicle[3];
        
        vehicles [1] = new Vehicle ("SD001","toyota","vios",2023, 3, "sedan",5,000.00);
        vehicles [2] = new Vehicle ("SD001","toyota","vios",2024, 5, "van",6,000.00);
        vehicles [3] = new Vehicle ("SD001","toyota","vios",2025, 7, "Motorcyle",4,000.00);
        
        System.out.println("========DINAGAT A RIDE SERVICE VEHIVLE RENTAL SYSTEM========");
        System.out.println("");
        
        for(Vehicle vehicle: Vehicle){
            vehicle.displayvehicleInfo();
        }
    }
    
}
