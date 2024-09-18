package Exercise.Vehicle_Catalogue;

public class Vehicle {
    private String vehicleType;
    private String vehicleModel;
    private String vehicleColor;
    private int vehicleHorsepower;

    public Vehicle (String type, String model, String color, int horsepower) {
        this.vehicleType = type;
        this.vehicleModel = model;
        this.vehicleColor = color;
        this.vehicleHorsepower = horsepower;
    }

    public String getVehicleType() {
        return this.vehicleType;
    }
    public String getVehicleModel() {
        return this.vehicleModel;
    }
    public String getVehicleColor() {
        return this.vehicleColor;
    }
    public int getVehicleHorsepower() {
        return this.vehicleHorsepower;
    }

    public void setModel(String model) {
        this.vehicleModel = model;
    }
    public void setColor(String color) {
        this.vehicleColor = color;
    }
    public void setHorsePower(int horsePower) {
        this.vehicleHorsepower = horsePower;
    }
    public void setType(String type) {
        this.vehicleType = type;
    }
}
