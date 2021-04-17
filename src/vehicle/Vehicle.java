package vehicle;

public class Vehicle {
    int vin;
    String brand;
    String isInsured;

    public Vehicle(int vin, String brand, String isInsured) {
        this.vin = vin;
        this.brand = brand;
        this.isInsured = isInsured;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getIsInsured() {
        return isInsured;
    }

    public void setIsInsured(String isInsured) {
        this.isInsured = isInsured;
    }
}
