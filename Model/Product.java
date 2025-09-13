package Model;

public class Product {
    String name;
    String discription;
    String availNum;
    int price;
    Address manufacturerAddress;
    Address shippingAddress;




    // Putting the getters and setters
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDiscription() {
        return discription;
    }
    public void setDiscription(String discription) {
        this.discription = discription;
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
        return manufacturerAddress;
    }
    public void setManufacturerAddress(Address manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }
    public Address getShippingAddress() {
        return shippingAddress;
    }
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }


}