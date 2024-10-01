/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

/**
 *
 * @author Admin
 */
import models.Ram;
import controllers.RamManagement;

public class menu {
    private RamManagement ramManagement; // Thêm biến này

    public menu() {
        ramManagement = new RamManagement(); // Khởi tạo trong constructor
    }
    public Ram addRam() {
        
        // RamManagement ramManagement = new RamManagement();  
        System.out.println("Adding a new RAM:");
        
        System.out.print("Enter RAM code: ");
        String code = System.console().readLine();
       if (ramManagement.getByCode(code) != null) {
        System.out.println("RAM code already exists.");
          return null;
       }
        System.out.print("Enter RAM type (LPDDR5/DDR5/LPDDR4/DDR4): ");
        String type = System.console().readLine();
        
        System.out.print("Enter RAM bus speed: ");
        String bus = System.console().readLine();
        
        System.out.print("Enter RAM brand: ");
        String brand = System.console().readLine();
        
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(System.console().readLine());
        
        System.out.print("Enter production month and year (MM/YYYY): ");
        String productionMonthYear = System.console().readLine();
        
        System.out.print("Is the RAM active? (true/false): ");
        boolean active = Boolean.parseBoolean(System.console().readLine());
        
        Ram newRam = new Ram(code, type, bus, brand, quantity, productionMonthYear, active); 
      
        return newRam;

    }
}







