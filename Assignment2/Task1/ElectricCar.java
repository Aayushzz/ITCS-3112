
public class ElectricCar extends Vehicle {
    // Additional attributes
    int batteryCapacity;

    // Constructor
    public ElectricCar(String brand, int year, int batteryCapacity) {
        super(brand, year);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to display electric car details
    public void displayDetails() {
        // Display electric car details
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}
