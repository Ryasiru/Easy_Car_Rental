package lk.easycarrental.dto;

public class CarDTO {

    private String brand;
    private String type;
    private String colour;
    private String regno;
    private String passengerno;
    private String transmission;
    private String fueltype;
    private String dailyrate;
    private String monthlyrate;
    private String freemileage;
    private String extraKmprice;
    private String status;

    public CarDTO() {
    }

    public CarDTO(String brand, String type, String colour, String regno, String passengerno, String transmission, String fueltype, String dailyrate, String monthlyrate, String freemileage, String extraKmprice, String status) {
        this.brand = brand;
        this.type = type;
        this.colour = colour;
        this.regno = regno;
        this.passengerno = passengerno;
        this.transmission = transmission;
        this.fueltype = fueltype;
        this.dailyrate = dailyrate;
        this.monthlyrate = monthlyrate;
        this.freemileage = freemileage;
        this.extraKmprice = extraKmprice;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getPassengerno() {
        return passengerno;
    }

    public void setPassengerno(String passengerno) {
        this.passengerno = passengerno;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getDailyrate() {
        return dailyrate;
    }

    public void setDailyrate(String dailyrate) {
        this.dailyrate = dailyrate;
    }

    public String getMonthlyrate() {
        return monthlyrate;
    }

    public void setMonthlyrate(String monthlyrate) {
        this.monthlyrate = monthlyrate;
    }

    public String getFreemileage() {
        return freemileage;
    }

    public void setFreemileage(String freemileage) {
        this.freemileage = freemileage;
    }

    public String getExtraKmprice() {
        return extraKmprice;
    }

    public void setExtraKmprice(String extraKmprice) {
        this.extraKmprice = extraKmprice;
    }
}
