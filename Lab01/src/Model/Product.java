/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aasikaleem
 */
public class Product {
    
    
    
    String name;
    String description;
    String availNum;
    Address manufacturingAdd;
    Address shippingAddress; 
    int price;
    
    public Product() {
    manufacturingAdd = new Address();
    shippingAddress = new Address();
}

      public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String discription) {
        this.description = discription;
    }
    public String getAvailNum() {
        return availNum;
    }
    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public Address getManufacturerAddress() {
        return manufacturingAdd;
    }
    public void setManufacturerAddress(Address manufacturerAddress) {
        this.manufacturingAdd = manufacturerAddress;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    
}
