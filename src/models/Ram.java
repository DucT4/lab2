package models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.io.Serializable;
public class Ram implements Serializable {
     private String code;
     private String type;
     private String bus;
     private String brand;
     private int quantity;
     private String productionMonthYear;
     private boolean active;

    public Ram(String code, String type, String bus, String brand, int quantity, String productionMonthYear, boolean active) {
        this.code = code;
        this.type = type;
        this.bus = bus;
        this.brand = brand;
        this.quantity = quantity;
        this.productionMonthYear = productionMonthYear;
        this.active = active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getProductionMonthYear() {
        return productionMonthYear;
    }

    public void setProductionMonthYear(String productionMonthYear) {
        this.productionMonthYear = productionMonthYear;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override

    public String toString() {
        return "Ram{" +
                "code='" + code + '\'' +
                ", type='" + type + '\'' +
                ", bus='" + bus + '\'' +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", productionMonthYear='" + productionMonthYear + '\'' +
                ", active=" + active +
                '}';
    }
    }
     

